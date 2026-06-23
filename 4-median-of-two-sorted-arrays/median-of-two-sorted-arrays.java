class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;

        int first = 0, second = 0;

        int curr = 0, prev = 0;

        for(int i = 0; i <= size/2; i++) {
            prev = curr;

            if(first < nums1.length && (second >= nums2.length || nums1[first] <= nums2[second])) {
                curr = nums1[first];
                first++;
            }

            else {
                curr = nums2[second];
                second++;
            }
        }

        if(size % 2 == 0) return (curr+prev)/2.0;
        return curr;
    }
}

/*

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = 0;
        int[] nums = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length; i++, n++) nums[n] = nums1[i];

        for(int i = 0; i < nums2.length; i++, n++) nums[n] = nums2[i];

        Arrays.sort(nums);

        if(n % 2 == 0) {
            int first = n/2;
            int second = n/2 - 1;

            return (nums[first] + nums[second])/2.0;
        }
        
        return nums[n/2];
    }
}

*/