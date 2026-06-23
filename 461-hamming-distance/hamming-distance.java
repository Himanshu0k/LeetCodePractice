class Solution {
    public int hammingDistance(int x, int y) {
        
        String first = Integer.toBinaryString(x); //    1
        String second = Integer.toBinaryString(y); // 101

        int count = 0;

        for(int i = first.length()-1, j = second.length()-1; i >= 0 || j >= 0; i--, j--) {
            if(i < 0) {
                if(second.charAt(j) == '1') count++;
            }
            else if(j < 0) {
                if(first.charAt(i) == '1') count++;
            }
            else if(first.charAt(i) != second.charAt(j)) count++;
            else continue;
            
        }

        return count;
    }
}