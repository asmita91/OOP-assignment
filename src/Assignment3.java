
import java.util.Scanner;
//Write a JAVA program to find maximum between two numbers.
 class MaximumFind {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        System.out.println("enter next number");
        int b=scanner.nextInt();
        if(a>b){
            System.out.println(a+" is the maximum");
        }
        else{
            System.out.println(b+" is the maximum");
        }

    }
}

//Write a JAVA program to find maximum between three numbers
 class MaximumThreeFind {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a number");
        int a=scanner.nextInt();
        System.out.println("enter next number");
        int b=scanner.nextInt();
        System.out.println("enter another number");
        int c=scanner.nextInt();
        if(a>b&&a>c){
            System.out.println(a+" is the maximum");
        }
        else if(b>a&&b>c){
            System.out.println(b+"is the maximum");
        }
        else{
            System.out.println(c+" is the maximum");
        }
    }
}

//Write a JAVA program to check whether a number is negative, positive or zero
 class PositiveNegative {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int a=scanner.nextInt();
        if (a>0){
            System.out.println("it is a positive number");
        }
        else if(a==0){
            System.out.println("it is zero");
        }
        else{
            System.out.println("it is a negative number");
        }
    }
}

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
 class DivisibleByFiveAndEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int a = scanner.nextInt();
        if (a % 5 == 0 && a % 11 == 0) {
            System.out.println("it is divisible by both 5 and 11");
        } else if (a % 5 == 0 && a % 11 != 0) {
            System.out.println("it is divisible by 5 only");
        } else if (a % 5 != 0 && a % 11 == 0) {
            System.out.println("it is divisible by 11 only");
        } else {
            System.out.println("it is neither divisible by 5 nor divisible by 11");
        }
    }
}

