package homeworks.hw1307.task1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CommonElementsTest {

    @Test
    void shouldReturnCommonElements() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        Set<Integer> actual = CommonElements.commonElem(array1, array2);

        Set<Integer> expected = Set.of(1, 7);
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotReturnCommonElements() {
        int[] array1 = {1, 2, 5, 5, 8, 9, -7, 10};
        int[] array2 = {-1, 0, 6, 15, 6, 4, 7, 0};

        Set<Integer> actual = CommonElements.commonElem(array1, array2);

        Set<Integer> expected = Set.of();
        assertEquals(expected, actual);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenArray1IsNull() {
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};

        assertThrows(IllegalArgumentException.class, () -> CommonElements.commonElem(null, array2));
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenArray2IsNull() {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};

        assertThrows(IllegalArgumentException.class, () -> CommonElements.commonElem(array1, null));
    }
}