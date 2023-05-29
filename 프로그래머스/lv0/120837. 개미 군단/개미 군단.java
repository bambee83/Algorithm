class Solution {
    public int solution(int hp) {
         int ants = 0;
        // 장군개미를 최대한 많이 배치
        ants += hp / 5;
        hp %= 5;

        // 병정개미를 최대한 많이 배치
        ants += hp / 3;
        hp %= 3;

        // 남은 체력을 일개미로 채움
        ants += hp;

        return ants;
    }
}