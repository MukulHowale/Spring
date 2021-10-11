package com.masai.springintroduction.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SunSortAlgorithm implements SortAlgorithm{

    public int[] sort(int[] numbers){
        //Logic for Bubble Sort
        return numbers;
    }
}
