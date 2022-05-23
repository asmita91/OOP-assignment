import java.util.Random;
import java.util.Scanner;

//Write a program to print numbers from 1 to 10.
class PrintNumbers{
    public static void main(String[] args) {
        System.out.println("the numbers from 1-10 are::");
        for(int i=1;i<=10;i++){
            System.out.print(i+"\t");
        }
    }
}
//WAP to display even number between 10 and 30.
class PrintEvenNumbers{
    public static void main(String[] args) {
        System.out.println("the even numbers between 10 and 30 are::");
        for (int i=12;i<30;i+=2){
            System.out.print(i+"\t");
        }
    }
}
//WAP to display the number of even numbers between 10 and 30.
class EvenNumbersCount{
    public static void main(String[] args) {
        System.out.println("the even numbers between 10 and 30 are::");
        int count=0;
        for (int i=11;i<30;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.println("the numbers of even numbers between 10 and 30 is:" +count);
    }
}
//WAP to display no. of even and no. of odd number between 10 and 30.
class EvenOddCount{
    public static void main(String[] args) {
        System.out.println("the even numbers between 10 and 30 are::");
        int counte=0;
        int counto=0;
        for (int i=11;i<30;i++){
            if(i%2==0){
                counte++;
            }
            else{
                counto++;
            }
        }
        System.out.println("the numbers of even numbers between 10 and 30 is:" +counte);
        System.out.println("the numbers of odd numbers between 10 and 30 is:" +counto);
    }
}
//WAP to display multiplication table of a given no
class MultiplicationOfGiven{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int num=5;
        for (int i=1;i<=10;i++){
            int product=i*num;
            System.out.println(num +"x"+ i+ "="+ product);
        }
    }
}
//Write a program to calculate the sum of first 10 natural number.
class NaturalNumberSum{
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("the sum is :"+sum);
    }
}
//Write a program that prompts the user to input a positive integer. It should then
//print the multiplication table of that number.
class MultiplicationOfUserInput{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();
        for (int i=1;i<=10;i++){
            int product=i*num;
            System.out.println(num +"x"+ i+ "="+ product);
        }
    }
}
//Write a program to find the factorial value of any number entered through the
//keyboard.
class FactorialOfNumber{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();
        System.out.println("the factorials of "+num+" is::");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+"\t");
            }
        }
    }
}
//Two numbers are entered through the keyboard. Write a program to find the value
//of one number raised to the power of another. (Do not use Java built-in method)
class Power{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int a= scanner.nextInt();
        System.out.println("enter the power");
        int power= scanner.nextInt();
        int answer=1;
        for(int i=1;i<=power;i++){
            answer=answer*a;
        }
        System.out.println(answer);
    }
}
//Write a program that prompts the user to input an integer and then outputs the
//number with the digits reversed. For example, if the input is 12345, the output
//should be 54321.
class Reverse{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int num= scanner.nextInt();
        int rev=0;
        while(num!=0){
            int digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("the reverse is :"+rev);
    }
}
//Write a program that reads a set of integers, and then prints the sum of the even
//and odd integers
class MultipleInputs{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of integers you want to enter");
        int num= scanner.nextInt();
        int sume=0;
        int sumo=0;
        for(int i=1;i<=num;i++){
            System.out.println("enter the element::");
            int ele=scanner.nextInt();
            if(ele%2==0){
                sume=sume+ele;
            }
            else{
                sumo=sumo+ele;
            }
        }
        System.out.println("the sum of even integers is: "+sume);
        System.out.println("the sum of odd integers is: "+sumo);
    }
}
/*Write a program that prompts the user to input a positive integer. It should then
output a message indicating whether the number is a prime number.*/
class PrimeOrNot{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ");
        int num= scanner.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}
