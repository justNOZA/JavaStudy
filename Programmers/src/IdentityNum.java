
public class IdentityNum {
	public static Boolean checkJumin(String jumin){
	    Boolean ok = false; // TRUE OR FALSE

	    int key = 11; // Ű�� 11
	    int checkSum = 0; // ����ġ ���Ͽ� �ջ��� ��
	    int reg =jumin.charAt(jumin.length() -1) - 48; // �ֹι�ȣ ������ ��
	    int checkReg = 0;     // üũ�� ��

	    int[] weight = { 2,3,4,5,6,7,8,9,2,3,4,5 }; //����ġ �迭

	    jumin = jumin.replace("-", ""); // �߰��� - ����
	    jumin = jumin.substring(0,jumin.length()-1); //�� ���ڸ� �ڸ� ��

	    //����ġ�� ���ؼ� �ջ�
	    for( int i = 0 ; i < weight.length ; i++){
	        checkSum += (jumin.charAt(i) - 48) * weight[i];
	    }

	    checkReg = key - (checkSum%key);

	    if(checkReg == 10){
	        checkReg = 0; // �˻簪�� 10���� ������ 0���� ��ȯ
	    }

	    if ( checkReg == reg ){
	        ok = true; // üũ�� ���� �ֹι�ȣ ������ ���� �´ٸ� true ��ȯ
	    }
//global email?? 
	    return ok;
	}
}
