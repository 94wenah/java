
public class TestIf {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int age = 40;
        if (age >= 18) {
        	System.out.println("成年");		       	
        	if (age > 30) {
        		System.out.println("壯年");
        		}
        }else {
            System.out.println("未成年");
        }
    
        
        int classroom=204;
        switch (classroom) {
        //case 連續寫代表在做'或'
		case 204:
//			System.out.println(">=30");
//			break;
		case 305:
			System.out.println("<30 >=20");
			break;

		default:
			System.out.println("其他");
			break; //default中的break可以省
		}
   }
}

