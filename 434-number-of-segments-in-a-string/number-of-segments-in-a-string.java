class Solution {
    public int countSegments(String s) {
        if(s.length() == 0) return 0;
        String[] str = s.split(" ");
        int count = 0;

        for(String i: str) {
            if(!i.isEmpty()) count++;
        }

        return count;
    }
}