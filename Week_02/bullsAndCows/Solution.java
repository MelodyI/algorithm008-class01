class Solution {
    public String getHint(String secret, String guess) {
        int[] bucketBull = new int[10];
        int[] bucketCow = new int[10];
        int bulls = 0, cows = 0;
        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                bucketBull[s - '0']++;
                bucketCow[g - '0']++;
            }
        }
        for (int i = 0; i < 10; i++)
            cows += Math.min(bucketBull[i], bucketCow[i]);

        return String.format("%dA%dB", bulls, cows);
    }
}
