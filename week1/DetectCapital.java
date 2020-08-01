class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.equals(word.toUpperCase())) {
            return true;
        }
        int len = word.length();
        for (int i = 1; i < len; i++) {
            char ch = word.charAt(i);
            if ('A' <= ch  && ch <= 'Z') {
                return false;
            }
        }
        return true;
    }
}
