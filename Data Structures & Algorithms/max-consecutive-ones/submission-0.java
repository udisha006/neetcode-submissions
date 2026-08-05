class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int maxcons = 0;
    int count =0;
    for(int i =0 ; i< nums.length; i++){
      if(nums[i] ==1){
        count++;
      }else{
        count=0;
      }   
      if(maxcons<count){
        maxcons = count;
      }
      }
         return maxcons;
    }

    }

