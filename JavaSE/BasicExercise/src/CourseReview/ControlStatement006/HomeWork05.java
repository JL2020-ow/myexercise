package CourseReview.ControlStatement006;
import java.util.*;
public class HomeWork05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		System.out.print("请输入第1个数字：");
		int x = s.nextInt();
		System.out.print("请输入第2个数字：");
		int y = s.nextInt();
		System.out.print("请输入第3个数字：");
		int z = s.nextInt();

		// 先判断三个值是否都相等
		if(x == y && y == z){
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
			return; //终止掉程序，后面讲
		}

		// 代码能够走到这里说明x y z不是都相等。
		// x和y相等，但是和z不等 
		if(x == y){
			if(x > z){
				System.out.println(z);
				System.out.println(x);
				System.out.println(y);
			}else{
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}
		// x和z相等，但是和y不等
		if(x == z){ 
			if(x > y){
				System.out.println(y);
				System.out.println(x);
				System.out.println(z);
			}else{
				System.out.println(x);
				System.out.println(z);
				System.out.println(y);
			}
		}
		// y和z相等，但是和x不等
		if(y == z){ // x y z
			if(y > x){
				System.out.println(x);	
				System.out.println(y);	
				System.out.println(z);	
			}else{
				System.out.println(y);	
				System.out.println(z);	
				System.out.println(x);
			}
		}

		// 程序执行到这里说明 x y z 都不相等
		/*
		if(x > y){
			if(y > z){
				System.out.println(z);
				System.out.println(y);
				System.out.println(x);
			}else{ 
				if(x < z){
					System.out.println(y);
					System.out.println(x);
					System.out.println(z);
				}else{
					System.out.println(y);
					System.out.println(z);
					System.out.println(x);
				}
			}
		}else{
			// x < y
			// 50 < 100
		}
		*/

		// 不算相等的，一共有6种情况。
		if(x > y && x > z){ // 假设x是最大的
			if(y > z){
				System.out.println(z);
				System.out.println(y);
			}else{
				System.out.println(y);
				System.out.println(z);
			}
			System.out.println(x);
		}else if(y > x && y > z){ // 假设y是最大的
			if(x > z){
				System.out.println(z);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(z);
			}
			System.out.println(y);
		}else{ //假设z是最大的
			if(x > y){
				System.out.println(y);
				System.out.println(x);
			}else{
				System.out.println(x);
				System.out.println(y);
			}
			System.out.println(z);
		}
    }
}