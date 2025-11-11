import java.util.*;
class IntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {

        //for more optimize way we will use hashMap

        //we always have to make the map for smaller array

        if (nums1.length < nums2.length){
            return intersect(nums2, nums1);
        }

        //HashMap

        HashMap<Integer, Integer> map = new HashMap<>();

        //build hashmap for smaller array by default smaller is nums1

        for (int num: nums1){
            map.put(num , map.getOrDefault(num, 0) + 1);
        }

        //create a arraylist result 
        ArrayList <Integer> res = new ArrayList<>();

        //now iterate through the other array

        for (int num: nums2){
            if (map.containsKey(num) && map.get(num) > 0){
                res.add(num);
                map.put(num , map.get(num)-1);
            }
        }

        //finally convert the Arraylist to the desired return type

        int[] ans = new int[res.size()];

        for (int i = 0; i<res.size(); i++){
            ans[i] = res.get(i);
        }

        return ans;
        
    }
}