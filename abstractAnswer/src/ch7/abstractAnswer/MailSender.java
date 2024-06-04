package ch7.abstractAnswer;

public class MailSender extends ContentSender {
	
	
	public MailSender(String title, String name, String content, String recipient) {
		super(title, name, content, recipient);
		
	}

	@Override
	void sendMsg(String sendMethod) {
		// TODO Auto-generated method stub
		System.out.println("언제 어디서나 쉽고 빠르게!");
		System.out.println("====== " + sendMethod + " ======");
		
		System.out.println("제목 = " + title);
		System.out.println("이름 = " + name);
		System.out.println("내용 = " + content);
		System.out.println("받는사람 = " + recipient);
		
		System.out.println("====== " + sendMethod + " ======");
	}

}
