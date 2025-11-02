package Random;
import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to search in the array");
        int n=sc.nextInt();
        int a[]={1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100};
        int l=0, r=a.length-1;
        boolean k=false;
        while(l<r){
            int mid=(l+r)/2;
            if(a[mid]==n){
                System.out.println(n+"\nFound at index : "+mid);
                k=true;
                break;
            }
            else if(a[mid]>n)
                r=mid;
            else
                l=mid;
            System.out.println(a[mid]);
        }
        if(k==false)
            System.out.println("Number is not in the array");
        sc.close();
    }
}