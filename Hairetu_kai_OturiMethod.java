import java.util.Scanner;

public class Hairetu_OturiMethod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//�����l����͂��܂�
		int kingaku = sc.nextInt();

		int[][] oturi =  oturi( kingaku );
		//oturi[0][0],oturi[0][1],oturi[0][2],oturi[0][3]�E�E�E�E�ɂ́A
		//  5000         1000       500         100      �E�E�E�Ƃ���
		//   �ݕ��̋��z���i�[����Ă��܂��B
		//oturi[1][0],oturi[1][1],oturi[1][2],oturi[1][3]�E�E�E�E�ɂ́A
		//  �Ή�����u�ݕ��̋��z�v�̖������i�[����Ă��܂��B
	    for(int i = 0; i < oturi[0].length; i++){
	        System.out.println(oturi[0][i] + "�~�̖���:" + oturi[1][i]);
	    }
	    
	    System.out.println("--------���܂�-------------------------------------");
	    //��L�Ŏ擾�����Q�����z����P�����z��Ƃ��Ĉ����܂��B������������
	    
		//�ݕ��̋��z�p�P�����z����`
		int[] kaheiKingaku = oturi[0];
		//�����p�P�����z����`
		int[] maisuu = oturi[1];
	    for(int i = 0; i < oturi[0].length; i++){
	        System.out.println(kaheiKingaku[i] + "�~�̖���:" + maisuu[i]);
	    }
	    
		sc.close();
	}

	//�ݕ��̋��z�ƁA���ނ�̖����̂Q�����z���Ԃ��܂��B
	//�Q�����z��́u�ŏ��̍s�v�ɂ́A
	//  5000         1000       500         100      �E�E�E�Ƃ���
	//   �ݕ��̋��z���i�[����Ă��܂��B
	//�Q�����z��́u���̍s�v�ɂ́A
	//  �Ή�����u�ݕ��̋��z�v�̖������i�[����Ă��܂��B
	public static int[][] oturi(int kingaku){
		if(kingaku > 10000) {
			//�������A�P���𒴂��Ă���ꍇ�A
		    //�Q�����z��́u�ŏ��̍s�v���A�u�v�f�� 0 �̂P�����z��v�ŁA
		    //�Q�����z��́u���̍s�v���A�u�v�f�� 0 �̂P�����z��v�ł���
		    //�Q�����z���Ԃ��܂��B
			return new int[][] {{  },{  }};
			//��L�̂P���́A�ȉ��̂P���Ɠ����ł��B
//			return new int[][] {new int[0], new int[0]};
		}
		// ������v�Z
		//�ݕ��̋��z�p�P�����z����`
		int[] kaheiKingaku = {5000, 1000, 500, 100, 50, 10, 5, 1};
		//�����p�P�����z����`
		int[] maisuu = new int[kaheiKingaku.length];
		
		int otsuri = 10000 - kingaku;

	    for(int i = 0; i < kaheiKingaku.length; i++){
	        maisuu[i] = otsuri / kaheiKingaku[i];
	        otsuri = otsuri % kaheiKingaku[i];
	    }
	    
	    //�ȉ��ł́A��L�́u�Q�̂P�����z��v��
	    //�u�P�̂Q�����z��v�Ƃ��Ĉ����܂��B������������
	    //�P�����z�� kaheiKingaku ���Q�����z��́u�ŏ��̍s�v�ŁA
	    //�P�����z�� maisuu  ���Q�����z��́u���̍s�v�ƂȂ�
	    //�Q�����z����쐬���܂��B
		int[][] oturi =  {kaheiKingaku, maisuu};
	    //��L�̂P���́A�ȉ��̂R���Ɠ����ł��B
//	    int[][] oturi = new int[2][];
//	    oturi[0] = kaheiKingaku;
//	    oturi[1] = maisuu;
	    
		return oturi;
	}

}
/*
[�P�[�X�P]�F
1002
5000�~�̖���:1
1000�~�̖���:3
500�~�̖���:1
100�~�̖���:4
50�~�̖���:1
10�~�̖���:4
5�~�̖���:1
1�~�̖���:3
--------���܂�-------------------------------------
5000�~�̖���:1
1000�~�̖���:3
500�~�̖���:1
100�~�̖���:4
50�~�̖���:1
10�~�̖���:4
5�~�̖���:1
1�~�̖���:3

[�P�[�X�Q]�F
10001
--------���܂�-------------------------------------
*/
