// 2530. Maximal Score After Applying K Operations

class Solution {
    public long maxKelements(int[] nums, int k) {
        long score = 0;
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i=0; i<nums.length; i++){
            pQueue.add(nums[i]);
        }
        while(k>0) {
            int top = pQueue.poll();
            score = score + top;
            pQueue.add((int)Math.ceil(top/3.0));
            k = k-1;
        }

        return score;
    }
}
