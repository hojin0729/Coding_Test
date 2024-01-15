import java.util.ArrayList;

class Solution {
    public String solution(int age) {
        String answer = "";
        ArrayList<Integer> intList = new ArrayList<Integer>();

        while (age > 0) {
            intList.add(age % 10);
            age /= 10;
        }

        for (int i = intList.size() - 1; i >= 0; i--) {
            int digit = intList.get(i);
            char convertedChar = (char) (digit + 'a');
            answer += convertedChar;
        }

        return answer;
    }
}