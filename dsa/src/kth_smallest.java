public class kth_smallest {
    public static void main(String[] args) {
        int arr[]={2,3,4,1,0,-3,-4};
        int k=3;

    }
        public static int kthSmallest(int[] arr, int l, int r, int k)
        {
            //Your code here
            int min;
            int c=1;
            while(c<=k)
            {
                min=arr[0];
                for(int j=1;j<arr.length;j++)
                {
                    if(arr[j]<min)
                        min=arr[j];
                }
                for(int b=0;b<arr.length;b++)
                {
                    if(arr[b]==min)
                    {
                        for(int g=b;g<arr.length-1;g++)
                        {
                            arr[g]=arr[g+1];
                        }
                        break;
                    }
                }

            }
            if(c==k)
                return min;



    }
}
