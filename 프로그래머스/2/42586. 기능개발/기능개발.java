class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        // 기능 완료 날짜를 저장할 큐 (배열)
        int[] daysToComplete = new int[progresses.length];
        
        // 각 기능의 완료까지 걸리는 날짜 계산
        for (int i = 0; i < progresses.length; i++) {
            daysToComplete[i] = (100 - progresses[i] + speeds[i] - 1) / speeds[i];
        }
        
        // 결과를 담을 리스트
        java.util.List<Integer> answerList = new java.util.ArrayList<>();
        
        // 배포될 기능을 세는 변수
        int currentDeployDay = daysToComplete[0]; // 첫 번째 기능의 완료 날짜
        int deployCount = 1; // 첫 번째 기능은 항상 1개 배포
        
        // 두 번째 기능부터 확인
        for (int i = 1; i < daysToComplete.length; i++) {
            if (daysToComplete[i] <= currentDeployDay) {
                // 현재 배포 날짜보다 빨리 끝난 기능은 같은 날 배포
                deployCount++;
            } else {
                // 새로운 배포 날짜가 등장하면 이전 배포를 answer에 추가하고
                answerList.add(deployCount);
                currentDeployDay = daysToComplete[i]; // 배포 날짜 업데이트
                deployCount = 1; // 새로운 배포 시작
            }
        }
        
        // 마지막 배포도 추가
        answerList.add(deployCount);
        
        // 리스트를 배열로 변환하여 반환
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}