//Write a JAVA program to check whether a number is even or odd. 
class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any number");
        int a=scanner.nextInt();
        if(a%2==0){
            System.out.println("it is an even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}
//Write a JAVA program to check whether a year is leap year or not.
class LeapOrNot{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter any year");
        int year= scanner.nextInt();
        if(year%400==0){
            System.out.println("it is a leap year");
        }
        else if(year%4==0 && year%100!=0 ){
            System.out.println("it is a leap year");
        }
        else {
            System.out.println("it is not a leap year");
        }
    }
}
//Write a JAVA program to check whether a character is alphabet or not.
class AlphabetOrNot{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=scanner.next().charAt(0);
        if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'){
            System.out.println("the character is an alphabet");
        }
        else{
            System.out.println("it is not an alphabet");
        }
    }
}
//Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
class VowelOrConsonant{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character");
        char ch=scanner.next().charAt(0);
        if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                System.out.println("It is a vowel letter");
            }
            else{
                System.out.println("it is a consonant");
            }
        }
        else{
            System.out.println("it is not alphabet");
        }
    }
}
/*Write a JAVA program to input any character and check whether it is alphabet, digit or special
character.
*/
class AlphaDigitOrChar{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=scanner.next().charAt(0);
        if(ch>='a'&&ch<='z'|| ch>='A'&&ch<='Z'){
            System.out.println("it is an alphabet");
        }
        else if(ch>=0 && ch<=9){
            System.out.println("it is a digit");
        }
        else{
            System.out.println("it is a special character");
        }
    }
}
//. Write a JAVA program to check whether a character is uppercase or lowercase alphabet.
class LowerAndUpperCase{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a character:");
        char ch=scanner.next().charAt(0);
        if (ch>='A'&&ch<='Z'){
            System.out.println("it is uppercase alphabet");
        }
        else if(ch>='a'&&ch<='z'){
            System.out.println("it is lower case alphabet");
        }
        else{
            System.out.println("the character is not an alphabet");
        }
    }
}
// Write a JAVA program to input week number and print weekday.
//Write a JAVA program to input month number and print number of days in that month.
class DaysInMonth{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter any month number::");
        int month=scanner.nextInt();
        if(month==1){
            System.out.println("it is january.there are 31 days");
        }
        else if(month==2){
            System.out.println("it is february.there are 28 days");
        }
        else if(month==3){
            System.out.println("it is march. there are 31 days");
        }
        else if(month==4){
            System.out.println("it is april.there are 30 days");
        }
        else if(month==5){
            System.out.println("it is may.there are 31 days");
        }
        else if(month==6){
            System.out.println("it is june.there are 30 days");
        }
        else if(month==7){
            System.out.println("it is july.there are 31 days");
        }
        else if(month==8){
            System.out.println("it is august.there are 31 days");
        }
        else if(month==9){
            System.out.println("it is september.there are 30 days");
        }
        else if(month==10){
            System.out.println("it is october.there are 31 days");
        }
        else if(month==11){
            System.out.println("it is november.there are 30 days");
        }
        else if(month==12){
            System.out.println("it is december.there are 31 days");
        }
        else{
            System.out.println("please enter any value between 1-12");
        }

    }
}
//Write a JAVA program to count total number of notes in given amount.
class CountNotes{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter amount:");
        int amt = scanner.nextInt();
        int note2 = 0;
        int note1 = 0;
        int note3 = 0;
        int note4 = 0;
        int note5 = 0;
        int note6 = 0;
        int note7 = 0;
        int note8 = 0;
        int note9 = 0;
        int note10 = 0;
        if (amt >= 1000) {
            note1 = amt / 1000;
            amt = amt - note1 * 1000;
        }  if (amt >= 500) {
            note2 = amt / 500;
            amt = amt - note2 * 500;
        }  if (amt >= 100) {
            note3 = amt / 100;
            amt = amt - note3 * 100;
        }  if (amt >= 50) {
            note4 = amt / 50;
            amt = amt - note4 * 50;
        }  if (amt >= 20) {
            note5 = amt / 20;
            amt = amt - note5 * 20;
        }  if (amt >= 10) {
            note6 = amt / 10;
            amt = amt - note6 * 10;
        }  if (amt >= 5) {
            note7 = amt / 5;
            amt = amt - note7 * 5;
        }  if (amt >= 2) {
            note8 = amt / 2;
            amt = amt - note8 * 2;
        }  if (amt >= 1) {
            note9 = amt / 1;
            amt = amt - note9 * 1;
        } else {
            note10 = 0;
        }
        int total_notes = note1 + note2 + note3 + note4 + note5 + note6 + note7 + note8 + note9 + note10;
        System.out.println("the total notes are:"+total_notes);
    }
}
//Write a JAVA program to input angles of a triangle and check whether triangle is valid or not.
class TriangleCheck{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first angle:");
        double ang1=scanner.nextDouble();
        System.out.println("enter second angle:");
        double ang2=scanner.nextDouble();
        System.out.println("enter third angle:");
        double ang3=scanner.nextDouble();
        double sum=ang1+ang2+ang3;
        if (sum==180){
            System.out.println("the triangle is valid");
        }
        else{
            System.out.println("the triangle cannot be formed");
        }
    }
}
//Write a JAVA program to input all sides of a triangle and check whether triangle is valid or not.
class TriangleCheckBySide{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first side:");
        double s1=scanner.nextDouble();
        System.out.println("enter second side:");
        double s2=scanner.nextDouble();
        System.out.println("enter third side:");
        double s3=scanner.nextDouble();
        if((s1+s2>s3)&&(s1+s3>s2)&&(s2+s3>s1)){
            System.out.println("the triangle is valid");
        }
        else{
            System.out.println("the triangle is invalid");
        }
    }
}
//. Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
class TriangleType{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first angle:");
        double ang1=scanner.nextDouble();
        System.out.println("enter second angle:");
        double ang2=scanner.nextDouble();
        System.out.println("enter third angle:");
        double ang3=scanner.nextDouble();
        double sum=ang1+ang2+ang3;
        if(sum==180){
            if(ang1==ang2 && ang2==ang3){
                System.out.println("it is an equilateral triangle");
            }
            else if(ang1!=ang2 && ang1!=ang3 && ang2!=ang3){
                System.out.println("it is an scalene triangle");
            }
            else if(ang1==ang2||ang1==ang3||ang2==ang3){
                System.out.println("it is an isosceles triangle");
            }
            else{
                System.out.println("it is another type of triangle");
            }
        }
        else{
            System.out.println("the triangle cannot be formed");
        }
    }
}
//Write a JAVA program to find all roots of a quadratic equation.
class QuadraticEqn{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //representation of quadratic eqn ax\u00b2+bx+c
        System.out.println("enter 1st value ");
        int A= scanner.nextInt();
        double a=(double) A;
        System.out.println("enter 2nd value ");
        int B= scanner.nextInt();
        double b=(double) B;
        System.out.println("enter 3rd value ");
        int C= scanner.nextInt();
        double c=(double) C;
        double r=(b*b-4*a*c);
        if (r>0){
            double r1=((-b+Math.sqrt(r))/2*a);
            double r2=((-b-Math.sqrt(r))/2*a);
            System.out.println("the roots are "+r1+" and "+r2);
        }
        else if (r==0){
            double r1=-b/(2*a);
            System.out.println("the root are " +r1+ "and" +r1);
        }
        else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-r) / (2 * a);
            System.out.println("the roots are: "+real+ "and "+imaginary);
        }
    }
}
//Write a JAVA program to calculate profit or loss.
class ProfitOrLoss{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the cost price");
        double cp=scanner.nextDouble();
        System.out.println("enter the selling price");
        double sp=scanner.nextDouble();
        if(cp>sp){
            System.out.println("it is loss ");
        }
        else if(cp==sp){
            System.out.println("there is neither profit nor loss");
        }
        else{
            System.out.println("there is profit");
        }
    }
}
/*Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F*/
class Marks{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter marks of physics(out of 100)");
        double physics=scanner.nextDouble();
        System.out.println("enter marks of chemistry(out of 100)");
        double chemistry=scanner.nextDouble();
        System.out.println("enter marks of biology(out of 100)");
        double biology=scanner.nextDouble();
        System.out.println("enter marks of maths(out of 100)");
        double maths=scanner.nextDouble();
        System.out.println("enter marks of computer(out of 100)");
        double computer=scanner.nextDouble();
        double total=physics+chemistry+biology+maths+computer;
        double percentage=(total*100)/500;
        if(percentage >= 90){
            System.out.println("grade A");
        }
        else if(percentage<90 && percentage >=80){
            System.out.println("grade B");
        }
        else if(percentage<80 && percentage >=70){
            System.out.println("grade C");
        }
        else if((percentage<70 && percentage >=60)){
            System.out.println("grade D");
        }
        else if(percentage<60 && percentage >=40){
            System.out.println("garde E");
        }
        else{
            System.out.println("fail");
        }
    }
}
/*Write a JAVA program to input basic salary of an employee and calculate its Gross salary
according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%*/
class Salary{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter basic salary:");
        int Salary=scanner.nextInt();
        double salary=(double) Salary;
        if(salary<=10000){
            double gross_salary=salary+((20*salary)/100)+((80*salary)/100);
            System.out.println("the gross salary is "+gross_salary+" including 20% HRA and 80% DA");
        }
        else if(salary>10000 && salary<=20000){
            double gross_salary=salary+((25*salary)/100)+((90*salary)/100);
            System.out.println("the gross salary is "+gross_salary+" including 25% HRA and 90% DA");
        }
        else{
            double gross_salary=salary+((30*salary)/100)+((95*salary)/100);
            System.out.println("the gross salary is "+gross_salary+" including 30% HRA and 95% DA");
        }
    }
}
/* Write a JAVA program to input electricity unit charges and calculate total electricity bill
according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill*/
class ElectricityCharge{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter electricity units");
        int unit=scanner.nextInt();
        if (unit<=50){
            double total_charge=unit*0.50+((unit*0.50*20)/100);
            System.out.println("the total charge is: "+total_charge);
        }
        else if(unit>50 && unit<=150){
            double total_charge=unit*0.75+((unit*0.75*20)/100);
            System.out.println("the total charge is: "+total_charge);
        }
        else if(unit>50 && unit<=250){
            double total_charge=unit*1.2+((unit*1.2*20)/100);
            System.out.println("the total charge is: "+total_charge);
        }
        else{
            double total_charge=unit*1.5+((unit*1.5*20)/100);
            System.out.println("the total charge is: "+total_charge);
        }
    }
}