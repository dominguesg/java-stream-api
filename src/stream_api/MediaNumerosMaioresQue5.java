package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MediaNumerosMaioresQue5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println("A média dos valores maiores que 5 é: ");
        // List<Integer> numerosMaioresQue5 = numeros.stream()
        //         .filter(n -> n > 5)
        //         .collect(Collectors.toList());

                numeros.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList())
                .stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
