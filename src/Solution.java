import java.util.Optional;

public class Solution {

    public static void main(String[] args) {

        Optional<String> st = Optional.empty();
        st.filter(val -> val.equals("hello"))
                .map(val -> val.charAt(1));

//        System.out.println(countAndSay(5));
    }

    private static String countAndSay(int n) {
        String data = "1";
        for(int i = 1; i<n; i++){
            data = calcData(data);
        }
        return data;
    }

    private static String calcData(String data) {
        StringBuilder newData = new StringBuilder();
        for(int j = 0; j<data.length(); ){
            int count = 0;
            do {
                count++;
                j++;
            }while(j != data.length() && data.charAt(j-1) == (data.charAt(j)));

            newData.append("").append(count).append(data.charAt(j - count));
        }
        return newData.toString();
    }
}
