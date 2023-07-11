package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(250, 350),
    INTERMEDIATE(200, 250),
    ADVANCED(120, 180);

    private final int minTime;
    private final int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int marathonTime) {
        for (Runner runner : Runner.values()) {
            if (marathonTime >= runner.minTime && marathonTime <= runner.maxTime) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Invalid marathon time: " + marathonTime);
    }
}
