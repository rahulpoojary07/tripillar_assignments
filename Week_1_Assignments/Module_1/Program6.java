package Module_1;

import java.util.*;
class Program6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(n<=1) flag=1;
        for(int i=2;i<n;i++){
            if(n%i==0) flag=1;
        }
        if(flag==0) System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}