package code;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class ResourceUsageTracker {

    public static String analyzePerformance(String initialState,String strategy, boolean visualize) {
        // Start time for CPU and wall-clock time measurement
        long startTimeCPU = getCpuTime();
        long startTimeWallClock = System.nanoTime();

        //run main program
        String answer = WaterSortSearch.solve(initialState, strategy, visualize);

        // End time for CPU and wall-clock time measurement
        long endTimeCPU = getCpuTime();
        long endTimeWallClock = System.nanoTime();

        // Calculate CPU time used (in nanoseconds)
        long cpuTimeUsed = endTimeCPU - startTimeCPU;

        // Calculate wall-clock time used (in nanoseconds)
        long wallClockTimeUsed = endTimeWallClock - startTimeWallClock;

        // Get memory usage after program finishes
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory(); // Total memory in JVM
        long freeMemory = runtime.freeMemory();   // Free memory in JVM
        long usedMemory = totalMemory - freeMemory; // Memory used by the program

        // Calculate CPU utilization as a percentage
        int availableProcessors = runtime.availableProcessors();
        double cpuUtilization = ((double) cpuTimeUsed / wallClockTimeUsed) / availableProcessors * 100;

        // Output CPU utilization and memory usage
        System.out.println("CPU time used (ms): " + (cpuTimeUsed / 1_000_000) + " ms");
        System.out.println("Wall-clock time used (ms): " + (wallClockTimeUsed / 1_000_000) + " ms");
        System.out.println("CPU Utilization: " + String.format("%.2f", cpuUtilization) + " %");
        System.out.println("Memory used (MB): " + (usedMemory / (1024 * 1024)) + " MB");

        return answer;
    }

    // Get CPU time in nanoseconds for the current thread
    private static long getCpuTime() {
        ThreadMXBean bean = ManagementFactory.getThreadMXBean();
        return bean.isCurrentThreadCpuTimeSupported() ? bean.getCurrentThreadCpuTime() : 0L;
    }


}

