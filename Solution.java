class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = nums1.length - 1; i >= 0; i--) {
            if(i - m >= 0) {
                nums1[i] = nums2[i - m];
            }
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
