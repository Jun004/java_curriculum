package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	private static void hello(String str, int n1){
		System.out.printf(str + n1 + "%n%n");
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void getMulti(int multi1, int multi2){
		System.out.printf(multi1 * multi2 + "%n%n");
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void getArray(int[] Array){
		for (int i = 0; i < Array.length; i++) {
			System.out.print(Array[i] + " ");
		}
		System.out.printf("%n%n");
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void getMulti(double multi1, double multi2){
		System.out.printf(multi1 + multi2 + "%n%n");
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	private static int[] getRandom(int rand){
		int[] randArray = new Random().ints(rand, 1, 100).toArray();
		for (int i = 0; i < rand; i++) {
			System.out.print(randArray[i] + " ");
		}
		System.out.printf("%n%n");
		return randArray;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	private static double getAvr(int[] randArg){
		double sum = 0.0;
		for (int i : randArg) sum += i;
		double avr = Math.round(sum / randArg.length * 10.0) / 10.0;
		System.out.print(avr);
		System.out.printf("%n%n");
		return avr;
	}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	private static void getBool(double bool) {
		boolean boo = bool >= 50 ? true : false;
		System.out.print(boo);
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		// Q1
		hello("Hello JavaSE ", 11);
		// Q2
		getMulti(5, 5);
		// Q3
		int[] arrayNum = {1, 2, 3, 4, 5};
		getArray(arrayNum);
		// Q4
		getMulti(0.55, 1.02);
		// Q5
		int[] randAvg = getRandom(3);
		// Q6
		double avg = getAvr(randAvg);
		// Q7
		getBool(avg);
	}
}