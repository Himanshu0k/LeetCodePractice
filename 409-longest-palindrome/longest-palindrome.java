class Solution {
    public int longestPalindrome(String s) {
        if(s.length() == 1) return 1;

        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        boolean isOdd = false;

        for(Map.Entry<Character, Integer> entry: map.entrySet()) {
            int count = entry.getValue();
            if(count % 2 == 0) res += count;
            else {
                res += count-1;
                isOdd = true;
            }
        }
        
        if(isOdd) return res + 1;
        return res;
    }
}