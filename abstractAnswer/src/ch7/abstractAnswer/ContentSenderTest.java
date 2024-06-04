package ch7.abstractAnswer;

public class ContentSenderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MailSender ms = new MailSender("안녕하세요?", "박성욱", "또 하루가 시작되었네요", "여러분");
		MobileMessengerSender mms = 
				new MobileMessengerSender("날씨가 좋네요", "박성욱", "언제 한강에서 치맥 콜?", "송금동 외 9명");
		
		ms.sendMsg("네이버 메일");
		
		System.out.println();
		
		mms.sendMsg("카카오톡");
		
	}

}
