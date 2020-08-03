/*
  在返回值类型是void的方法中使用"return;"语句
  "return;"语句出现在返回值为void的方法当中主要是为了结束当前方法。
*/
  public class MethodTest10
  {
  	public static void main(String[] args){
  		m();

  		for(int i=10;i>0;i--){
  			if(i==2){
  				return;
  			}
  			System.out.println("data:-->"+i);
  		}
  		System.out.println("Execute Here!");
         
        //编译报错，返回值类型是void，不能返回值
  		//return 100;
  	}
  	//编译错误，对于结果类型为空的方法，无法返回值
  	/*
  	public static void m(){
  		return 10;
  	}
  	*/


  	public static void m(){
  		for(int i=0;i<10;i++){
  			if(i==5){
  				return;//不是终止for循环，终止的是m()方法。
  				//break;//终止的是for循环
  			}
  			System.out.println("i--->"+i);
  	}
  	System.out.println("Hello World!");
  }
}