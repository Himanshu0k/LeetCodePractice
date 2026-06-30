class Solution {
    public int longestSubstring(String s, int k) {
        if(s.length() < k) return 0;

        Map<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c: map.keySet()) {
            if(map.get(c) < k) {
                int max = 0;

                for(String part: s.split(String.valueOf(c))) {
                    max = Math.max(max, longestSubstring(part, k));
                }

                return max;
            }
        }

        return s.length(); // works if every element of string is valid
    }
}