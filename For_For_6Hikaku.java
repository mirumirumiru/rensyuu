
public class For_For_6Hikaku {
    public static void main(String[] args) {


    	//①マイナスしないやり方
        for (int i = 1; i <= 10; i++) {
            for(int j= i; j <= 9; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i;j++){
    			System.out.print("*");
    		}
            System.out.println("");
        }

        //②マイナスするやり方
        int num =10;
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j < num; j++) {
				System.out.print(" ");
				}
				num--;
			for (int j = 0; j < i; j++) {
				System.out.print("*");
				}
			System.out.println("");
		}

    }
}