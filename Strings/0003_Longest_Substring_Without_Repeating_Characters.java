class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        Set<Character> set=new HashSet<>();
        int left=0;
        int i=0;
        while(i<s.length()){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(max,set.size());
                i++;
            }
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }
        return max;
    }
}