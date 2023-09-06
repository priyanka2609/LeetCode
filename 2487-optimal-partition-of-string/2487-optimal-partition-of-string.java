class Solution {
    public int partitionString(String s) {
        int c = 1;
        HashSet<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                c++;
                set.clear();
            }
            set.add(ch);
        }
        return c;
    }
}