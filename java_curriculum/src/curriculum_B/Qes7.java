package curriculum_B;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		// 変数の宣言と初期化
		int stuNum = 0;
		
		String[] sub = {"英語", "数学", "理科", "社会", "全体"};
		
		Scanner sca = new Scanner(System.in);
		
		System.out.print("生徒の人数を入力してください(2以上):");
		// 人数を入力し格納
		stuNum = sca.nextInt();
		
		// 二次元配列の初期化
		int[][] score = new int[stuNum][4];
		
		// 人数分繰り返し処理
		for(int i = 0; i < stuNum; i++) {
			// 教科分繰り返し
			for(int j = 0; j < 4; j++) {
				System.out.print(i + 1 + "人目の『" + sub[j] + "』の点数を入力してください:");
				score[i][j] = sca.nextInt();
			}
			System.out.printf("%n");
		}
		
		// 変数の初期化
		double[] stuSum = new double[stuNum];
		double sumTotal = 0;
		double[] sum = new double[5];
		
		for(int i = 0; i < score.length; i++) {
			// 各教科の合計を取得
			sum[0] += score[i][0];
			sum[1] += score[i][1];
			sum[2] += score[i][2];
			sum[3] += score[i][3];
			for(int j = 0; j < score[i].length; j++) {
				// 人数分の合計と全体の合計を取得
				stuSum[i] += score[i][j];
				sumTotal += score[i][j];
			}
			// それぞれの平均値を出力
			System.out.println(i + 1 + "人目の平均点は" + stuSum[i] / 4 + "点です。");
		}
		System.out.printf("%n");
		
		sum[4] = sumTotal / 4;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 1; j++) {
				double subAvg = sum[i] / stuNum;
				double avg = Math.round(subAvg * 100.0) / 100.0;
				System.out.println(sub[i] + "の平均点は" + avg + "点です。");
			}
		}
		sca.close();
	}
}
		
		