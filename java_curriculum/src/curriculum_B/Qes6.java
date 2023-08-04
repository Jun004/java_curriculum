package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes6 {
	
	public static void main(String[] args) {
		// 変数の宣言
		String scaC = "";
		String[] apps;
		
		// ０～１１の間でランダムの値を６つの配列に格納
		int[] appNum = new Random().ints(6, 0, 11).toArray();
		
		Scanner sca = new Scanner(System.in);
		
			// 入力された値を「、」区切りで取得
			scaC = sca.nextLine();
			apps = scaC.split("、");
			// 入力された値によって分岐し、結果を出力
			for(String app : apps) {
				switch(app) {
				case "パソコン":
					System.out.printf("パソコンの残り台数は" + appNum[0] + "です%n%n");
					break;
				case "冷蔵庫":
					System.out.printf("冷蔵庫の残り台数は" + appNum[1] + "です%n%n");
					break;
				case "扇風機":
					System.out.printf("扇風機の残り台数は" + appNum[2] + "です%n%n");
					break;
				case "洗濯機":
					System.out.printf("洗濯機の残り台数は" + appNum[3] + "です%n%n");
					break;
				case "加湿器":
					System.out.printf("加湿器の残り台数は" + appNum[4] + "です%n%n");
					break;
				case "テレビ":
				case "ディスプレイ":
					int DisNum = 11 - appNum[5];
					String TvDis = app.matches(".*テレビ.*") ? "テレビの残り台数は" + appNum[5] + "です%n%n" : "ディスプレイの残り台数は" + DisNum + "です%n%n";
					System.out.printf(TvDis);
					break;
				default:
					System.out.printf("『" + app + "』は指定の商品ではありません%n%n");
					continue;
				}
			}
		sca.close();
	}
}