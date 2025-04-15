package lion;

public class LionProcess {
	private String name;
	private double length;
	private int speed;
	
	// Setter
	//メンバ変数を変更するメソッドgetterとは違い、戻り値は返しません。
	public void setName(String name) { //引数の変数
		this.name = name; // ← thisを使ってフィールドに代入
		// this.name = name; は「外から来た名前を、自分の持ってるnameに代入する」って意味
		// 自分（this）のname ← 引数のname
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// Getter
	/*
	 * クラスを構成するメンバ変数から値を取得するためのメソッド
　　		getterは「get」から始まる名前をつけるというルールがある
	 */
	public String getName() {
		return this.name;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
}
