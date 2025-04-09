package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//Q1
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char letter;
		String letters;
		boolean isBoolean;
		
		//Q2,3
		byteNum = 10;
		shortNum = 100;
		intNum = 1000;
		longNum = 10000;
		floatNum = 9.5f;
		doubleNum = 10.5;
		letter = 'a';
		letters = "ハロー";
		isBoolean = true;
		
		//Q4
		System.out.println(byteNum + shortNum + intNum + longNum);
		System.out.println(byteNum + byteNum);
		System.out.println(letter + " " + letters + " " + isBoolean);
		System.out.println(byteNum + byteNum + byteNum + shortNum + intNum + longNum);
		System.out.println(doubleNum / shortNum);
		System.out.println(byteNum - shortNum);
		
		//Q5
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num + num1));
		
		//Q6
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String favFood = "寿司";
		
		System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favFood + "です");
		
		//Q7
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        //BMI = 体重(kg) ÷ (身長(m) × 身長(m))
        //身長は cm → m に変換する必要あり（÷100）
        // BMI出力（小数点第1位まで表示）
        System.out.printf("BMIは%.1fです%n", bmi);
        
        //Q8
        // ここで再代入（新しい情報）
        name = "鈴木一郎";
        age = 24;
        height = 168.5;
        weight = 64.2;
        favFood = "オムライス";
        
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favFood + "です");
        heightInMeters = height / 100;
        bmi = weight / (heightInMeters * heightInMeters);
        System.out.printf("BMIは%.1fです%n", bmi);
        
        //Q9
        name = "鈴木一郎";
        age = age + age;
        height = height + height;
        weight = weight + weight;
        favFood = "オムライス";
        
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favFood + "です");
        heightInMeters = height / 100;
        bmi = weight / (heightInMeters * heightInMeters);
        System.out.printf("BMIは%.2fです%n", bmi);
        
        //Q10
        System.out.println(age >= 25);
        
        //Q11
        // 年齢・身長・体重を文字列型に型変換し、繋げて出力
        String profile = String.valueOf(age) + "歳, " + 
                         String.valueOf(height) + "cm, " + 
                         String.valueOf(weight) + "kg";
        System.out.println(profile); // 結果を出力
        
        //Q12
        // 年齢・身長を文字列型から整数型に変換
        int ageInt = Integer.parseInt(String.valueOf(age));  // 年齢を整数に変換
        int heightInt = (int) height;  // 身長を整数に変換（小数点以下を切り捨て）

        // 結果を出力
        System.out.println(ageInt);
        System.out.println(heightInt);
        
        //Q13
        // 年齢が25以上もしくは身長が160以上ならtrueを出力（if文なし）
        System.out.println((ageInt == 25 || heightInt >= 160));
	}

}
