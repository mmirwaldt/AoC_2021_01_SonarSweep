package net.mirwaldt.aoc.year2021.day01;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThreeWindowSumSonarSweeperTest {
    @Test
    void givenSampleFromPuzzle_whenCountIncreases_thenReturnSeven() {
        SonarSweeper sonarSweeper = new ThreeWindowSumLoopSonarSweeper();
        assertEquals(5, sonarSweeper.countIncreases(List.of(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)));
    }
}
