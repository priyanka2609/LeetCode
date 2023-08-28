class Solution {
    public int trailingZeroes(int n) {
        int powOf5 = 5;
        int count = 0;
        while(n>=powOf5){
            count = count + n/powOf5;
            powOf5 = powOf5 * 5;
        }
        return count;
    }
}