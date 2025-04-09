package curriculumB;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

        int studentCount;

        // 生徒数を2以上で入力させる
        do {
            System.out.print("生徒の人数を入力してください（2以上）: ");
            studentCount = scanner.nextInt();
        } while (studentCount < 2);

        // 各科目の合計
        double totalEnglish = 0, totalMath = 0, totalScience = 0, totalSocial = 0;

        for (int i = 0; i < studentCount; i++) {
            System.out.println();

            System.out.print((i + 1) + "人目の『英語』の点数を入力してください :");
            double english = scanner.nextDouble();

            System.out.print((i + 1) + "人目の『数学』の点数を入力してください :");
            double math = scanner.nextDouble();

            System.out.print((i + 1) + "人目の『理科』の点数を入力してください :");
            double science = scanner.nextDouble();

            System.out.print((i + 1) + "人目の『社会』の点数を入力してください :");
            double social = scanner.nextDouble();

            double studentAverage = (english + math + science + social) / 4.0;

            System.out.printf("\n%d人目の平均点は%.2f点です。\n", i + 1, studentAverage);

            totalEnglish += english;
            totalMath += math;
            totalScience += science;
            totalSocial += social;
        }

        // 各科目の平均
        double avgEnglish = totalEnglish / studentCount;
        double avgMath = totalMath / studentCount;
        double avgScience = totalScience / studentCount;
        double avgSocial = totalSocial / studentCount;

        // 全体平均 = 各科目の合計点の平均
        double totalAvg = (avgEnglish + avgMath + avgScience + avgSocial) / 4.0;

        System.out.println();
        System.out.printf("英語の平均点は%.2f点です。\n", avgEnglish);
        System.out.printf("数学の平均点は%.2f点です。\n", avgMath);
        System.out.printf("理科の平均点は%.2f点です。\n", avgScience);
        System.out.printf("社会の平均点は%.2f点です。\n", avgSocial);
        System.out.printf("全体の平均点は%.2f点です。\n", totalAvg);

        scanner.close();
    }
}

