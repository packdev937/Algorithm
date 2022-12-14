package inflearn.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " `~1@#$%^&*()-=_+,./<>?;':[]{}");
        boolean isPelindrome = true;
        String str = "";
        while (st.hasMoreTokens()) {
            str += st.nextToken();
        }
        str = str.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPelindrome = false;
                break;
            }
        }

        if (isPelindrome)
            System.out.print("YES");
        else System.out.print("NO");

    }
}