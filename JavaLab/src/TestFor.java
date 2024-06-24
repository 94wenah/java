import java.util.Iterator;

public class TestFor {

	public static void main(String[] args) {
		
		// for迴圈
		int sum=0; 
		//  計數器宣告  ;條件成立,迴圈就執行
		for (int i =0; i<=10 ;i++) {
			System.out.println(i);
			sum=sum+i;
		
		}
		System.out.println("總和=" + sum);
//		System.out.println("finally i=" + i);
		
		
//		int sum2=0;
//		for (int i=1 ; i<=100 ; i++ ) {
//			if(i%2==1) {
//			System.out.println(i);
//			sum2=sum2+i;}
//		}
//		System.out.println("SUM=" +sum2);
		
		
		
//		int sum3=0;
//		for(int i=1 ;i<=100 && i%2==1 ; i++) {
//			System.out.println(i);
//			sum3=sum3+i;
//			// 遇到FALSE會中止
//		}
//		System.out.println("SUM=" +sum3);
		
		int sum2=0;
		for (int i=1 ; i<=100 ; i++ ) {
			if( i%2 == 0 ) {
				continue;
		}	
			if( i >= 50 ) {
				break;
			}
			System.out.println(i);
			sum2=sum2+i;}
		
		System.out.println("SUM=" +sum2);
		
		//while迴圈
		int i=1; //上面的i只能在for迴圈裡面使用，出來就可以再使用
		sum=0; //不能重複宣告，但可以重設一個值
		while (i<=100) {
			sum += i ;
			i++;		
		}
		System.out.println("sum of while=" +sum);
		
		//DoWhile迴圈
		i=100; //不能重複宣告，但可以重設一個值
		sum=0; //不能重複宣告，但可以重設一個值
		do {
			//至少會執行一次
			sum += i ;
			i++;
		} while (i<=100);
		System.out.println("sum of dowhile=" + sum);
	}

}
