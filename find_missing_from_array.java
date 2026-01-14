class find_missing_from_array
{
    public static void main(String args[])
    {
      int a[]={1,2,3,5};
      int sum=0,arr_sum=0;
      for(int i=0;i<a.length;i++)
      {
         arr_sum=arr_sum+a[i];
      }
      for(int i=0;i<=a.length;i++)
      {
         sum=sum+(i+1);
      }
      System.out.println(sum);
       int sum_arr=arr_sum-sum;
         System.out.println("Missing number is: "+sum_arr);

    }
}