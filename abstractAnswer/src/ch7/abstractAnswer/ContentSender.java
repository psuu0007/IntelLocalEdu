package ch7.abstractAnswer;

public abstract class ContentSender {
	String title;  // 제목
	String name;   // 보낸이
	String content = "";  // 내용
	String recipient = ""; // 받는 사람
	
	
	
	public ContentSender() {
		super();
	}

	public ContentSender(String title, String name, String content, String recipient) {
		super();
		this.title = title;
		this.name = name;
		this.content = content;
		this.recipient = recipient;
	}

	abstract void sendMsg(String sendMethod);
	
}
