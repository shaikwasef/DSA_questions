// 1509. Minimum Difference Between Largest and Smallest Value in Three Moves
var minDifference = function (nums) {
  let n = nums.length;
  let i = n - 1;
  let min = Number.MAX_SAFE_INTEGER;

  nums.sort(function (a, b) {
    return a > b ? 1 : -1;
  });
  if (n <= 4) {
    return 0;
  }
  while (i >= 0) {
    let j = i - n + 4;
    if (j < 0) {
      break;
    }

    let curr = nums[i] - nums[j];
    min = Math.min(min, curr);
    i--;
  }

  return min;
};
