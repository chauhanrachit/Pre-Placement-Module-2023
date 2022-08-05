class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> remainingLetters = new HashMap<>();
        for (Character c : magazine.toCharArray())
            remainingLetters.put(c, remainingLetters.getOrDefault(c, 0) + 1);
        for (Character c : ransomNote.toCharArray()) {
            int remaining = remainingLetters.getOrDefault(c, 0);
            if (remaining == 0)
                return false;
            remainingLetters.put(c, remaining - 1);
        }
        return true;
    }
}