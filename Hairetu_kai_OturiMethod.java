import java.util.Scanner;

public class Hairetu_OturiMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//整数値を入力します
		int kingaku = sc.nextInt();

		int[][] oturi =  oturi( kingaku );
		//oturi[0][0],oturi[0][1],oturi[0][2],oturi[0][3]・・・・には、
		//  5000         1000       500         100      ・・・という
		//   貨幣の金額が格納されています。
		//oturi[1][0],oturi[1][1],oturi[1][2],oturi[1][3]・・・・には、
		//  対応する「貨幣の金額」の枚数が格納されています。
	    for(int i = 0; i < oturi[0].length; i++){
	        System.out.println(oturi[0][i] + "円の枚数:" + oturi[1][i]);
	    }
	    
	    System.out.println("--------おまけ-------------------------------------");
	    //上記で取得した２次元配列を１次元配列として扱います。★★★★★★
	    
		//貨幣の金額用１次元配列を定義
		int[] kaheiKingaku = oturi[0];
		//枚数用１次元配列を定義
		int[] maisuu = oturi[1];
	    for(int i = 0; i < oturi[0].length; i++){
	        System.out.println(kaheiKingaku[i] + "円の枚数:" + maisuu[i]);
	    }
	    
		sc.close();
	}

	//貨幣の金額と、お釣りの枚数の２次元配列を返します。
	//２次元配列の「最初の行」には、
	//  5000         1000       500         100      ・・・という
	//   貨幣の金額が格納されています。
	//２次元配列の「次の行」には、
	//  対応する「貨幣の金額」の枚数が格納されています。
	public static int[][] oturi(int kingaku){
		if(kingaku > 10000) {
			//引数が、１万を超えている場合、
		    //２次元配列の「最初の行」が、「要素数 0 の１次元配列」で、
		    //２次元配列の「次の行」も、「要素数 0 の１次元配列」である
		    //２次元配列を返します。
			return new int[][] {{  },{  }};
			//上記の１文は、以下の１文と同じです。
//			return new int[][] {new int[0], new int[0]};
		}
		// おつりを計算
		//貨幣の金額用１次元配列を定義
		int[] kaheiKingaku = {5000, 1000, 500, 100, 50, 10, 5, 1};
		//枚数用１次元配列を定義
		int[] maisuu = new int[kaheiKingaku.length];
		
		int otsuri = 10000 - kingaku;

	    for(int i = 0; i < kaheiKingaku.length; i++){
	        maisuu[i] = otsuri / kaheiKingaku[i];
	        otsuri = otsuri % kaheiKingaku[i];
	    }
	    
	    //以下では、上記の「２個の１次元配列」を
	    //「１個の２次元配列」として扱います。★★★★★★
	    //１次元配列 kaheiKingaku が２次元配列の「最初の行」で、
	    //１次元配列 maisuu  が２次元配列の「次の行」となる
	    //２次元配列を作成します。
		int[][] oturi =  {kaheiKingaku, maisuu};
	    //上記の１文は、以下の３文と同じです。
//	    int[][] oturi = new int[2][];
//	    oturi[0] = kaheiKingaku;
//	    oturi[1] = maisuu;
	    
		return oturi;
	}

}
/*
[ケース１]：
1002
5000円の枚数:1
1000円の枚数:3
500円の枚数:1
100円の枚数:4
50円の枚数:1
10円の枚数:4
5円の枚数:1
1円の枚数:3
--------おまけ-------------------------------------
5000円の枚数:1
1000円の枚数:3
500円の枚数:1
100円の枚数:4
50円の枚数:1
10円の枚数:4
5円の枚数:1
1円の枚数:3

[ケース２]：
10001
--------おまけ-------------------------------------
*/
