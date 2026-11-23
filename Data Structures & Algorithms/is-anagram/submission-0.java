class Solution {
    public boolean isAnagram(String s, String t) {
        // chekc if one is null and other is not
        // check the size of two strings

        //arrange the chars in sorted order and compare

        char[] charS = s.toCharArray();
        Arrays.sort(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        return new String(charT).equals(new String(charS));

    }
}
