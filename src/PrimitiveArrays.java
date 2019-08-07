import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Created by aborisco on 2/8/2018.
 */
public class PrimitiveArrays { //they are objects

    int[] numbers2 = new int[] {42, 55, 99};

    int[] numAnimals;
    int [] numAnimals2;
    int numAnimals3[];
    int numAnimals4 [];

    public static void main(String[] args) {

        char[] i1 = new char[5];
        for (char i : i1) {
            System.out.print((int)i);//is 0 or ''
        }
        System.out.println();

        int[] m1, m2;
        m1 = new int[]{1, 2, 3, 5};
        m2 = new int[]{3, 2, 1};

        int n1[], n2;
        n1 = new int[]{1,2,3};
//        n2 = new int[]{3,2,1}; does nto compile
//        n1 = {1,2,3}; does note compile

        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        System.out.println(bugs.equals(alias)); // true
        System.out.println(bugs == alias); // true
        System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0

        int[] he1 = new int[]{1,2,3};
        int[] he2 = new int[]{1,2,3};
        System.out.println(he1.equals(he2)); // don't look for the values, only for the object reference
        System.out.println(he1 == he2); // again don't look for the values,

        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[])objects;
//        againStrings[0] = new StringBuilder();// require string but gave builder
//        objects[0] = new StringBuilder();  ArrayStoreException

        int a = strings.length;         //for array
        a = "asd".length();             //for String
        a = new ArrayList<>().size();   //for Array Objects

        int[] in1 = {1,6,3,5,2};


        String[] str3 = {"1", "9", "100", "24"};
        Arrays.sort(str3);
        Arrays.stream(str3).forEach(System.out::println);// 1, 100, 24, 9 - because first go 1 to9 than a-z and then A-Z
        System.out.println(Arrays.binarySearch(in1, 1));    // will be first
        System.out.println(Arrays.binarySearch(in1, 3));    // will be 3rd(2)
        System.out.println(Arrays.binarySearch(in1, 6));    // because of after 1 should go 2 it starts to go back
        System.out.println(Arrays.binarySearch(in1, 20)); //-6 because only 6 is length
        Arrays.sort(in1); //sort as expected

//        String... varar Varargs, that can be used only in methods declaration


        //Multidimensional Arrays
        int[] asd[], asdf[][]; //2D and 3D length
        int[][] arr2 = {{1,2,3}, {1,2}, {1}}; // in third level will be only one detention array, on second 2 and first 3

        Stream.of(arr2).map(Arrays::toString).forEach(System.out::println);


    }

}
