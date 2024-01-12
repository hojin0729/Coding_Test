class Solution {
    public int solution(int n, int k) {
        int sheep = n*12000;
        int drink = k*2000;
        int discount = (n/10)*2000;
        int totalCost = sheep + drink - discount;
        return totalCost;
    }
}
