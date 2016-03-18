#Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?

##solution:
```java
public class Solution {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] S= s.toCharArray();
        char[] T= t.toCharArray();
        Arrays.sort(S);
        Arrays.sort(T);
        
        if(new String(S).equals(new String(T)))
            return true;
        return false;

    }
}

###hints
toCharArray(): 字符串转化为字符数组
Arrays.sort(S): 数组排序
new String(S):通过字符数组创建字符串
