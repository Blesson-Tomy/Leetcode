class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for(int num : nums1)
        {
            h.add(num);
        }

        for(int num : nums2)
        {
            if(h.contains(num))
            {
                h2.add(num);
            }
        }
        int[] ans = new int[h2.size()];
        int i=0;
        for(int no : h2)
        {
            ans[i]=no;
            i++;
        }

        return ans;
    }
}