package three27;

public class PointTest {

	public static void main(String[] args) {
		
		Point p = new Point();
		p.x = 10;
		p.y = 20;
		
		System.out.println(p.getLocation());
		
		Point3D p3d = new Point3D();
		
		p3d.x = 1;
		p3d.y = 2;
		p3d.z = 3;
		
		System.out.println(p3d.getLocation());
		
		
		
	}
	
}
