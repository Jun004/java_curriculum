package curriculum_B;

import java.text.DecimalFormat;

public class Qes5 {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat();
		format.setMinimumIntegerDigits(3);
		for(int i = 1; i < 10; i++){
			// 2重ループ
			for(int j = 1; j < 21; j++) {
				// 掛け算式を3桁で出力
				String dfA = format.format(i);
				String dfB = format.format(j);
				String dfC = format.format(i * j);
				System.out.print(dfB + " * " + dfA + " = " + dfC);
				// 処理を抜ける
				if (j < 20) {
					// ||を出力
					System.out.print(" || ");
				}
			}
			// 改行させる
			System.out.println();
		}
	}
}
