class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String dbStr = s + s;
        return dbStr.substring(1, dbStr.length()-1).contains(s);
    }
}