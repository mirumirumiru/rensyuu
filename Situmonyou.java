//Main.java
public class Main {

	public static void main(String[] args){

		Ueda ueda = new Ueda();
	}

//Hero.java
public class Hero {
	int hp;//HP
	int mp;//MP
	int attack;//攻撃力
	int defense;//防御力


	public Hero() {
	}


	public Hero(int hp, int mp, int attack, int defense) {
		super();
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.defense = defense;
	}
}

//Ueda.java
public class Ueda extends Hero {

	String name = "上田先生";
	String command1 = "Javaで攻撃！！";
	Double command1Coef = 1.2;//コマンド1の係数
	String command2 = "pythonで攻撃！！";
	Double command2Coef = 2.0;//コマンド2の係数
	String command3 = "よもぎ大福！！";
	Double command3Coef = 3.0;//コマンド3の係数
	String command4 = "逃げる";
	Double command4Coef = 5.0;//コマンド4の係数

	public Ueda() {
		super(100, 30, 20, 20);
	}

//Battle.java

  このクラスでMain.javaでnewされた上田先生のステータスを受け取りたいです
