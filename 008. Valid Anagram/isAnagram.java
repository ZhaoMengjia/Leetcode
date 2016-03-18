public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }else{
            int[] sa = new int[26];
            int[] ta = new int[26];
            for(int i = 0; i < s.length(); i++){
                sa[s.charAt(i) - 'a']++;
                ta[t.charAt(i) - 'a']++;
            }
            for(int i = 0; i < 26; i++){
                if(ta[i] != 0 && ta[i] != sa[i]){
                    return false;
                }
            }
            return true;
        }
    }
}