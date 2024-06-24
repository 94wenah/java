
public class Test9x9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i X j
		
		for(int i=1;i<=9;i++) {		
			for(int j=1 ; j<=9 ; j++) {
//				System.out.print(i + "x" + j + "=" + (i*j) + "\t");
				System.out.print(i + "x" + j + "=" + i*j + (j!=9 ? "\t" : "\r\n"));
			}
			System.out.println();
		}
		
		
	}

}
