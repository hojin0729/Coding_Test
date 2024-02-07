class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int a = M;
        int b = N;
        if( M <= N) {
            a = N;
            b = M;
        }
        
        answer = b * (a - 1) + (b - 1);
        return answer;
    }
}