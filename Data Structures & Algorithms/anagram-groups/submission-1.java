class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs) {
            char [] schars = s.toCharArray();
            java.util.Arrays.sort(schars);
            String st = new String(schars);
            if (res.containsKey(st))
                res.get(st).add(s);
            else {
                res.putIfAbsent(st, new ArrayList<>());
                res.get(st).add(s);
            }
        }
        return new ArrayList<>(res.values());
    }
}
