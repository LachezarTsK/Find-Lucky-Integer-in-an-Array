
/**
 * @param {number[]} input
 * @return {number}
 */
var findLucky = function (input) {
    const NOT_FOUND = -1;
    const RANGE_OF_VALUES = [1, 500];

    const frequency = new Array(RANGE_OF_VALUES[1] + 1).fill(0);
    for (let value of input) {
        ++frequency[value];
    }

    let maxLuckyInteger = NOT_FOUND;
    for (let value of input) {
        if (value === frequency[value] && maxLuckyInteger < value) {
            maxLuckyInteger = value;
        }
    }

    return maxLuckyInteger;
};
