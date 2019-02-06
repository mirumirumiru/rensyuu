import java.util.Random;
import java.util.Scanner;

public class porker {
	public static void main(String[] args) {

		//カード1セット作る
		String[][] cards = new String[4][13];
		cardsSet(cards);

		String[] hand = new String[5];

		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();

		System.out.println("deal? yes:1 no:2");
		int deal = sc.nextInt();

		if (deal == 1) {
			//手札をランダムで取得
			for (int i = 0; i < 5; i++) {
				hand[i] = cards[rnd.nextInt(4)][rnd.nextInt(13)];
			}

		} else
			System.out.println("good bye");

		//手札を表示
		for (int i = 0; i < hand.length; i++)
			System.out.print(hand[i] + " ");

		//判定・・・・・・・・・・・・・＞＜

		sc.close();

	}

	public static String[][] cardsSet(String[][] cards_x) {
		for (int i = 0; i < cards_x.length; i++) {
			for (int j = 0; j < cards_x[0].length; j++) {
				if (i == 0) {
					cards_x[i][j] = "ダイヤの" + (j + 1);
				} else if (i == 1) {
					cards_x[i][j] = "スペードの" + (j + 1);
				} else if (i == 2) {
					cards_x[i][j] = "ハートの" + (j + 1);
				} else {
					cards_x[i][j] = "クラブの" + (j + 1);
				}
			}
		}
		return cards_x;
	}

}