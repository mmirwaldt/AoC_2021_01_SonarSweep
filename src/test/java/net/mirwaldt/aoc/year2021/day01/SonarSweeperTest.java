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
}