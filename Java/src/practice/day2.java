package practice;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define and variable and assign a value
		
		int a=10;
		System.out.println(a);
		
		//Arithmetic operator
		
		int s=10;
		int t=5;
		int q=s+t;
		System.out.println(q);
		System.out.println(s+t);
		System.out.println(q+q);
		
		System.out.println(s+t);
		System.out.println(s-t);
		System.out.println(s*t);
		System.out.println(s/t);
		System.out.println(s%t);
		
		//calling the function
		Cal(12,13);
		Cal(120,12);
		
		//calling second function
		
		CalA();
		CalA();
		CalA();
		CalA();
		
		CalB(120,60);
		CalB(12,6);
		CalB(10,5);
		
		int x2=CalC(12,3);
		System.out.println(x2);
		System.out.println(x2+15);
		System.out.println(x2*0.10);
		System.out.println(x2/2);
		
		int q22=Sub(10,5);
		System.out.println(q22);
		int q23=Sub(100,50);
		System.out.println(q23);
		System.out.println(q23+q23);
	}
		
		static void Cal(int x, int y) {
			System.out.println(x+y);
			System.out.println(x-y);
			System.out.println(x*y);
			System.out.println(x/y);
			System.out.println(x%y);
		}
		
		
		//function without parameter and without return 
		
		static void CalA() {
			System.out.println(9+9);
		}
		
		//Function with parameter and without return type
		
		static void CalB(int x, int y) {
			System.out.println(x+y);

	}
		
		//function with parameter and with return type
		
		static int CalC(int x, int y) {
			return (x+y);
		}
		//multiplication
		
		static int Mul(int x, int y) {
			return (x*y);
		}
       //Subtraction
		
		static int Sub(int x, int y) {
			return(x-y);
		}
		//division
		
		static int Div(int x, int y){
			return (x/y);
		}}

