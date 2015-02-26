import java.util.Scanner;

class math {

double add(double number1, double number2)
{
double answer  = number1 + number2;
return  answer;
}

double subtract(double number1, double number2)
{
double answer = number1 - number2;
return  answer;
}

double  division(double number1, double number2)
{
double answer = number1/number2;
return answer;
}

double   multiplication(double number1, double number2)
{
double answer = (number1 * number2);
return answer;
}
}
class calculator  { 
public static void main(String []args)
{
double number1,number2;
double operation1 =  0;
int operation;
math math = new math();
Scanner in = new Scanner(System.in);
System.out.println("Please Enter first number");
number1 = in.nextDouble();
System.out.println("Please Enter Second number");
number2 = in.nextDouble();

System.out.println("1:Addition");
System.out.println("2:Subtraction");
System.out.println("3:Division");
System.out.println("4:Multiplication");
System.out.println("Please enter operation you want to perform");
operation = in.nextInt();


switch (operation)
{
case 1: operation1 = math.add(number1, number2);
break;
case 2: operation1 = math.subtract(number1, number2);
break;
case 3: operation1 = math.division(number1, number2);
break;
case 4: operation1 = math.multiplication(number1, number2);
break;
default: 
break;
}
System.out.println("Answer  is " + operation1);
}
}
