package stream_api;

import java.util.Arrays;
import java.util.List;

public class SomarNumerosPares {

    public static void main(String[] args) {
        
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // System.out.println(numeros.stream()
        // .filter(n -> (n % 2 == 0))
        // .reduce(0, (n1, n2) -> n1 + n2));

        int somaDosNumerosPares = numeros.stream()
        .filter(n -> n % 2 == 0)
        .mapToInt(Integer::intValue)
        .sum();

        System.out.println("Pegue apenas os números pares e some: " + somaDosNumerosPares);
    

    }

}
