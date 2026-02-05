class Solution {
    public boolean isValid(String s) {
        while (true) {
            String updated = s.replace("()", "").replace("{}", "").replace("[]", "");
            if (updated.equals(s)) {
                break;   // no more changes
            }
            s = updated;
        }
        return s.isEmpty();
    }
}
