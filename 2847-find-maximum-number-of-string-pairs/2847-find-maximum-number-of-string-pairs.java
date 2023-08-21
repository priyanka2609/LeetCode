class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < words.length; i++){
            for(int j = i + 1; j < words.length; j++){
                sb.append(words[j]);
                if(words[i].equals(sb.reverse().toString())){
                    count++;
                }
                sb.delete(0, sb.length());
            }
        }
        return count;
    }
}