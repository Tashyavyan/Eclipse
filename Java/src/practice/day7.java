package practice;

public class day7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for while loop
//*
//*initialization
//
//while(condition) {
//	//statements
//	
//	increment/decrement
//}
//}


//print hello 5 times with while loop
		
		int i1 = 1;
		while (i1 <= 5) {
			System.out.println("hello");
			//i1 = i1 + 1;
			i1++;
		}
//Printing 1 to 5
		int p = 1;
		while(p <= 5) {
			System.out.println(p);
			p++;
		}
		//printing reverse 5 to 1
		
		int r = 5;
		while(r >= 1) {
			System.out.println(r);
			r--;
		}
		//printing table of 2
		
		int t = 2;
		while(t <= 20) {
			System.out.println(t);
			t = t + 2;
		}
		//printing table of 5
		
	int t5 = 5;
	while(t5 <= 50) {
		System.out.println(t5);
		t5 = t5 + 5;
	}
	 //printing table of 6 reverse
	
	int r6 = 60;
	while(r6 >= 6) {
		System.out.println(r6);
		r6 = r6 - 6;
	}
	
	//break with while loop reverse
	
	int br = 5;
	while(br >=1) {
		if(br == 2) {
			break;
		}
		System.out.println(br);
		br--;
	}
	//break with while loop
	int b = 5;
	while(b <= 20) {
		if(b == 8) {
			break;
		}
		System.out.println(b);
		b++;
		}
	
	//other type break with while loop
	int b1 = 5;
	while(b1 <= 20) {
		System.out.println(b1);
		if(b1 ==8) {
			break;
		}
		//System.out.println(b1);
		b1++;
		}
	
	//continue with while
	
	int c = 1;
	while(c <= 10) {
		if(c == 3) {
			//c++;
			continue;
		}
			System.out.println(c);
			c++;
		}
	}
}



