package spms.freeboard.dto;

import java.util.Date;

public class FreeBoardDto {

	private int freeBoardId; // 기본키
	private int memberNo; // 외래키
	private String freeBoardTitle;     
	private String freeBoardContent;
	private String freeBoardWriter;
	private Date createDate;
	private Date updateDate;
	
	public FreeBoardDto() {
		super();
	}

	public FreeBoardDto(int freeBoardId, int memberNo, String freeBoardTitle, 
		String freeBoardContent, String freeBoardWriter, 
		Date createDate, Date updateDate) {
		super();
		this.freeBoardId = freeBoardId;
		this.memberNo = memberNo;
		this.freeBoardTitle = freeBoardTitle;
		this.freeBoardContent = freeBoardContent;
		this.freeBoardWriter = freeBoardWriter;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}

	public int getFreeBoardId() {
		return freeBoardId;
	}

	public void setFreeBoardId(int freeBoardId) {
		this.freeBoardId = freeBoardId;
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

	public String getFreeBoardContent() {
		return freeBoardContent;
	}

	public void setFreeBoardContent(String freeBoardContent) {
		this.freeBoardContent = freeBoardContent;
	}

	public String getFreeBoardWriter() {
		return freeBoardWriter;
	}

	public void setFreeBoardWriter(String freeBoardWriter) {
		this.freeBoardWriter = freeBoardWriter;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FreeBoardDto [freeBoardId=");
		builder.append(freeBoardId);
		builder.append(", memberNo=");
		builder.append(memberNo);
		builder.append(", freeBoardTitle=");
		builder.append(freeBoardTitle);
		builder.append(", freeBoardContent=");
		builder.append(freeBoardContent);
		builder.append(", freeBoardWriter=");
		builder.append(freeBoardWriter);
		builder.append(", createDate=");
		builder.append(createDate);
		builder.append(", updateDate=");
		builder.append(updateDate);
		builder.append("]");
		return builder.toString();
	}
	
}
