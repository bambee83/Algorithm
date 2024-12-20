class Solution {
    public long solution(int n, int[] times) {
        long left = 1;
        long right = (long) n * getMax(times);
        long answer = right;

        while (left <= right) {
            long mid = (left + right) / 2;
            long processed = getProcessedCount(times, mid);
            if (processed >= n) { // n명을 처리할 수 있다면
                answer = mid; // 최소 시간을 갱신
                right = mid - 1; // 더 짧은 시간을 탐색
            } else {
                left = mid + 1; // 시간을 늘려 탐색
            }
        }
        return answer;
    }

    private int getMax(int[] times) {
        int max = times[0];
        for (int time : times) {
            max = Math.max(max, time);
        }
        return max;
    }

    // 시간 내 처리 가능한 사람 계산
    private long getProcessedCount(int[] times, long time) {
        long count = 0;
        for (int t : times) {
            count += time  / t; // 심사관이 처리할 수 있는 사람 수
        }
        return count;
    }
}