package uk.co.willworth.calcengine;

public class Main {

    public static void main(String[] args) {
    double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
    double[] rightVals = { 50.0d, 92.0d, 17.0d, 3.0d};
    char[] opCodes = {'d', 'a', 's', 'm'};
    double[] results = new double[opCodes.length];


//	double val1 = 100.0d;
//    double val2 =50.0d;
//    double result;
//    char opCode='d';
    for (int i = 0; i< opCodes.length; i++) {
        switch (opCodes[i]) {
            case 'a':
                results[i] = leftVals[i] + rightVals[i];
                break;
            case 's':
                results[i] = leftVals[i] - rightVals[i];
                break;
            case 'd':
                results[i] = rightVals[i] != 0.0 ? leftVals[i] / rightVals[i] : 0.0;
                break;
            case 'm':
                results[i] = leftVals[i] * rightVals[i];
                break;
            default:
                System.out.println("Error - invalid opCode");
                results[i] = 0.0d;
                break;

        }

    }
        for(double theResult: results) {
            System.out.print("The result =");
            System.out.println(theResult);
        }

    }
}
//dummy changes for github