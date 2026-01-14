class find_missing_from_array
{
    public static void main(String args[])
    {
      int a[]={1,2,3,5};
      int sum=0,arr_sum=0;
        int n=a.length+1;
      for(int i=0;i<a.length;i++)
      {
         arr_sum=arr_sum+a[i];
      }
      sum=n*(n+1)/2;
       int sum_arr=sum-arr_sum;
         System.out.println("Missing number is: "+sum_arr);

    }
}