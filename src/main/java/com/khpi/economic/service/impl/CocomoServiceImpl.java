package com.khpi.economic.service.impl;

import com.khpi.economic.service.CocomoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class CocomoServiceImpl implements CocomoService {

    @Override
    public double calculateLaborInput(int sizeProject, double coefA, double coefE, double[] coefMArray) {
        return coefA * Math.pow(sizeProject, coefE) * Arrays.stream(coefMArray)
                .reduce((current, next) -> current * next)
                .orElse(0);
    }

    @Override
    public double calculateDurationProduction(double laborInput, double coefG, double coefH) {
        return coefG * Math.pow(laborInput, coefH);
    }

    @Override
    public double calculateAverageNumberSpecialists(double laborInput, double durationProduction) {
        return laborInput / durationProduction;
    }

    @Override
    public double calculateAverageProductivitySpecialists(int sizeProject, double laborInput) {
        return sizeProject / laborInput;
    }

}