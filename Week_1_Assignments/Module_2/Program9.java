package Module_2;

import java.util.*;
class Program9{
    static boolean isPalindrome(String s){
        String r="";
        for(int i=s.length()-1;i>=0;i--){
            r+=s.charAt(i);
        }
        return s.equals(r);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isPalindrome(s));
    }
}