public class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int j = 0;
        int[] temp = new int[len];
        for (int i = 0; i < len; i++){
            if (nums[i] != 0){
                temp[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < len; i++){
            nums[i] = temp[i];
        }
    }
}