class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);

        return nums[nums.length-k];
    }
}

/*

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n: nums) queue.add(n);

        for(int i = 0; i < k-1; i++) queue.poll();

        return queue.poll();
    }
}

*/