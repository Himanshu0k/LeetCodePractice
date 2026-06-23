class Solution {
    public int minCost(String colors, int[] neededTime) {
        int size = neededTime.length;
        
        int res = 0, check = 0;

        for(int i = 0; i < size; i++) {
            if(i+1 == size) break;

            if(colors.charAt(i) == colors.charAt(i+1)) {
                if(check == 0) check = neededTime[i];
                res += Math.min(check, neededTime[i+1]);
                check = Math.max(check, neededTime[i+1]);
            }
            else check = 0;
        }

        return res;
    }
}
 