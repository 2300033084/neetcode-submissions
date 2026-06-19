class Solution {
    public int removeElement(int[] nums, int val) 
    {
        int p1=0;
        int p2=nums.length-1;
        while(p1<p2)
        {
           while(nums[p1] !=val && p1<p2)
           {
            p1++;
           } 
           while(nums[p2]==val  && p2>p1)
           {
            p2--;
           }
           int temp=nums[p1];
           nums[p1]=nums[p2];
           nums[p2]=temp;
           p1++;
           p2--;
        }
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] !=val)
            {
                count++;
            }
        }
        return count;
        
    }
}