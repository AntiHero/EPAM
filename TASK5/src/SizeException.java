
public class SizeException {
    public static void handleRuntimeException() {
        try {
            ProgramTester.maxElementTest();
            ProgramTester.minElementTest();
            ProgramTester.findArithmTest();
            ProgramTester.findGeomTest();
            ProgramTester.isSortedAscTest();
            ProgramTester.isSortedDescTest();
            ProgramTester.isLocalMinimumTest();
            ProgramTester.isLocalMaximumTest();
            ProgramTester.makeReverseTest();
        } catch (NullPointerException e) {
            System.out.println("\nArray is not properly initialized!");
        } catch (NegativeArraySizeException e) {
            System.out.println("\nNEGATIVE SIZE!");
        }
    }
}
