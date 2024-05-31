package ch7.abstractExam;

/**
 * @author user
 *
 */
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

	
	/**
	 * @param sendMethod 보내는 방법 ex) 카카오톡 or Line or 네이버메일 or 다음메일 ...  
	 */
	abstract void sendMsg(String sendMethod);
	
}
