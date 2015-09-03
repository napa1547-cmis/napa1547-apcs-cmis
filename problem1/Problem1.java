public class Problem1
{
    public static void main (String[] args)
    {
        int[] nums = { 3, 5, 7, 9, 11, 13 };
        for ( int i = nums.length - 1; i  >= 0; i-- )
        {
            System.out.println(nums[i]);
        }// end for
        int n = nums.length - 1;
       
        while ( n >= 0 )
        {
            System.out.println (nums[n]);
            n--;
        }// end while
            
    }// end main
} // end class
        