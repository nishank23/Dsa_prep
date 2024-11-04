class Solution {

    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        if (word.isEmpty()) {
            return comp.toString();
        }

        char currentChar = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == currentChar) {
                count++;
                if (count == 9) { // Limit count to 9 per the problem's instructions
                    comp.append(count).append(currentChar);
                    count = 0;
                }
            } else {
                if (count > 0) {
                    comp.append(count).append(currentChar);
                }
                count = 1;
                currentChar = word.charAt(i);
            }
        }

        // Append the last character group
        if (count > 0) {
            comp.append(count).append(currentChar);
        }

        return comp.toString();
    }
}
