class Solution {
    public String longestPalindrome(String s) {
        String ans="";
      for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String n=s.substring(i,j+1);
            if(isPalindrome(n,i,j+1)){
                if(n.length()>ans.length()){
                    ans=n;
                }
            }
        }
      }
      return ans;    
    }
    static boolean isPalindrome(String s,int start,int end){
        int st=0;
        int e=s.length()-1;
        while(st<e){
            if(s.charAt(st)!=s.charAt(e)){
                return false;
            }
            st++;
            e--;
        }
        return true;

    }
}