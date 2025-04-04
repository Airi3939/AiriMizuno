package curriculumA;

public class Qes1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		byte byteNum;
		//初期値を設定する
		byteNum = 10;
		//数字は””これいらない
		//byteは型名、byteNumは変数名
		short shortNum;
		shortNum = 100;
		int intNum;
		intNum = 1000;
		//intは整数のみ
		long longNum;
		longNum = 10000;
		float floatNum;
		floatNum = 9.5f;
		double doubleNum;
		doubleNum = 10.5;
		char letter;
		letter = 'a';
		// シングルクォートで囲む
		String letters;
		letters = "ハロー";
		// ダブルクォートで囲む
		boolean isBoolean;
		isBoolean = true;
		//boolean は true か false の2値のみ
		
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + " " + letters + " " + isBoolean);
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum * shortNum * intNum * longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		//Q4
		String name = "山田太郎";
		System.out.println("こんにちは、" + name + "さん！");
		
		//5
		int age = 25;
		System.out.println("年齢：" + age + "歳");
		
		//Q6
		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		System.out.println(sum);
		
		//Q7
		int score;
		score = 80;
		score = score + 20;
		System.out.println("最終スコア：" + score);
		
		//Q8
		double price = 99.99;
		int i = (int)price; // int 型に変換（小数点以下切り捨て）
		System.out.println("整数価格：" + i);
		//int型に変換とあるが、変数名を変えればいいのか？
		
		//Q9
		String numStr = "123";
		int num = Integer.parseInt(numStr); // String → int に変換 （文字列から数字）
		System.out.println("変換後の値：" + (num + 10)); // 123 + 10 = 133
		//(num + 10) をカッコで囲むことで、文字列結合ではなく数値計算を先に行う
		
		
		//Q10
		int num3 = 50;
		String str = String.valueOf(num3);  // int → String に変換　（数字から文字列）
		System.out.println("得点：" + str + "点");
		
		//Q11
		int a = 10;
		int b = 20;
		boolean result = (a < b) ? true : false;
		System.out.println(result);
		
		//Q12
		int x = 15;
		if(x >= 10) {
			System.out.println("OK");
		}
		else if(x <= 10) {
			System.out.println("NG");
		}
		
		//Q13
		String text = "私はJavaが好きです。Javaは楽しい！";
		String newText = text.replace("Java", "Python"); // "Java" を "Python" に置き換え
		System.out.println(newText);
		

	}

}
