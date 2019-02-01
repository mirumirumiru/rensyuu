package sample;

import java.util.Random;
import java.util.Scanner;

public class Battle2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int winOrLose = 0;//勝敗用
		int con = 0;//コンティニュー回数

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("＊＊　　　　　　　　　　　　　　＊＊");
		System.out.println("＊＊　上田先生の最後の戦い！！　＊＊");
		System.out.println("＊＊　　　　　　　　　　　　　　＊＊");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");

		outer2:for (int i = 0; i <= con; i++) {

			int num = 0;//コマンドの番号取得用
			String attack1 = "";//攻撃方法
			int attack2 = 0;//課長が受けるダメージ
			int uedahp = 100;//上田先生のHP
			int kachohp = 100;//課長のHP

			outer: while (true) {

				System.out.println("\n水島訓練課長が現れた！！\n");

				while ((kachohp > 0) && (uedahp > 0)) {
					System.out.println("◎上田先生 HP：" + uedahp);
					System.out.println("Javaで攻撃　 = 1");
					System.out.println("pythonで攻撃 = 2");
					System.out.println("よもぎ大福　  = 3");
					System.out.println("逃げる　　　 = 4");
					System.out.println("1～4のコマンドを入力してください");

					num = sc.nextInt();
					int kachoPercent = (rnd.nextInt(100) + 1);//課長の攻撃を判定する数値
					int kachoAttack3 = kachoAttack2(kachoPercent);//2回抽選されることを防ぐため値を格納

					if (num == 1) {
						attack1 = "Javaで攻撃！！";
						attack2 = (rnd.nextInt(10) + 1) * 2;
					} else if (num == 2) {
						attack1 = "pythonで攻撃！！";
						attack2 = (rnd.nextInt(10) + 1) * 3;
					} else if (num == 3) {
						attack1 = "よもぎ大福を食べた！！";
						attack2 = (rnd.nextInt(30) + 1) * 2;
						System.out.println("\n上田先生は" + attack1);
						System.out.println("上田先生はHPが" + attack2 + "回復した！！\n");
						uedahp = uedahp + attack2;
						uedahp = uedaHeal(uedahp);//HPが100を超えた時の処理
						System.out.print(kachoAttack1(kachoPercent));
						System.out.println(kachoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - kachoAttack3;
						continue;

					} else {
						System.out.println("\n上田先生はみんなを捨てて退職した");
						break;
					}

					//上田先生の攻撃結果
					System.out.println("\n上田先生は、" + attack1);
					kachohp = kachohp - attack2;
					System.out.println("水島訓練課長に" + attack2 + "のダメージをあたえた！！\n");

					//課長の体力がある時だけ反撃する
					if (kachohp > 0) {
						System.out.print(kachoAttack1(kachoPercent));
						System.out.println(kachoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - kachoAttack3;
					}

				}

				if (kachohp <= 0) {
					System.out.println("上田先生は水島訓練課長を倒した！！");
				} else if (uedahp <= 0) {
					System.out.println("上田先生は力尽きた・・・");
					winOrLose = 1;
					break outer;
				} else {
					System.out.println("ものづくりプログラム課は消滅した・・・");
					winOrLose = 1;
					break outer;
				}

				//ここから彼女戦
				//数値関連は初期化
				num = 0;//コマンドの番号取得用
				attack1 = "";//攻撃方法
				attack2 = 0;//元カノが受けるダメージ
				uedahp = 100;//上田先生のHP
				int kanojyohp = 100;//彼女のHP
				int counter = 0;//ターン数

				System.out.println("\n\n彼女が現れた！！\n");

				while ((counter != 10) && (uedahp > 0)) {
					System.out.println("◎上田先生 HP：" + uedahp);
					System.out.println("Javaで攻撃　 = 1");
					System.out.println("pythonで攻撃 = 2");
					System.out.println("よもぎ大福　  = 3");
					System.out.println("ついていく　 = 4");
					System.out.println("1～4のコマンドを入力してください");
					counter = counter + 1;

					num = sc.nextInt();
					int kanojyoPercent = (rnd.nextInt(100) + 1);//課長の攻撃を判定する数値
					int kanojyoAttack3 = kanojyoAttack2(kanojyoPercent);//2回抽選されることを防ぐため値を格納

					if (num == 1) {
						attack1 = "Javaで攻撃！！";
					} else if (num == 2) {
						attack1 = "pythonで攻撃！！";
					} else if (num == 3) {
						attack1 = "よもぎ大福を食べた！！";
						attack2 = (rnd.nextInt(30) + 1) * 2;
						System.out.println("\n上田先生は" + attack1);
						System.out.println("上田先生はHPが" + attack2 + "回復した！！\n");
						uedahp = uedahp + attack2;
						uedahp = uedaHeal(uedahp);//HPが100を超えた時の処理
						System.out.print(kanojyoAttack1(kanojyoPercent));
						System.out.println(kanojyoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - kanojyoAttack3;
						continue;

					} else {
						System.out.println("\n上田先生は彼女とどこかへ消えた");
						break;
					}

					//上田先生の攻撃結果
					System.out.println("\n上田先生は、" + attack1);
					System.out.println("彼女にはまったく効いていない！！\n");

					//課長の体力がある時だけ反撃する
					if (kanojyohp > 0) {
						System.out.print(kanojyoAttack1(kanojyoPercent));
						System.out.println(kanojyoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - kanojyoAttack3;
					}

				}

				if (counter >= 10) {
					System.out.println("彼女はあきらめて帰っていった！！");
				} else if (uedahp <= 0) {
					System.out.println("上田先生は力尽きた・・・");
					winOrLose = 1;
					break outer;
				} else {
					System.out.println("ものづくりプログラム課は消滅した・・・");
					winOrLose = 1;
					break outer;
				}

				//ここから所長戦
				//数値関連は再度初期化
				num = 0;//コマンドの番号取得用
				attack1 = "";//攻撃方法
				attack2 = 0;//所長が受けるダメージ
				uedahp = 100;//上田先生のHP
				int syochohp = 200;//所長のHP

				System.out.println("\n\n所長が現れた！！\n");

				while ((syochohp > 0) && (uedahp > 0)) {
					System.out.println("◎上田先生 HP：" + uedahp);
					System.out.println("Javaで攻撃　 = 1");
					System.out.println("pythonで攻撃 = 2");
					System.out.println("よもぎ大福　  = 3");
					System.out.println("逃げる　　　 = 4");
					System.out.println("1～4のコマンドを入力してください");

					num = sc.nextInt();
					int syochoPercent = (rnd.nextInt(100) + 1);//課長の攻撃を判定する数値
					int syochoAttack3 = syochoAttack2(syochoPercent);//2回抽選されることを防ぐため値を格納

					if (num == 1) {
						attack1 = "Javaで攻撃！！";
						attack2 = (rnd.nextInt(10) + 1) * 2;
					} else if (num == 2) {
						attack1 = "pythonで攻撃！！";
						attack2 = (rnd.nextInt(10) + 1) * 3;
					} else if (num == 3) {
						attack1 = "よもぎ大福を食べた！！";
						attack2 = (rnd.nextInt(30) + 1) * 2;
						System.out.println("\n上田先生は" + attack1);
						System.out.println("上田先生はHPが" + attack2 + "回復した！！\n");
						uedahp = uedahp + attack2;
						uedahp = uedaHeal(uedahp);//HPが100を超えた時の処理
						System.out.print(syochoAttack1(syochoPercent));
						System.out.println(syochoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - syochoAttack3;
						continue;

					} else {
						System.out.println("\n上田先生はみんなを捨てて退職した");
						break;
					}

					//上田先生の攻撃結果
					System.out.println("\n上田先生は、" + attack1);
					syochohp = syochohp - attack2;
					System.out.println("所長に" + attack2 + "のダメージをあたえた！！\n");

					//課長の体力がある時だけ反撃する
					if (syochohp > 0) {
						System.out.print(syochoAttack1(syochoPercent));
						System.out.println(syochoAttack3 + "のダメージをうけた！！\n");
						uedahp = uedahp - syochoAttack3;
						if (syochoPercent > 80) {
							syochohp = syochohp + 40;
						}
					}

				}

				if (syochohp <= 0) {
					System.out.println("上田先生は所長を倒した！！");
				} else if (uedahp <= 0) {
					System.out.println("上田先生は力尽きた・・・");
					winOrLose = 1;
					break outer;
				} else {
					System.out.println("ものづくりプログラム課は消滅した・・・");
					winOrLose = 1;
					break outer;
				}
			}

			if (winOrLose == 0) {
				System.out.println("ものづくりプログラム課は守られた！！");
			} else {
				System.out.print("コンティニューしますか？　　はい：1　いいえ：2  ");
				int x = sc.nextInt();
				if (x == 1) {
					con++;
				}else {
					break outer2;
				}
			}
		}
		sc.close();

	}

	public static int kachoAttack2(int kachoPercent) {

		Random rnd = new Random();

		if (kachoPercent <= 50) {
			int value = (rnd.nextInt(10) + 1) * 2;
			return value;
		} else if (kachoPercent <= 80) {
			int value = (rnd.nextInt(10) + 1) * 3;
			return value;
		} else {
			int value = (rnd.nextInt(50) + 1) * 1;
			return value;
		}
	}

	public static String kachoAttack1(int kachoPercent) {

		if (kachoPercent <= 50) {
			String kekka = "水島訓練課長のパワハラ！！\n" + "上田先生は";
			return kekka;
		} else if (kachoPercent <= 80) {
			String kekka = "水島訓練課長のセクハラ！！\n" + "上田先生は";
			return kekka;
		} else {
			String kekka = "水島訓練課長が「今晩付き合え」と言い始めた！！\n" + "上田先生は";
			return kekka;
		}
	}

	public static int uedaHeal(int uedahp) {

		if (uedahp > 100) {
			return 100;
		} else {
			return uedahp;
		}
	}

	public static int kanojyoAttack2(int kachoPercent) {

		Random rnd = new Random();

		if (kachoPercent <= 50) {
			int value = (rnd.nextInt(10) + 1) * 2;
			return value;
		} else if (kachoPercent <= 80) {
			int value = (rnd.nextInt(10) + 1) * 3;
			return value;
		} else {
			int value = (rnd.nextInt(50) + 1) * 1;
			return value;
		}
	}

	public static String kanojyoAttack1(int kachoPercent) {

		if (kachoPercent <= 50) {
			String kekka = "「自転車ばっか乗ってないでどっか連れてってよ！！」！！\n" + "上田先生は";
			return kekka;
		} else if (kachoPercent <= 80) {
			String kekka = "「python、pythonって、牛と私とどっちが大事なのよ！！」\n" + "上田先生は";
			return kekka;
		} else {
			String kekka = "「かまってくれないから、明日合コン行ってくるから！！」\n" + "上田先生は";
			return kekka;
		}
	}

	public static int syochoAttack2(int syochoPercent) {

		Random rnd = new Random();

		if (syochoPercent <= 50) {
			int value = (rnd.nextInt(10) + 1) * 2;
			return value;
		} else if (syochoPercent <= 80) {
			int value = (rnd.nextInt(10) + 1) * 3;
			return value;
		} else {
			int value = (rnd.nextInt(50) + 1) * 1;
			return value;
		}
	}

	public static String syochoAttack1(int syochoPercent) {

		if (syochoPercent <= 50) {
			String kekka = "所長は大福禁止令を出した！！\n" + "上田先生は";
			return kekka;
		} else if (syochoPercent <= 80) {
			String kekka = "所長はアラスカに転勤命令を出した！！\n" + "上田先生は";
			return kekka;
		} else {
			String kekka = "所長は給料をピンハネした！！\n" + "所長のHPが回復した！！\n" + "上田先生は";
			return kekka;
		}
	}

}
