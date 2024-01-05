public class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int newNumer = numer1 * denom2 + numer2 * denom1;
        int newDenom = denom1 * denom2;

        int gcd = gcd(newNumer, newDenom);

        newNumer /= gcd;
        newDenom /= gcd;

        int[] answer = {newNumer, newDenom};
        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
        