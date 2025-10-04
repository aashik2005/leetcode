class Solution {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        for (char ch : t.toCharArray()) {
            freq[ch]++;
        }

        int m = t.length();
        int l = 0, r = 0, cnt = 0;
        int minLen = Integer.MAX_VALUE, start = -1;

        while (r < s.length()) {
            char ch = s.charAt(r);
            if (freq[ch] > 0) cnt++;
            freq[ch]--;

            while (cnt == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                char leftChar = s.charAt(l);
                freq[leftChar]++;
                if (freq[leftChar] > 0) cnt--;
                l++;
            }
            r++;
        }

        return start == -1 ? "" : s.substring(start, start + minLen);
    }
}
