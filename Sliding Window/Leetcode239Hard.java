import java.util.*;
class Leetcode239Hard {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque <Integer> dq = new LinkedList<>();
        int []res = new int [n-k+1];

        //process first window 
        for (int i = 0; i < k ; i++){      //0, 1, 2
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        res[0] = nums[dq.peekFirst()];

        //process res of the windows
        for (int i = k;  i<n ; i++){
            while (!dq.isEmpty () && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            dq.offer(i);
            res[i-k+1] = nums[dq.peekFirst()];
        }

        return res;

    }
}