class Solution {
    public String reverseWords(String s) {
         String words[] = s.split(" ");
        String reverseWords = "";
        for(String w:words){
        StringBuilder sb = new StringBuilder(w).reverse();
        reverseWords += sb.toString()+" ";
        }
        return reverseWords.trim();
    }
}