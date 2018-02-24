package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    private SortingAlgorithm sortingAlgorithm;

    public BinarySearch(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int binarySearch(int[] numbers, int key){
        // sort the array
        int[] sortedNumbers = this.sortingAlgorithm.sort(numbers);
        // search the array
        //return the result
        return 3;
    }
}
