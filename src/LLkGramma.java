import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LLkGramma {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    private static List<String[]> gramma;
    private static Map<String, List<String>> prim = new HashMap<>();
    private static Map<String, List<String>> ultim = new HashMap<>();

    public static void main(String[] args) throws IOException {
        insertData();
        generatePrUl();
    }

    private static void insertData() throws IOException {
        gramma = new ArrayList<>();

        String data1 = bufferedReader.readLine();
        String data2 = bufferedReader.readLine();
        while (!data1.equals("1") || !data2.equals("1")) {
            String[] data = {data1, data2};
            gramma.add(data);

            data1 = bufferedReader.readLine();
            data2 = bufferedReader.readLine();
        }
    }


    private static void generatePrUl() {
        generatePrim();
        generateUltim();
        insertTable();
        populateTable();

        insertWord();

        analizeWord();

    }

    static List<Integer> numbers = new ArrayList<>();

    private static void analizeWord() {
        String newWord = generateSymb(word);
        boolean contin = true;

        System.out.println(newWord);

        while (contin) {

            int lengt = newWord.length() - 3;
            for (int i = 0; i < lengt; i++) {
                if (newWord.charAt(i) == '<' && newWord.charAt(i + 2) == '>') {

                    newWord = newWord.substring(0, i + 1) + findTheAnswer1(String.valueOf(newWord.charAt(i + 1))) + newWord.substring(i + 2);

                } else if (newWord.charAt(i) == '<' && newWord.charAt(i + 2) == '=') {
                    String answer = findTheAnswer2(String.valueOf(newWord.charAt(i + 1)) + String.valueOf(newWord.charAt(i + 3)));
                    newWord = newWord.substring(0, i + 1) + answer + newWord.substring(i + 4);
                }

            }

            lengt = newWord.length();
            String neWord2 = "";
            for (int i = 0; i < lengt; i += 2) {
                neWord2 += String.valueOf(newWord.charAt(i));
            }

            newWord = neWord2;

            newWord = generateSymb(newWord);
            System.out.println(newWord);

            if (newWord.charAt(0) == '$' && newWord.charAt(1) == '<' && newWord.charAt(3) == '>' && newWord.charAt(4) == '$') {
                contin = false;
                System.out.println("Word belongs to grammar");
                System.out.print("1");
                for (int i = numbers.size()-1; i > -1; i--) {
                    System.out.print(numbers.get(i));
                }
            }
        }

    }


    private static String generateSymb(String word) {
        String newWord = "";

        for (int i = 0; i < word.length() - 1; i++) {
            char ch1 = word.charAt(i);
            char ch2 = word.charAt(i + 1);
            newWord += String.valueOf(ch1);
            newWord += table.get(String.valueOf(ch1)).get(String.valueOf(ch2));
        }
        newWord += String.valueOf(word.charAt(word.length() - 1));

        return newWord;
    }

    private static String findTheAnswer1(String letter) {
        int i = 1;
        for (String[] str : gramma) {
            if (str[1].length() == 1 && String.valueOf(str[1].charAt(0)).equals(letter)) {
                numbers.add(i);
                return String.valueOf(str[0].charAt(0));
            }
            i++;
        }
        return "ERROR";
    }

    private static String findTheAnswer2(String letter) {
        int i = 1;
        for (String[] str : gramma) {
            if (str[1].length() == 2 && (String.valueOf(str[1].charAt(0)) + String.valueOf(str[1].charAt(1))).equals(letter)) {
                numbers.add(i);
                return String.valueOf(str[0].charAt(0));
            }
            i++;
        }
        return "ERROR";
    }

    private static String updateWord() {
        return null;
    }

    private static String word;

    private static void insertWord() {
        try {
            word = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void generatePrim() {
        int pos = 0;
        for (String[] strings : gramma) {
            List<String> data = new ArrayList<>();

            String first = String.valueOf(strings[1].charAt(0));
            if (prim.get(strings[0]) != null) {
                data = prim.get(strings[0]);
            }

            if (prim.get(strings[0]) != null && prim.get(strings[0]).contains(first)) {

            } else {
                data.add(first);
                prim.put(strings[0], data);
                if (Character.isUpperCase(first.charAt(0)) && !strings[0].equals(first)) {
                    loopPrim(strings[0], pos, first);
                }
            }

            pos++;
        }

        System.out.println("Prim");
        prim.forEach((x, y) -> {
                    System.out.print(x + " - ");
                    y.forEach(System.out::print);
                    System.out.println();
                }
        );

    }

    private static void loopPrim(String currPos, int position, String ch) {
        for (String[] gram : gramma) {
            if (gram[0].equals(ch)) {
                String first = String.valueOf(gram[1].charAt(0));
                List<String> data = prim.get(currPos);

                if (prim.get(currPos).contains(first)) {

                } else {
                    data.add(first);
                    prim.put(currPos, data);
                    if (Character.isUpperCase(first.charAt(0)) && !currPos.equals(first)) {
                        loopPrim(currPos, position, first);
                    }
                }

            }
        }
    }

    private static void generateUltim() {

        int pos = 0;
        for (String[] strings : gramma) {
            List<String> data = new ArrayList<>();

            String last = String.valueOf(strings[1].charAt(strings[1].length() - 1));
            if (ultim.get(strings[0]) != null) {
                data = ultim.get(strings[0]);
            }

            if (ultim.get(strings[0]) != null && ultim.get(strings[0]).contains(last)) {

            } else {
                data.add(last);
                ultim.put(strings[0], data);
                if (Character.isUpperCase(last.charAt(0)) && !strings[0].equals(last)) {
                    loopUltim(strings[0], pos, last);
                }
            }

            pos++;
        }

        System.out.println("Ultim");
        ultim.forEach((x, y) -> {
                    System.out.print(x + " - ");
                    y.forEach(System.out::print);
                    System.out.println();
                }
        );
    }

    private static void loopUltim(String currPos, int position, String ch) {

        for (String[] gram : gramma) {
            if (gram[0].equals(ch)) {
                String ult = String.valueOf(gram[1].charAt(gram[1].length() - 1));
                List<String> data = ultim.get(currPos);

                if (ultim.get(currPos).contains(ult)) {

                } else {
                    data.add(ult);
                    ultim.put(currPos, data);
                    if (Character.isUpperCase(ult.charAt(0)) && !currPos.equals(ult)) {
                        loopUltim(currPos, position, ult);
                    }
                }

            }
        }
    }

    private static Map<String, Map<String, String>> table = new TreeMap<>();
    private static List<String> letter = new ArrayList<>();

    private static void insertTable() {
        for (String[] gram : gramma) {
            for (String let : gram) {

                char[] chars = let.toCharArray();
                for (char ch : chars) {
                    if (letter.size() == 0) {
                        letter.add(String.valueOf(ch));
                    } else if (!letter.contains(String.valueOf(ch))) {
                        letter.add(String.valueOf(ch));
                    }
                }
            }
        }
        letter.add("$");

        Collections.sort(letter);
        for (String let : letter) {
            Map<String, String> map = new TreeMap<>();
            for (String l : letter) {
                map.put(l, "_");
            }
            table.put(let, map);
        }

    }

    private static void populateTable() {

        for (String[] gram : gramma) {
            if (gram[1].length() > 1) {
                Map<String, String> tab = table.get(String.valueOf(gram[1].charAt(0)));
                tab.put(String.valueOf(gram[1].charAt(1)), "=");
                table.put(String.valueOf(gram[1].charAt(0)), tab);

                if (!Character.isUpperCase(gram[1].charAt(0)) && Character.isUpperCase(gram[1].charAt(1))) {
                    Map<String, String> tab2 = table.get(String.valueOf(gram[1].charAt(0)));
                    for (String ch : prim.get(String.valueOf(gram[1].charAt(1)))) {
                        tab2.put(ch, "<");
                    }
                    table.put(String.valueOf(gram[1].charAt(0)), tab2);
                } else if (Character.isUpperCase(gram[1].charAt(0)) && !Character.isUpperCase(gram[1].charAt(1))) {
//                    Map<String, String> tab2 = table.get(String.valueOf(gram[1].charAt(1)));
                    for (String ch : ultim.get(String.valueOf(gram[1].charAt(0)))) {
                        Map<String, String> t = table.get(ch);
                        t.put(String.valueOf(gram[1].charAt(1)), ">");
                        table.put(String.valueOf(ch), t);
                    }
                } else if (Character.isUpperCase(gram[1].charAt(0)) && Character.isUpperCase(gram[1].charAt(1))) {
                    Map<String, String> t2 = table.get(String.valueOf(gram[1].charAt(1)));

                    for (String ch1 : ultim.get(String.valueOf(gram[1].charAt(0)))) {
                        for (String ch2 : prim.get(String.valueOf(gram[1].charAt(1)))) {
                            if (!Character.isUpperCase(ch2.charAt(0))) {
                                Map<String, String> t1 = table.get(ch1);
                                t1.put(ch2, ">");
                                table.put(ch1, t1);
                            }
                        }
                    }

                    Map<String, String> tab2 = table.get(String.valueOf(gram[1].charAt(0)));
                    for (String ch : prim.get(String.valueOf(gram[1].charAt(1)))) {
                        tab2.put(ch, "<");
                    }
                    table.put(String.valueOf(gram[1].charAt(0)), tab2);
                }

            }
        }


        Map<String, String> t1 = table.get("$");
        for (String ch : prim.get(String.valueOf(gramma.get(0)[0].charAt(0)))) {
            t1.put(ch, "<");
        }

        table.put(String.valueOf(gramma.get(0)[0].charAt(0)), t1);

        for (String ch : ultim.get(String.valueOf(gramma.get(0)[0].charAt(0)))) {
            Map<String, String> t = table.get(ch);
            t.put("$", ">");
            table.put(ch, t);
        }

        printTable();
    }

    private static void printTable() {
//        System.out.println();
//        System.out.print(" ");
//        letter.forEach(f -> System.out.print(" " + f));

        System.out.print(" ");
        table.forEach((k, l) -> {
            System.out.print(k);
        });

        System.out.println();
        table.forEach((k, l) -> {
            System.out.print(k);
            l.forEach((t, y) -> System.out.print(y));
            System.out.println();
        });
    }
}
