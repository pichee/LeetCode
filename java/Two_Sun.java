//Solução EXCELENTE 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numerosHashmap=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int falta=target-nums[i];
            if(numerosHashmap.containsKey(falta)){
                return new int[]{numerosHashmap.get(falta),i};
            }
            numerosHashmap.put(nums[i],i);
        }
        return new int[]{};
    }
}
