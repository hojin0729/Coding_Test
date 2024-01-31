class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] s = my_string.split("[a-zA-z]+");
        for(int i = 0;i<s.length;i++){
            if(s[i].matches("[0-9]+")){
                answer += Integer.parseInt(s[i]);
            }
        }
        return answer;
    }
}