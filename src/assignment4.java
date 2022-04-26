import java.util.Scanner;

/*Using switch statement Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to
following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/
class FiveSubject{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter the marks of Physics");
        double phy= scanner.nextDouble();
        System.out.println("please enter the marks of chemistry");
        double chem= scanner.nextDouble();
        System.out.println("please enter the marks of biology");
        double bio= scanner.nextDouble();
        System.out.println("please enter the marks of mathematics");
        double maths= scanner.nextDouble();
        System.out.println("please enter the marks of computer");
        double com= scanner.nextDouble();
        double total_marks= phy+chem+ bio+maths+com;
        double Per=(total_marks*100)/500;
        switch((Per>=90)?0:(Per<90 && Per>=80)?1:(Per<80 && Per>=70)?2:(Per<70 && Per>=60)?3:(Per<60 && Per >=40)?4:5){
            case 0:
                System.out.println("grade A");
                break;
            case 1:
                System.out.println("grade B");
                break;
            case 2:
                System.out.println("grade C");
                break;
            case 3:
                System.out.println("grade D");
                break;
            case 4:
                System.out.println("grade E");
                break;
            case 5:
                System.out.println("grade F");
                break;
            default:
                System.out.println("please enter marks between 0-100 only");
                break;

        }

    }
}
//JAVA Program to find the maximum between two numbers. Using the switch statement.
class TwoNumberMax{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter 1st number");
        int a= scanner.nextInt();
        System.out.println("enter 2nd number");
        int b= scanner.nextInt();
        switch((a>b)?1:(b>a)?2:0){
            case 1:
                System.out.println(a+" is the maximum1");
                break;
            case 0:
                System.out.println(b+" is the maximum");
                break;
            default:
                System.out.println("both are equal");
                break;
            }
    }
}
//JAVA Program to find the maximum between three numbers. Using the switch statement
class MaxInThree{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:: ");
        int a = scanner.nextInt();

        System.out.println("Enter the second number:: ");
        int b = scanner.nextInt();

        System.out.println("Enter the third number:: ");
        int c = scanner.nextInt();

        switch((a>b&&b>c)?1:(b>c&&c>a)?2:(c>b&&b>a)?3:0){
            case 1:
                System.out.print(a+" is greatest");
                break;
            case 2:
                System.out.print(b+" is greatest");
                break;
            case 3:
                System.out.print(c+" is greatest");
                break;
            default :
                System.out.println("they are equal");
                break;
        }
    }
}
//JAVA Program to check whether a number is divisible by 5 and 11 or not. Using the switch
//statement
class DivisibleByFiveOrEleven{
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("please enter any number");
        int num= scanner.nextInt();
        double five=num%5;
        double eleven=num%11;
        switch((five==0 && eleven==0)?1:(five==0 && eleven!=0)?2:(five!=0 && eleven==0)?3:0){
            case 1:
                System.out.println("divisible by both 5 and 11");
                break;
            case 2:
                System.out.println("divisible by 5 only");
                break;
            case 3:
                System.out.println("divisible by 11 only");
                break;
            default:
                System.out.println("neither divisible by 5 nor by 11");
                break;
        }
    }
}
//JAVA Program to check whether a year is a leap year or not. Using switch statement
class LeapY{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year:: ");
        int year = scanner.nextInt();

        switch ((year%400==0)?1:((year%4==0 && year%100!=0 )?2:0)){
            case 1:
                System.out.print("The year is a leap year.");
                break;
            case 2:
                System.out.print("The year is  a leap year.");
                break;
            default:
                System.out.println("it is not a leap year");
        }
    }
}
//JAVA Program to check whether a character is an alphabet or not. Using the switch statement.
class Alpha{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a character");
        char ch=scanner.next().charAt(0);
        switch((ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z')?1:0){
            case 1:
                System.out.println("it is an alphabet");
                break;
            case 0:
                System.out.println("it is not alphabet");
                break;
        }
    }
}
/*JAVA Program to take the value from the user as input any alphabet and check whether it is
vowel or consonant. Using the switch statement.*/
class Vowel{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the alphabet:: ");
        char ch = scanner.next().charAt(0);

