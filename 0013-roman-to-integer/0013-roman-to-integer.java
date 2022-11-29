class Solution {
    public int romanToInt(String s) {
        int i = 0, res = 0;
        while (i != s.length()) {
            char c = s.charAt(i);
            char next = i < (s.length() - 1) ? s.charAt(i+1) : 'Z'; 
            if (c == 'I') {
                if (next == 'V') {
                    res += 4;
                    i++;
                }
                else if (next == 'X') {
                    res += 9;
                    i++;
                }
                else
                    res += 1;
            }
            else if (c == 'V') 
                res += 5;
            else if (c == 'X') {
                if (next == 'L') {
                    res += 40;
                    i++;
                }
                else if (next == 'C') {
                    res += 90;
                    i++;
                }
                else
                    res += 10;
            }
            else if (c == 'L') 
                res += 50;
            else if (c == 'C') {
                if (next == 'D') {
                    res += 400;
                    i++;
                }
                else if (next == 'M') {
                    res += 900;
                    i++;
                }
                else
                    res += 100;
            }
            else if (c == 'D') 
                res += 500;
            else 
                res += 1000;
            i++;
        }
        return res;
    }
}