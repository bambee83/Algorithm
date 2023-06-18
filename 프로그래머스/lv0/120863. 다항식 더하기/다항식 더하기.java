class Solution {
    public String solution(String polynomial) {
        String[] terms = polynomial.split(" \\+ ");
        int constant = 0;
        int xCoeff = 0;

        for (String term : terms) {
            if (term.endsWith("x")) {
                String coeff = term.substring(0, term.length() - 1);
                xCoeff += coeff.isEmpty() ? 1 : Integer.parseInt(coeff);
            } else {
                constant += Integer.parseInt(term);
            }
        }

        StringBuilder sb = new StringBuilder();
        if (xCoeff != 0) {
            sb.append(xCoeff == 1 ? "x" : xCoeff + "x");
        }
        if (constant != 0) {
            if (sb.length() != 0) {
                sb.append(" + ");
            }
            sb.append(constant);
        }

        return sb.toString();
    }
}
