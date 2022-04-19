import javax.swing.*;
import java.util.Scanner;

//Write a program to take student details as input and display the result.
class StudentInfoAnother {
    public static void main(String[] args) {
        String name,address;
        int cls,roll,age;
        name= JOptionPane.showInputDialog("enter your name::");
        address= JOptionPane.showInputDialog("where do you live?::");
        cls=Integer.parseInt(JOptionPane.showInputDialog(null,"which class do you study in?::"));
        roll=Integer.parseInt(JOptionPane.showInputDialog(null,"enter your roll no.:"));
        age=Integer.parseInt(JOptionPane.showInputDialog(null,"please enter your age::"));
        JOptionPane.showMessageDialog(null,"your name is ::" + name);
        JOptionPane.showMessageDialog(null,"you study in grade ::" + cls);
        JOptionPane.showMessageDialog(null,"your roll no. is ::" + roll);
        JOptionPane.showMessageDialog(null,"you are "+age+" years old");
        JOptionPane.showMessageDialog(null,"you live in ::"+ address);
    }
}
//Write a program to calculate sum of four numbers taking user input
class SumOfFourAnother{
    public static void main(String[] args) {
        int a,b,c,d;
        a=Integer.parseInt(JOptionPane.showInputDialog("enter first num"));
        b=Integer.parseInt(JOptionPane.showInputDialog("enter second num"));
        c=Integer.parseInt(JOptionPane.showInputDialog("enter third num"));
        d=Integer.parseInt(JOptionPane.showInputDialog("enter fourth num"));
        int sum=a+b+c+d;
        JOptionPane.showMessageDialog(null,"the sum is:"+sum);


    }
}
/*Write a program to take input of the total marks of four subjects of a student and calculate
the total percentage secured. Then display the percentage and final result of the student;
If equal to or more than 70 -> First Class
If more than 59 -> Upper second Class
If more than 49 -> Second class
If more than 39 -> Third class and if below than 40 the result is fail*/
class ResultAnother{
    public static void main(String[] args) {
        double sub1,sub2,sub3,sub4;
        sub1=Double.parseDouble(JOptionPane.showInputDialog("enter the marks of 1st sub"));
        sub2=Double.parseDouble(JOptionPane.showInputDialog("enter the marks of 2nd sub"));
        sub3=Double.parseDouble(JOptionPane.showInputDialog("enter the marks of 3rd sub"));
        sub4=Double.parseDouble(JOptionPane.showInputDialog("enter the marks of 4th sub"));
        double total=sub1+sub2+sub3+sub4;
        double per=total/4;
        JOptionPane.showMessageDialog(null,"the percentage obtained is:"+per);
        if(per>=70){
            JOptionPane.showMessageDialog(null,"First Class");
        }
        else if(per>59 && per<70){
            JOptionPane.showMessageDialog(null,"upper second class");
        }
        else if(per>49 && per<=59){
            JOptionPane.showMessageDialog(null,"second class");
        }
        else if(per>39 && per<=49){
            JOptionPane.showMessageDialog(null,"third class");
        }
        else if(per<40){
            JOptionPane.showMessageDialog(null,"fail");
        }
        else{
            JOptionPane.showMessageDialog(null,"error in calculation");
        }

    }
}
//Write a program to take two integer inputs from user and print sum and product of them.
class SumAndProductAnother{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter next number:"));
        int sum=a+b;
        JOptionPane.showMessageDialog(null,"the sum is :"+sum);
    }
}
/*Take two integer inputs from user. First calculate the sum of two then product of two.
Finally, calculate the division of thus obtained sum and product and print the result*/
class TwoInputsAnother{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number:"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter next number:"));
        int sum=a+b;
        int product=a*b;
        double casted_sum= (double) (sum);
        double casted_product= (double) (product);
        double division=casted_sum/casted_product;
        JOptionPane.showMessageDialog(null,"the sum is "+sum+" and the product is "+product);
        JOptionPane.showMessageDialog(null,"the value after division is:"+division);
    }
}
/*Ask user to give two double input for length and breadth of a rectangle and print area type
casted to int.*/
class AreaOfRectangleAnother{
    public static void main(String[] args) {
        double len=Double.parseDouble(JOptionPane.showInputDialog("enter the length of rectangle in cm"));
        double bdth=Double.parseDouble(JOptionPane.showInputDialog("enter the breadth of rectangle in cm"));
        double Area=len*bdth;
        int area=(int) Area;
        JOptionPane.showMessageDialog(null,"the area is: "+area+"\u00b2cm");
    }
}
/*Take name, roll number and field of interest from user and print in the format below :Hey,
my name is xyz and my roll number is xyz. My field of interest are xyz*/
class IntroductionAnother{
    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog(null,"enter your name:");
        int roll=Integer.parseInt(JOptionPane.showInputDialog(null,"enter your roll no.:"));
        String interest=JOptionPane.showInputDialog(null,"enter your field of interest:");
        JOptionPane.showMessageDialog(null,"Hey,my name is "+name+" and my roll number is "+roll+". My field of interest is "+interest+".");
    }
}
/*Take side of a square from user and print area and perimeter of it. Also, calculate SI, Area
of triangle and Volume of Cube and Cuboid. Take the attributes as user input*/
class MixedStuffAnother{
    public static void main(String[] args) {
        double side=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter the sides of square in cm:"));
        double perimeter=4*side;
        double Area =side*side;
        JOptionPane.showMessageDialog(null,"the perimeter is:"+perimeter+"cm");
        JOptionPane.showMessageDialog(null,"the area is:"+Area+"\u00b2cm");
        //for SI
        double p=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter principal:"));
        double r=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter rate:"));
        double t=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter time:"));
        double SI=(p*t*r)/100;
        JOptionPane.showMessageDialog(null,"the simple interest is:"+SI);
        //for volume of cube
        double l=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter length of cube in cm"));
        double v=l*l*l;
        JOptionPane.showMessageDialog(null,"the volume of cube is:"+v+"\u00b3cm");
        //for volume of cuboid
        double len=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter length of cuboid in cm:"));
        double bdth=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter breadth of cuboid in cm:"));
        double hgt=Double.parseDouble(JOptionPane.showInputDialog(null,"please enter height of cuboid in cm:"));
        double V=len*bdth*hgt;
        JOptionPane.showMessageDialog(null,"the volume of cuboid is:"+V+"\u00b3cm");
    }
}
/*Write a program to find square of a number.
E.g.- INPUT : 2 OUTPUT : 4
INPUT : 5 OUTPUT : 25*/
class FindSquareAnother{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
        int sq= (int)Math.pow(a,2);
        JOptionPane.showMessageDialog(null,"the square is:"+sq);
    }
}
/*Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope*/
class TwoStringPrintAnother{
    public static void main(String[] args) {
        String a=JOptionPane.showInputDialog(null,"please enter a string:");
        String b=JOptionPane.showInputDialog(null,"please enter next string:");
        JOptionPane.showMessageDialog(null,a+b);
    }
}
/*Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || with ternary operator )*/
class InputCheckAnother{
    public static void main(String[] args) {
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"please enter 1st number:"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"please enter 2nd number:"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog(null,"please enter 3rd number:"));
        String check=(num1==num2&&num1==num3&&num2==num3)?"All are same":(num1==num2||num2==num3||num1==num3)?"any two are same":"none are equal";
        JOptionPane.showMessageDialog(null,check);
    }
}
/*Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
check if both the conditions 'a < 50' and 'a < b' are true.*/
class ConditionCheckAnother{
    public static void main(String[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog(null,"enter a number"));
        int b=Integer.parseInt(JOptionPane.showInputDialog(null,"enter next number"));
        if (a<50 && a<b){
            JOptionPane.showMessageDialog(null,"the condition is true");
        }
        else{
            JOptionPane.showMessageDialog(null,"the condition is not satisfied");
        }
    }
}
/*If the marks of Robert in three subjects are entered through keyboard (each out of 100 ),
write a program to calculate his total marks and percentage marks*/
class RobertMarks{
    public static void main(String[] args) {
        double sub1=Double.parseDouble(JOptionPane.showInputDialog(null,"enter marks of 1st sub(out of 100)"));
        double sub2=Double.parseDouble(JOptionPane.showInputDialog(null,"enter marks of 2nd sub(out of 100)"));
        double sub3=Double.parseDouble(JOptionPane.showInputDialog(null,"enter marks of 3rd sub(out of 100)"));
        double total=sub1+sub2+sub3;
        double per=total/3;
        JOptionPane.showMessageDialog(null,"the total marks obtained is:"+total);
        JOptionPane.showMessageDialog(null,"the total percentage obtained is:"+per);
    }
}
