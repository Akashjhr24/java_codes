public class max_min {
    public static void main(String[] args) {
        int arr[]={2,34,5,7,-2,67,4};
        int max=max(arr);
        int min=min(arr);
        System.out.println("The maximum element is "+max+" and the minimum element is "+min);

    }
    static int max(int arr[])
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static int min(int arr[])
    {
        int min=arr[0];
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]<min)
                min=arr[j];
        }
        return min;
    }
}
