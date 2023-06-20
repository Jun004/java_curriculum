package Curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 問１～３
		byte b;
		b = 0;
		b = 10;
		
		short s;
		s = 0;
		s = 100;
		
		int i;
		i = 0;
		i = 1000;
		
		long l; 
		l = 0L;
		l = 10000;
		
		float f;
		f = 0.0f;
		f = 9.5f;
		
		double d;
		d = 0.0d;
		d = 10.5;
		
		char c;
		c = '\u0000';
		c = 'a';
		
		String str;
		str = null;
		str = "ハロー";
		
		boolean bl;
		bl = false;
		bl = true;
		
		// 問４
		System.out.println(b + s + i + l);
		double k = f + d;
		System.out.println((int)k);
		System.out.println(c + str + bl);
		System.out.println(b + s + i + l + f + d);
		System.out.println(b * s * i * l);
		System.out.println(d / s);
		System.out.println(b - s);
		
		System.out.print("\r\n");
		
		// 問５
		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA" + (num + num1));
		
		System.out.print("\r\n");
		
		// 問６
		String name = "山田太郎";
		System.out.println("初めまして" + name + "です");
		
		int old = 18;
		System.out.println("年齢は" + old + "歳です");
		
		double height = 170.5;
		System.out.println("身長は" + height + "cmです");
		
		float weight = 62.2f;
		System.out.println("体重は" + weight + "kgです");
		
		String food = "寿司";
		System.out.println("好きな食べ物は" + food + "です");
		
		System.out.print("\r\n");
		
		// 問７
		double BMI = weight / Math.pow(height * 0.01, 2);
		System.out.println("BMIは" + (double)Math.round(BMI * 10) / 10 + "です");
		
		// 問８
		name = "鈴木一郎";
		System.out.println("初めまして" + name + "です");
		
		old = 24;
		System.out.println("年齢は" + old + "歳です");
		
		height = 168.5;
		System.out.println("身長" + height + "cmです");
		
		weight = 64.2f;
		System.out.println("体重は" + weight + "kgです");
		
		food = "オムライス";
		System.out.println("好きな食べ物は" + food + "です");
		
		BMI = 22.6;
		System.out.println("BMIは" + (double)Math.round(BMI * 10) / 10 + "です");
		
		System.out.print("\r\n");
		
		// 問９
		System.out.println("初めまして" + name + "です");
		
		old = old + 24;
		System.out.println("年齢は" + old + "歳です");
		
		height = height + 168.5;
		System.out.println("身長" + height + "cmです");
		
		weight = weight + 64.2f;
		System.out.println("体重は" + weight + "kgです");
		
		System.out.println("好きな食べ物は" + food + "です");
		
		BMI = BMI - 11.29;
		System.out.println("BMIは" + (double)Math.round(BMI * 100) / 100 + "です");
		
		System.out.print("\r\n");
		
		// 問１０
		old = 24;
		
		height = 168.5;
		
		weight = 64.2f;
		
		System.out.println(old >= 25);
		
		System.out.print("\r\n");
		
		// 問１１
		String olds = String.valueOf(old);
		String heights = String.valueOf(height);
		String weights = String.valueOf(weight);
		System.out.println(olds + heights + weights);
		
		System.out.print("\r\n");
		
		// 問１２
		int oldi = (int)Integer.parseInt(olds);
		int heighti = (int)Double.parseDouble(heights);
		
		System.out.println(oldi);
		System.out.println(heighti);
		
		System.out.print("\r\n");
		
		// 問１３
		System.out.println(oldi == 25 || heighti >= 160); 
	}

}
