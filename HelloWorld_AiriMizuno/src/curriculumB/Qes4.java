package curriculumB;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				int result = i * j;
				System.out.printf("%03d * %03d = %03d", i, j, result);				
				if (j != 9) {
					System.out.print(" || ");
				}			
			}
			System.out.println(); // 改行（次の段に進む）
		}
	}

}
