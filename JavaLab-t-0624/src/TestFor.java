
public class TestFor {

	public static void main(String[] args) {
		int sum = 0;
		//  計數器宣告    ; 條件成立,迴圈就執行
		for( int i = 1 ; i <= 100 ; i++ ) {
			if ( i%2 == 0) {
				//偶數就會跳過,執行i++
				continue;
			}
			if ( i >= 50 ) {
				break;//迴圈立即停止
			}
			//奇數才會執行到下方程式
			System.out.println(i);
			sum = sum + i;
//			sum = sum + (i%2 == 1 ? i: 0);				
//			sum = i%2==1 ? sum + i : sum + 0;				
//			sum = sum + (i++);				
			//i++;
		}
		System.out.println("總和=" + sum);
		//System.out.println("finally i = " + i); //101
		
		int i = 1;
		//不能重複宣告,上面有了,但可以重設一個新的值
		sum = 0;//Duplicate local variable sum
		while ( i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("Sum of While = "+sum);
		
		//不能重複宣告,上面有了,但可以重設一個新的值
		i = 101;
		sum = 0;
		do {
			//至少會執行一次
			sum += i;
			i++;
		}while( i <= 100);
		System.out.println("Sum of DoWhile = "+sum);
		
	}
}





