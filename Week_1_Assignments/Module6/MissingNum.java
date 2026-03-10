package Module6;

class MissingNum{
    public static void main(String[] args){
        int[] arr={1,2,4,5};
        int n=5;
        int sum=n*(n+1)/2;
        int s=0;
        for(int i:arr) s+=i;
        System.out.println(sum-s);
    }
}