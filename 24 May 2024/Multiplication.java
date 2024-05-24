// Write a Java program that takes a number as input and prints its multiplication table up to 10
import  java.util.Scanner;
public class Multiplication{
    public  static  void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = s.nextInt();

        for(int i = 1 ; i <= 10; i++){
            System.out.println(i+ "x" + num + "=" + i * num);
        }
    }
}
