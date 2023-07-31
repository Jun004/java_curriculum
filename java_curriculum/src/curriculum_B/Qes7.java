package curriculum_B;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 変数の宣言と初期化
		int stu_num = 0;
		int i = 0;
		int j = 0;
		
		String[] wo = {"英語", "数学", "理科", "社会"};
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("生徒の人数を入力してください(2以上):");
		// 人数を入力し格納
		stu_num = scr.nextInt();
		
		// 二次元配列の初期化
		int[][] score = new int[stu_num][4];
		
		// 人数分繰り返し処理
		for(i = 0; i < stu_num; i++) {
			// 教科分繰り返し
			for(j = 0; j < 4; j++) {
				System.out.print(i + 1 + "人目の『" + wo[j] + "』の点数を入力してください:");
				score[i][j] = scr.nextInt();
			}
			System.out.printf("%n");
		}
		
		// 変数の初期化
		double[] sum = new double[stu_num];
		double sum_t = 0;
		double sum_e = 0;
		double sum_m = 0;
		double sum_sc = 0;
		double sum_s = 0;
		for(i = 0; i < score.length; i++) {
			// 各教科の合計を取得
			sum_e += score[i][0];
			sum_m += score[i][1];
			sum_sc += score[i][2];
			sum_s += score[i][3];
			for(j = 0; j < score[i].length; j++) {
				// 人数分の合計と全体の合計を取得
				sum[i] += score[i][j];
				sum_t += score[i][j];
			}
			// それぞれの平均値を出力
			System.out.println(i + 1 + "人目の平均点は" + sum[i]/4 + "点です。");
		}
		System.out.printf("%n");
		// 平均値を出力
		System.out.println("英語の平均点は" + String.format("%.2f", sum_e/stu_num) + "点です。");
		System.out.println("数学の平均点は" + String.format("%.2f", sum_m/stu_num) + "点です。");
		System.out.println("理科の平均点は" + String.format("%.2f", sum_sc/stu_num) + "点です。");
		System.out.println("社会の平均点は" + String.format("%.2f", sum_s/stu_num) + "点です。");
		System.out.println("全体の平均点は" + String.format("%.2f", (sum_t/stu_num)/4) + "点です。");
		scr.close();
	}
}