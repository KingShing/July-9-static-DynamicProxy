package basic_exercise;




import java.util.Scanner;

import org.junit.Test;

public class Loop_control_statement {
	//1) if三种格式 1: if(boolean){ }  2: if(){ }else{ }  3:if(){}else if(){}else{}
		
	//2)成绩分级
	@Test
	public void score() throws Exception {
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		if(score>=90) {
			//优秀
			System.out.println("优秀");
		}else if(score>=80) {
			//好
			System.out.println("好");
		}else if(score>=70) {
			//良
			System.out.println("良");
		}else if(score>=60) {
			//及格
			System.out.println("及格");
		}else{
			//不及格
			System.out.println("不及格");
		}
	}
	
	//3) 用第三种格式  判断成绩
	// 答:同上
	
	
	//4)for : 求1-100奇数和
	@Test
	public void getSum() throws Exception {
		int sum = 0;
		for(int i=1;i<=100;sum+=i,i+=2) {}
		System.out.println(sum); //2500
	}
	
	//5) 条件求和:1-100 间 3的倍数&&5的倍数
	@Test
	public void getSum100() throws Exception {
			int sum = 0;
		
			for (int i = 1; i < 100; i++) {
				if(i % 5==0 && i % 3==0) {
					sum+=i;
				 }
			}
			System.out.println(sum); //315
	}
	
	
	//6)键盘输入一个大于100的三位数n ,求出100到n之间满足下列条件的数的和 //个位!=7 十位!=5 百位!=3
	
	@Test
	public void getsum4() throws Exception {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 100; i <= n; i++) {
			int ge = i%100%10;
			int shi = i/10%10;
			int bai = i/100;
			if(ge!=7&&shi!=5&&bai!=3) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
	
	
	//7)
	/**
	 * 1.从键盘上录入一个1到5的数字;
		2.当数字为1时打印菜单"新建";
		当数字为2时打印菜单"打开文件";
		当数字为3时打印菜单"保存";
		当数字为4时打印菜单"刷新";
		当数字为5时打印菜单"退出",并退出程序;
		此行代码可以终止java程序运行: System.exit(0);

	 */
	@Test
	public void printMenu()  {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		switch (n) {
		case 1:
			System.out.println("新建");
			break;
		case 2:
			System.out.println("打开文件");
			break;
		case 3:
			System.out.println("保存");
			break;
		case 4:
			System.out.println("刷新");
			break;
		default:
			System.out.println("退出");
			System.exit(0);
			break;
		}
	}
	//8)
	/**
	 * 看程序,完成以下问题
		public class Task06{
			public static void main(String[] args) {
				for(int x=1; x<=10; x++) {
					if(x%3==0) {
						//()在此处填写代码
					}
					System.out.println("Java基础班");
				}
			}
		}
		问题:
			1.想在控制台输出2次:"Java基础班"   括号()里面应该填写什么?  //break;
			2.想在控制台输出7次:"Java基础班"   括号()里面应该填写什么?  //continue;
			3.想在控制台输出13次:"Java基础班"   括号()里面应该填写什么? //System.out.println("Java基础班");
	 */
	//9)
	@Test
	public void t1() throws Exception {
		int x = 1,y = 1;
		if(x++==2 & ++y==2)	{
			x =7;
		}
		System.out.println("x="+x+",y="+y); //x=2,y=2;
		
		int a = 1,b = 1;
		if(a++==2 && ++b==2) {
			a =7;
		}
		System.out.println("a="+a+",b="+b); //a=2,b=1
	}
	
	
	//10) 
	@Test
	public void test22() throws Exception {
		int x = 1,y = 1;
		if(x++==1 | ++y==1)	{
			x =7;
		}
		System.out.println("x="+x+",y="+y);//x=7,y=2
		
		int a = 1,b = 1;
		if(a++==1 || ++b==1) {
			a =7;
		}
		System.out.println("a="+a+",b="+b);//a=7,b=1
		
		boolean c = true;
		
		if(c==false) 
			System.out.println("a");
		else if(c)
			System.out.println("b"); //b
		else if(!c)
			System.out.println("c");
		else
			System.out.println("d");
		}


	//11)
	@Test
	public void xx() throws Exception {
		int x = 2,y=3;
		switch(x)
		{
			default:
				y++;
			case 3:
				y++;
				break;
			case 4:
				y++;
		}
		System.out.println("y="+y); //y=5
	}
	
	
	//12)
	/**
	 * 分析以下需求，并用代码实现：
	1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	2.涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
	 *
	 */
	@Test
	public void salary() throws Exception {
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		int salary =  3000;
		if(age<1&&age>=0) {
			salary+=200;
		}else if(age<3) {
			salary+=500;
		}else if(age<5) {
			salary+=1000;
		}else if(age<10) {
			salary+=2500;
		}else if(age<15) {
			salary+=5000;
		}
		System.out.println(salary);
		String msg = "您目前工作了"+age+"年，基本工资为 3000元, 应涨工资 "+(salary-3000)+"元,涨后工资 "+salary+"元";
		System.out.println(msg);
	}
	
	
	//13)计算器
	/**
	 *	 请输入第一个整数:30
			请输入第二个整数:40
			请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
			控制台输出:30+40=70
	 */
	
	
	
	@Test
	public void calc() throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		double num1 = scan.nextInt();
		System.out.println("请输入第二个整数");
		double num2 = scan.nextInt();
		System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)");
		int ope = scan.nextInt();
		double res = 0;
		char ch1=' ' ;
		switch (ope) {
		case 0:
			res=num1+num2;
			ch1='+';
			break;
		case 1:
			res=num1-num2;
			ch1='-';
			break;
		case 2:
			res=num1*num2;
			ch1='*';
			break;
		case 3:
			res=num1/num2;
			ch1='/';
			break;
		}
		System.out.println(num1+String.valueOf(ch1)+num2+" = "+res);
	}
	
	
	
	//14)
	/**
	 * 	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
		2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。

	 */
	
	@Test
	public void dod() throws Exception {
		int h = 8848;
		double x = 0.0001;
		int count =0;
		do{
			count++;
			x*=2;
		} while (x<=h);
		System.out.println(count); // 27
	}
	
}
