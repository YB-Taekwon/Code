import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n).filter(i -> (n-1) % i == 0).findFirst().getAsInt();
    }
}