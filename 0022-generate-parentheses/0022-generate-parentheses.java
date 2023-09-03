class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        balPara(res, "", 0, 0, n);
        return res;
    }

    public void balPara(List<String> list, String cur, int o, int c, int n){
       if(cur.length() == 2 * n){
           list.add(cur);
           return;
       }

        if(o < n){
            balPara(list, cur+ '(', o + 1, c, n);
        }

        if(c < o) {
            balPara(list, cur + ')', o, c + 1, n);
        }
    }
}