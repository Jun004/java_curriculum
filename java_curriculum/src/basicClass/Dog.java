package basicClass;

public class Dog {
	// Q1：フィールドに動物の名前の変数を定義してください。
	private String aniName;
	
	// Q2：フィールドに動物の数の変数を定義してください。
	private int aniNum;
	
	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。
	void setName(String newAniName) {
		this.aniName = newAniName;
	}
	String getName() {
		return this.aniName;
	}
	
	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	void setNum(int newAniNum) {
		this.aniNum = newAniNum;
	}
	int getNum() {
		return this.aniNum;
	}
}
