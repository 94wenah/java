
public class TestEmployee {

	public static void main(String[] args) {
	//  型態        變數名稱   = 值
		int        age      = 20;
		Employee   emp      = new Employee();//0800
		emp.empno = 1; //用.可以設值
		emp.name = 'V';
		System.out.println("員工編號=" + emp.empno);
		
		Employee   emp2      = new Employee();//0900
		emp2.empno = 2; //用.可以設值
		emp2.name = 'D';
		System.out.println("員工編號=" + emp2.empno);
		System.out.println( age == 18  );
		System.out.println( emp == emp2 );//0800 == 0900, false
		
		emp2 = emp;//emp2 = 0800;
		System.out.println( emp == emp2 );//0800 == 0800, true
		
		emp = null;//0800 -> 清空
		emp2 = null;//0800 -> 清空
		//System.out.println("員工編號=" + emp2.empno);//發生錯誤,程式會中斷不執行
		//Null Pointer Exception: Cannot read field "empno" because "emp2" is null
		
		System.gc();//強制啟動GC
		
		System.out.println("done!!!");
		
		

	}

}