        switch ((ch =='a'|| ch =='e' || ch =='i'|| ch =='o'||ch =='u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == '0' || ch == 'U' )?1:0){
            case 1:
                System.out.print("The alphabet is a vowel.");
                break;
            case 0:
                System.out.print("The alphabet is a constant.");
                break;
        }
    }
}
/*JAVA Program to take the value from the user as input any character and check whether it is
the alphabet, digit or special character. Using the switch statement. */
class CheckCharacter{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        char a=scanner.next().charAt(0);
        switch((Character.isAlphabetic(a)?1:Character.isDigit(a)?2:0)){
            case 1:
                System.out.println("it is alphabet");
                break;
            case 2:
                System.out.println("it is numeric digit");
                break;
            default:
                System.out.println("it is a special character");
                break;
        }
    }
}
/*JAVA Program to check whether a character is an uppercase or lowercase alphabet. Using the
switch statement.*/
class  LowerOrUpper{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the character:: ");
        char ch = scanner.next().charAt(0);

        switch ((Character.isLowerCase(ch)?1:Character.isUpperCase(ch)?2:0)){
            case 1:
                System.out.print("The character is lower case.");
                break;
            case 2:
                System.out.print("The character is Upper case.");
                break;
            case 0:
                System.out.print("The character is invalid.");
                break;
        }
    }
}
/*JAVA Program to take the value from the user as an input week number and print weekday by
using the switch statement. */
class WeekDays{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the week number:: ");
        int a = scanner.nextInt();

        switch (a){
            case 1:
                System.out.print("Sunday");
                break;
            case 2:
                System.out.print("Monday");
                break;
            case 3:
                System.out.print("Tuesday");
                break;
            case 4:
                System.out.print("Wednesday");
                break;
            case 5:
                System.out.print("Thursday");
                break;
            case 6:
                System.out.print("Friday");
                break;
            case 7:
                System.out.print("Saturday");
                break;
            default:
                System.out.print("please enter number between 1-12.");
                break;

        }
    }
}
/*JAVA Program to take the value from the user as input the month number and print number of
days in that month. Using switch statement*/
class Month{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month=null;
        int days=0;

        System.out.print("Enter the month number:: ");
        int m = scanner.nextInt();
        System.out.println("enter year");
        int y = scanner.nextInt();
        switch (m){
            case 1:
                month = "January";
                days=31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 2:
                month="February";
                switch ((y%400==0)?1:(y%4==0 && y%100!=0)?2:0){
                    case 1:
                    case 2:
                        days=29;
                        break;
                    default:
                        days=28;
                        break;
                }
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 3:
                month="march";
                days=31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 4:
                month = "April";
                days = 30;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 5:
                month = "May";
                days = 31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 6:
                month = "June";
                days = 30;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 7:
                month = "july";
                days = 31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 8:
                month = "August";
                days = 31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 9:
                month = "September";
                days = 30;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 10:
                month = "October";
                days = 31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 11:
                month = "November";
                days = 30;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            case 12:
                month = "December";
                days = 31;
                System.out.print("The month "+month+" has "+days+" days.");
                break;
            default:
                System.out.println("please enter number only between 1-12");
                break;
        }

    }
}
/*JAVA Program to count the total number of notes in a given amount. Using the switch
statement.*/
class Notes{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the amount");
        int money=scanner.nextInt();
        int notes=0;
        switch((money%5==0)?1:0){
            case 1:
                notes=money/5;
                System.out.println("the notes are "+ notes);
                break;
            case 0:
                System.out.println("enter valid figures ");
                break;
        }
    }
}
/*JAVA Program to take the value from the user as input all sides of a triangle and check whether
the triangle is valid or not. Using switch statement*/
class ValidTriangle{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first side:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second side:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second side:: ");
        double c = scanner.nextDouble();

