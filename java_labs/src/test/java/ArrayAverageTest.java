import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


class ArrayAverageTest {

    @Test
    public void testMerge() {
        Integer[][] array = {
                {1, 2, 3, 4},
                {3},
                {5, 7}
        };
        Integer[] merge = ArrayAverage.merge(Integer.class, array);

        Integer[] expected = {1, 2, 3, 4, 3, 5, 7};
        Assert.assertArrayEquals(expected, merge);
    }

    @Test
    public void testAverage() {
        Integer[] array1 = {1, 3, 5, 7};
        assertThat(ArrayAverage.average(array1), closeTo(4, 1e-7));

        Integer[] array2 = {1};
        assertThat(ArrayAverage.average(array2), closeTo(1, 1e-7));

        Integer[] emptyArray = {};
        assertThat(ArrayAverage.average(emptyArray), is(Double.NaN));

        Integer[] overflowCheck = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE - 3};
        assertThat(ArrayAverage.average(overflowCheck), closeTo(Integer.MAX_VALUE - 1, 1e-7));
    }



}