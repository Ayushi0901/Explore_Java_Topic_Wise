package Strings;

public class ReverseWordsOfString {
    public static void main(String[] args) {
        String str = "i am not a string";
//        i ma ton gnirts
        reverseWord(str);
    }

    private static void reverseWord(String str) {
        String res = "";
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            char[] s = arr[i].toCharArray();
            int start = 0, end = s.length - 1;
            while (start < end) {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;

            }

            res += String.valueOf(s) + " ";

        }
        System.out.println(res);
    }
}
