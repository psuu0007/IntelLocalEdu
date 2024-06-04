package ch7.abstractAnswer;

public class MobileMessengerSender extends ContentSender{
	
	public MobileMessengerSender(String title, String name, String content, String recipient) {
		super(title, name, content, recipient);
	}


	@Override
	void sendMsg(String sendMethod) {
		// TODO Auto-generated method stub
		System.out.println("전세계 어디서나 친구와 1:1 또는 그룹채팅을 무료로!!");
		System.out.println("====== " + sendMethod + " ======");
		
		System.out.println("제목 = " + title);
		System.out.println("이름 = " + name);
		System.out.println("내용 = " + content);
		System.out.println("받는사람 = " + recipient);
		
		System.out.println("====== " + sendMethod + " ======");
	}

	
	
}
