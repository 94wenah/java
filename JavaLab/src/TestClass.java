
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 	 age    = 20;
		Employee emp	= new Employee(); //物件，記憶體有物件的空間
		emp.empno=1; //用.可以設值
		emp.name="Debbie";
		System.out.println("員工名字=" + emp.name);
		
		Employee emp2	= new Employee(); //物件，記憶體有物件的空間
		emp2.empno=2; //用.可以設值
		emp2.name="david";
		System.out.println("員工編號=" + emp2.empno);
		System.out.println(emp==emp2); //比較物件記憶體的位址
		
		emp2=emp;
		System.out.println(emp==emp2); //比較物件記憶體的位址
		
		emp=null;
		emp2=null;
		System.out.println("員工編號=" + emp2.empno);
		System.out.println(emp==emp2); //比較物件記憶體的位址
		
	}

}
