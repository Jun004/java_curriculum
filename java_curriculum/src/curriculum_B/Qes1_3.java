package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問１
		// Scannerクラスで入力された値を取得
		// 変数の宣言と初期化
		int i = 0;
		int user_flag = 0;
		int flag = 0;
		
		String line1 = "";
		String fu_hand = "";
		String[] hands = {"グー","チョキ","パー"};
			
		// 繰り返し処理
		while(user_flag == 0) {
			// nextLineでScannerクラスに入力された値を文字列として取得
			Scanner scr = new Scanner(System.in);
			line1 = scr.nextLine();
			
			if (line1.length() >= 10) {
				// 入力された文字数が10以上の場合に出力
				System.out.println("「名前を10文字以内にしてください」");
				
			} else if (line1.length() <= 0 || line1 == null) {
				// 文字数が0以下もしくはnullの場合に出力
				System.out.println("「名前を入力してください」");
				
			} else if (line1.matches("[^0-9a-zA-Z]+$")) {
				// (問２)半角英数字以外が入力された場合に出力
				System.out.println("「半角英数字のみで名前を入力してください」");
				
			} else {
				// 正しくユーザー名が入力された場合に出力
				System.out.println("ユーザー名「" + line1 + "」を登録しました");
				// while文から抜ける
				user_flag = 1;
			}
		}
		
		// 繰り返し処理
		while(flag == 0) {
			// scannerクラスで入力された値を文字列として取得
			Scanner user = new Scanner(System.in);
			fu_hand = user.nextLine();
			
			// 半角数字0.1.2以外が入力された場合に再入力
			if (fu_hand.matches("[^0-2]+$")) {
				System.out.println("半角数字0,1,2のどれか1文字で入力してください。");
				continue;
			}  
			
			// fu_handをu_handへint型に変換し代入
			int u_hand = Integer.parseInt(fu_hand);
			
			// pcからじゃんけんの手の値を0-2のどれかをランダムで取得
			Random pc = new Random();
			int p_hand = pc.nextInt(3);
			
			if((u_hand == 0 && p_hand == 1) || (u_hand == 1 && p_hand == 2) || (u_hand == 2 && p_hand == 0)) {
				// じゃんけんに勝った時に出力し、iに1を代入
				System.out.printf("%nやるやん。%n次は俺にリベンジさせて%n");
				System.out.printf("%n勝つまでにかかった回数は" + i + "回です%n");
				i++;
				// ループから抜ける
				flag = 1;
			} else if (u_hand == 1 && p_hand == 0){
				// グーに負けた時に出力し、iに1を代入
				System.out.printf("%n俺の勝ち！%n負けは次につながるチャンスです！%nネバーギブアップ！%n");
				i++;
			} else if (u_hand == 2 && p_hand == 1){
				// チョキに負けた時に出力し、iに1を代入
				System.out.printf("%n俺の勝ち！%nたかがじゃんけん、そう思ってないですか？%nそれやったら次も、俺が勝ちますよ%n");
				i++;
			} else if (u_hand == 0 && p_hand == 2){
				// パーに負けた時に出力し、iに1を代入
				System.out.printf("%n俺の勝ち！%nなんで負けたか、明日まで考えといてください。%nそしたら何かが見えてくるはずです%n");
				i++;
			} else {
				// あいこの時に出力し、iに1を代入
				System.out.printf("%nDRAW あいこ もう一回しましょう！%n");	
				i++;
			}
			System.out.println(line1 + "の手は「" + hands[u_hand] + "」");
			System.out.println("相手の手は「" + hands[p_hand] + "」");
		}
	}
}