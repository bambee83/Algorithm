import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Map<String, String> morseToAlphabet = new HashMap<>();
        for (int i = 0; i < morseCodes.length; i++) {
            morseToAlphabet.put(morseCodes[i], String.valueOf((char)('a' + i)));
        }

        StringBuilder answer = new StringBuilder();
        String[] letters = letter.split(" ");
        for (String morse : letters) {
            answer.append(morseToAlphabet.get(morse));
        }
        
        return answer.toString();
    }
}
