class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        if ((s.isBlank() && !t.isBlank()) || (!s.isBlank() && t.isBlank())) {
            return false;
        }
        char[] charS = s.toCharArray();
        Arrays.sort(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        return new String(charT).equals(new String(charS));

    }
}
