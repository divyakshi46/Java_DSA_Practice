import java.util.*;
class ContainsDuplicateII{
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n  = nums.length;

        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < n ; i++){
            if (window.contains(nums[i])){
                return true;    //duplicate found
            }

            window.add(nums[i]);

            //if windowSize > k remove first element

            if (window.size() > k) {
                window.remove(nums[i-k]);
            }
        }

        return false;
        
    }
}