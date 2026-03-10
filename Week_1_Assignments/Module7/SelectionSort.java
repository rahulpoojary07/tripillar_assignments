package Module7;

class SelectionSort{
    public static void main(String[] args){
        int[] arr={5,3,8,4,2};
        for(int i=0;i<arr.length;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]) min=j;
            }
            int t=arr[i];
            arr[i]=arr[min];
            arr[min]=t;
        }
        for(int i:arr) System.out.print(i+" ");
    }
}
