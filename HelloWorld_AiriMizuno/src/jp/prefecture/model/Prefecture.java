package jp.prefecture.model;

public class Prefecture {
	private String name;
	private String capital;
	private double area;
	
	//コンストラクタ（＝最初にオブジェクトを作るときの初期設定)
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}
	//なぜgetはあるのにsetはないのか
	//「都道府県名・県庁所在地・面積」は途中で変わらない固定データとして扱いたい！つまり、読み取り専用でOK！
	
	//クラスの中のname・capital・areaはprivateになっていて、他のクラスから直接アクセスできないように守られてる。
	//だから代わりに get〇〇() を使って「安全に中身を見るための窓口」を用意してる⭐
	//Mainクラスは外部クラス。Prefectureクラスのnameフィールドに直接アクセスはできないが、getName()メソッドを使ってその値を取得できる。️
	public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public double getArea() {
        return area;
    }

    public void printInfo() {
        System.out.println("都道府県名：" + name);
        System.out.println("県庁所在地：" + capital);
        System.out.println("面積：" + area + "km2\n");
    }
	
}
