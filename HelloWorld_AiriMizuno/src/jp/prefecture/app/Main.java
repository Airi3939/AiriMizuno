package jp.prefecture.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import jp.prefecture.model.Prefecture;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String[] rawData = {
	            "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275",
	            "宮城県:仙台市:7282", "秋田県:秋田市:11638", "山形県:山形市:9323",
	            "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408",
	            "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"
	        };

	        List<Prefecture> allPrefectures = new ArrayList<>();
	        for (String entry : rawData) { //rawData から1つずつ文字列を取り出してentryに代入
	            String[] parts = entry.split(":"); //その文字列を「:」で分けて「都道府県名・県庁所在地・面積」に分解
	            //この場合parts[0] は「北海道」、parts[1] は「札幌市」、parts[2] は「83424」
	            allPrefectures.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
	            //分割されたデータを使って Prefecture クラスのインスタンス（オブジェクト）を作る
	            //・parts[0]：都道府県名（例：「栃木県」）
	            //・parts[1]：県庁所在地（例：「宇都宮市」）
	            //・Double.parseDouble(parts[2])：文字列の面積を数値に変換（例：「6408」→ 6408.0）
	            //作ったオブジェクトを allPrefectures リストに追加
	        }

	        //ここからはユーザーに都道府県の番号とソート順（昇順・降順）を入力させて、該当する都道府県を面積順に表示する処理
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("番号をカンマ区切りで入力してください（例：8,5,9）:");
	        String[] indices = scanner.nextLine().split(",");
	        //例：8,5,9 など、都道府県のインデックス番号をカンマで分けて入力。

	        System.out.println("昇順は asc、降順は desc を入力してください:");
	        String order = scanner.nextLine().trim().toLowerCase();
	        //asc（昇順）か desc（降順）を入力。大文字小文字の違いは無視される。

	        List<Prefecture> selected = new ArrayList<>();
	        for (String idxStr : indices) {
	            try {
	                int index = Integer.parseInt(idxStr.trim()); 
	                //.trim() は 空白を取り除く メソッド。Integer.parseInt() は 文字列を整数に変えるメソッド
	                //" 5" → trim() → "5" → parseInt() → 5　こういうこと。
	                
	                selected.add(allPrefectures.get(index));
	                //allPrefectures は すべての都道府県が入ったリスト
	                //index 番目の都道府県を取り出す：allPrefectures.get(index)
	                //selected は「ユーザーが選んだ都道府県を入れる箱」
	                //選ばれた都道府県を selected に add() して追加してる
	                
	            } catch (Exception e) {
	            //例えば「abc」とか「8a」みたいに数字じゃない文字が入ってたらエラーが出る。
	                System.out.println("無効な番号: " + idxStr);
	            }
	        }

	        selected.sort((p1, p2) -> { //ラムダ式 を使ったソート（並び替え）の処理
	            if (order.equals("asc")) { //「asc」だったら、小さい順（昇順） に並べる。
	                return Double.compare(p1.getArea(), p2.getArea());
	            } else { //それ以外（desc）だったら、大きい順（降順） に並べる
	                return Double.compare(p2.getArea(), p1.getArea());
	            }
	        });

	        for (Prefecture pref : selected) {
	            pref.printInfo();
	            //並び替えが終わった都道府県リストから、1つずつ取り出して、コンソールに表示する！


	        }

	        scanner.close();
	}

}
