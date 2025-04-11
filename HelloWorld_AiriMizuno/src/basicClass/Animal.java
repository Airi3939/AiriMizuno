package basicClass;

class Dogdog {
    String name = "ポチ";   // Q1用：名前
    int count = 1;         // Q2用：動物の数（例として1匹）
}

public class Animal {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dogdog dog1 = new Dogdog(); // Dogクラスのインスタンスを作成
		System.out.println("動物の名前：" + dog1.name);
		
// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dogdog dog2 = new Dogdog();
        System.out.println("動物の数：" + dog2.count);
        
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
        java.time.LocalDateTime now = java.time.LocalDateTime.now(); //
        java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDate = now.format(formatter);
        System.out.println("現在の日時：" + formattedDate);
	}

}
