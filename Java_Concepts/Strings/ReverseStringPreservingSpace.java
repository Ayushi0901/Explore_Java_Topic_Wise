package Strings;

public class ReverseStringPreservingSpace {
    public static void main(String[] args) {
        String str = "I Am Not String";
//       ans="g ni rtS toNmAI"
        reverseStringPreservingSpace(str);
    }

    private static void reverseStringPreservingSpace(String str) {
        char[] arr = str.toCharArray();
        char[] resArr = new char[arr.length];
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] == ' ') {
                resArr[i] = ' ';
            }
        }
        int j = resArr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ') {
                if (resArr[j] == ' ') {
                    j--;
                }
                resArr[j] = arr[i];
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < resArr.length; i++) {
            sb.append(resArr[i]);

        }
        System.out.println(sb.toString());
    }


}
