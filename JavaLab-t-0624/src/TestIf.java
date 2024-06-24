
public class TestIf {

	public static void main(String[] args) {
		
		int age = 25;
		if ( age >= 18 ) {
			//move: alt + up or down
			if ( age > 30 ) {
				System.out.println("壯年");
			}else {
				System.out.println("成年");				
			}
		}else {
			System.out.println("未成年");
		}
			
		
		int classroom = 204;
		switch (classroom) {
		//case只能等於
		//case連續寫,或|| 
		case 204:
		case 205:
		case 305:
			System.out.println("<30 >=20");
			break;
		default:
			System.out.println("其它");
			//break;//default中 break可以省
		}		
		
		
		
		
		
	}
	
	

}
