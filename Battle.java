package sample;
import java.util.Random;
import java.util.Scanner;

public class Battle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    Random rnd = new Random();


		int num = 0;//コマンドの番号取得用
		int attack1 = 0 ;//javaで攻撃した時のダメージ
		int attack2 = 0 ;//pythonで攻撃した時のダメージ
		int attack3 = 0 ;//PLCで攻撃した時のダメージ
		int uedahp = 100;//上田先生のHP
		int kachohp = 100;//課長のHP
		int kachoat = 0;//課長の攻撃

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

			if(num == 1) {
		    	attack1 = (rnd.nextInt(10) + 1) * 2;
		    	System.out.println("\n上田先生のJavaで攻撃！！");
		    	System.out.println("水島訓練課長に" + attack1 + "のダメージをあたえた！！\n");
				kachohp = kachohp - attack1;
				kachoat = (rnd.nextInt(10) + 1) * 2;
				System.out.println("水島訓練課長のパワハラ！！");
				System.out.println("上田先生は" + kachoat + "のダメージをうけた！！\n");
				uedahp = uedahp - kachoat;
				//System.out.println("上田先生の残りHP：" + uedahp);
				//System.out.println("水島訓練課長の残りHP：" + kachohp + "\n");

			}else if (num == 2) {
		    	attack2 = (rnd.nextInt(10) + 1) * 3;
		    	System.out.println("\n上田先生のpythonで攻撃！！");
		    	System.out.println("水島訓練課長に" + attack2 + "のダメージをあたえた！！\n");
				kachohp = kachohp - attack2;
				kachoat = (rnd.nextInt(10) + 1) * 3;
				System.out.println("水島訓練課長のセクハラ！！");
				System.out.println("上田先生は" + kachoat + "のダメージをうけた！！\n");
				uedahp = uedahp - kachoat;
				//System.out.println("上田先生の残りHP：" + uedahp);
				//System.out.println("水島訓練課長の残りHP：" + kachohp + "\n");

			}else if(num == 3) {
		    	attack3 = (rnd.nextInt(50) + 1) * 1;
		    	System.out.println("\n上田先生のPLCで攻撃！！");
		    	System.out.println("水島訓練課長に" + attack3 + "のダメージをあたえた！！\n");
				kachohp = kachohp - attack3;
				kachoat = (rnd.nextInt(50) + 1) * 1;
				System.out.println("水島訓練課長の「今晩付き合え」攻撃！！");
				System.out.println("上田先生は" + kachoat + "のダメージをうけた！！\n");
				uedahp = uedahp - kachoat;
				//System.out.println("上田先生の残りHP：" + uedahp);
				//System.out.println("水島訓練課長の残りHP：" + kachohp + "\n");
			}else {
				System.out.println("\n上田先生はみんなを捨てて退職した");
				break;
			}

		}

		if(kachohp<=0) {
			System.out.println("上田先生は水島訓練課長を倒した！！");
		}else if(uedahp<=0) {
			System.out.println("上田先生は力尽きた・・・");
		}else {
			System.out.println("ものづくりプログラム課は消滅した・・・");
		}

		sc.close();
	}

}
