class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
            return 0;
        HashSet<Character> set = new HashSet<>();
        int result = 1;
        int i=0; 
        char c;
        for(int j=0; j<s.length(); j++){
            c = s.charAt(j);
            if(!set.contains(c)){
                set.add(c);
                result = Math.max(result, set.size());
            }
            else{
                while(i<j){
                    if(s.charAt(i)==c){
                        i++;
                        break;
                    }
                    set.remove(s.charAt(i));
                    i++;
                }
            }    
        }
        return result;
    }
}