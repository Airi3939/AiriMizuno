package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	
	//Q1
	public static void message(String text, int version) {
	    System.out.println(text + " " + version); //""の中は半角スペースが入っている
	}
	
	//Q2
	public static void multiply(int a, int b) {
		System.out.println(a * b);
	}
	
	//Q3
	public static void array(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
	//Q4
	public static void multiply(double a, double b) {
		System.out.printf("%.1f%n", (a + b));
	}
	//Q5
	public static int[] randomNumbers(int count) {
		Random random = new Random(); //ランダムな数字を作るための道具（Randomのインスタンス）を準備
		int[] nums = new int[count]; //count個ぶんの箱（整数の配列）を作る。ここにランダムな数字をどんどん入れてく。
		int value; //一時的にランダムな数字を入れておく変数を作る。
		for (int i = 0; i < count; i++) { 
			//i を 0 から count-1 まで動かして、count 回くり返すループを作ってる。
			//1つずつランダムな数を生成して nums[i] に入れる。
	        do {
	            value = random.nextInt(100) + 1;
	            //random.nextInt(100) は「0～99のランダムな数」を出す。
	            // +1 してるので、実際の範囲は 1～100。	            
	        } while (value == 0);
	        // while (value == 0) は保険で「万が一0だったらもう一回」だけど、+1 してるので実際は0にはならない。
	        nums[i] = value; //i 番目の配列の場所にランダムな値を入れる。
	        System.out.println(value);
	    }
	    return nums; //全部の数字が詰まった配列 nums をメソッドの結果として返す。
	}
	
	//Q6
	public static double average(int[] numbers) {
	    int sum = 0;
	    for (int num : numbers) {
	        sum += num;
	    }
	    double average = (double) sum / numbers.length;
	    System.out.println("平均値: " + average);
	    return average;
	}
	
	//Q7
	public static void above50(double value) {
	    System.out.println(value >= 50);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ	

// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
		message("Hello JavaSE", 11);
		
// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
		multiply(5, 3);
// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
		int[] num = {10, 20, 30};
		array(num);
// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		multiply(2.1, 3.2);
		
// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
// ※0は出力＆格納しないようにしてください。
		int[] randoms = randomNumbers(5);
// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
// ※小数点以下も表示されるようにしてください。
		double avg = average(randoms);
// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
		above50(avg);
	}

}
