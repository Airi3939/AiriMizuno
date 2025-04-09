package curriculumB;

import java.util.Random;
import java.util.Scanner; // ← これがないと scanner は使えない

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 Scanner scanner = new Scanner(System.in); // 入力用のScannerを作成（定義している）
		 Random random = new Random(); 
		 //じゃんけんの 相手の手（コンピュータの手）をランダムに決定するために使用されています。

		
		 String userName = scanner.nextLine(); 
		//scanner.nextLine() はユーザーの入力を文字列として受け取る
		
		//Q1-2
		if (userName.length() > 10) {
			 System.out.println("名前を10文字以内にしてください");
		} else if (userName == null || userName.trim().isEmpty()) { 
			System.out.println("名前を入力してください");
			//.trim().isEmpty() 空白しか入力されていないような文字列も空とみなす
		} else if (userName != null && !userName.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
            /*
             * matches() メソッドは、文字列が正規表現にマッチするかをチェック
             * 正規表現 "^[a-zA-Z0-9]+$" は、半角英数字だけが含まれていることを意味する
             */
		} else {
			System.out.println("ユーザー名「" + userName + "」を登録しました");
			//正常な入力
		}
		
		//Q3 無限ループ
		
		int rounds = 0; // じゃんけんをした回数
		while (true) {
			rounds++; // じゃんけんの回数をカウント
			
			int userHand = scanner.nextInt();  // ユーザーが直接入力
			int otherHand = random.nextInt(3); // 0, 1, 2のランダム値
			
			// ユーザーと相手の手を表示
            String[] hands = {"グー", "チョキ", "パー"};
            System.out.println(userName + "の手は「" + hands[userHand] + "」");
            System.out.println("相手の手は「" + hands[otherHand] + "」");
            
        // 勝敗判定
            if (userHand == otherHand) {
            	System.out.println("DRAW あいこ もう一回しましょう！");
            } else if ((userHand == 0 && otherHand == 1) ||
            		   (userHand == 1 && otherHand == 2) ||
            		   (userHand == 2 && otherHand == 0)) {
            	System.out.println("やるやん。");
            	System.out.println("次は俺はリベンジさせて");
            	break; // 勝ったらループ終了
            	
            } else { //elseブロックの中にif文を入れることは可能。これを「ネストされたif文」という。
            	// それぞれ負けた場合のメッセージ
            	if (userHand == 0 && otherHand == 2) {
            		System.out.println("俺の勝ち！");
            		System.out.println("なんで負けたか、明日まで考えといてください。");
            		System.out.println("そしたら何かが見えてくるはずです");
            	} else if (userHand == 1 && otherHand == 0) {
            		System.out.println("俺の勝ち！");
            		System.out.println("負けは次につながるチャンスです！");
            		System.out.println("ネバーギブアップ！");
            	} else if (userHand == 2 && otherHand == 1) {
            		System.out.println("俺の勝ち！");
            		System.out.println("たかがじゃんけん、そう思ってないですか？");
            		System.out.println("それやったら次も、俺が勝ちますよ");
            	}
            }
		} //while文から抜ける
		// 勝つまでにかかった回数を表示
        System.out.println("勝つまでにかかった合計回数は" + rounds + "回です");
        
        scanner.close();
        
}}
