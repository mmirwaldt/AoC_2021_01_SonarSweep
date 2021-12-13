package net.mirwaldt.aoc.year2021.day01;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        // part one
        final List<String> lines = Files.readAllLines(Path.of("input"), StandardCharsets.US_ASCII);
        List<Integer> depths = lines.stream().map(Integer::parseInt).collect(Collectors.toList());
        SonarSweeper sonarSweeper = new LoopSonarSweeper();
        System.out.println(sonarSweeper.countIncreases(depths)); // result: 1665

        // part two
        SonarSweeper threeWindowSumSonarSweeper = new ThreeWindowSumLoopSonarSweeper();
        System.out.println(threeWindowSumSonarSweeper.countIncreases(depths)); // result: 1702
    }
}
