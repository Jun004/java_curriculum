package Curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 問１
		// 変数の宣言
		byte b_t;
		short s_t;
		int i_t;
		long l_t;
		float f_t;
		double d_t;
		char c_t;
		String str_t;
		boolean bl_t;
		
		// 問２
		// 初期値の代入
		b_t = 0;
		s_t = 0;
		i_t = 0;
		l_t = 0L;
		f_t = 0.0f;
		d_t = 0.0d;
		c_t = '\u0000';
		str_t = null;
		bl_t = false;
		
		// 問３
		// 変数に値を代入
		b_t = 10;
		s_t = 100;
		i_t = 1000;
		l_t = 10000;
		f_t = 9.5f;
		d_t = 10.5;
		c_t = 'a';
		str_t = "ハロー";
		bl_t = true;
				
		// 問４
		// 変数b_t、s_t、i_t、l_tを足して出力
		System.out.println(b_t + s_t + i_t + l_t);
		// double型の変数kにf_tとd_tを足した値を代入
		double k = f_t + d_t;
		// 変数kをint型に変換して出力
		System.out.println((int)k);
		// 変数c_t、str_t、bl_tを足して出力
		System.out.println(c_t + str_t + bl_t);
		// 変数b_t、s_t、i_t、l_t、f_t、d_tを足して出力
		System.out.println(b_t + s_t + i_t + l_t + f_t + d_t);
		// 変数b_t、s_t、i_t、l_tを掛けて出力
		System.out.println(b_t * s_t * i_t * l_t);
		// 変数d_tからs_tを割って出力
		System.out.println(d_t / s_t);
		// 変数b_tからs_tを引いて出力
		System.out.println(b_t - s_t);
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問５
		// 変数に値を代入
		int num = 20;
		int num1 = 23;
		// 文字列と変数num, num1を足して出力
		System.out.println("ハローJAVA" + (num + num1));
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問６
		// 変数に値を代入
		String name = "山田太郎";
		// 結果を出力
		System.out.println("初めまして" + name + "です");
		// 変数に値を代入
		int old = 18;
		// 結果を出力
		System.out.println("年齢は" + old + "歳です");
		// 変数に値を代入
		double height = 170.5;
		// 結果を出力
		System.out.println("身長は" + height + "cmです");
		// 変数に値を代入
		float weight = 62.2f;
		// 結果を出力
		System.out.println("体重は" + weight + "kgです");
		// 変数に値を代入
		String food = "寿司";
		// 結果を出力
		System.out.println("好きな食べ物は" + food + "です");
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問７
		// 体重(kg)から身長(m)を2乗した値で割り、変数bmiに代入する
		double bmi = weight / Math.pow(height * 0.01, 2);
		// 変数bmiの小数点以下2桁を四捨五入して結果を出力
		System.out.println("BMIは" + (double)Math.round(bmi * 10) / 10 + "です");
		
		// 問８
		// 変数を再代入
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");
		// 変数を再代入
		old = 24;
		// 結果を出力
		System.out.println("年齢は" + old + "歳です");
		// 変数を再代入
		height = 168.5;
		// 結果を出力
		System.out.println("身長" + height + "cmです");
		// 変数を再代入
		weight = 64.2f;
		// 結果を出力
		System.out.println("体重は" + weight + "kgです");
		// 変数を再代入
		food = "オムライス";
		// 結果を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 変数を再代入
		bmi = 22.6;
		// 変数bmiの小数点以下2桁を四捨五入して結果を出力
		System.out.println("BMIは" + (double)Math.round(bmi * 10) / 10 + "です");
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問９
		// 結果を出力
		System.out.println("初めまして" + name + "です");
		// 変数の数値を自己代入
		old += 24;
		// 結果を出力
		System.out.println("年齢は" + old + "歳です");
		// 変数の数値を自己代入
		height += 168.5;
		// 結果を出力
		System.out.println("身長" + height + "cmです");
		// 変数の数値を自己代入
		weight += 64.2f;
		// 結果を出力
		System.out.println("体重は" + weight + "kgです");
		// 結果を出力
		System.out.println("好きな食べ物は" + food + "です");
		// 変数の数値を自己代入
		bmi -= 11.29;
		// 結果を出力
		System.out.println("BMIは" + (double)Math.round(bmi * 100) / 100 + "です");
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問１０
		// 問８と同じ値を再代入
		old = 24;
		height = 168.5;
		weight = 64.2f;
		// 結果を出力する
		System.out.println(old >= 25);
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問１１
		// 問８で使用した年齢、身長、体重の値を文字列に変換
		String old_str = String.valueOf(old);
		String height_str = String.valueOf(height);
		String weight_str = String.valueOf(weight);
		// 結果を出力する
		System.out.println(old_str + height_str + weight_str);
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問１２
		// 問１１で変換した年齢と身長を整数型に変換
		int old_int = (int)Integer.parseInt(old_str);
		int height_int = (int)Double.parseDouble(height_str);
		// 結果を出力する
		System.out.println(old_int);
		System.out.println(height_int);
		// コンソール上で1行の空白を作る
		System.out.print("\r\n");
		
		// 問１３
		// 年齢が25もしくは身長が160以上であればtureを出力する
		System.out.println(old_int == 25 || height_int >= 160); 
	}

}
