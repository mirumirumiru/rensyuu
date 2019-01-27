package sample;

import java.util.Random;

public class Wariai {

	public static void main(String[] args) {

		Random rnd = new Random();


		int x = (int)(Math.random() * 10) + 1;	  //文字列が出力される数

		//int wariais = rnd.nextInt(100-x) + 1;  //100以下のランダムな数を出力
		//int wariaizana = 100 - wariais; //本当の割合の残り
		//int wariaizanb = 100 - wariais - x; //次の割合を出すための残り
		int wariais = 100; //まずはここで100を確保しておきます

		//ここはwariaisが0になるまで繰り返す。という意味	    
		while(wariais>1) {
			//まずここでwariaisから引く数を決める(最初は100が出るが、
			//次回以降はwariaisが虚数にならないようにランダムで値を決める必要がある
    			int wariaizana = rnd.nextInt(wariais)+1;
    			wariais -= wariaizana;

			System.out.println("あなたの頭の中の" + wariaizana + "％は〇〇でできています！");
		}

	}

}
