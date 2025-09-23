class Solution {
    public long solution(long n) {
        return n % Math.sqrt(n) == 0 ? (long) Math.pow((long) Math.sqrt(n) + 1, 2) : -1;
    }
}