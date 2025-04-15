package animalInfo;

//import java.util.HashMap;
//import java.util.Map; //Javaでマップ（連想配列）を使うための準備

public class Animal {
	private String name;
	private double height;
	private int speed;
	private String scientificName;
	//private このクラスの中だけで使える（他のクラスからアクセス不可）
	//インスタンスではなくクラス全体で一つだけ共有される＝何個Animalを作っても、このマップは１つだけ
	//一度代入したら変えられない（再代入できない）=別のMapに入れ替えることはできない
	
	
	public Animal(String name, double height, int speed, String scientificName) {
        this.name = name;
        this.height = height;
        this.speed = speed;
        this.scientificName = scientificName;
    }
	public void printInfo() {
	    System.out.println("動物名：" + name);
	    System.out.println("体長：" + height + "m");
	    System.out.println("速度：" + speed + "km/h");
	    System.out.println("学名：" + scientificName);
	    System.out.println(); // 空行で区切る
	}

	
}
