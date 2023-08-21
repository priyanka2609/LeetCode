class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for(String s: words){
            String reverse = new StringBuilder(s).reverse().toString();
            if(map.containsKey(reverse))
               map.put(reverse, map.get(reverse)+1);
            else
               map.put(s, 0);
        }
        int ans = 0;
        for(int value: map.values())
          ans += value;
          return ans;
    }
}