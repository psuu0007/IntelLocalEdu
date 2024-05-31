package three81.basic;

public interface Tv extends Mp3, Video{
//ctrl + shift + x와 y로 대소문자화
	public boolean POWER = false;
	public static final int CHANNEL = 0;
	
	public void power();
	
	public abstract void channelUp();
	
//	public void channerDown() {
		// 오류가 발생한다
//	}
	
	
	
}
