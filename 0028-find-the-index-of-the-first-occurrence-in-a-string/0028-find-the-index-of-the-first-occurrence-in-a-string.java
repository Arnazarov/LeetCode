class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length(), h = haystack.length();
        if (n == 0 || (h == 0 && n == 0)) return 0;
        else if (h == 0) return -1;
        for (int i = 0; i < h - n + 1; i++){
           String str = haystack.substring(i, i + n);
           if (str.equals(needle)) return i;
        }
        return -1;  
    }
}