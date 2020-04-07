package com.khpi.economic.service.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CocomoServiceImplTest {

    public static final double EXPECTED_LABOR_INPUT = 1375.567;
    public static final double EXPECTED_DURATION_PRODUCTION = 31.362;
    public static final int SIZE_PROJECT = 200;

    private CocomoServiceImpl cocomoService = new CocomoServiceImpl();

    @Test
    public void shouldCalculateLaborInputMethodCalculateCorrectly() {
        final double[] coefMArray = {0.83, 0.95, 0.87, 1.26, 1.12, 1.10, 1.14};
        double actualLaborInput = cocomoService.calculateLaborInput(SIZE_PROJECT, 3.0, 1.12, coefMArray);

        assertEquals(EXPECTED_LABOR_INPUT, actualLaborInput, 0.01);
    }

    @Test
    public void shouldCalculateDurationProductionMethodCalculateCorrectly() {
        double actualDurationProduction = cocomoService.calculateDurationProduction(EXPECTED_LABOR_INPUT, 2.5, 0.35);

        assertEquals(EXPECTED_DURATION_PRODUCTION, actualDurationProduction, 0.01);
    }

    @Test
    public void shouldCalculateAverageNumberSpecialistsMethodCalculateCorrectly() {
        double actualAverageNumberSpecialists = cocomoService.calculateAverageNumberSpecialists(EXPECTED_LABOR_INPUT, EXPECTED_DURATION_PRODUCTION);

        assertEquals(43.86, actualAverageNumberSpecialists, 0.01);
    }

    @Test
    public void shouldCalculateAverageProductivitySpecialistsMethodCalculateCorrectly() {
        double actualAverageProductivitySpecialists = cocomoService.calculateAverageProductivitySpecialists(SIZE_PROJECT, EXPECTED_LABOR_INPUT);

        assertEquals(0.1453, actualAverageProductivitySpecialists, 0.01);
    }

}