package sample;

import java.util.Random;

public class Wariai {

	public static void main(String[] args) {

		Random rnd = new Random();

		int x = 4; // (int) (Math.random() * 10) + 1; //文字列が出力される数
		int[] xList = new int[x]; // 要素数xの配列を作成

		//int wariais = rnd.nextInt(100-x) + 1;  //100以下のランダムな数を出力
		//int wariaizana = 100 - wariais; //本当の割合の残り
		//int wariaizanb = 100 - wariais - x; //次の割合を出すための残り
		int wariais = 100; //まずはここで100を確保しておきます

		//ここはwariaisが0になるまで繰り返す。という意味
		while (wariais-- > 0) {
			//まずここで
			//次回以降はwariaisが負数にならないようにランダムで値を決める必要がある
			int xAt = (int) (rnd.nextInt(xList.length));
			xList[xAt] += 1; // 要素を1ずつ割り振っていく
		}

		for (int i = 0; i < xList.length; i++) {
			System.out.println("あなたの頭の中の" + xList[i] + "％は〇〇でできています！");
		}
	}

}
