package animalInfo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner =new Scanner(System.in);
		
		// ユーザーに入力を促す
        System.out.println("コンソールに文字を入力してください");
        
        // 入力例: ライオン:2.1:80,ゾウ:3.2:40,...
        String input = scanner.nextLine();
        scanner.close();
        
    	// 動物名とデータのMap（学名を紐づける）
        // Mapは使わない方針なので if 文で分岐
        String[] animals = input.split(",");
        
        for (String animalData : animals) {
            String[] parts = animalData.split(":");
            String name = parts[0];
            double height = Double.parseDouble(parts[1]);
            int speed = Integer.parseInt(parts[2]);

            String scientificName = getScientificName(name);

            Animal animal = new Animal(name, height, speed, scientificName);
            animal.printInfo();
        }
    }
	// 🔽 mainメソッドの外に出す
    private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            case "インコ":
                return "不明";
            default:
                return "不明";
        }
    }
}

//scientificName.put("ライオン", "パンテラ レオ"); //値を追加・登録	put(key, value)
//scientificName.put("ゾウ", "ロキソドンタ・サイクロティス");
//scientificName.put("パンダ", "アイルロポダ・メラノレウカ");
//scientificName.put("チンパンジー", "パン・トゥログロディテス");
//scientificName.put("シマウマ", "チャップマンシマウマ");
//scientificName.put("インコ", "不明");
