
public class Solution {

    private static final int NOT_FOUND = -1;
    private static final int[] RANGE_OF_VALUES = {1, 500};

    public int findLucky(int[] input) {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        for (int value : input) {
            ++frequency[value];
        }

        int maxLuckyInteger = NOT_FOUND;
        for (int value : input) {
            if (value == frequency[value] && maxLuckyInteger < value) {
                maxLuckyInteger = value;
            }
        }

        return maxLuckyInteger;
    }
}
