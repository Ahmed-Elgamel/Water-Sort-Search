public class Main {



    // Example test cases using strings
    public static void runMyTestCases() {
        // Test Case 1: Simple Separation
        String testCase1Input = "3;3;r,g,b;e,e,e;e,e,e";
        String testCase1Output = "r,e,e;e,g,e;e,b,e";
        System.out.println("Test Case 1:");
        System.out.println("Input: " + testCase1Input);
        System.out.println("Expected Output: " + testCase1Output);
        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase1Input,"BF",false));
        System.out.println();

        // Test Case 2: Already Separated
        String testCase2Input = "3;3;r,e,e;g,e,e;b,e,e";
        String testCase2Output = "r,e,e;g,e,e;b,e,e";
        System.out.println("Test Case 2:");
        System.out.println("Input: " + testCase2Input);
        System.out.println("Expected Output: " + testCase2Output);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase2Input,"BF",false));
        System.out.println();

        // Test Case 3: Impossible Separation
        String testCase3Input = "2;2;r,b;b,r";
        String testCase3Output = "None";  // No valid solution exists
        System.out.println("Test Case 3:");
        System.out.println("Input: " + testCase3Input);
        System.out.println("Expected Output: " + testCase3Output);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase3Input,"BF",false));
        System.out.println();

        // Test Case 4: Multiple Empty Bottles
        String testCase4Input = "4;3;r,g,b;r,g,e;b,e,e;e,e,e";
        String testCase4Output = "r,e,e;g,e,e;b,e,e;e,e,e";
        System.out.println("Test Case 4:");
        System.out.println("Input: " + testCase4Input);
        System.out.println("Expected Output: " + testCase4Output);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase4Input,"BF",false));
        System.out.println();

        // Test Case 5: Larger Capacity
        String testCase5Input = "4;4;r,g,b,y;r,g,e,e;b,y,e,e;e,e,e,e";
        String testCase5Output = "r,e,e,e;g,e,e,e;b,e,e,e;y,e,e,e";
        System.out.println("Test Case 5:");
        System.out.println("Input: " + testCase5Input);
        System.out.println("Expected Output: " + testCase5Output);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase1Input,"BF",false));
        System.out.println();

        // Test Case 6: Complex Separation
        String testCase6Input = "4;4;r,b,g,y;b,r,g,e;y,b,e,e;e,e,e,e";
        String testCase6Output = "r,e,e,e;b,e,e,e;y,e,e,e;g,e,e,e";
        System.out.println("Test Case 6:");
        System.out.println("Input: " + testCase6Input);
        System.out.println("Expected Output: " + testCase6Output);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase1Input,"BF",false));
        System.out.println();
    }

    public static void main(String[] args) {
        runMyTestCases();
    }




}