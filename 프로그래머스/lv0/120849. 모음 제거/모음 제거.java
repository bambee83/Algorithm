class Solution {
    public String solution(String my_string) {
        String vowels = "aeiou";
        for (int i = 0; i < vowels.length(); i++) {
            my_string = my_string.replace(String.valueOf(vowels.charAt(i)), "");
        }
        return my_string;
    }
}
