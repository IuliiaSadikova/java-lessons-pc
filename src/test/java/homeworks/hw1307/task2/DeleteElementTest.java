package homeworks.hw1307.task2;

import homeworks.hw1307.task1.CommonElements;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class DeleteElementTest {

    @Test
    void shouldRemoveDuplicates() {
        int[] array = {0, 3, -2, 4, 3, 2};

        Integer[] actual = DeleteElement.deleteElem(array);

        Integer[] expected = {0, 3, -2, 4, 2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> DeleteElement.deleteElem(null));
    }
}