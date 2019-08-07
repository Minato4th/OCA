
import java.util.*;

/**
 * Created by aborisco on 2/11/2018.
 */
public class ArrayLists {

    public static Set<Map<String, Object>> listic = new HashSet<>();

    static int [][] some;

    public static void main(String[] args) {
        List arr1 = new ArrayList();                //default capacity 10
        List arr2 = new ArrayList(20);   // initialize capacity to 20
        List arr3 = new ArrayList(arr1);            // copy arr1

        arr1.add(new Integer(3));
        arr1.add("asd");
        arr1.stream().forEach(System.out::println);


        ArrayList a1 = new ArrayList();
        a1.add("Hall");
        a1.add(Boolean.FALSE);
        a1.stream().forEach(System.out::println);

        ArrayList<String> a2 = new ArrayList<>();
        a2.add("Hell");
//        a2.add(Boolean.FALSE) because was define <String>

        List<String> bird = new ArrayList<>();
        bird.add("hawk");                        // [hawk]
        bird.add(1,"robin");        // [hawk, robin]
        bird.add(0,"blue jay");     // [blue jay, hawk, robin]
        bird.add(1,"cardinal");     // [blue jay, , hawk, robin]
        bird.add(0,"hawk");         // [hawk, blue jay, cardinal, hawk, robin]
        System.out.println(bird.remove("hawk")); //true
        System.out.println(bird.remove("asdf")); //false
        System.out.println(bird.remove("jay")); //false
        System.out.println(bird.remove(0));  //print blue jay
        //System.out.println(bird.remove(100));  //IndexOutOfBoundsException
        bird.set(0, "jay");                     //will change 0 element
        //bird.set(15, "jay");                 //IndexOutOfBoundsException
        System.out.println(bird.isEmpty());
        System.out.println(bird.size());
        System.out.println(bird);                   //[jay, hawk, robin]
        System.out.println(bird.contains("robin")); //true
        System.out.println(bird.indexOf("hawk"));
        bird.clear();


        List one = new ArrayList();
        List two = new ArrayList();
        one.equals(two);            //true
        one.add("1");
        one.equals(two);            //false
        two.add("1");
        one.equals(two);            //true
        one.add(1);
        two.add(1L);
        one.equals(two);            //false


        // converting ArrayList to array and back
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length);
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length);


        String[] array = { "hawk", "robin" };       //[hawk, robin]
        List<String> list2 = Arrays.asList(array);  //return fixed size
        System.out.println(list2.size());           //2
        list2.set(1, "test");                        // [hawk, test]
        array[0] = "new";                           // [new, test]  - because they are linked.
        for (String b : array) System.out.print(b + " ");// new test - because they are linked.
//        list2.remove(1);                              // will cause UnsupportedOperation - because they are linked, and you cant dell
//        list2.add("test2");                             //will cause UnsupportedOperationException


        List<String> list3 = Arrays.asList("one", "two");


        //Sorting
        List<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 100], as expected


        Map<String, Object> mapOb = new HashMap<>();
        mapOb.put("a", "b");
        listic.add(mapOb);
        System.out.println(listic.stream().findFirst().get());

    }
}
