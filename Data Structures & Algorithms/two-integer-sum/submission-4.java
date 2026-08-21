class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] dynamicArray = new int[2]; 
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+ nums[j]==target){
                    dynamicArray[0]=i;
                    dynamicArray[1]=j;
                    return dynamicArray;
                
                
                }
            
            }

        }
    return dynamicArray;
    }
}
