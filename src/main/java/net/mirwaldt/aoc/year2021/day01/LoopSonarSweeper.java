package net.mirwaldt.aoc.year2021.day01;

import java.util.List;

public class LoopSonarSweeper implements SonarSweeper {
    @Override
    public int countIncreases(List<Integer> depths) {
        if (2 <= depths.size()) {
            int count = 0;
            for (int i = 1; i < depths.size(); i++) {
                int left = depths.get(i - 1);
                int right = depths.get(i);
                if(left < right) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}
