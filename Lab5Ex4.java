import java.util.Scanner;

class Lab5Ex4{
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter num1:");
		int a = scn.nextInt();
		
		System.out.println();
		
		System.out.print("Enter num2:");
		int b = scn.nextInt();
		
		int c = (a>b)?(+1):(-1);
		System.out.println(c);
	
	}
	
}