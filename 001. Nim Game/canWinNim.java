public class Solution {
    public boolean canWinNim(int n) {
        boolean win = true;
        if (n%4 == 0){
            win = false;
        }
        return win;
    }
}