/*Write a program to calculate HCF of Two given number.*/
class HCF{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();
        System.out.println("enter next number");
        int b = scanner.nextInt();
        int answer=0;
        for(int i=1;i<=a||i<=b;i++){
            if(a%i==0 && b%i==0){
                answer=i;
            }
        }
        System.out.println("the hcf is "+answer);
    }
}
/*Write a do-while loop that asks the user to enter two numbers. The numbers
should be added and the sum displayed. The loop should ask the user whether he
or she wishes to perform the operation again. If so, the loop should repeat;
otherwise it should terminate*/
class DisplaySum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean answer;
        int sum=0;
        do {
            System.out.println("enter a number");
            int num1 = scanner.nextInt();
            System.out.println("enter next number");
            int num2 = scanner.nextInt();
            sum = num1 + num2;
            System.out.println(sum);
            System.out.println("do you want to continue..type true or false");
            answer = scanner.nextBoolean();
        } while (answer == true);
    }
}
//Write a program to enter the numbers till the user wants and at the end it should
//display the count of positive, negative and zeros entered.
class PositiveNegativeZero{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range of numbers you want to enter");
        int last=scanner.nextInt();
        int num = 0;
        int countp = 0,countn=0,counto=0;
        for(int i=0;i<=last;i++){
            System.out.println("enter elements");
            num=scanner.nextInt();
            if (num>0){
                countp++;
            }
            else if(num==0){
                counto++;
            }
            else{
                countn++;
            }
        }
        System.out.println("the count of positive numbers is: "+countp);
        System.out.println("the count of negative numbers is: "+countn);
        System.out.println("the count of zeros is: "+counto);

    }
}
/*Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.*/
class LargestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the range of numbers you want to enter");
        int last = scanner.nextInt();
        int max=0;
        int min=0;
        for (int i = 0; i <= last; i++) {
            System.out.println("enter elements");
            int num = scanner.nextInt();

            if(num>max){
                max=num;
            }
            else if(num<min){
                min=num;
            }
        }
        System.out.println("the maximum number is :"+ max);
        System.out.println("the minimum number is :"+min);
    }
}
/*Write a program to print out all Armstrong numbers between 1 and 500. If sum of
cubes of each digit of the number is equal to the number itself, then the number is
called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )*/
class Armstrong{
    public static void main(String[] args) {
        for(int i=2;i<500;i++){
            int arm=0;
            int ori=i;
            while(ori!=0) {
                int rem = ori % 10;
                arm = arm + (rem * rem * rem);
                ori = ori / 10;
            }
            if(arm==i){
                System.out.print(i+"\t");
            }
            arm=0;

        }
    }
}
/*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 .....*/
class FibonacciSeries{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a range");
        int last= scanner.nextInt();
        int x=0;
        int y=1;
        int z=0;
        for(int i=1;i<=last;i++){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}
/*Write a program to calculate the sum of following series where n is input by user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
*/
class Series{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the denominator of last term");
        int last=scanner.nextInt();
        double sum=0;
        for(int i=1;i<=last;i++){
            sum=sum+(1.0/i);
        }
        System.out.println("the sum is :"+sum);
    }
}
/*Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user.*/

class NaturalLogarithm{                                  //yo mistake vayo
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the denominator of last term");
        int last=scanner.nextInt();
        double sum=0;
        double sign=1.0;
        for(int i=1;i<=last;i++){
            sum=sign*(sum+(1.0/i));
            sign=(-1)*sign;
        }
        System.out.println("the sum is :"+sum);
        }
    }
/*Write a program that generates a random number and asks the user to guess what
the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random
number, the program should display "Too low, try again." The program should use
a loop that repeats until the user correctly guesses the random number.*/
class RandomKo{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random rand = new Random();
        System.out.println("enter the maximum bound");
        int max=scanner.nextInt();
        int int_random=0;
        int num=0;
        do{
            System.out.println("enter any number");
             num=scanner.nextInt();
             int_random = rand.nextInt(max);
             if(num>int_random){
                 System.out.println("Too high, try again");
             }
             else if (num<int_random){
                 System.out.println("Too low, try again");
             }
             else{
                 System.out.println("bravo!!");
             }
        }while(int_random!=num);
    }
}
/*Write a program to print following :
i)  **********
    **********
    **********
    ***********/
class Rectangle{
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for(int j=1;j<=10;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*Question 18
Write a program to print following :
ii) *
    **
    ***
    ****
    ******/
class Triangle{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*  *
   ***
  *****
 *******
**********/
class TrianglePartTwo {
    public static void main(String[] args) {
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}
//
class NumbersPyramid {

    public static void main(String[] args) {
        int rows = 5, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print( i );
                ++k;
            }

            System.out.println();
        }
    }
}