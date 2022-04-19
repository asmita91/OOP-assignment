import java.util.Scanner;

//Write a program to take student details as input and display the result.
class StudentInfo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name::");
        String name= scanner.next();
        System.out.println("which class do you study in?::");
        int cls= scanner.nextInt();
        System.out.println("enter your roll no.::");
        int roll= scanner.nextInt();
        System.out.println("please enter your age::");
        int age= scanner.nextInt();
        System.out.println("where do you live?::");
        String address= scanner.next();
        System.out.println("your name is ::" + name);
        System.out.println("you study in grade ::" + cls);
        System.out.println("your roll no. is ::" + roll);
        System.out.println("you are\t" +age+ "\tyears old");
        System.out.println("you live in ::"+ address);
    }
}
// Write a program to calculate sum of four numbers taking user input
class SumOfFour{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter first num");
        float a=scanner.nextFloat();
        System.out.println("enter second num");
        float b=scanner.nextFloat();
        System.out.println("enter third num");
        float c=scanner.nextFloat();
        System.out.println("enter fourth num");
        float d=scanner.nextFloat();
        float sum=a+b+c+d;
        System.out.println("the sum of entered number is::"+sum);
    }
}
/*Write a program to take input of the total marks of four subjects of a student and calculate
the total percentage secured. Then display the percentage and final result of the student;
a. If equal to or more than 70 -> First Class
b. If more than 59 -> Upper second Class
c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail*/
class Result{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter marks of 1st sub");
        float sub1=scanner.nextFloat();
        System.out.println("enter marks of 2nd sub");
        float sub2=scanner.nextFloat();
        System.out.println("enter marks of 3rd sub");
        float sub3=scanner.nextFloat();
        System.out.println("enter marks of 4th sub");
        float sub4=scanner.nextFloat();
        float total= sub1+sub2+sub3+sub4;
        float per=(total*100)/400;
        System.out.println("the total marks secured is:"+total);
        System.out.println("the percentage achieved is::"+per);
        if(per>=70){
            System.out.println("First Class");
        }
        else if(per>59 && per<70){
            System.out.println("upper second class");
        }
        else if(per>49 && per<=59){
            System.out.println("second class");
        }
        else if(per>39 && per<=49){
            System.out.println("third class");
        }
        else if(per<40){
            System.out.println("fail");
        }
        else{
            System.out.println("error in calculation");
        }
    }
}
//Write a program to take two integer inputs from user and print sum and product of them.
class SumAndProduct{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter first num");
        int num1= scanner.nextInt();
        System.out.println("enter second num");
        int num2= scanner.nextInt();
        int sum=num1+num2;
        int product=num1*num2;
        System.out.println("the sum is:"+sum);
        System.out.println("the product is:"+product);
    }
}
//Take two integer inputs from user. First calculate the sum of two and then product.
//Finally, calculate the division of thus obtained sum and product and print the result.
class TwoInputs{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter first num");
        int num1= scanner.nextInt();
        System.out.println("enter second num");
        int num2= scanner.nextInt();
        int sum=num1+num2;
        int product=num1*num2;
        System.out.println("the sum is:"+sum);
        System.out.println("the product is:"+product);
        double division=(product/sum);
        System.out.println("the division of product with sum is:" +division);
    }
}

//Take name, roll number and field of interest from user and print in the format below :Hey,
//my name is xyz and my roll number is xyz. My field of interest are xyz.
class Introduction{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter your name:: ");
        String name=scanner.next();
        System.out.println("enter your roll no.:");
        int roll=scanner.nextInt();
        System.out.println("enter your field of interest::");
        String interest=scanner.next();
        System.out.println("Hey,my name is "+name+" and my roll number is "+roll+". My field of interest is "+interest+".");
    }
}
/*Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
of triangle and Volume of Cube and Cuboid. Take the attributes as user input.*/
class MixedStuff{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("please enter the sides of square in cm:");
        double side= scanner.nextDouble();
        double perimeter=4*side;
        double Area =side*side;
        System.out.println("the perimeter is:"+perimeter+"cm");
        System.out.println("the area is:"+Area+"\u00b2cm");
        //for SI
        System.out.println("please enter principal:");
        double p=scanner.nextDouble();
        System.out.println("please enter rate:");
        double r=scanner.nextDouble();
        System.out.println("please enter time:");
        double t=scanner.nextDouble();
        double SI=(p*t*r)/100;
        System.out.println("the simple interest is:"+SI);
        //for volume of cube
        System.out.println("please enter length of cube in cm");
        double l=scanner.nextDouble();
        double v=l*l*l;
        System.out.println("the volume of cube is:"+v+"\u00b3cm");
        //for volume of cuboid
        System.out.println("please enter length of cuboid in cm:");
        double len=scanner.nextDouble();
        System.out.println("please enter breadth of cuboid in cm:");
        double bdth=scanner.nextDouble();
        System.out.println("please enter height of cuboid in cm:");
        double hgt=scanner.nextDouble();
        double V=len*bdth*hgt;
        System.out.println("the volume of cuboid is:"+V+"\u00b3cm");



    }
}
//Write a program to find square of a number.
class FindSquare{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a number:");
        int num=scanner.nextInt();
        int sq= (int) Math.pow(num,2);
        System.out.println("the square of number you entered is :"+sq);

    }
}
/*Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope
*/
class TwoStringsPrint{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a string value");
        String s1=scanner.next();
        System.out.println("please enter second string value");
        String s2=scanner.next();
        System.out.println(s1+s2);
    }
}
/*. Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || with ternary operator )*/
class InputCheck{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter first number:");
        int num1= scanner.nextInt();
        System.out.println("enter second number:");
        int num2= scanner.nextInt();
        System.out.println("enter third number:");
        int num3= scanner.nextInt();
        String check=(num1==num2&&num1==num3&&num2==num3)?"All are same":(num1==num2||num2==num3||num1==num3)?"any two are same":"none are equal";
        System.out.println(check);
    }
}
/*Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true*/
class CheckCondition{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("please enter 1st integer value");
        int a=scanner.nextInt();
        System.out.print("please enter 2nd integer value");
        int b=scanner.nextInt();
        if (a<50 && a<b){
            System.out.println("the condition is true");
        }
        else{
            System.out.println("the condition is not satisfied");
        }
    }
}
//If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
//write a program to calculate his total marks and percentage marks.
class RobertMMarks{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter marks of 1st sub(out of 100)");
        double marks1=scanner.nextDouble();
        System.out.println("enter marks of 2nd sub(out of 100)");
        double marks2=scanner.nextDouble();
        System.out.println("enter marks of 3rd sub(out of 100)");
        double marks3=scanner.nextDouble();
        double total=marks1+marks2+marks3;
        double per=(total*100)/300;
        System.out.println("the total marks obtained is:"+total);
        System.out.println("the percentage obtained is:"+per);
    }
}
//Ask user to give two double input for length and breadth of a rectangle and print area type
//casted to int.
class AreaOfRectangle{
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.println("enter the length of rectangle");
        double len=scanner.nextDouble();
        System.out.println("enter the breadth of rectangle");
        double bdth=scanner.nextDouble();
        double Area=(len*bdth);
        int Area1=(int)Area;
        System.out.println("the area is:"+Area1);
    }
}
