import java.util.Scanner;

public class SciCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operationChoice;
        int menuOption = 0;
        double firstOperand;
        double secondOperand;
        double answer = 0.0;
        double sumOfAllNumbers = 0.0;
        int numberOfCalculations = 0;
        double previousNum = 0.0;
        String numberInput;
        // Variables are declared here.


        while (true) {

            System.out.println("Current Result: " + answer);

            System.out.println("Calculator Menu");
            System.out.println("--------------- ");
            System.out.println("0. Exit Program");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exponentiation");
            System.out.println("6. Logarithm");
            System.out.println("7. Display Average");
            // Results and menu are printed.


            while (menuOption == 0) {

                System.out.print("Enter Menu Selection: ");
                operationChoice = input.nextInt();


                if (operationChoice == 1) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum; }
                    else {
                        secondOperand = Double.parseDouble(numberInput); }
                    // This gets the input for the numbers and checks if "RESULTS" get inputted.
                    // If not, the input gets converted into a double.

                    answer = firstOperand + secondOperand;
                    // This adds the numbers.

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // This updates to help calculate average and breaks while loop.
                else if (operationChoice == 2) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum; }
                    else {
                        secondOperand = Double.parseDouble(numberInput); }

                    answer = firstOperand - secondOperand;

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // Gets inputs, subtracts them, updates to calculate average, and loop breaks.
                else if (operationChoice == 3) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum;
                    } else {
                        secondOperand = Double.parseDouble(numberInput);
                    }

                    answer = firstOperand * secondOperand;

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // Gets inputs, multiplies them, updates for average, and loop breaks.
                else if (operationChoice == 4) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum;
                    } else {
                        secondOperand = Double.parseDouble(numberInput);
                    }

                    answer = firstOperand / secondOperand;

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // Gets inputs, divides them, update for average, and loop breaks.
                else if (operationChoice == 5) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum; }
                    else {
                        secondOperand = Double.parseDouble(numberInput); }

                    answer = Math.pow(firstOperand, secondOperand);

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // Gets input, firstOperand to the power of the secondOperand, updates for average, and loop breaks.
                else if (operationChoice == 6) {
                    System.out.print("Enter first operand: ");
                    firstOperand = input.nextDouble();
                    System.out.print("Enter second operand: ");
                    numberInput = input.next();

                    if (numberInput.equals("RESULT")) {
                        secondOperand = previousNum; }
                    else {
                        secondOperand = Double.parseDouble(numberInput); }

                    answer = Math.log(secondOperand) / Math.log(firstOperand);

                    sumOfAllNumbers += answer;
                    numberOfCalculations += 1;
                    previousNum = answer;
                    break; }
                    // Gets input, log of secondOperand divided by log of firstOperand to get log.
                    // Then  updates for average and loop breaks.
                else if (operationChoice == 7) {
                    if (numberOfCalculations == 0) {
                        System.out.println("Error: No calculations yet to average!"); }
                        // Checks if nothing has been calculated.
                    else {
                        answer = sumOfAllNumbers / numberOfCalculations;
                        // Finds average.

                        System.out.println("Sum of calculations: " + sumOfAllNumbers);
                        System.out.println("Number of calculations: "  + numberOfCalculations);

                        System.out.print("Average of calculations: ");
                        System.out.printf("%.2f", answer);
                        System.out.println();
                        // Prints the data, and rounds average to two decimal places.

                        sumOfAllNumbers += answer;
                        numberOfCalculations += 1;
                        previousNum = answer; } }
                        // Updates for average and gets selections without menu.
                else if (operationChoice == 0) {
                    System.out.println("Thanks for using this calculator. Goodbye!");
                    return; }
                    // Exits the calculator
                else {
                    System.out.println("Error: Invalid selection!"); }
                    // While loop is used to repeat selection if they input a invalid input.
            }
        }
    }
}
