import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ArrayAverage {

    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        Integer[][] twoDimArray = new Integer[N][N];

        Random rnd = new Random(System.currentTimeMillis());
        for (Integer[] array : twoDimArray) {
            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(90) + 10;
            }
        }

        Integer[] array = merge(Integer.class, twoDimArray);
        double average = average(array);


    }

    public static  <T> T [] merge (Class<T> clazz, T [][] twoDimensionArray) {
        List<T> list = new ArrayList<T>();
        for (T[] array : twoDimensionArray) {
            list.addAll(Arrays.asList(array));
        }

        return list.toArray((T[]) Array.newInstance(clazz, list.size()));
    }

    public static <T extends Number> double average(T [] array) {
        if (array.length == 0) {
            return Double.NaN;
        }

        double result = 0;
        for (T t : array) {
            result += t.doubleValue() / array.length;
        }
        return result;
    }
}
