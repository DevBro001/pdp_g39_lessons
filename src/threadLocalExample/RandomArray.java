package src.threadLocalExample;

import java.util.HashSet;
import java.util.Random;

public class RandomArray {

    HashSet<Random> set= new HashSet<>();
    ThreadLocal<Random> randomThreadLocal = new ThreadLocal<>(){
        @Override
        protected Random initialValue() {
            return new Random();
        }
    };
    public void fillArray(int[] arr, int a, int b){
        Random random = randomThreadLocal.get();
        set.add(random);
    }

}
