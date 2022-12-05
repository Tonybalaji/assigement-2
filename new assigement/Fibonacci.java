package week2.day;

// 0 1 1 2 3 5 8 13 21
//num1   0  1 1 2
//num2   1  1 2 3
//num3   1  2 3 5

public class Fibonacci

{
	public static void main(String[] args) {
	
     int a=0;
     int b=1;
     int c;
     int number=9;
     
     {     
     for (int i=0;i<9;i++)
     {	
    	 System.out.println(a);
    	 c=a+b;
    	 a=b;
    	 b=c;
     }
     
 }
}
}

