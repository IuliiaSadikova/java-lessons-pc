package homeworks.hw1307.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondSmallestElementTest {

    @Test
    void shouldFindSecondSmallestElement() {
        int[] array = {-1, 4, 0, 2, 7, -3};

        Integer actual = SecondSmallestElement.secondSmallestValue(array);

        Integer expected = -1;

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> SecondSmallestElement.secondSmallestValue(null));
    }
}