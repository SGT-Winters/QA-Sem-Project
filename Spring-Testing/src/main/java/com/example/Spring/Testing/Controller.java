package com.example.Spring.Testing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;


@RestController
public class Controller {

    @PostMapping("/sort-numbers")
    public int[] sortNumbers(@RequestBody int[] numbers) {
        Arrays.sort(numbers); // Sort the array
        return numbers; // Return the sorted array
    }

}