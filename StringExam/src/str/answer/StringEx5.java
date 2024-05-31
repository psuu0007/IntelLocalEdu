package str.answer;

public class StringEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 절대 원본 데이터를 변경하지 않는다
		String fileFullName = "Hello.java"; // 기준
		String fileName = "";   
		String fileExtensionName = "";  // 파일 확장자명
		
//		파일명과 파일확장자를 출력하시오
// 		ex:  
//		파일 전체명: Hello.java
//		파일명: Hello 
//		확장자명: java
		
		int pointStrIndex = fileFullName.indexOf(".");
		fileName = fileFullName.substring(0, pointStrIndex);
		fileExtensionName = 
			fileFullName.substring(pointStrIndex+1, fileFullName.length());
		
//		split()은 .이 인식되지 않는다 저렇게 표현해야 인식됨
//      String[] strArr = originStr.split("\\.");
//		String[] strArr = fileFullName.split("[.]");
//		fileName = strArr[0];
//		fileExtensionName = strArr[1];
		
		System.out.println("파일명: " + fileName);
		System.out.println("확장자명: " + fileExtensionName);

	}

}
