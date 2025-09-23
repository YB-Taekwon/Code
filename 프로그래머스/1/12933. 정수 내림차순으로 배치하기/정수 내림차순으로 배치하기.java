import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = String.valueOf(n);
        
        char[] c = s.toCharArray();
        Arrays.sort(c);
        
        return Long.parseLong(new StringBuilder(new String(c)).reverse().toString());
    }
}