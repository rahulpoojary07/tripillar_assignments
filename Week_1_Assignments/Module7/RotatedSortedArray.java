package Module7;

class RotatedSortedArray{
    public static void main(String[] args){
        int[] arr={4,5,6,7,0,1,2};
        int key=0;
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key){
                System.out.println(mid);
                return;
            }
            if(arr[l]<=arr[mid]){
                if(key>=arr[l] && key<arr[mid]) r=mid-1;
                else l=mid+1;
            }else{
                if(key>arr[mid] && key<=arr[r]) l=mid+1;
                else r=mid-1;
            }
        }
        System.out.println(-1);
    }
}
