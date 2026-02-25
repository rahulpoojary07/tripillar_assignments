package Module_1;

import java.util.*;
class Program1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0) System.out.println("Positive");
        else if(n<0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}