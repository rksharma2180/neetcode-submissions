class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        
        char [] chars = s.toCharArray();
        java.util.Arrays.sort(chars);

        char [] chart = t.toCharArray();
        java.util.Arrays.sort(chart);

        return new String(chars).equals(new String(chart));
    }
}
