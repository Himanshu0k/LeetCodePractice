class Solution {
    public int hammingWeight(int n) {
        String num = Integer.toBinaryString(n);
        int count = 0;

        for(char c: num.toCharArray()) {
            if(c == '1') count++;
        }

        return count;
    }
}