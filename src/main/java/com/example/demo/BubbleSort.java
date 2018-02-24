package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BubbleSort implements SortingAlgorithm {

    public int[] sort(int[] numbers){
        return numbers;
    }
}
