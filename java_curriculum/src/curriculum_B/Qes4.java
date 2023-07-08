package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問４
		// 変数iを使って繰り返し処理
		for(int i = 1; i < 10; i++){
			// 変数jを使っての2重ループ
			for(int j = 1; j < 10; j++) {
				// 変数iと変数jの掛け算式を出力
				System.out.print(String.format("%02d", i) + " * " + String.format("%02d", j) + " = " + String.format("%02d", i * j));
				// 変数jが9になったとき処理を抜ける
				if (j == 9) {
					break;
				}
				// ||を出力
				System.out.print(" || ");
			}
			// 改行させる
			System.out.println();
		}
	}
}