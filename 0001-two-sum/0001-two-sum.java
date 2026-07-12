class Solution {


    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        for( i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
                
                 if(nums[i]+nums[j]==target)
                {
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{i,j};
    }
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size ");
        int n=in.nextInt();
        int nums[]=new int[n];
        Solution ob=new Solution();
        System.out.println("enter the element");
        for(int i=0;i<n;i++)
        {
            nums[i]=in.nextInt();
        }
        System.out.println("enter the target");
        int t=in.nextInt();
        System.out.println(ob.twoSum(nums,t));
    }
}