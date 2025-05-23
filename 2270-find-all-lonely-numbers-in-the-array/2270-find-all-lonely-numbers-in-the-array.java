class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        for(int num:hm.keySet()){
            if(hm.get(num)==1 && !hm.containsKey(num-1) && !hm.containsKey(num+1)){
                ans.add(num);
            }
        }
        return ans;
    }
}