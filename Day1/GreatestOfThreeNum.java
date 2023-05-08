
package Day1;

import java.util.Scanner;


public class GreatestOfThreeNum {
    
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("enter the numbers");
        Scanner sc1=new Scanner(System.in);
        a=sc1.nextInt();
        
          Scanner sc2=new Scanner(System.in);
        b=sc2.nextInt();
        
          Scanner sc3=new Scanner(System.in);
        c=sc3.nextInt();
        
        
        if(a>b&a>c){
        
            System.out.println("a is the greatest number");
        } 
        else if(b>c){
            System.out.println("b is the greatest number");
        }
        else{
            System.out.println("c is the greatest number");
        }
        
    }
    
}
