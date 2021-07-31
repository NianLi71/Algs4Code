package com.linian.algs4.chp1;


import lombok.Data;

@Data
public class Node<T> {
    private T value;
    private Node<T> next;
}
