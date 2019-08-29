public class finder {
    public static Integer findMax(int[] intArray) {
        if(intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            int maxOfArray = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] > maxOfArray) {
                    maxOfArray = intArray[i];
                }
            }
            return maxOfArray;
        }
    }

    public static Integer findMin(int[] intArray) {
        if(intArray == null || intArray.length == 0) {
            return null;
        }
        else {
            int minOfArray = intArray[0];

            for (int i = 0; i < intArray.length; i++) {
                if (intArray[i] < minOfArray) {
                    minOfArray = intArray[i];
                }
            }
            return minOfArray;
        }
    }
}
