
public class Test9x9 {

	public static void main(String[] args) {
		//ixj
		//1x1=1 1x2=2 .... 1x9=9
		//2x1=2 2x2=4 .... 2x9=18
		//....
		//9x1=9       .... 9x9=81
		
		for( int i = 1; i <= 9 ; i++) {
			for(int j=1 ; j <= 9 ; j++) {
				System.out.print(i +"x" + j +"=" + i*j + (j!=9 ? "\t" :"\r\n") );// \r\n \\ \"
			}
			System.out.println();
			//lab: 拿掉System.out.println();,印出來要跟下面一樣
			//提示:j!=9,印"\t", j=9,印\r\n 
			
		}
		

	}

}
