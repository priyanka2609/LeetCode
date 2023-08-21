class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Set<String> set = new HashSet<>();
        for(String s : words){
            StringBuilder sb = new StringBuilder(s).reverse();
            if(set.contains(sb.toString())){
                count++;
            }
            else{
                set.add(s);
            }
        }
        return count;
    }
}