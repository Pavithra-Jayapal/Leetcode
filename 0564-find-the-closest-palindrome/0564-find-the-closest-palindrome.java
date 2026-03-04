import java.util.*;
class Solution {
    public String nearestPalindromic(String n) {
        int len = n.length();
        long num = Long.parseLong(n);
        
        // Special edge cases
        if (num <= 10) return String.valueOf(num - 1);
        if (num == 11) return "9";
        
        Set<Long> candidates = new HashSet<>();
        
        // Edge candidates
        candidates.add((long)Math.pow(10, len - 1) - 1);   // 999... case
        candidates.add((long)Math.pow(10, len) + 1);       // 1000...0001 case
        
        // Get first half
        long prefix = Long.parseLong(n.substring(0, (len + 1) / 2));
        
        for (long i = prefix - 1; i <= prefix + 1; i++) {
            String firstHalf = String.valueOf(i);
            StringBuilder sb = new StringBuilder(firstHalf);
            
            String secondHalf = new StringBuilder(
                firstHalf.substring(0, len % 2 == 0 ? firstHalf.length() : firstHalf.length() - 1)
            ).reverse().toString();
            
            sb.append(secondHalf);
            candidates.add(Long.parseLong(sb.toString()));
        }
        
        long closest = -1;
        
        for (long candidate : candidates) {
            if (candidate == num) continue;
            
            if (closest == -1 ||
                Math.abs(candidate - num) < Math.abs(closest - num) ||
                (Math.abs(candidate - num) == Math.abs(closest - num) && candidate < closest)) {
                closest = candidate;
            }
        }
        
        return String.valueOf(closest);
    }
}