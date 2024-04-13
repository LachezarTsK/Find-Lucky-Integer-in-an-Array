
#include <array>
#include <vector>
using namespace std;

class Solution {

    static const int NOT_FOUND = -1;
    static constexpr  array<int, 2> RANGE_OF_VALUES = { 1, 500 };

public:
    int findLucky(const vector<int>& input) const {

        array<int, RANGE_OF_VALUES[1] + 1> frequency{};
        for (const auto& value : input) {
            ++frequency[value];
        }

        int maxLuckyInteger = NOT_FOUND;
        for (const auto& value : input) {
            if (value == frequency[value] && maxLuckyInteger < value) {
                maxLuckyInteger = value;
            }
        }

        return maxLuckyInteger;
    }
};
