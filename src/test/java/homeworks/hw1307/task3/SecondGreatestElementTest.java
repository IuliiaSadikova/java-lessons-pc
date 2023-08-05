package homeworks.hw1307.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondGreatestElementTest {

    @Test
    void shouldFindSecondGreatestElement() {
        int[] array = {-1, 4, 0, 2, 7, -3};

        Integer actual = SecondGreatestElement.secondGreatestValue(array);

        Integer expected = 4;

        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> SecondGreatestElement.secondGreatestValue(null));
    }
}