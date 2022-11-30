class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        else if (strs.length == 0 || strs[0] == "")
            return "";
        String x = strs[0];
        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(x) != 0) {
                x = x.substring(0, x.length() - 1);
                if (x.isEmpty()) return "";
            }
        }
        return x;
    }
}