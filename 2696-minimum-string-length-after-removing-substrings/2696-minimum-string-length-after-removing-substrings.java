class Solution {
    public int minLength(String s) {
        while (s.contains("AB") || s.contains("CD")) {
            int index = s.indexOf("AB");
            if (index != -1)
                s = s.replace("AB", "");
            index = s.indexOf("CD");
            if (index != -1)
                s = s.replace("CD", "");
        }

        return s.length();
    }
}