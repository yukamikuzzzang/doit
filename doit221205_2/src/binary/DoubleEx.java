package binary;

public class DoubleEx {

	int abc = 1;	// 전역변수 : 자료형 추론 불가.
	
	public static void main(String[] args) {
		
		// 지역변수 : 자료형 추론 가능.
		
		double dNum = 3.14;
		//float fNum = 3.14;
		float fNum = 3.14F;
		
		var num = 10.0;
		System.out.println(dNum);
		
		//num = true;	//error
		
	}

}
