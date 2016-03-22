public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsSet = new HashSet<Integer>();
        for (int i : nums){
            numsSet.add(i);
        }
        if (nums.length == numsSet.size()){
            return false;
        }else{
            return true;
        }
    }
}