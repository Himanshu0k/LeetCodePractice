class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for(char c: s.toCharArray()) {
            first.put(c, first.getOrDefault(c, 0)+1);
        }

        for(char c: t.toCharArray()) {
            second.put(c, second.getOrDefault(c, 0)+1);
        }

        return first.equals(second);
    }
}

/*

Solution 1.
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] charS = s.toCharArray();
        char[] chart = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(chart);
        
        return Arrays.equals(charS,chart);
    }
}

Solution 2.
class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> first = new HashMap<>();
        Map<Character, Integer> second = new HashMap<>();

        for(char c: s.toCharArray()) {
            first.put(c, first.getOrDefault(c, 0)+1);
        }

        for(char c: t.toCharArray()) {
            second.put(c, second.getOrDefault(c, 0)+1);
        }

        return first.equals(second);
    }
}

*/