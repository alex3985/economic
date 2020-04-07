package com.khpi.economic.service;

/**
 * This interface has methods of the essential metrics of the COnstructive COst MOdel.
 *
 */
public interface CocomoService {

    /**
     * This method calculate a labor input of a project.
     *
     * @param sizeProject - KLOC of a project
     * @param coefA - a coefficient A
     * @param coefE - a coefficient E
     * @param coefMArray - an array of coefficients of change in the complexity of production
     * @return a labor input of a project.
     */
    double calculateLaborInput(int sizeProject, double coefA, double coefE, double[] coefMArray);

    /**
     * This method calculate a duration of production.
     *
     * @param laborInput - a labor input of a project
     * @param coefG - a coefficient G
     * @param coefH - a coefficient H
     * @return a duration of production.
     */
    double calculateDurationProduction(double laborInput, double coefG, double coefH);

    /**
     * This method calculate an average number of specialists.
     *
     * @param laborInput - a labor input of a project
     * @param durationProduction - a duration of production
     * @return an average number of specialists.
     */
    double calculateAverageNumberSpecialists(double laborInput, double durationProduction);

    /**
     * this method calculate an average productivity of specialists.
     *
     * @param sizeProject - KLOC of a project
     * @param laborInput - a labor input of a project
     * @return an average productivity of specialists.
     */
    double calculateAverageProductivitySpecialists(int sizeProject, double laborInput);
}
