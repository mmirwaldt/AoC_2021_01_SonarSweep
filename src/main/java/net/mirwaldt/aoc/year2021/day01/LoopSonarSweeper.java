package net.mirwaldt.aoc.year2021.day01;

import java.util.List;

public class LoopSonarSweeper implements SonarSweeper {
    @Override
    public int countIncreases(List<Integer> depths) {
        if (depths.size() == 2) {
            return (depths.get(0) < depths.get(1)) ? 1 : 0;
        } else {
            return 0;
        }
    }
}
