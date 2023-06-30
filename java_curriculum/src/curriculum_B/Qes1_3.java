package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		// 問１
		// Scannerクラスで入力された値を取得
		int i = 0;
		int user_flag = 0;
		int flag = 0;
		
		
		
		
		String[] hands = {"グー","チョキ","パー"};
		// nextLineでScannerクラスに入力された値を文字列として取得
		
		
		
		while(user_flag == 0) {
		
		Scanner scr = new Scanner(System.in);
		String line1 = scr.nextLine();
		
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
			
			
			user_flag = 1;
			
		}
		
		
		
		
		
		while(flag == 0) {
			
			Scanner user = new Scanner(System.in);
			int u_hand = user.nextInt(3);
			
			
			
			Random pc = new Random();
			int p_hand = pc.nextInt(3);
			
			
			System.out.println(line1 + "の手は「" + hands[u_hand] + "」");
			System.out.println("相手の手は「" + hands[p_hand] + "」");

			
			if((u_hand == 0 && p_hand == 1) || (u_hand == 1 && p_hand == 2) || (u_hand == 2 && p_hand == 0)) {
			System.out.printf("%nやるやん。%n次は俺にリベンジさせて%n");
			i++;
			System.out.printf("%n勝つまでにかかった回数は" + i + "回です");
			flag = 1;
		} else if (u_hand == 1 && p_hand == 0){
			System.out.printf("%n俺の勝ち！%n負けは次につながるチャンスです！%nネバーギブアップ！%n");
			i++;
		
		} else if (u_hand == 2 && p_hand == 1){
			System.out.printf("%n俺の勝ち！%nたかがじゃんけん、そう思ってないですか？%nそれやったら次も、俺が勝ちますよ%n");
			i++;
		
		} else if (u_hand == 0 && p_hand == 2){
			System.out.printf("%n俺の勝ち！%nなんで負けたか、明日まで考えといてください。%nそしたら何かが見えてくるはずです%n");
			i++;
		
		} else {
			System.out.printf("%nDRAW あいこ もう一回しましょう！%n");	
			i++;
		}
			
			
		
		
		}
		
		
		
		
		}
		
		
	}
	
}
