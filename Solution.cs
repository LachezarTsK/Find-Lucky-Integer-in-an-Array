
using System;

public class Solution
{
    private static readonly int NOT_FOUND = -1;
    private static readonly int[] RANGE_OF_VALUES = { 1, 500 };

    public int FindLucky(int[] input)
    {
        int[] frequency = new int[RANGE_OF_VALUES[1] + 1];
        foreach (int value in input)
        {
            ++frequency[value];
        }

        int maxLuckyInteger = NOT_FOUND;
        foreach (int value in input)
        {
            if (value == frequency[value] && maxLuckyInteger < value)
            {
                maxLuckyInteger = value;
            }
        }

        return maxLuckyInteger;
    }
}
