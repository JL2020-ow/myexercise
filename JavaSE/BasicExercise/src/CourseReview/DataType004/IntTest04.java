package CourseReview.DataType004;

public class IntTest04 {

	public static void main(String[] args) {
		byte b = (byte)300;
		System.out.println(b);
		
		byte x = 1;
		byte y = 127;
		byte z1 = -128;
		//byte z= 128;
		//byte的取值范围是：[-128,127]
		
		short s = 1;
		short s1 = -32768;
		short s2 = 32767;
		//short s3 = 32768;
		//short的取值范围是：[-32768,32767]
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}
