package character2;

import java.util.Random;

public class PlayerCharacter extends CharacterBase {
	private String name;
	
	public PlayerCharacter(String name) {
		super(randomStat(), randomStat(), randomStat(), randomStat(), randomStat());
		this.name = name;
	}
	private static int randomStat() {
        Random rand = new Random();
        return rand.nextInt(1000); // 0〜999 のランダム値
    } 

    public void printStatus() {
        System.out.println("こんにちは 「" + this.name + "」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
    }
}

