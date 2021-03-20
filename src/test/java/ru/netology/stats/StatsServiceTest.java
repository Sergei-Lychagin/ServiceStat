package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    int inputValues[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    @org.junit.jupiter.api.Test
    void salesAmount() {
        StatsService service = new StatsService();
        int actual = service.salesAmount(inputValues);
        long expected = 180;
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void averageSalesAmount() {
        StatsService service = new StatsService();
        long expected = 15;
        int actual = service.averageSalesAmount(inputValues);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void picMonthNumber() {
        StatsService service = new StatsService();
        long expected = 7;
        int actual = service.picMonthNumber(inputValues);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void minMonthNumber() {
        StatsService service = new StatsService();
        long expected = 8;
        int actual = service.minMonthNumber(inputValues);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ofMonthsBelowAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        int actual = service.ofMonthsBelowAverage(inputValues);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void ofMonthsAboveAverage() {
        StatsService service = new StatsService();
        long expected = 5;
        int actual = service.ofMonthsAboveAverage(inputValues);
        assertEquals(expected, actual);
    }
}