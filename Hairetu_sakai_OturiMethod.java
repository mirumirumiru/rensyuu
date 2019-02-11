import java.util.Scanner;

public class Hairetu_OturiMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] kinnsyu = { 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int kingaku = sc.nextInt();
		int[] mai = oturi(kingaku);

		for (int i = 0; i < kinnsyu.length; i++) {
			System.out.println(kinnsyu[i] + "円札：" + mai[i]);
		}
		
		sc.close();

	}

	public static int[] oturi(int kingaku) {

		int[] kinnsyu = { 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int[] mai = new int[8];

		int oturi = 10000 - kingaku;

		if (kingaku > 10000) {
			return mai;
		}

		for (int i = 0; i < kinnsyu.length; i++) {
			mai[i] = oturi / kinnsyu[i];
			oturi = oturi % kinnsyu[i];
		}
		return mai;
	}

}
