package Module6;

class EvenIndex{
    public static void main(String[] args){
        int[] arr={3,6,12,1,5,8};
        int[] res=new int[arr.length];
        int even=0,odd=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                res[even]=arr[i];
                even+=2;
            }else{
                res[odd]=arr[i];
                odd+=2;
            }
        }
        for(int i:res) System.out.print(i+" ");
    }
}
