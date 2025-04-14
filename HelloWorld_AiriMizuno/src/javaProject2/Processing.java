package javaProject2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Processing {
	 private String greeting;
	 private String sushiComment;
	 private String foodComment;
	 private String currentDateTime;

	 public Processing() {
	     this.greeting = "こんにちは！ここは日本です！";
	     this.sushiComment = "この寿司はうまい";
	     this.foodComment = "寿司は和食です";

	     // 現在日時の取得とフォーマット
	     Date now = new Date();
	     SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	     this.currentDateTime = "今の現在日時は" + formatter.format(now) + "です";
	 }
	 public void printMessages() {
		 //↑これは（）の中を表示するだけで、何も返さないので void。
	     System.out.println(this.greeting);
	     System.out.println(this.sushiComment);
	     System.out.println(this.foodComment);
	     System.out.println(this.currentDateTime);
	 }
	 //質問：thisを使う理由
	 //もし使わなかった場合
	 //privateじゃなかったら
}
