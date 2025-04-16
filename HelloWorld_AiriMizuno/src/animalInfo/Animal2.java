package animalInfo;

import java.util.HashMap;
import java.util.Map;

public class Animal2 {
    private String name;
    private double height;
    private int speed;

    private static final Map<String, String> scientificName = new HashMap<>();

    static {
        scientificName.put("ライオン", "パンテラ レオ");
        scientificName.put("ゾウ", "ロキソドンタ・サイクロティス");
        scientificName.put("パンダ", "アイルロポダ・メラノレウカ");
        scientificName.put("チンパンジー", "パン・トゥログロディテス");
        scientificName.put("シマウマ", "チャップマンシマウマ");
        scientificName.put("インコ", "不明");
    }

    // コンストラクタ
    public Animal2(String name, double height, int speed) {
        this.name = name;
        this.height = height;
        this.speed = speed;
    }

    // 情報を表示するメソッド
    public void printInfo() {
        System.out.println("動物名：" + name);
        System.out.println("体長：" + height + "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName.getOrDefault(name, "不明"));
        System.out.println(); // 空行で区切る
    }
}
