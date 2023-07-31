package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes6 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 変数の宣言
		String scr_c = "";
		String[] apps;
		
		int h = 0;
		
		// ０～１１の間でランダムの値を６つの配列に格納
		int[] moni = new Random().ints(6, 0, 11).toArray();
		
		Scanner scr = new Scanner(System.in);
		
		// 繰り返し処理
		while(h == 0){
			
			// 入力された値を「、」区切りで取得
			scr_c = scr.nextLine();
			apps = scr_c.split("、");
			// 入力された値によって分岐し、結果を出力
			for(String app : apps) {
				switch(app) {
				case "パソコン":
					System.out.println("パソコンの残り台数は" + moni[0] + "です");
					break;
				case "冷蔵庫":
					System.out.println("冷蔵庫の残り台数は" + moni[1] + "です");
					break;
				case "扇風機":
					System.out.println("扇風機の残り台数は" + moni[2] + "です");
					break;
				case "洗濯機":
					System.out.println("洗濯機の残り台数は" + moni[3] + "です");
					break;
				case "加湿器":
					System.out.println("加湿器の残り台数は" + moni[4] + "です");
					break;
				case "テレビ":
				case "ディスプレイ":
					int monis = 11 - moni[5];
					String ort = app.matches(".*テレビ.*") ? "テレビの残り台数は" + moni[5] + "です" : "ディスプレイの残り台数は" + monis + "です";
					System.out.println(ort);
					break;
				default:
					System.out.println("『" + app + "』は指定の商品ではありません");
					continue;
				}
			}
		}
		scr.close();
	}
}