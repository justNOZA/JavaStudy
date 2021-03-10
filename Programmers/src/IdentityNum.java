
public class IdentityNum {
	
	public  Boolean checkJumin(String identifiedNum){
		
	    Boolean identifyCheck = false; // 주민번호가 유효한지 결과()

	    int key = 11; // 키값 11
	    int checkSum = 0; // 가중치 곱하여 합산한 값
	    int reg =identifiedNum.charAt(identifiedNum.length() -1) - 48; // 주민번호 마지막 값
	    int checkReg = 0;     // 체크할 값

	    int[] weight = { 2,3,4,5,6,7,8,9,2,3,4,5 }; //가중치 배열

	    identifiedNum = identifiedNum.replace("-", ""); // 중간에 - 빼기
	    identifiedNum = identifiedNum.substring(0,identifiedNum.length()-1); //맨 뒷자리 자른 값

	    //가중치와 곱해서 합산
	    for( int i = 0 ; i < weight.length ; i++){
	        checkSum += (identifiedNum.charAt(i) - 48) * weight[i];
	    }

	    checkReg = key - (checkSum%key);

	    if(checkReg == 10){
	        checkReg = 0; // 검사값이 10으로 나오면 0으로 반환
	    }

	    if ( checkReg == reg ){
	        identifyCheck = true; // 체크한 값과 주민번호 마지막 값이 맞다면 true 반환
	    }
	    return identifyCheck;
	}
}
