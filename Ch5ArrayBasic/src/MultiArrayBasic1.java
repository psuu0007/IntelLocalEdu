
public class MultiArrayBasic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2차원 배열
		
		int[][] scoreArr = new int[4][3];
//		alt + shift + a: 행 조작?
		scoreArr[0][0] = 1;
		scoreArr[0][1] = 2;
		scoreArr[0][2] = 3;
		scoreArr[1][0] = 4;
		scoreArr[1][1] = 5;
		scoreArr[1][2] = 6;
		scoreArr[2][0] = 7;
		scoreArr[2][1] = 8;
		scoreArr[2][2] = 9;
		scoreArr[3][0] = 10;
		
		System.out.print(scoreArr[0][0]);
		System.out.print(scoreArr[0][1]);
		System.out.print(scoreArr[0][2]);
		System.out.println();
		System.out.print(scoreArr[1][0]);
		System.out.print(scoreArr[1][1]);
		System.out.print(scoreArr[1][2]);
		System.out.println();
		System.out.print(scoreArr[2][0]);
		System.out.print(scoreArr[2][1]);
		System.out.print(scoreArr[2][2]);
		System.out.println();
		System.out.print(scoreArr[3][0]);
		System.out.print(scoreArr[3][1]);
		System.out.print(scoreArr[3][2]);
		System.out.println();
		System.out.println("================");
		System.out.println(scoreArr.length);
		System.out.println(scoreArr[0].length);
	}

}
