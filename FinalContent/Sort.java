package FinalContent;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import FinalContent.DataGeneration.RandomArrPop;
import FinalContent.sortAlgs.*;

public class Sort {
    public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {

        RandomArrPop randArr = new RandomArrPop();
        int[] arrSizes = {10, 100, 1000, 10000, 50000, 100000, 500000};
        
        // create csv
        for (int size : arrSizes) {
            int[] unsortedArr = randArr.randIntArr(size);

            double bubbleTime = testAlg(Bubble.class, unsortedArr);

            // update csv
        }

        // download csv
    }

    public static double testAlg(Class<?> sortName, int[] arr) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        double start, end;
        start = System.nanoTime();
        sortName.getDeclaredMethod(sortName.getSimpleName(), int[].class).invoke(null, arr);
        end = System.nanoTime();
        return (end - start);
    }
}
