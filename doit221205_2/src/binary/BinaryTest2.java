package binary;

public class BinaryTest2 {

	public static void main(String[] args) {
		int num = 0b0000_0000_0000_0000_0000_0000_0000_0101;
		int num2 = 0b1111_1111_1111_1111_1111_1111_1111_1011;
		
		int sum = num + num2;
		System.out.println(sum);
		System.out.println(num);
		System.out.println(num2);
	}

}
