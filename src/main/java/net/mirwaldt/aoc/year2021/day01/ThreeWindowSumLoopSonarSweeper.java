package net.mirwaldt.aoc.year2021.day01;

import java.util.List;

public class ThreeWindowSumLoopSonarSweeper implements SonarSweeper{
    @Override
    public int countIncreases(List<Integer> depths) {
        if (4 <= depths.size()) {
            int count = 0;
            for (int i = 3; i < depths.size(); i++) {
                int leftSum = depths.get(i - 3) + depths.get(i - 2) + depths.get(i - 1);
                int rightSum = depths.get(i - 2) + depths.get(i - 1) + depths.get(i);
                if(leftSum < rightSum) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}
