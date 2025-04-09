package curriculumB;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		for (int j = 1; j <= 9; j++) { //掛ける数（左の数）
			for (int i = 1; i <= 20; i++) { //掛けられる数（右の数）
				int result = i * j;
				System.out.printf("%03d * %03d = %03d", i, j, result);
				//% フォーマットの開始, 0 空いてる桁を 0 で埋める, 3 3桁で表示するという指定, d 数値（整数）を表示
				
			if (i != 9) {
				System.out.print(" || ");
				}
			}		
			//改行が必要
			System.out.println();
		}
		
	}

}
