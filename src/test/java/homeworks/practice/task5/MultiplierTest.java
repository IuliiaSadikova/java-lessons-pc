package homeworks.practice.task5;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MultiplierTest {

    private final List<Integer> list = List.of(1, 2, 3);

    @Test
    void shouldMultiply() {
        List<Integer> expected = List.of(3, 6, 9);
        List<Integer> actual = Multiplier.multiply(list, 3);
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowException() {
        assertThrowsExactly(IllegalArgumentException.class, () -> Multiplier.multiply(null, 2));
    }

}