import java.util.Scanner;
 class First1 {
public static void main(String []args){
int  number1 , number2 ;
Scanner in = new Scanner(System.in);

System.out.println("Please enter first number for addition");
number1 = in.nextInt();
System.out.println("Please enter second number for addition");
number2 = in.nextInt();
First1 f = new First1();
int sum;
sum = (number1+number2);
System.out.println("Sum is :" + sum);
}
}

