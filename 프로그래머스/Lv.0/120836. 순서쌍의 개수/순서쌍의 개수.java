public class Solution {
    public int solution(int n) {
        int count = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i != n / i) {
                    count += 2;
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}