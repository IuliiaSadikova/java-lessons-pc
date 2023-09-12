package homeworks.practice.task3;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionDividerTest {

    private final List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    @Test
    void checkEvenNumbers() {
        List<Integer> expectedEvenNumbers = List.of(2, 4, 6, 8);
        List<Integer> actualEvenNumbers = CollectionDivider.listOfEven(list);
        assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }

    @Test
    void checkOddNumbers() {
        List<Integer> expectedEvenNumbers = List.of(1, 3, 5, 7, 9);
        List<Integer> actualEvenNumbers = CollectionDivider.listOfOdd(list);
        assertEquals(expectedEvenNumbers, actualEvenNumbers);
    }

}