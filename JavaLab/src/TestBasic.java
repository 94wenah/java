
public class TestBasic {
	public static void main(String[] args) {
//  宣告 型態 變數名	
		int salary; //宣告會產生記憶體的空間
		salary = 20000; //給值
		salary = 400000; //給值可以給多次，但宣告的名稱不能重複 
		System.out.println("薪水=" + salary); //取值
		
		long salaryOfMary=21000000000000L; //超過21e結尾要加L
		int overflow=2000000000+2000000000; //20e+20e
		System.out.println(overflow);
		//計算結果40e，超過int的儲存範圍->overflow
		
		long overflow2=2000000000+2000000000L; //20e+20e
		System.out.println(overflow2);
		//int + long -> long + long ->long
		
		char ch='小';
		System.out.println(ch);
		boolean rain=true;
		System.out.println("\"台北\"\\下雨了嗎?\\ \r\n" +  rain);
//		基本資料型態(4個整數，2浮，char，boolean)
		
		
		
//		int a=20,b=6,c=a%b; // %取餘數(對2取餘數，判斷基偶數)
//		System.out.println("c=" + c);
//		int d=10,e=3,f=d/e; // /除(int/int=int)
//		System.out.println("f=" + f);
		
//		double a=10;
//		int b=3;
//		double c=a/b;
//		System.out.println("c=" + c); //double/int->double/double
		
		double a=10;
		int b=3;
		double c=a/b;
		System.out.println("c=" + c); //double/int->double/double
		int d =(int)c; //強制轉型，由大轉小，工程師表示並保證轉型沒問題(float->轉成int的極限值)
		System.out.println("d=" +d);
		
		
		int age=22;
		boolean adult=(age!=18);
		System.out.println("小明是否成年? \r\n" +adult);
		
		System.out.println( age >= 18 && age<30 );
		System.out.println( age > 18 || age<30 );
		System.out.println( ! (age<30) );
		System.out.println( 12&6 );
		System.out.println( 12|6 );
		
		int java  = 8; //1 0 0 0
		int sql   = 4; //0 1 0 0
		int html  = 2; //0 0 1 0
		int python= 1; //0 0 0 1
		int skiiOfKen=java | python;
		System.out.println("Ken會不會java=" + ((skiiOfKen & java)>0));
		//1 0 0 1
       //&1 0 0 0
	   //----------
	    //1 0 0 0
		System.out.println("Ken會不會html=" + ((skiiOfKen & html)>0));
		//1 0 0 1
	   //&0 0 1 0
		//----------
		//0 0 0 0
	}
}
