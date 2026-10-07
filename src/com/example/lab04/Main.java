package com.example.lab04;

import com.example.lab04.service.StreamTasks;

import java.util.List;
import java.util.NoSuchElementException;

public class Main
{
    public static void main(String[] args)
    {
        StreamTasks tasks = new StreamTasks();

        System.out.println("среднее: " + tasks.average(List.of(1, 2, 3, 4)));
        System.out.println("префикс: " + tasks.addPrefix(List.of("abc", "xyz")));
        System.out.println("уникальные квадраты: " + tasks.uniqueSquares(List.of(1, 2, 2, 3, 4, 4)));
        System.out.println("последний элемент: " + tasks.last(List.of("a", "b", "c")));
        System.out.println("сумма четных: " + tasks.sumEven(new int[] {1111111, 24, 31, 40}));
        System.out.println("map: " + tasks.toMap(List.of("дерево", "дом", "небо")));

        try
        {
            tasks.last(List.of());
        }
        catch (NoSuchElementException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
