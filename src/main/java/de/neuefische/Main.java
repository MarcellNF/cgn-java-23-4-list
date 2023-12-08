package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(31);
        numbers.add(40);
        numbers.addAll(List.of(1, 2, 4, 5, 5,6));
        System.out.println(numbers);
        System.out.println(numbers.get(0));
        List<Integer> filteredNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println(filteredNumbers);
        List<Integer> filteredNumbers2 = new ArrayList<>();
        for(Integer n : numbers){
            if(n % 2 == 0){
                filteredNumbers2.add(n);
            }
        }
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get((i)));
        }
        //System.out.println(filteredNumbers2);
        numbers.remove(0);
        //System.out.println(numbers);
    }
}