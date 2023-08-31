package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String aniName;
	// Q2：フィールドに動物の数の変数を定義してください。
	private int aniNum;
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	Dog(String newAniName) {
		aniName = newAniName;
		System.out.println(aniName);
	}	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	Dog(int newAniNum) {
		aniNum = newAniNum;
		System.out.println(aniNum);
	}
	
	
}
