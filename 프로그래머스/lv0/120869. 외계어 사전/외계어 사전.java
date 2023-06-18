import java.util.*;

class Solution {
    public int solution(String[] spell, String[] dic) {
        List<String> permutations = new ArrayList<>();
        permutation(spell, 0, spell.length, permutations);

        for (String word : dic) {
            if (permutations.contains(word)) {
                return 1;
            }
        }
        
        return 2;
    }

    private void permutation(String[] arr, int depth, int n, List<String> result) {
        if (depth == n) {
            StringBuilder sb = new StringBuilder();
            for (String s : arr) {
                sb.append(s);
            }
            result.add(sb.toString());
            return;
        }

        for (int i = depth; i < n; i++) {
            swap(arr, i, depth);
            permutation(arr, depth + 1, n, result);
            swap(arr, i, depth);
        }
    }

    private void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
