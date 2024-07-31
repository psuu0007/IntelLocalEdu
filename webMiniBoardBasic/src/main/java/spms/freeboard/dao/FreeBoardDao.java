package spms.freeboard.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import spms.dto.MemberDto;
import spms.freeboard.dto.FreeBoardDto;
import spms.freeboard.dto.MemberFreeBoardDto;

public class FreeBoardDao {

	private Connection connection;

	public void setConnection(Connection conn) {
		this.connection = conn;
	}

	public List<FreeBoardDto> selectList() throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "";

			sql += "SELECT  FREE_BOARD_ID, MEMBER_NO, FREE_BOARD_TITLE,";
			sql += " FREE_BOARD_CONTENT, FREE_BOARD_WRITER,";
			sql += " CREATE_DATE, UPDATE_DATE";
			sql += " FROM FREE_BOARD";
			sql += " ORDER BY FREE_BOARD_ID DESC";

			pstmt = connection.prepareStatement(sql);

			rs = pstmt.executeQuery(sql);

			int freeBoardId = 0; 
			int memberNo = 0; 
			String freeBoardTitle = "";     
			String freeBoardContent = "";
			String freeBoardWriter = "";
			Date createDate = null;
			Date updateDate = null;

			ArrayList<FreeBoardDto> FreeBoardList = 
				new ArrayList<FreeBoardDto>();

			FreeBoardDto FreeBoardDto = null;
			while (rs.next()) {
				freeBoardId = rs.getInt("FREE_BOARD_ID");
				memberNo = rs.getInt("MEMBER_NO");
				freeBoardTitle = rs.getString("FREE_BOARD_TITLE");
				freeBoardContent = rs.getString("FREE_BOARD_CONTENT");
				freeBoardWriter = rs.getString("FREE_BOARD_WRITER");
				createDate = rs.getDate("CREATE_DATE");
				updateDate = rs.getDate("UPDATE_DATE");
				
				
				FreeBoardDto = new FreeBoardDto(freeBoardId, memberNo, 
					freeBoardTitle, freeBoardContent, freeBoardWriter, 
					createDate, updateDate);

				FreeBoardList.add(FreeBoardDto);
			}

			return FreeBoardList;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			try {
				if (pstmt != null) {
					pstmt.close();
				} 
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // finally 종료
	}
	
	// 자유게시판 등록
	public int memberInsert(MemberDto memberDto) throws Exception {
		int result = 0;
		PreparedStatement pstmt = null;
		
		try {
			String email = memberDto.getEmail();
			String pwd = memberDto.getPassword();
			String memberName = memberDto.getMemberName();
			
			String sql = "";
			
			sql = "INSERT INTO MEMBER";
			sql += "(MEMBER_NO, EMAIL, PWD, MEMBER_NAME, CRE_DATE, MOD_DATE)";
			sql += "VALUES(MEMBER_NO_SEQ.NEXTVAL, ?, ?, ?, SYSDATE, SYSDATE)";
			
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, email);
			pstmt.setString(2, pwd);
			pstmt.setString(3, memberName);
			
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("memberDao memberInsert() 예외 발생");
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} // finally 종료
		
		return result;
	}
	
	// 회원삭제
	public int memberDelete(int memberNo) {
		int result = 0;
		
		PreparedStatement pstmt = null;

		try {
			String sql = "";
			
			sql = "DELETE FROM MEMBER";
			sql += " WHERE MEMBER_NO = ?";
			
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1, memberNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} // finally end
		
		return result;
	}
	
	// 자유게시판 상세 정보 조회
	public MemberFreeBoardDto freeBoardSelectOne(int freeBoardId) 
		throws Exception{
		MemberFreeBoardDto memberFreeBoardDto = null;
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		
		sql += "SELECT FB.MEMBER_NO, FB.FREE_BOARD_TITLE,";
		sql += " FB.FREE_BOARD_WRITER, FB.FREE_BOARD_ID,";
		sql += " M.EMAIL, FB.CREATE_DATE,";
		sql += " FB.FREE_BOARD_CONTENT";
		sql += " FROM FREE_BOARD FB INNER JOIN MEMBER M";
		sql += " ON FB.MEMBER_NO = M.MEMBER_NO";
		sql += " WHERE FB.FREE_BOARD_ID = ?";
		
		try {
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setInt(1, freeBoardId);
			
			rs = pstmt.executeQuery();
			
			int memberNo = 0; // 외래키
			String freeBoardTitle = "";     
			String freeBoardWriter = "";
			String email = "";	// 유니크키
			Date createDate = null;
			String freeBoardContent = "";
			
			if(rs.next()) {
				memberNo = rs.getInt("MEMBER_NO");; // 외래키
				freeBoardTitle = rs.getString("FREE_BOARD_TITLE");     
				freeBoardWriter = rs.getString("FREE_BOARD_WRITER");
				freeBoardId = rs.getInt("FREE_BOARD_ID");
				email = rs.getString("EMAIL");
				createDate = rs.getDate("CREATE_DATE");
				freeBoardContent = rs.getString("FREE_BOARD_CONTENT");

				Map<String, String> memberFreeBoardMap 
					= new HashMap<String, String>();
				
				memberFreeBoardDto = 
					new MemberFreeBoardDto(memberNo, freeBoardTitle, 
						freeBoardWriter, freeBoardId, email, createDate, 
						freeBoardContent);
			}else {
				throw new Exception("해당 번호의 회원을 찾을 수 없습니다.");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} // finally end
		
		return memberFreeBoardDto;
	}
	
	//회원 정보 변경
	public int memberUpdate(MemberDto memberDto) throws SQLException{
		int result = 0;
		
		PreparedStatement pstmt = null;
		
		try {
			String sql = "";
			
			sql = "UPDATE MEMBER";
			sql += " SET EMAIL = ?, MEMBER_NAME = ?";
			sql += " WHERE MEMBER_NO = ?";
			
			pstmt = connection.prepareStatement(sql);
			
			pstmt.setString(1, memberDto.getEmail());
			pstmt.setString(2, memberDto.getMemberName());
			pstmt.setInt(3, memberDto.getMemberNo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} // finally end
		
		
		return result;
	}
	
	// 사용자 존재 유무/ 없으면 null 리턴
	public MemberDto memberExist(String email, String password) {
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "";
		
		sql += "SELECT MEMBER_NO, EMAIL, MEMBER_NAME";
		sql += " FROM MEMBER";
		sql += " WHERE EMAIL = ? AND PWD = ?";
		
		String memberName = "";
		
		try {
			pstmt = connection.prepareStatement(sql);
			
			int colIndex = 1;
			
			pstmt.setString(colIndex++, email);
			pstmt.setString(colIndex, password);
			
			rs = pstmt.executeQuery();
			
			MemberDto memberDto = new MemberDto();
			if(rs.next()) {
				email = rs.getString("EMAIL");
				memberName = rs.getString("MEMBER_NAME");
				
				memberDto.setEmail(email);
				memberDto.setMemberName(memberName);
				
				return memberDto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
//			db 객체 메모리 해제
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		} // finally 종료
		
		// 회원 조회가 안된다면
		return null;
	}
}
