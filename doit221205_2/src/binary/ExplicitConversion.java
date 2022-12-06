package binary;

public class ExplicitConversion {

	public static void main(String[] args) {
		
		int iNum = 1000;
		byte bNum = (byte)iNum;
		
		System.out.println(iNum);	
		System.out.println(bNum);
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println(iNum);
		
		float fNum = 0.9F;
		int num1 = (int)dNum + (int)fNum;
		// 형 변환 후 연산
		int num2 = (int)(dNum + fNum);
		// 연산 후 형 변환
		
 		System.out.println(num1);	// truncate
 		System.out.println(num2);
		
	}

}
