package spms.freeboard.dto;

import java.util.Date;

// 1.조인을 하는 경우도 하나의 테이블이다 전략
public class MemberFreeBoardDto {

    private int memberNo; // 외래키
	private String freeBoardTitle;     
	private String freeBoardWriter;
	private int freeBoardId; // 기본키
	private String email;	// 유니크키
	private Date createDate;
	private String freeBoardContent;
	
	public MemberFreeBoardDto() {
		super();
	}

	public MemberFreeBoardDto(int memberNo, String freeBoardTitle, 
			String freeBoardWriter, int freeBoardId,
			String email, Date createDate, String freeBoardContent) {
		super();
		this.memberNo = memberNo;
		this.freeBoardTitle = freeBoardTitle;
		this.freeBoardWriter = freeBoardWriter;
		this.freeBoardId = freeBoardId;
		this.email = email;
		this.createDate = createDate;
		this.freeBoardContent = freeBoardContent;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getFreeBoardTitle() {
		return freeBoardTitle;
	}

	public void setFreeBoardTitle(String freeBoardTitle) {
		this.freeBoardTitle = freeBoardTitle;
	}

	public String getFreeBoardWriter() {
		return freeBoardWriter;
	}

	public void setFreeBoardWriter(String freeBoardWriter) {
		this.freeBoardWriter = freeBoardWriter;
	}

	public int getFreeBoardId() {
		return freeBoardId;
	}

	public void setFreeBoardId(int freeBoardId) {
		this.freeBoardId = freeBoardId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getFreeBoardContent() {
		return freeBoardContent;
	}

	public void setFreeBoardContent(String freeBoardContent) {
		this.freeBoardContent = freeBoardContent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MemberFreeBoardDto [memberNo=");
		builder.append(memberNo);
		builder.append(", freeBoardTitle=");
		builder.append(freeBoardTitle);
		builder.append(", freeBoardWriter=");
		builder.append(freeBoardWriter);
		builder.append(", freeBoardId=");
		builder.append(freeBoardId);
		builder.append(", email=");
		builder.append(email);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", freeBoardContent=");
		builder.append(freeBoardContent);
		builder.append("]");
		return builder.toString();
	}
	
}