        switch ((a+b>c)||(a+c>b)||(b+c>a)?1:2){
            case 1:
                System.out.print("The triangle is valid.");
                break;
            case 2:
                System.out.print("The triangle is not valid.");
                break;
        }

    }
}
/*JAVA Program to check whether the triangle is an equilateral, isosceles or scalene triangle.
Using switch statement*/
class QuestionFourteenS{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the degree of first angle:: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double b = scanner.nextDouble();

        System.out.print("Enter the degree of second angle:: ");
        double c = scanner.nextDouble();

        switch ((a==b&&b==c)?1:(a==b||b==c||c==a)?2:3){
            case 1:
                System.out.print("The triangle is a equilateral triangle. ");
                break;
            case 2:
                System.out.print("The triangle is a isosceles triangle. ");
                break;
            case 3:
                System.out.print("The triangle is a scalene triangle. ");
                break;
            default:
                System.out.println("the sum of angle is not equal to 180 so triangle cannot be formed");
                break;
        }
    }
}
/*JAVA Program to find all the roots of a quadratic equation. Using switch statement*/
class QuadraticEquation{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the co-efficient of x square");
        double a= scanner.nextDouble();
        System.out.println("enter the co-efficient of x ");
        double b= scanner.nextDouble();
        System.out.println("enter the constant");
        double c= scanner.nextDouble();
        double determinant= b*b -4*a*c;
        switch((determinant>0)?1:(determinant==0)?2:0){
            case 1:
                double r1=((-b+Math.sqrt(determinant))/2*a);
                double r2=((-b-Math.sqrt(determinant))/2*a);
                System.out.println("the roots are "+r1+"\t and "+r2);
                break;
            case 2:
                double r3=-b/(2*a);
                System.out.println("the root is" +r3);
                break;
        }

    }
}
/*JAVA Program to calculate profit or loss. Using switch statement*/
class ProfitLoss{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the selling price: ");
        double sp = scanner.nextDouble();

        System.out.print("Enter the cost price: ");
        double cp = scanner.nextDouble();

        switch ((cp>sp)?1:(sp>cp)?2:0){
            case 1:
                double loss = cp-sp;
                System.out.print("The loss is "+loss);
                break;
            case 2:
                double profit = sp-cp;
                System.out.print("The profit is "+profit);
                break;
            case 0:
                System.out.print("there is neither profit nor loss");
        }
    }
}
/*JAVA Program to take the value from the user as input the basic salary of an employee and
calculate its Gross salary according to the following:
Basic Salary <= 10000: HRA = 20%, DA =80%……………………………….
Basic Salary <= 20000 : HRA = 25%, DA =90%………………………………
Basic Salary > 20000 : HRA = 30%, DA = 95%.*/
class GrossSalary{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your basic salary: ");
        double salary=scan.nextDouble();

        double HRA,DA;

        switch ( (salary<=10000)?1:(salary<=20000 && salary>10000)?2:(salary>20000)?3:0 ){

            case 1:
                System.out.println("Gross salary is "+ (salary+(0.2*salary)+(0.8*salary)));
                break;

            case 2:
                System.out.println("Gross salary is "+ (salary+(0.25*salary)+(0.9*salary)));
                break;

            case 3:
                System.out.println("Gross salary is "+ (salary+(0.3*salary)+(0.95*salary)));
                break;

            default:
                System.out.println("invalid");

        }

    }
}
/*JAVA Program to take the value from the user as input electricity unit charges and calculate
total electricity bill according to the given condition: For the first 50 units Rs.
0.50/unit………….For the next 100 units Rs. 0.75/unit…..For the next 100 units Rs. 1.20/unit
……………For unit above 250 Rs. 1.50/unit………An additional surcharge of 20% is added to
the bill…….Using the switch statement. */
class Elect{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        double amount,sur,bill;

        System.out.println("Enter the electricity unit charges:");
        double unit= scan.nextDouble();

