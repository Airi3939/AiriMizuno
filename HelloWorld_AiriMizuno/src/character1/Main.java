package character1;

import java.util.Scanner;
import character2.PlayerCharacter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

        System.out.print("名前を入力してください: ");
        String inputName = scanner.nextLine();

        PlayerCharacter player = new PlayerCharacter(inputName);
        player.printStatus();

        scanner.close();
	}

}
