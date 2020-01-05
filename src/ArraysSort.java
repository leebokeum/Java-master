import java.util.*;

public class ArraysSort {

    //역 정렬 comparator 인터페이스 구현
    public static class ReverseNumericalOrder implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }
    public static void main(String[] args) {
        final int[] numbers = {-3, -5, 1, 7, 4, -2};
        final int[] expected = {-5, -3, -2, 1, 4, 7};

        //기본정렬
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));


        final List<Integer> objects = new ArrayList<>();
        for(int i =0; i< 10; i++){
            objects.add(i);
        }

        // 역정렬
        Collections.sort(objects, new ReverseNumericalOrder());
        System.out.println(objects.toString());

    }
}
