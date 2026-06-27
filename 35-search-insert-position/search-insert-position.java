class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(target > nums[mid]) {
                start = mid + 1;
            }
            else if(target < nums[mid]) {
                end = mid - 1;
            }
            else return mid;
        }

        return start;
    }
}

/*

class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(target <= nums[i]) return i;
        }
        return nums.length;
    }
}

class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        if(nums[0] > target) return 0;
        if(nums[0] == target) return 0;
        for(i = 1; i < nums.length; i++){
            if(nums[i] == target) return i;
            if(nums[i-1] < target && nums[i] > target) return i;
        }
        return i;
    }
}

*/