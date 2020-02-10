package Calculator.CalculatorExample;

import java.util.Scanner;

import org.junit.Test;

public class Testt {
	private Scanner sc;
	private double a;
	private double b;
	private double c;
	@Test
   public void TestTestt() {
		Calci cal=new App();
		sc = new Scanner(System.in);
		   System.out.println("Enter number 1 : ");
		   a = sc.nextDouble();
		   System.out.println("Enter number 2 : ");
		   b=sc.nextDouble();
		   System.out.println("1.Add\n 2.Subtract\n 3.Multiply\n 4.Division\n 5.Exit\n");
		   System.out.println("Enter the choice : ");
		   int choice=sc.nextInt();
		   do{
			   switch(choice) {
			   	   case 1 : c=cal.add(a,b);
			   		    	System.out.println("Sum of two numbers are :"+c);
			                break;
			       case 2 : c=cal.sub(a,b);
			                System.out.println("Subtraction of two numbers are :"+c);
			                break;
			       case 3 : c=cal.mul(a,b);
			                System.out.println("Multiplication of two numbers are :"+c);
			                break;
			       case 4 : c=cal.div(a,b);
			                System.out.println("Division of two numbers are :"+c);
			                break;
			       case 5 : System.exit(0);
				            break;
			       default : System.out.println("Invalid choice choosen\n Choose another number");
			   }
		   }while(choice!=5);
   }
}
