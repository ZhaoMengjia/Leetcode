public class Solution {
    public int[] countBits(int num) {
        int array[] = new int[num+1];
        array[0] = 0;
        for(int i = 1; i <= num; i++ ){
            array[i] = array[i & i-1] +1;
        }
        return array;
    }
}