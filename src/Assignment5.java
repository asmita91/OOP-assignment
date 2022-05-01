import java.util.Scanner;

//1. WAP to print the first 10 multiples of 2
class Multiple{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        for (int i=1;i<=10;i++){
            int product=i*2;
            System.out.println( 2+"*"+ i + "="+ product);
        }
    }
}
// WAP to take your name and age as user input and print it 5 times using for loop
class NameAndAge{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        System.out.println("enter your age");
        int age= scanner.nextInt();
        for (int i=1;i<=5;i++){
            System.out.println("your name is "+name+" and you are "+age+" years old");
        }
    }
}
/*3. WAP to take the initialization and condition for the for loop and print the even numbers
present in between it.*/
class EvenNumbers{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the point of initialization");
        int a= scanner.nextInt();
        System.out.println("enter the end point");
        int end= scanner.nextInt();
        for (int i=a;i<=end;i+=2){
            System.out.println(i);
        }
    }
}
//WAP to take the initialization and condition for the for loop and print the sum of all the even
// numbers
//present in between it.
class EvenSum{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the point of initialization");
        int a= scanner.nextInt();
        System.out.println("enter the end point");
        int end= scanner.nextInt();
        int sum=0;
        for(int i=a;i<=end;i+=2){
            sum=sum+i;
        }
        System.out.println("the sum is: "+ sum);
    }
}