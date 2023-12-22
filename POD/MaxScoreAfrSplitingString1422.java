package POD;

public class MaxScoreAfrSplitingString1422 {
    public int maxScore(String s) {
        int maxScore = 0;
        int zeros = 0;
        int ones = 0;

        // Count the total number of ones in the string
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }

        // Iterate through each possible split position
        for (int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            if (c == '0') {
                zeros++;
            } else {
                ones--;
            }
            // Update the maximum score if needed
            maxScore = Math.max(maxScore, zeros + ones);
        }
        return maxScore;
    }
}
