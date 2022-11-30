package Homework1;

public class Ex151 {
    public static void main(String[] args) {
        String s = "the sky is blue";
        reverseWords(s);
    }

    public static void reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder output = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                output.insert(start, s.charAt(i));
                end++;
            }
            if (s.charAt(i) == ' ' && end > 0) {
                output.append(' ');
                start += end + 1;
                end = 0;
            }
        }
        if (output.charAt(start + end - 1) == ' ') {
            output.deleteCharAt(start + end - 1);
        }
        System.out.print(output.toString());
    }
}
