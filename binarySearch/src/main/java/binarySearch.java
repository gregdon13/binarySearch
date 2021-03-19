public class binarySearch {
    public boolean binSearch(int[] intArr, int intToFind) {
        //loop to keep searching or cut in half
        //check index we land on is greater than or less than intToFind
        //if index is greater, to lower half, dividing by 2
        //if index is less, to upper half, add current to end THEN divide by 2
        //keep checking until finds or way to break out if it doesn't
        //int for beginning, end, the changing one
        //if
        int start = 0;
        int end = intArr.length -1;

        while (start <= end) {
            int middle = (start / 2) + (end / 2);
            //^^^^ to account for MAX INTEGER as end
            if (intToFind == intArr[middle]) {
                return true;
            } else if (intToFind > intArr[middle]) {
                    start = middle + 1;
            } else {
                //catches less than
                    end = middle - 1;
            }

        }
        return false;
    }
}
