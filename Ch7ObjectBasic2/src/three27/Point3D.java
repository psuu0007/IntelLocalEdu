package three27;

public class Point3D extends Point{

	
	int z;
//	재정의
	String getLocation() { // 오버라이딩
		return "x : " + x + ", y : " + y + ", z : " + z;
	}
	
}
