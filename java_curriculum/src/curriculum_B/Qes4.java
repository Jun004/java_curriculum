package curriculum_B;

import java.text.DecimalFormat;

public class Qes4 {

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat();
		format.setMinimumIntegerDigits(2);
		// 繰り返し処理
		for(int i = 1; i < 10; i++){
			// 2重ループ
			for(int j = 1; j < 10; j++) {
				String dfA = format.format(i);
				String dfB = format.format(j);
				String dfC = format.format(i * j);
				// 掛け算式を出力
				System.out.print(dfA + " * " + dfB + " = " + dfC);
				// 処理を抜ける
				if (j < 9) {
					// ||を出力
					System.out.print(" || ");
				}				
			}
			// 改行させる
			System.out.println();
		}
	}
}