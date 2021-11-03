import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class streamTest {
    @Test
    public void testManipulate_nullArgument_throwsException() {
        // given:
        final List<Integer> emptyList = null;
        // expect:
        assertThrows(NullPointerException.class, () -> {
            Main.manipulate(emptyList);
        });
    }

    @Test
    public void testOnlyFilter() {
        // given:
        final List<Integer> sortedList = Arrays.asList(2,4,6,8,10);
        // expect:
        Assertions.assertEquals(sortedList, Main.manipulate(sortedList));
    }

    @Test
    public void testFilterAndSorting() {
        // given:
        final List<Integer> testList = Arrays.asList(16,15,2,0,-1,6,32,87,10,-2);
        // expect:
        List<Integer> afterManipulation = Arrays.asList(2,6,10,16,32);

        List<Integer> res = Main.manipulate(testList);

        // check:
        Assertions.assertFalse(res.contains(-2));
        Assertions.assertFalse(res.contains(15));
        Assertions.assertEquals(afterManipulation, Main.manipulate(testList));
    }

    @Test
    public void testUnappropriateArray() {
        final List<Integer> oddNumbersList = Arrays.asList(1,3,5,7,9);
        Assertions.assertNotNull(Main.manipulate(oddNumbersList));
    }
}
