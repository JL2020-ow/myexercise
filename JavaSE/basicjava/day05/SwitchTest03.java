/*
 *case后面也可以写char类型。
 */
  public class SwitchTest03
{
     public static void main(String[] args){
        
	     char c='A';
	     switch(c){
		case 'A':
		     System.out.println("高级");
		     break;
		case 'B':
		     System.out.println("中级");
		case 'C':
		     System.out.println("初级");
		default :
		     System.out.println("出错了");
	     }

     
            /* double d=90;
             switch(d){
                case 90:
                     System.out.println("高级");
                     break;
                case 80:
                     System.out.println("中级");
                case 70:
                     System.out.println("初级");
                default :
                     System.out.println("出错了");
             }
	     */
	}

}
