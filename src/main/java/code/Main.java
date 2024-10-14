package code;

public class Main {



    // Example test cases using strings
    public static void runMyTestCases() {
        // Test Case 1: Simple Separation
        String testCase1Input = "3;3;r,g,b;e,e,e;e,e,e";
        System.out.println("Test Case 1:");
        System.out.println("Input: " + testCase1Input);
        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase1Input, "ID", true));
        System.out.println();

//        // Test Case 2: Already Separated
//        String testCase2Input = "3;3;r,e,e;g,e,e;b,e,e";
//        System.out.println("Test Case 2:");
//        System.out.println("Input: " + testCase2Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase2Input, "BF", false));
//        System.out.println();
//
//        // Test Case 3: Impossible Separation
//        String testCase3Input = "2;2;r,b;b,r";
//        System.out.println("Test Case 3:");
//        System.out.println("Input: " + testCase3Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase3Input, "BF", false));
//        System.out.println();
//
//        // Test Case 4: Multiple Empty Bottles
//        String testCase4Input = "4;3;r,g,b;r,g,e;b,e,e;e,e,e";
//        System.out.println("Test Case 4:");
//        System.out.println("Input: " + testCase4Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase4Input, "BF", false));
//        System.out.println();
//
//        // Test Case 5: Larger Capacity
//        String testCase5Input = "4;4;r,r,b,y;r,y,e,e;b,y,e,e;e,e,e,e";
//        System.out.println("Test Case 5:");
//        System.out.println("Input: " + testCase5Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase5Input, "BF", false));
//        System.out.println();
//
//        // Test Case 6: Complex Separation unsolvalbel i think
//        String testCase6Input = "4;4;r,b,g,y;b,r,g,e;y,b,e,e;e,e,e,e";
//        System.out.println("Test Case 6:");
//        System.out.println("Input: " + testCase6Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase6Input, "BF", false));
//        System.out.println();
//
//        // Test Case 7: Complex Separation
//        String testCase7Input = "4;4;r,b,g,y;e,e,e,e;e,e,e,e;e,e,e,e";
//        System.out.println("Test Case 7:");
//        System.out.println("Input: " + testCase7Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase7Input, "BF", false));
//        System.out.println();
//
        // Test Case 8: Complex Separation
        String testCase8Input = "4;4;y,r,e,e;y,r,e,e;o,r,e,e;g,r,e,e";
        System.out.println("Test Case 8:");
        System.out.println("Input: " + testCase8Input);
        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase8Input, "ID", true));
        System.out.println();

//
//        // Test Case 9: Complex Separation
//        String testCase9Input = "5;4;" +"b,y,r,b;" + "b,y,r,r;" +"y,r,b,y;" + "e,e,e,e;" + "e,e,e,e";
//        System.out.println("Test Case 9:");
//        System.out.println("Input: " + testCase8Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase9Input, "AS2", true));
//        System.out.println();
//






    }

    public static void main(String[] args) {
        runMyTestCases();
    }




}