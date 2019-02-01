package sample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Kyounokibun {
	/**
	 * 配列の並びをランダムにするプログラム
	 */
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.println("えっ(。ﾟωﾟ)　なんて呼んだらいい？");
		String line = sc.next();

		String[] array = {
				"からあげクンでローソンをはしご",
				"上田先生と琴似でデート",
				"イオンで○○な本を立ち読み",
				"今すぐ自転車でサハリンへ",
				"BOOKOFFで閉店まで立ち読み",
				"ミスドで5,000円分のドーナツ",
				"米澤さんとPython猛特訓",
				"カブトムシの養殖で企業",
				"Javaとラズパイで世界を救う",
				"お茶にはやっぱりハバネロ" };

		Random rnd = new Random();

		// 配列からListへ変換します。
		List<String> list = Arrays.asList(array);

		// リストの並びをシャッフルします。
		Collections.shuffle(list);

		// listから配列へ戻します。
		String[] array2 = (String[]) list.toArray(new String[list.size()]);

		int x = (int) (Math.random() * 10) + 1; //文字列が出力される数
		int[] xList = new int[x]; // 要素数xの配列を作成

		int r = 100 - x ; //各項目に1を確保。 割合の残り。
		int p; //乱数用

		for(int i=0; i<x; i++) {
			if(i < x-1) {//最後の1回以外
				p = rnd.nextInt(r+1); //0～rの乱数を出す
				xList[i] = p+1; //
				r = r -p; //次の乱数用に今回の分を引く
			} else {
				xList[i] = r+1; //最後の1回はあまりを全部入れる
			}
		}


		System.out.println("\n" + line + " なんて恥ずかしくて呼べない(/∀＼*))" + "\n");
		System.out.println("そんな " + line + " 先輩の今日の気分は・・・" + "\n");

		for (int i = 0; i < xList.length; i++) {
			System.out.println(array2[i] + "\t\t" + xList[i] + "％" + "\n");
		}

		sc.close();

	}
}
