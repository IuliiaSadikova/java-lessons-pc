package homeworks.practice.task4;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFilterTest {

    private final List<Integer> list = List.of(-1, 2, -3, 4, 5, 6, 7, 8, 9);
    private final DuplicateFilter duplicateFilter = new DuplicateFilter();


    @Test
    void deleteNegative() {
        duplicateFilter.setNegative(true);
        List<Integer> actual = duplicateFilter.delete(list);
        List<Integer> expected = List.of(2, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, actual);
    }

    @Test
    void deletePositive() {
        duplicateFilter.setPositive(true);
        List<Integer> actual = duplicateFilter.delete(list);
        List<Integer> expected = List.of(-1, -3);
        assertEquals(expected, actual);
    }

    @Test
    void deleteEven() {
        duplicateFilter.setEvenNumbers(true);
        List<Integer> actual = duplicateFilter.delete(list);
        List<Integer> expected = List.of(-1, -3, 5, 7, 9);
        assertEquals(expected, actual);
    }

    @Test
    void deleteOdd() {
        duplicateFilter.setOddNumbers(true);
        List<Integer> actual = duplicateFilter.delete(list);
        List<Integer> expected = List.of(2, 4, 6, 8);
        assertEquals(expected, actual);
    }

}