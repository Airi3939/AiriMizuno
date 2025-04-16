package animalInfo;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("コンソールに文字を入力してください");
		String input =scanner.nextLine(); // 入力例：ライオン:2.1:80,ゾウ:3.2:40, ...
		
		String[] animals = input.split(","); //inputはユーザーがコンソールに入力した1つの長い文字列。
		//例：input = "ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30"
		//splitは文字列を特定の記号や文字で「区切って」バラバラにする メソッド。
		//String[] animalsの構造はanimals[0] → "ライオン:2.1:80"　animals[1] → "ゾウ:3.2:40"　animals[2] → "パンダ:1.9:30"
		//なぜ必要なのか → この split をしないと、「動物1匹ずつのデータ」が取り出せない。
		//"ライオン:2.1:80,ゾウ:3.2:40" ← これ全部を1つのデータとして処理するのは無理
		//split(",") を使えば、1匹ごとのデータに分けられるから、 その後で さらに : で分解して「名前」「体長」「速度」を取り出せる！
		
		for (String animalData : animals) {
			//animalsの中身が"ライオン:2.1:80","ゾウ:3.2:40","パンダ:1.9:30"だったとして
			//上のfor文のループは3回実行されるという意味
			String[] parts = animalData.split(":");
			//上の処理は、1匹の動物のデータを「名前」「体長」「速度」に分けてる。
			//処理をする前は　animalData = "ライオン:2.1:80"　1匹分の情報が :（コロン）で区切られて入ってる！
			//splitをすることによって結果はこうなる。↓↓
			//parts[0] → "ライオン"（名前）,parts[1] → "2.1"（体長）,parts[2] → "80"（速度）
			//この parts 配列の中には、3つの要素が順番に入ってる。
			if (parts.length != 3) continue;
			//配列の長さが 3じゃなかったらそのループの回をスキップして、次のループに進むって命令
			
			String name = parts[0]; // 動物名を取り出す
			double height = Double.parseDouble(parts[1]); //// 体長を数値に変換して取り出す
			int speed =Integer.parseInt(parts[2]); // 速度も数値に変換して取り出す
			//✅ Double.parseDouble() と Integer.parseInt() は、文字（"2.1" や "80"）を数字（double や int）に変換してる
			//もし "ゾウ:3.2:40" がきたら、parts[0] → "ゾウ"、parts[1] → "3.2"、parts[2] → "40"となる
			
			Animal2 animal = new Animal2(name, height, speed);
			//これは、「Animal2クラスのインスタンス（＝実体）を作ってる」コード
			//設計図 Animal2 から、name, height, speed の情報を使って、動物を作ったということ
			//この一行で、「ライオンの情報を持った Animal2 オブジェクト」を作って、animal って名前で使えるようにした
			animal.printInfo();
		}
		scanner.close();

	}

}
