
public class TestBasic {
	//main
	public static void main(String[] args) {
		
//宣告  型態  變數名稱
		{
			int  salary;//宣告會產生記憶體的空間
			salary = 20000; //給值
			System.out.println("薪水=" + salary);//取值
			salary = 40000;//給值可以給多次,但宣告 名稱不能重覆
		}
	   
	   int i=0,j=1,k=2;
	   //int k;
	   //int j;
	   short saLary;//Duplicate local variable salary
	   
	   long salaryOfMary = 21000000000L;//21e
	   
	   long overflow = 20000000000L + 20000000000L; //20e + 20e
	   //計算結果40e, 超過int能儲存的範圍(+-21e) -> overflow
	   //                 int     +     int -> int
	   //                 int     +     long -> long+long -> long
	   System.out.println("overflow = "+overflow);
	   
	   char ch = '中';//char字元(單一一個字),用單引號不是雙引號
	   System.out.println(ch);
	   
	   boolean paid = true;//true or false
	   System.out.println("付過錢了沒?"+paid);
	   //基本資料型態(4整個,2浮點,char, boolean)一共8個
	   
	   System.out.println("\"Hello\"\r\n\\World\\");
	   
	   float a = 10; 
	   int b = 3;
	   float c = a  / b;//一定要試 %(取餘數,對2取餘數), /除, 3.3333333
	   //        int / int -> int
	   //      double/ int -> double / double -> double
	   //       float/ int -> float  / float  -> float
	   System.out.println("c=" + c);
	   
	   c = 4000000000.0f;//40e float->轉成int極限值
	   int d = (int)c;//強制轉型,由大轉小,表示工程師保證轉型沒問題
	   System.out.println("d="+ d);
	   
	   int e = (int)overflow;//long(40e) -> int
	   System.out.println("e="+e);
	   
	   
	   short aa = 1;
	   short bb = 2;
	   int cc = aa + bb;//int(+-21e)
	   //      short + short -> int + int -> int 
	   
	   
	   int age = 10;
	   boolean isAdult = (age != 18);//一定要測 == , !=
	   System.out.println("是否成年?" + !isAdult);
	   
	   System.out.println(  age >= 18 && age <30  );//且
	   //enter |
	   System.out.println(  age < 18  || age >30  );//或
	   
	   System.out.println(12 & 6);//4
	   System.out.println(12 | 6);//14
	   
	   int java  = 8;//1 0 0 0
	   int sql   = 4;//0 1 0 0
	   int html  = 2;//0 0 1 0
	   int python= 1;//0 0 0 1
	   
	   //假設Ken會java 跟python
	   //int skillOfKen = 9;//1 0 0 1
	   //ctrl+alt+down
	   //用|把技能組起來
	   int skillOfKen = java | python;//1 0 0 1
	   // 1 0 0 0 
	  //| 0 0 0 1
	  //------------
	  //  1 0 0 1  -> 2^3 + 2^0 = 9
	   //判斷會不會用 & >0表示會
	   System.out.println("Ken會不會java=" + ((skillOfKen & java) > 0) );
	   // 1 0 0 1
	 //&  1 0 0 0 
	 //--------------
	  //  1 0 0 0 -> 8表示,第4個bit有1, & 才會不是0, 大於0來判斷該位置的bit是否有值
	   System.out.println("Ken會不會html=" + ((skillOfKen & html) > 0) );
	   // 1 0 0 1
	 //&  0 0 1 0 
	 //--------------
	  //  0 0 0 0 -> 結果為0,表示第2個bit為0,不會html
	   
	   System.out.println(~1234);
	   
	   System.out.println(3 << 2);//3 * 2^2=12
	   System.out.println(15 >> 2);//15 / 4 = 3
	   
	   //age = age + 1;
	   age = 10;
	   //age++; //age = age + 1, age += 1
	   //age--;
	   System.out.println("age=" + age++ + ",age="+age);
	   //加號放後面跟其它程式一起執行時,會晚做加1
	   System.out.println(age);
	   
	   //float a;
	   //int b;
	   a += b; //a = a + b;//10,3
	   a = a + b;
	              //float + int -> float + float -> float
	   b += a; // b = b + a;//3+13
	   b = (int)(b + a);
   //int = int + float -> float
	   System.out.println("a="+a);
	   System.out.println("b="+b);
	   
	   System.out.println( age>=18 ? "成年"                     : "未成年" );
	   age = 40;
	   System.out.println( age>=18 ? (age > 30 ?"壯年" : "成年") : "未成年" );
	   
	   int sales = 2000;
	   double salary = 100;
	   salary = sales > 1000 ? salary * 1.1 : salary *0.9;
	   //                     float * double -> double * double ->double
	   System.out.println("薪水="+salary);
	   
	   int empno_1 = 1;
	   char name_1 = 'V';
	   
	   int empno_100 = 2;
	   char name_100 ='D';
	   
	   
	   
	}

}










