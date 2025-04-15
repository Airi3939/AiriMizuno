package character2;

public class CharacterBase {
	
	////フィールド変数を定義
	//private データ型 フィールド名
	private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;
    private String name;

    public CharacterBase(int hp, int mp, int attack, int speed, int defense) {
        this.hp = hp;
        this.mp = mp;
        this.attack = attack;
        this.speed = speed;
        this.defense = defense;
    } 
    
        //getterとはprivate に設定されたフィールドは外部からアクセスが出来ないので、
        //メソッドを介してアクセスする必要があり、それが getter。
    	//getter, setter は 外部で扱えなくてはいけないため、すべて 「public」で記述すること！
   
    //public データ型 getフィールド名()
    //return this.フィールド名
    //getter フィールドの値を取り出す(取得する)だけのメソッド
    
    public String getName() {
        return name;
    }

    public int getHp() { 
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public int getAttack() {
        return attack;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    // Setter
    //setter は単純に**「フィールドに値を代入するためのメソッド」** 
    public void setName(String name) {
        this.name = name;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
    
    
}
