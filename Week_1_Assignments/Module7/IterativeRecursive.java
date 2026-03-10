package Module7;

class IterativeRecursive{
    static int binarySearch(int[] arr,int key){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid]<key) l=mid+1;
            else r=mid-1;
        }
        return -1;
    }
    static int binarySearchRec(int[] arr,int l,int r,int key){
        if(l>r) return -1;
        int mid=(l+r)/2;
        if(arr[mid]==key) return mid;
        if(arr[mid]>key) return binarySearchRec(arr,l,mid-1,key);
        return binarySearchRec(arr,mid+1,r,key);
    }
    public static void main(String[] args){
        int[] arr={1,3,5,7,9};
        System.out.println(binarySearch(arr,7));
        System.out.println(binarySearchRec(arr,0,arr.length-1,7));
    }
}
