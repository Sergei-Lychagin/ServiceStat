package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

        int inputValues[] = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, salesAmount', 180", 
                        "'registered user, salesAmount', 15"}, delimiter = ',')
        void salesAmount(String test, long expected) {
                StatsService service = new StatsService();
                int actual = service.salesAmount(inputValues);
                // long expected = 180;
                assertEquals(expected, actual);
        }

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, averageSalesAmount', 15",
                         "'registered user, averageSalesAmount', 7" }, delimiter = ',')
        void averageSalesAmount(String test, long expected) {
                StatsService service = new StatsService();
                // long expected = 15;
                int actual = service.averageSalesAmount(inputValues);
                assertEquals(expected, actual);
        }

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, picMonthNumber', 7", 
                        "'registered user, picMonthNumber', 8"}, delimiter = ',')
        void picMonthNumber(String test, long expected) {
                StatsService service = new StatsService();
                // long expected = 7;
                int actual = service.picMonthNumber(inputValues);
                assertEquals(expected, actual);
        }

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, minMonthNumber', 8", 
                        "'registered user, minMonthNumber', 7"}, delimiter = ',')
        void minMonthNumber(String test, long expected) {
                StatsService service = new StatsService();
                // long expected = 8;
                int actual = service.minMonthNumber(inputValues);
                assertEquals(expected, actual);
        }

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, ofMonthsBelowAverage', 5",
                        "'registered user, ofMonthsBelowAverage', 6" }, delimiter = ',')
        void ofMonthsBelowAverage(String test, long expected) {
                StatsService service = new StatsService();
                // long expected = 5;
                int actual = service.ofMonthsBelowAverage(inputValues);
                assertEquals(expected, actual);
        }

        // @org.junit.jupiter.api.Test
        @ParameterizedTest
        @CsvSource(value = {

                        "'registered user, ofMonthsAboveAverage', 5",
                        "'registered user, ofMonthsAboveAverage', 6" }, delimiter = ',')
        void ofMonthsAboveAverage(String test, long expected) {
                StatsService service = new StatsService();
                // long expected = 5;
                int actual = service.ofMonthsAboveAverage(inputValues);
                assertEquals(expected, actual);
        }
}