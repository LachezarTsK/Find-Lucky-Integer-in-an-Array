
class Solution {

    companion object {
        const val NOT_FOUND = -1;
        val RANGE_OF_VALUES = intArrayOf(1, 500);
    }

    fun findLucky(input: IntArray): Int {
        val frequency = IntArray(RANGE_OF_VALUES[1] + 1)
        for (value in input) {
            ++frequency[value];
        }

        var maxLuckyInteger = NOT_FOUND;
        for (value in input) {
            if (value == frequency[value] && maxLuckyInteger < value) {
                maxLuckyInteger = value;
            }
        }

        return maxLuckyInteger;
    }
}
