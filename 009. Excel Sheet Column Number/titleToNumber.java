public class Solution {
    public int titleToNumber(String s) {
        int columnNum = 0;
        for(int i = 0; i < s.length(); i++){
            columnNum = columnNum + (s.charAt(i)-'A'+1) * power(26, s.length()-i -1);
        }
        return columnNum;
    }
    
    private int power(int a, int b){
        int pow = 1;
        while (b > 0){
            pow *= a;
            b--;
        }
        return pow;
    }
}