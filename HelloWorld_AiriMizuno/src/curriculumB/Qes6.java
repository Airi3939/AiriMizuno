package curriculumB;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ 
		
        //Q6
        
		Random random = new Random();
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); 
        // 全角の「、」を半角のカンマに置き換える
        input = input.replace("、", ",");
        
        // 商品リストをカンマで分割して配列に格納
        String[] products = input.split(",");
        
        // 拡張for文で商品リストを処理
        int tvStock = random.nextInt(12);  // 0～11のランダムな数字
    	int displayStock = 11 - tvStock;
        for (String product : products) {
        	
        	// Switch文で商品を判別
        	switch (product.trim()) { //trimは、文字列の先頭と末尾にある空白文字（スペース、タブ、改行など）を削除するメソッド
        			// テレビとディスプレイは同じ商品扱い
	        	case "テレビ":	
	        	case "ディスプレイ":	        		
	        		System.out.println(product.equals("テレビ") ? "テレビの残り台数は" + tvStock + "台です" : "ディスプレイの残り台数は" + displayStock + "台です");
//	        		System.out.println("テレビの残り台数は" + tvStock + "台です");
//	        		System.out.println("ディスプレイの残り台数は" + displayStock + "台です");	 が33行目にまとめられている
	        		break;
	        		//product.trim()  入力された product の前後にある空白（スペースなど）を取り除く
	        		//case "テレビ":	product が "テレビ" の場合、この後の処理を実行
	        		//case "ディスプレイ":	product が "ディスプレイ" の場合も、"テレビ" と同じ処理を実行する
	        		//三項演算子（?:）	product が "テレビ" なら tvStock の値を使い、それ以外（＝"ディスプレイ"）なら displayStock の値を使う
	        		//break;	この case を終えて switch 文を抜ける
	        	case "パソコン":
	        	case "冷蔵庫":
	        	case "扇風機":
	        	case "洗濯機":
	        	case "加湿器":
	        		int Stock = random.nextInt(12);
        			System.out.println(product + "の残り台数は" + Stock + "台です");
        			break;
	        	                   
                default:
                    // それ以外の商品の場合
                    System.out.println("『" + product + "』は指定の商品ではありません");
                    break;
	        	}
	        }
        
	}

}
