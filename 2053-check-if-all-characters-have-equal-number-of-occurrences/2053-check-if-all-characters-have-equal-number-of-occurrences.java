class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for(char ch: s.toCharArray()){
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int frequency = hm.get(s.charAt(0));
        for(char key : hm.keySet()){
            if(hm.get(key) != frequency)
               return false;
        }
        return true;
    }
}