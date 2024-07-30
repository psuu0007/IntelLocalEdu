package spms.dto;

import java.util.Date;

public class MemberDto {

	private int memberNo;    
	private String email;        
	private String password;          
	private String memberName;  
	private Date createdDate;     
	private Date modifiedDate;
	
	public MemberDto() {
		super();
	}

	public MemberDto(int memberNo, String email, String password, 
		String memberName, Date createdDate, Date modifiedDate) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.password = password;
		this.memberName = memberName;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
	}

	public MemberDto(String email, String memberName) {
		// TODO Auto-generated constructor stub
		this.email = email;
		this.memberName = memberName;
	}

	public MemberDto(int memberNo, String email, String memberName
		, Date createdDate) {
		super();
		this.memberNo = memberNo;
		this.email = email;
		this.memberName = memberName;
		this.createdDate = createdDate;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "MemberDto [memberNo=" + memberNo + ", email=" + email 
			+ ", password=" + password + ", memberName="
			+ memberName + ", createdDate=" + createdDate 
			+ ", modifiedDate=" + modifiedDate + "]";
	}    
	
	
	
	
}
