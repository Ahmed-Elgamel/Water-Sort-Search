package code;

import javax.swing.table.TableRowSorter;

public class Main {


    public static String createTestCaseForComparison(){
        int bottleCapicity = (int) 10;
        int numberOfBottles = 3;
        StringBuilder sb =new StringBuilder(numberOfBottles+";"+bottleCapicity+";");
        for(int i=0;i<bottleCapicity;i++){
            sb.append("b");
            if(i+1<bottleCapicity)
                sb.append(',');
            else
                sb.append(";");
        }
        for(int i=0;i<bottleCapicity;i++){
            sb.append("e");
            if(i+1<bottleCapicity)
                sb.append(',');
            else
                sb.append(";");
        }

        for(int i=0;i<bottleCapicity-2;i++){
            sb.append("e");
            if(i+1<bottleCapicity)
                sb.append(',');
            else
                sb.append(";");
        }
        sb.append("r,g;");


        return sb.toString();

    }


    // Example test cases using strings
    public static void runMyTestCases() {
        // Test Case 1: Simple Separation
//        StringBuilder testCase1Input = new StringBuilder("3;3;r,g,b;e,e,e;e,e,e");
//        StringBuilder reverseSubstring = new StringBuilder( testCase1Input.substring(4, testCase1Input.length())).reverse() ;
//        testCase1Input.replace(4,testCase1Input.length(),reverseSubstring.toString());
//
//        System.out.println("Test Case 1:");
//        System.out.println("Input: " + testCase1Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase1Input.toString(), "DF", true));
//        System.out.println();

//
////        // Test Case 2: Already Separated
//        StringBuilder testCase2Input = new StringBuilder("3;3;r,e,e;g,e,e;b,e,e");
//        System.out.println("Test Case 2:");
//        System.out.println("Input: " + testCase2Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase2Input.toString(), "BF", false));
//        System.out.println();
////
////        // Test Case 3: Impossible Separation
//        StringBuilder testCase3Input = new StringBuilder("2;2;r,b;b,r");
//        System.out.println("Test Case 3:");
//        System.out.println("Input: " + testCase3Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase3Input.toString(), "BF", false));
//        System.out.println();
////
////        // Test Case 4: Multiple Empty Bottles
//        StringBuilder testCase4Input = new StringBuilder("4;3;r,g,b;r,g,e;b,e,e;e,e,e");
//        System.out.println("Test Case 4:");
//        System.out.println("Input: " + testCase4Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase4Input.toString(), "BF", false));
//        System.out.println();
////
////        // Test Case 5: Larger Capacity
//        StringBuilder testCase5Input = new StringBuilder("4;4;r,r,b,y;r,y,e,e;b,y,e,e;e,e,e,e");
//        System.out.println("Test Case 5:");
//        StringBuilder reverseSubstring = new StringBuilder( testCase5Input.substring(4, testCase5Input.length())).reverse() ;
//        testCase5Input.replace(4,testCase5Input.length(),reverseSubstring.toString());
//
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase5Input.toString(), "GR2", false));
//        System.out.println();
////
////        // Test Case 6: Complex Separation unsolvalbel i think
//        StringBuilder testCase6Input = new StringBuilder("4;4;r,b,g,y;b,r,g,e;y,b,e,e;e,e,e,e");
//        System.out.println("Test Case 6:");
//        System.out.println("Input: " + testCase6Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase6Input.toString(), "BF", false));
//        System.out.println();
////
////        // Test Case 7: Complex Separation
//        StringBuilder testCase7Input = new StringBuilder("4;4;r,b,g,y;e,e,e,e;e,e,e,e;e,e,e,e");
//        System.out.println("Test Case 7:");
//        StringBuilder reverseSubstring = new StringBuilder( testCase7Input.substring(4, testCase7Input.length())).reverse() ;
//        testCase7Input.replace(4,testCase7Input.length(),reverseSubstring.toString());
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase7Input.toString(), "BF", false));
//        System.out.println();
//
//        // Test Case 8: Complex Separation
        StringBuilder testCase8Input = new StringBuilder("4;4;y,r,e,e;y,r,e,e;o,r,e,e;g,r,e,e");
        System.out.println("Test Case 8:");
        StringBuilder reverseSubstring = new StringBuilder( testCase8Input.substring(4, testCase8Input.length())).reverse() ;
        testCase8Input.replace(4,testCase8Input.length(),reverseSubstring.toString());
        System.out.println(testCase8Input);
//        System.out.println("Our algorithm answer: " + WaterSortSearch.solve(testCase8Input.toString(), "GR1", true));
        System.out.println();
//
////
//        // Test Case 9: Complex Separation
        StringBuilder testCase9Input = new StringBuilder("5;4;" +"b,y,r,b;" + "b,y,r,r;" +"y,r,b,y;" + "e,e,e,e;" + "e,e,e,e");
        System.out.println("Test Case 9:");
        System.out.println("Input: " + testCase9Input);
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "DF", false) );
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "BF", false) );
//
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "ID", false) );
//
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "UC", false) );
//
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "GR1", false) );
//
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "GR2", false) );
        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "AS1", false) );
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance( testCase9Input.toString(), "AS2", false) );

        System.out.println();
////
//
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance(testCase9Input.toString(), "AS1", false));
//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance(testCase9Input.toString(), "GR1", true));


//        System.out.println("Our algorithm answer: " + ResourceUsageTracker.analyzePerformance("5;4;b,y,r,b;b,y,r,r;y,r,b,y;e,e,e,e;e,e,e,e;", "UC", true));




    }

    public static void main(String[] args) {
        runMyTestCases();
    }




}