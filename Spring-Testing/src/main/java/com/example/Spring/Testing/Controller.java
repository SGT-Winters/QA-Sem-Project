package com.example.Spring.Testing;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;


@RestController
public class Controller {

    @PostMapping("/computeSampleDeviation")
    public double computeSampleDeviation(@RequestBody double[] numbers) {
        if (numbers.length < 2) {
            throw new IllegalArgumentException("At least two numbers are required for sample standard deviation.");
        }

        // Compute mean
        double mean = Arrays.stream(numbers).average().orElse(0.0);

        // Compute sum of squared differences from the mean
        double squaredDifferenceSum = Arrays.stream(numbers)
                .map(num -> Math.pow(num - mean, 2))
                .sum();

        // Compute sample standard deviation
        return Math.sqrt(squaredDifferenceSum / (numbers.length - 1));
    }

    @PostMapping("/computePopulationDeviation")
    public double computePopulationStandardDeviation(@RequestBody double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required for population standard deviation.");
        }

        // Compute the mean
        double mean = Arrays.stream(numbers).average().orElse(0.0);

        // Compute sum of squared differences from the mean
        double squaredDifferenceSum = Arrays.stream(numbers)
                .map(num -> Math.pow(num - mean, 2))
                .sum();

        // Compute population standard deviation
        return Math.sqrt(squaredDifferenceSum / numbers.length);
    }

    @PostMapping("/computeMean")
    public double computeMean(@RequestBody double[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number is required to compute the mean.");
        }

        // Compute and return the mean
        return Arrays.stream(numbers).average().orElse(0.0);
    }

}