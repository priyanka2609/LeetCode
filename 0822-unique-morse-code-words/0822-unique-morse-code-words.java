class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> hs = new HashSet<>();
        for(String w : words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < w.length(); i++){
                sb.append(d[w.charAt(i) - 'a']);
            }
            hs.add(sb.toString());
            }
        return hs.size();
    }
}