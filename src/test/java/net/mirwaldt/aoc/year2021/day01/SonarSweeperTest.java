package net.mirwaldt.aoc.year2021.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonarSweeperTest {
    @Test
    void givenAnEmptyList_whenCountIncreases_thenReturnZero() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of()));
    }

    @Test
    void givenOneElement_whenCountIncreases_thenReturnZero() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200)));
    }

    @Test
    void givenNoIncrease_whenCountIncreases_thenReturnZero() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200, 200)));
    }

    @Test
    void givenOneDecrease_whenCountIncreases_thenReturnZero() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200, 190)));
    }

    @Test
    void givenOneIncrease_whenCountIncreases_thenReturnOne() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(1, sonarSweeper.countIncreases(List.of(200, 210)));
    }

    @Test
    void givenTwoDecreases_whenCountIncreases_thenReturnZero() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200, 190, 188)));
    }

    @Test
    void givenTwoIncreases_whenCountIncreases_thenReturnTwo() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(2, sonarSweeper.countIncreases(List.of(188, 190, 200)));
    }

    @Test
    void givenSampleFromPuzzle_whenCountIncreases_thenReturnSeven() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(7, sonarSweeper.countIncreases(List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)));
    }
}