package CourseReview.DataType004;

public class CharTest02 {
	public static void main(String[] args) {
		char c1 = 't';
		System.out.println(c1);
		
		char c2 = '\t';
		System.out.println(c2 + "a");
		System.out.println("abcdef");
		System.out.println("abc\tdef");
	
		System.out.println("HelloWorld !");
		System.out.print("HelloWorld !");
		System.out.println("HelloWorld !");
		
		System.out.print("abc");
		char c3 = '\n' ;
		System.out.println(c3);
		System.out.println("def");
		
		System.out.println('\'');
		System.out.println("test");
		System.out.println("“test”");
		
		System.out.println("\"test\"");
		
		System.out.println("'");
		
		System.out.println("'这样呢 ?'");
		
		//反斜杠u表示后面的是一个字符的unicode编码。
		char x = '\u4e2d';
		System.out.println(x);
		
   }
}