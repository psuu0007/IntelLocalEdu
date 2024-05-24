
public class MultiArrayBasic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2차원 배열
//		다차원
		int[][] scoreArr = {
			{
				1, 2, 3
			},
			{
				10, 50, 100
			}
		};

		for (int i = 0; i < scoreArr.length; i++) {
			for (int j = 0; j < scoreArr[i].length; j++) {
				System.out.print(scoreArr[i][j] + "\t");
			}
			System.out.println();
		}
		
	}

}
