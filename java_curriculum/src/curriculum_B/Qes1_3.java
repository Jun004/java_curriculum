package curriculum_B;
import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		// 変数の宣言と初期化
		boolean isVaild = true;
		String userName = "";
			
		Scanner sca = new Scanner(System.in);
		// 繰り返し処理
		while(isVaild) {
			// 入力された値を文字列として取得
			userName = sca.next();
			
			if (10 < userName.length()) {
				// 入力された文字数が10以上の場合に出力
				System.out.println("「名前を10文字以内にしてください」");
				
			} else if (userName == null || userName.isEmpty()) {
				// 文字数が0以下もしくはnullの場合に出力
				System.out.println("「名前を入力してください」");
				
			} else if (userName.matches("^[0-9a-zA-Z]+$")) {
				// 正しくユーザー名が入力された場合に出力
				System.out.println("ユーザー名「" + userName + "」を登録しました");
				// ループから抜ける
				isVaild = false;
			} else {
				// (問２)半角英数字以外が入力された場合に出力
				System.out.println("「半角英数字のみで名前を入力してください」");
			}
			
		}
		
		int i = 1;
		boolean isWin = true;
		String uHandStr = "";
		String[] hands = {"グー","チョキ","パー"};
		
		
		// 繰り返し処理
		while(isWin) {
			System.out.printf("%n");
			// scannerクラスで入力された値を文字列として取得
			uHandStr = sca.next();
			
			// 半角数字0.1.2以外が入力された場合に再入力
			if (uHandStr == null || uHandStr.isEmpty()) {
				// 文字数が0以下もしくはnullの場合に出力
				System.out.println("数字0,1,2のどれか1文字で入力してください。");
				continue;
			}else if (2 < uHandStr.length()) {
					System.out.println("数字0,1,2のどれか1文字で入力してください。");
					continue;
				  
			} else if (uHandStr.matches("[^0-2０-２]+$")) {
				System.out.println("数字0,1,2のどれか1文字で入力してください。");
				continue;
			}  
			
			// int型に変換し代入
			int uHand = Integer.parseInt(uHandStr);
			
			// pcからじゃんけんの手の値を0-2のどれかをランダムで取得
			Random pc = new Random();
			int pcHand = pc.nextInt(3);
			
			System.out.println(userName + "の手は「" + hands[uHand] + "」");
			System.out.println("相手の手は「" + hands[pcHand] + "」");
			
			if((uHand == 0 && pcHand == 1) || (uHand == 1 && pcHand == 2) || (uHand == 2 && pcHand == 0)) {
				// じゃんけんに勝った時に出力し、1を代入
				System.out.printf("%nやるやん。%n次は俺にリベンジさせて%n");
				System.out.printf("%n勝つまでにかかった合計回数は" + i + "回です%n");
				i++;
				// ループから抜ける
				isWin = false;
			} else if (uHand == 1 && pcHand == 0){
				// グーに負けた時に出力し、1を代入
				System.out.printf("%n俺の勝ち！%n負けは次につながるチャンスです！%nネバーギブアップ！%n");
				i++;
			} else if (uHand == 2 && pcHand == 1){
				// チョキに負けた時に出力し、1を代入
				System.out.printf("%n俺の勝ち！%nたかがじゃんけん、そう思ってないですか？%nそれやったら次も、俺が勝ちますよ%n");
				i++;
			} else if (uHand == 0 && pcHand == 2){
				// パーに負けた時に出力し、1を代入
				System.out.printf("%n俺の勝ち！%nなんで負けたか、明日まで考えといてください。%nそしたら何かが見えてくるはずです%n");
				i++;
			} else {
				// あいこの時に出力し、1を代入
				System.out.printf("%nDRAW あいこ もう一回しましょう！%n");	
				i++;
			}
		}
		sca.close();
	}
}