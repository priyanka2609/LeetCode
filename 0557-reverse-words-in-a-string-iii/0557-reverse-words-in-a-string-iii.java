class Solution {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            StringBuilder revWord = new StringBuilder(word);
            revWord.reverse();
            sb.append(revWord).append(" ");
        }
        return sb.toString().trim();
    }
}