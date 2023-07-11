package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i < 10; i++){
			// 変数jを使っての2重ループ
			for(int j = 1; j < 21; j++) {
				// 変数iと変数jの掛け算式を3桁で出力
				System.out.print(String.format("%03d", j) + " * " + String.format("%03d", i) + " = " + String.format("%03d", i * j));
				// 変数jが20になったとき処理を抜ける
				if (j == 20) {
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
