import java.util.Scanner;

//Write a program for multiplying 3 numbers using a function and return the
//result and print the result from the main function.
class MultiplyThree{
    public static void main(String[] args) {
        System.out.println("the answer is" +multiplyNumbers());
    }
    public static int multiplyNumbers(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 1st number: ");
        int num1=scanner.nextInt();
        System.out.println("enter 2nd number: ");
        int num2=scanner.nextInt();
        System.out.println("enter 3rd number: ");
        int num3=scanner.nextInt();
        int multiply=num1*num2*num3;
        return multiply;
    }
}
//2. Write a program for calculating Simple Interest using a function and print
//the result from the function itself.
class SIUsingFunction{
    public static void main(String[] args) {
        simpleInterest();

    }
    public static void simpleInterest(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter principal");
        int p=scanner.nextInt();
        System.out.println("enter time");
        int t=scanner.nextInt();
        System.out.println("enter rate");
        int r=scanner.nextInt();
        int SI=(p*t*r)/100;
        System.out.println("the simple interest is "+SI);
    }
}
//3. Write a program to calculate area of circle using a function of your choice.
class AreaOfCircle{
    public static void main(String[] args) {
        System.out.println("the area is " +area());

    }
    static double area(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the radius");
        double r=scanner.nextDouble();
        double a=(22/7)*r*r;
        return a;
    }
}
//check if a number is prime or not
class PrimeNumberKo {
    public static void main(String[] args) {
        checkPrime();
    }

    public static void checkPrime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is prime");
        }
        else{
            System.out.println("it is not prime");
        }
    }
}