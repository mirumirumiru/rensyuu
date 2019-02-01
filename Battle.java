import java.util.Random;
import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		int num = 0;// コマンドの番号取得用
		String attack1 = "";// 攻撃する時のコマンド
		int attack2 = 0;// 課長が受けるダメージ
		String attack3 = "";// 課長が攻撃する技
		int uedahp = 100;// 上田先生のHP
		int kachohp = 100;// 課長のHP
		int kachoat = 0;// 課長の攻撃

		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊");
		System.out.println("＊＊　　　　　　　　　　　　　　＊＊");
		System.out.println("＊＊　上田先生の最後の戦い！！　＊＊");
		System.out.println("＊＊　　　　　　　　　　　　　　＊＊");
		System.out.println("＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊＊\n");
		System.out.println("水島訓練課長が現れた！！\n");

		while ((kachohp > 0) && (uedahp > 0)) {
			System.out.println("Javaで攻撃　 = 1");
			System.out.println("pythonで攻撃 = 2");
			System.out.println("PLCで攻撃　  = 3");
			System.out.println("逃げる　　　 = 4");
			System.out.println("1～4のコマンドを入力してください");

			num = sc.nextInt();

			if (num == 1) {
				attack1 = "Java";
				attack2 = (rnd.nextInt(10) + 1) * 2;
				attack3 = "パワハラ";
				kachoat = (rnd.nextInt(10) + 1) * 2;

			} else if (num == 2) {
				attack1 = "python";
				attack2 = (rnd.nextInt(10) + 1) * 3;
				attack3 = "セクハラ";
				kachoat = (rnd.nextInt(10) + 1) * 3;

			} else if (num == 3) {
				attack1 = "PLC";
				attack2 = (rnd.nextInt(50) + 1) * 1;
				attack3 = "「今晩付き合え」攻撃";
				kachoat = (rnd.nextInt(50) + 1) * 1;

			} else {
				System.out.println("\n上田先生はみんなを捨てて退職した");
				break;

			}

			System.out.println("\n上田先生の" + attack1 + "で攻撃！！");
			kachohp = kachohp - attack2;
			System.out.println("水島訓練課長に" + attack2 + "のダメージをあたえた！！\n");

			// 訓練課長の体力があるときだけ反撃を行う
			if (kachohp > 0) {
				System.out.println("水島訓練課長の" + attack3 + "！！");
				System.out.println("上田先生は" + kachoat + "のダメージをうけた！！\n");
				uedahp = uedahp - kachoat;
			}

			System.out.println("上田先生の残りHP：" + uedahp);
			System.out.println("水島訓練課長の残りHP：" + kachohp + "\n");
		}

		if (kachohp <= 0) {
			System.out.println("上田先生は水島訓練課長を倒した！！");
		} else if (uedahp <= 0) {
			System.out.println("上田先生は力尽きた・・・");
		} else {
			System.out.println("ものづくりプログラム課は消滅した・・・");
		}

		sc.close();
	}

}
