class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chArr = s.toCharArray();
            Arrays.sort(chArr);
            String sKey = new String(chArr);
            map.putIfAbsent(sKey, new ArrayList());

            map.get(sKey).add(s);
        }

        return new ArrayList<>(map.values());
    }
}