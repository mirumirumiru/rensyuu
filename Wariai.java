package sample;

import java.util.Random;

public class Wariai {

	public static void main(String[] args) {

	    Random rnd = new Random();


	    int x = (int)(Math.random() * 10) + 1;	  //文字列が出力される数

    	int wariais = rnd.nextInt(100-x) + 1;  //100以下のランダムな数を出力
    	int wariaizana = 100 - wariais; //本当の割合の残り
    	int wariaizanb = 100 - wariais - x; //次の割合を出すための残り

    	//System.out.println(wariais + " + " + x + "　whileの外の初期値");
    	//System.out.println(wariaizana + "  wariaizan + whileの外の初期値");
    	//System.out.println(wariaizanb + "  wariaizan + whileの外の初期値");

	    while(x>1) {
	    	System.out.println(wariais + " + " + x);

	    	System.out.println(wariaizana + "  wariaizana");
	    	System.out.println(wariaizanb + "  wariaizanb");

	    	int wariaib = rnd.nextInt(wariaizanb) + 1;

	    	System.out.println(wariaib + "  wariaib");

	    	wariais = wariaib;

	    	System.out.println(wariais + "  wariais");

	    	wariaizana = wariaizana - wariais;
	    	wariaizanb = wariaizana - x;

	    	--x;
	    	
	    	}if (x == 1) {
	    		System.out.println(wariaizana + 1 + " ++ " + x);
	    		
	    	}

	}

}
