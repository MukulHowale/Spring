package com.masai.springintroduction.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl {

    @Autowired
    private SortAlgorithm sortAlgorithm;

//    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int key){

        System.out.println(sortAlgorithm);

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        // Apply Binary Search
        return 3;
    }
}
