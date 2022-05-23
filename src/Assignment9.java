
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//Write code that creates an ArrayList that can hold string objects. Add the names of
//      three cars to the ArrayList, and then display the contents of the ArrayList
class Q1{
    public static void main(String[] args) {
        System.out.println(displayCar());

    }
    static ArrayList<String> displayCar(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        for(int i=0;i<3;i++){
            System.out.print("Enter name of the car: ");
            String car = scanner.next();
            str.add(i,car);
        }
        return str;
    }
}
/*. WAP to create a function which accepts the arraylist of integer of size 10 as
parameter and return the sum of prime numbers present in it.*/
class Q2_IntSumprime{
    public static void main(String[] args) {
        ArrayList<Integer> yourArray= new ArrayList<Integer>();
        yourArray.add(0,55);
        yourArray.add(1,5);
        yourArray.add(2,3);
        yourArray.add(3,7);
        yourArray.add(4,6);
        int ans =sumPrime(yourArray);
        System.out.println(ans);
    }
    static int sumPrime(ArrayList<Integer> myArray){

        int sum =0;
        for(int i=0;i<myArray.size();i++){
            int count =0;
            for(int j=2;j<myArray.get(i);j++){
                if(myArray.get(i)%j==0){
                    count+=1;
                }
            }
            if(count==0){
                sum+=myArray.get(i);
            }
        }
        return sum;

    }
}
/*WAP to sort the integer elements of array of size 10 in ascending and descending
order*/
class Q3_Sort{
    public static void main(String[] args) {


    }
    static ArrayList<Integer> ass(ArrayList<Integer> myArray){
        Collections.sort(myArray);
        return myArray;
    }
    static ArrayList<Integer> dec(ArrayList<Integer> myArray){
        Collections.reverse(myArray);
        return myArray;
    }
}
//wap to create an arraylist of size 10 where you have to add integer values and return the sum of those value which are the multples of 2
// you have to  create a function over here which returns the sum and initializees the arraylist.

class ArrayListKo {
    public static void main(String[] args) {
        System.out.println(sumMultilple());
    }

    public static int sumMultilple() {
        ArrayList<Integer> myarr = new ArrayList<Integer>(10);
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter any value");
            int num = scanner.nextInt();
            myarr.add(num);
            for(int j=0;j<myarr.size();j++)
                if (myarr.get(j) % 2 == 0) {
                    sum = sum + myarr.get(j);
                }
        }
        return sum;
    }
}
//sort arraylist element in ascending order
class SortingString{
    public static void main(String[] args) {
        System.out.println(arraySort());
    }
    public static ArrayList<String> arraySort(){
        ArrayList<String> myarr= new ArrayList<String>(10);
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter value:");
            String value= scanner.next();
            myarr.add(value);
        }
        ArrayList<String> arr= (ArrayList<String>) myarr.clone();
        System.out.println(arr);
        System.out.println(myarr);
        Collections.sort(myarr);
        return myarr;
    }
}
//pass arraylist as parameter and find all prime numbers and sum them
class Parameterwala{
    public static void main(String[] args) {
        ArrayList<Integer> myarr= new ArrayList<Integer>();
        Scanner scanner =new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("enter value:");
            int value= scanner.nextInt();
            myarr.add(value);
        }
        System.out.println(checkPrime(myarr));
    }
    static int checkPrime(ArrayList<Integer>myarr){
        int sum=0;
        for(int i=0;i<myarr.size();i++){
            int count=0;
            int value=myarr.get(i);
            for(int j=1;j<=myarr.get(i);j++){
                if(value%j==0){
                    count++;
                }
            }
            if(count==2){
                sum=sum+myarr.get(i);
            }
        }
        ArrayList<Integer> arr= (ArrayList<Integer>) myarr.clone();
        System.out.println(arr);
        return sum;
    }
}