package Testing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import static Testing.Data.*;

/**
 * Created by aborisco on 2/12/2019.
 */
public class MainTest {
    public static final List<Data> TEST = Collections.unmodifiableList(Arrays.asList(SOME, ELSE, YES));
    public static void main(String[] args) {
        System.out.println(TEST.contains(YES));
        System.out.println(TEST.contains(NO));

    }
}
