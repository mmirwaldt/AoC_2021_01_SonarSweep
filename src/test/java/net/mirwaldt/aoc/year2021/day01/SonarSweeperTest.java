package net.mirwaldt.aoc.year2021.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonarSweeperTest {
    @Test
    void givenAnEmptyList_whenCountIncreases_thenReturn0() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of()));
    }

    @Test
    void givenOneElement_whenCountIncreases_thenReturn0() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200)));
    }

    @Test
    void givenTwoEqualElements_whenCountIncreases_thenReturn0() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200, 200)));
    }

    @Test
    void givenTwoDecreasingElements_whenCountIncreases_thenReturn0() {
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        assertEquals(0, sonarSweeper.countIncreases(List.of(200, 190)));
    }
}