// wap to create a function which accepts array as a parameter
// and you need to count all those numbers which are factors of 2


// wap to create a function which returns an integer array.
//note: you have to add only 10 elements in the array


//wap to create a function where you have to add all the elements which are the factors of both 11 and 5.
//here, you have to return thus obtained sum.

//wap to create a function to reverse a positive integer number and return it.
// syntax of the function is
// static int reverseNumbe

import java.util.Arrays;
import java.util.Scanner;

//Write a java program to Add two 2x3 matrices.
class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 2;
        int column = 3;
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        int[][] s = new int[row][column];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter any value");
                int num1 = scanner.nextInt();
                a[i][j] = num1;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter any value");
                int num2 = scanner.nextInt();
                b[i][j] = num2;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("the sum is");
        System.out.println(Arrays.deepToString(s));
    }
}

//Write a java program to Multiply two 2x3 matrices.
class MatrixMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = 2;
        int column = 3;
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];
        int[][] s = new int[row][column];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter any value");
                int num1 = scanner.nextInt();
                a[i][j] = num1;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("enter any value");
                int num2 = scanner.nextInt();
                b[i][j] = num2;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                s[i][j] = a[i][j] * b[i][j];
            }
        }
        System.out.println("the sum is");
        System.out.println(Arrays.deepToString(s));
    }
}
//write to create a function which has a integer value as a parameter.
//syntax=static int sumValue(int Value)
//here in this function you have to create an integer array of size 10 where you have to use logic to sum all the array elements
//which are exactly divisible by value passed as a parameter to the function
class KHoK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int Value = scanner.nextInt();
        System.out.println("the sum is "+sumValue(Value));

    }
    static int sumValue(int Value) {
        int[] arr = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter value ");
            int num = scanner.nextInt();
            arr[i]=num;
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i]%Value==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }

}
// Write a Java program to test if an array contains a specific value.
class SpecificValue{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter any number to check");
        int num=scanner.nextInt();
        System.out.println(checkValue(num));
    }
    public static boolean checkValue(int num){
        int[] a=new int[5];
        Scanner scanner= new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("enter any number");
            int value= scanner.nextInt();
            a[i]=value;
            if(a[i]==num){
                return true;
            }
        }
        return false;
    }
}
// wap to create a function which accepts array as a parameter
// and you need to count all those numbers which are factors of 2
class FactorsOfTwo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter number of the elements");
        int num = scanner.nextInt();
        int[] a = new int[num];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements");
            int ele = scanner.nextInt();
            a[i] = ele;

        }
        System.out.println("the count is "+ countEven(a));
    }
    public static int countEven(int [] a) {
        int count=0;
        for(int i=0;i<a.length;i++)
            if (a[i] % 2 == 0) {
                count++;
            }
        return count;
    }

}
// wap to create a function which returns an integer array.
//note: you have to add only 10 elements in the array
class ArrayReturn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(returnArray()));
    }
    public static int[] returnArray(){
        int [] arr= new int[10];
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i< arr.length;i++){
            System.out.println("enter any number");
            int num= scanner.nextInt();
            arr[i]=num;
            int value=arr[i];
        }
        return arr;

    }

}

//wap to create a function where you have to add all the elements which are the factors of both 11 and 5.
//here, you have to return thus obtained sum.
class AddElement {
    public static void main(String[] args) {
        System.out.println("the sum is " + sumOfFactors());
    }

    public static int sumOfFactors() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the numbers of element");
        int num = scanner.nextInt();
        int[] a = new int[num];
        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the elements");
            int ele = scanner.nextInt();
            a[i] = ele;
        }
        for(int i=0;i< a.length;i++){
            if (a[i] % 11 == 0 & a[i] % 5 == 0) {
                sum = sum + a[i];
            }
        }
        return sum;

    }
}

//wap to create a function to reverse a positive integer number and return it.
// syntax of the function is
// static int reverseNumber(int num)
class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any number");
        int num = scanner.nextInt();
        System.out.println("the reverse is " + reverseOfNumber(num));
    }

    public static int reverseOfNumber(int num) {
        int rev = 0;
        while (num < 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }
}
