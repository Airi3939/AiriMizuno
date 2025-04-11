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
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

// Q1：フィールドに動物の名前の変数を定義してください。
		
// Q2：フィールドに動物の数の変数を定義してください。
		
// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
		
// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
		// デフォルトコンストラクタ（nameに"犬"が入る）
		Dog dog1 = new Dog();
		System.out.println("動物の名前：" + dog1.name);

        // 引数つきコンストラクタ（countに数字が入る）
		Dog dog2 = new Dog(3);
		System.out.println("動物の数：" + dog2.count);
		
	}

}
