package basicClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {

		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	public static void main(String args[]) {
		Dog animal = new Dog("犬");
	
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog animal2 = new Dog(2);
		
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		LocalDateTime nowTime = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formatNowTime = dtf.format(nowTime);
		System.out.println(formatNowTime);
	}
	
}
