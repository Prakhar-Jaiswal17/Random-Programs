package Random;
import java.util.*;
class Palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int num=0;
        for(int i=n;i>0;i/=10){
            int d=i%10;
            num=num*10+d;
        }
        if(n==num){
            System.out.println("The number entered is a Palindrome number");
        }
        else{
            System.out.println("The number you entered is a boring number");
        }
    }
}