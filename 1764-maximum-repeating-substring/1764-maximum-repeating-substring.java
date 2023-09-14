class Solution {
    public int maxRepeating(String sequence, String word) {
        String search = "";
        while(sequence.contains(search))
           search += word;
           return (search.length()-word.length()) / word.length();
    }
}