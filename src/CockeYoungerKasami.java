import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class CockeYoungerKasami {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Insert word : ");
        calculator.generateMatrix(calculator.read(bufferedReader));
    }
}

class Calculator {

    private static final String a = "a";
    private static final String b = "b";
    private static final String c = "c";
    private static final String e = "e";
    private static final String S = "S";
    private static final String A = "A";
    private static final String B = "B";
    private static final String D = "D";
    private static final String E = "E";
    private static final String X = "X";
    private static final String Y = "Y";
    private static final String Z = "Z";
    private static final String W = "W";

    private static final String terminals = a + b + c + e;

    private final ArrayList<String[]> rules2 = new ArrayList<String[]>() {{
        add(new String[]{S, A + D});
        add(new String[]{S, a});
        add(new String[]{A, A + B});
        add(new String[]{A, A + D});
        add(new String[]{A, a});
        add(new String[]{B, B + D});
        add(new String[]{B, X + S});
        add(new String[]{B, b});
        add(new String[]{D, Z + Y});
        add(new String[]{D, Z + W});
        add(new String[]{E, e});
        add(new String[]{E, W + E});
        add(new String[]{X, b});
        add(new String[]{Y, W + E});
        add(new String[]{Z, c});
        add(new String[]{W, e});
    }};

    public String read(BufferedReader read) {
        try {
            String word = read.readLine();
            for (char ch : word.toCharArray()) {
                if (!terminals.contains(Character.toString(ch)))
                    throw new IOException();
            }
            return word;
        } catch (IOException e1) {
            System.out.println("Wrong alphabet, rewrite word : ");
        }
        return read(read);
    }


    public void generateMatrix(String word) {
        String[][] matrix = new String[word.length()][word.length()];

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length(); j++) {
                if (i == 0) {
                    matrix[i][j] = findLine(Character.toString(word.charAt(j)));
                } else {


                    matrix[i][j] = clearDupl(collectNextLines(matrix, i, j));
                }
            }
        }
        showMatrix(matrix, word);
    }

    private String clearDupl(String old){
        StringBuilder newWord = new StringBuilder();
        char[] ch = old.toCharArray();
        for (char c : ch) {
            if (!newWord.toString().contains(Character.toString(c))) newWord.append(Character.toString(c));
        }

        return newWord.toString();
    }

    private void showMatrix(String[][] matrix, String word) {
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + "\t");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        if (matrix[matrix.length-1][0].equals("-")) System.out.println("Doesn't belong to grammar");
        else System.out.println("Belongs to grammar");

    }

    private String findLine(String letter) {
        StringBuilder result = new StringBuilder();
        for (String[] st : rules2) {
            if (st[1].equals(letter))
                result.append(st[0]);
        }
        return result.toString();
    }

    private String collectNextLines(String[][] matrix, int level, int position) {
        if (matrix.length - level <= position) return "";

        StringBuilder letters = new StringBuilder();
        int l1 = level;
        int l2 = 1;
        int p = 1;
        for (int i = 0; i < level; i++) {
            if ((position + p) > matrix.length -1) break;
            letters.append(findLetters(matrix[level - l1--][position], matrix[level - l2++][position + p++]));
        }
        if (letters.toString().length() == 0) letters.append('-');
        return letters.toString();
    }

    private String findLetters(String s1, String s2) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                result.append(findLine(Character.toString(s1.charAt(i)) + Character.toString(s2.charAt(j))));
            }
        }
        return result.toString();
    }
}