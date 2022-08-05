class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char a[] = s.toCharArray();
        char b[] = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        String s1 = new String(a);
        String s2 = new String(b);
        return s1.equals(s2);
        /*if(s.length()!=t.length())
            return false;
        HashMap <Character , Integer> m = new HashMap<>();
        int a;
        for(Character c : s.toCharArray())
            m.put(c,m.getOrDefault(c,0)+1);
        for(Character c : t.toCharArray()){
            a = m.getOrDefault(c,0);
            if(a==0)
                return false;
            m.put(c,m.getOrDefault(c,0)-1);
        }
        return true;*/
    }
}