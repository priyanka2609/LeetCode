class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int left = 0, right = 0, space = 0;
    
       for (char move : moves.toCharArray()) {
         if (move == 'L' ) {
                left++;
            } else if (move == 'R') {
                right++;
            } else space++;
        }
        if(left > right) return left + space - right;
        return right + space - left;
    }
}