        switch ( (unit<=50)?1:(unit>50 && unit<=150)?2:(unit>150 && unit<=250)?3:(unit>250)?4:0){
            case 1:
                amount=unit*0.5;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("The total bill is "+ bill);
                break;

            case 2:
                amount=25+(unit-50)*0.75;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("the total bill is"+bill);
                break;

            case 3:
                amount=25+75+(unit-150)*1.20;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            case 4:
                amount=25+75+150+(unit-250)*1.50;
                sur=amount*0.2;
                bill=amount+sur;
                System.out.println("total bill is "+bill);
                break;

            default:
                System.out.println("invalid");
                break;
        }
    }
}
/*Program to take the hours and minutes as input by the user and the show that whether it is AM
or PM by using the switch statement.*/
class AMOrPM{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double hours, minutes;
        System.out.println("enter the total hours: ");
        hours=scanner.nextDouble();
        System.out.println("enter the total minutes: ");
        minutes=scanner.nextDouble();

        double min_in_hr=minutes/60;
        double t_hours=min_in_hr+hours;

        switch((t_hours>0 &&t_hours<=11)? 1:(t_hours>=12 &&t_hours<24)?2:0){
            case 1:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is AM.");
                break;
            case 2:
                System.out.println("the total hours is "+t_hours);
                System.out.println("so it is PM.");
                break;

            default:
                System.out.println("invalid");
        }
    }
}
/*Program to convert a positive number into negative number and negative number into a positive
number using switch statement*/
class SwapPositiveNegative{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int num= scanner.nextInt();
        switch((num==0)?0:1){
            case 1:
                int new_num=(-1)*num;
                System.out.println("after change"+ new_num);
                break;
            case 0:
                System.out.println("zero cannot be negative or positive so answer is " + num);

        }
    }
}
/*Write a program to swap the values of two numbers if the values of both variables are not the
same using a switch statement. */
class SwapVariables{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        System.out.println("Enter the first no:");
        double a=scanner.nextDouble();
        System.out.println("Enter the second no:");
        double b=scanner.nextDouble();
        temp=a;
        a=b;
        b=temp;
        switch((a!=b)?1:(a==b)?2:3){
            case 1:
                System.out.println("a="+a);
                System.out.println("b="+b);
                break;
            case 2:
                System.out.println("enter two different numbers");
                break;
            case 3:
                System.out.println("enter valid numbers");
                break;
        }
    }
}
/*24. Program to Convert even number into its upper nearest odd number Switch Statement*/
class Upper{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        switch(num%2){
            case 0:
                System.out.println(num+" is an even number");
                System.out.println("And it's upper nearest odd number is "+ (num+1));
                break;
            case 1:
                System.out.println("Don't enter the odd number");
                break;
            default:
                System.out.println("enter numbers which are valid");
        }
    }
}
/*Write a program that determines a student’s grade. The program will read three types of scores
        (quiz, mid-term, and final scores) and determine the grade based on the following rules:if the
        average score =90% =>grade=A…………………..-if the average score >= 70% and <90% =>
        grade=B……………………-if the average score>=50% and <70%`
        =>grade=C……………………..-if the average score<50% =>grade=F
        */

class Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double quiz, mid, final_term,p;
        System.out.println("Enter the quiz_term marks: ");
        quiz=scanner.nextDouble();
        System.out.println("Enter the mid_term marks: ");
        mid=scanner.nextDouble();
        System.out.println("Enter the final_term marks: ");
        final_term=scanner.nextDouble();

        p=(quiz+mid+final_term)/3;
        System.out.println("the total percent is "+p);

        switch ((p>=90)? 0:(p>=70&& p<90)? 1:(p>=50&& p<70)?2:3){
            case 0:
                System.out.println("Grade A");
                break;
            case 1:
                System.out.println("Grade B");
                break;
            case 2:
                System.out.println("Grade C");
                break;
            case 3:
                System.out.println("Grade F");
                break;
            default:
                System.out.println("enter marks between 1-100");
        }

    }
}

