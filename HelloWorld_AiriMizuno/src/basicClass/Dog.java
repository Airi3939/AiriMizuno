package basicClass;

public class Dog {
	// フィールド（動物の名前と数）Q1,Q2
	private String name;  // ← private にしてカプセル化
    private int count;

    // コンストラクタ①：名前を「犬」にする
    public Dog() {
        this.name = "犬"; //初期化をするイメージ
    }

    // コンストラクタ②：数を指定する
    public Dog(int count) {
        this.count = count;
    }
    
    // 🔑 getter を追加することで、別クラスから値を取得できる
    //なぜgetterを使うのか→Javaでは、
    //外部のクラスから直接フィールドにアクセスするのは安全じゃないと考えられています（カプセル化の考え方）。
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
}
