class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        findPermutations(s, "", ans);
        return ans;
    }
    public void findPermutations(String input, String temp, List<String> ans) {
        if(input.length() == 0) {
            ans.add(temp);
            return;
        }
        char ch = input.charAt(0);
        if(Character.isDigit(ch))
            findPermutations(input.substring(1), temp + ch, ans);
        else{
            findPermutations(input.substring(1), temp + Character.toLowerCase(ch), ans);
            findPermutations(input.substring(1), temp + Character.toUpperCase(ch), ans);
        }
        return;
    }
}