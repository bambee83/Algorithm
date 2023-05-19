class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
    String firstPart = my_string.substring(0, s);
    String secondPart = my_string.substring(s + overwrite_string.length());

    return firstPart + overwrite_string + secondPart;
        }
}