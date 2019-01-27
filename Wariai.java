package sample;

import java.util.Random;

public class Wariai {

	public static void main(String[] args) {

	    Random rnd = new Random();


	    int x = (int)(Math.random() * 10) + 1;	  //文字列が出力される数

    	int wariais = rnd.nextInt(100) + 1;  //100以下のランダムな数を出力
    	int wariaizan = 100 - wariais - x;

    	//System.out.println(wariais + " + " + x + "　whileの外の初期値");
    	//System.out.println(wariaizan + "  wariaizan + whileの外の初期値");

	    while(x>1) {
	    	System.out.println(wariais + " + " + x);

	    	//System.out.println(wariaizan + "  wariaizan");

	    	int wariaib = rnd.nextInt(wariaizan) + 1;

	    	//System.out.println(wariaib + "  wariaib");

	    	wariais = wariaib;

	    	//System.out.println(wariais + "  wariais");

	    	wariaizan = wariaizan - wariais - x;

	    	--x;
	    	}

	    //System.out.println(wariais + " ++ " + x);

	}

}
