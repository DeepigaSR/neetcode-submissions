class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 0 1 -1  2 -1 -4 

         List<List<Integer>> resList = new ArrayList();

         Arrays.sort(nums);
         int len = nums.length;
         for(int i=0;i<=len-3;i++)
         {
            if(i!=0 && nums[i]== nums[i-1]){
                continue;
            }
            int j= i+1; int k= len-1;
            while(j<k)
            {
                int sum = nums[i]+ nums[j]+nums[k];
                if(sum==0)
                {
                    resList.add(Arrays.asList(nums[i],nums[j],nums[k]));
                
                    j++;
                    k--;
                    while(j<k && nums[j]== nums[j-1]){
                      j++;
                    }
                    while(j<k && nums[k]== nums[k+1]){
                      k--;
                    }
                }else if(sum<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        return resList;
    }
}
