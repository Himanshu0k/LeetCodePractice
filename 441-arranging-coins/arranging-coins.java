class Solution {
    public int arrangeCoins(int n) {
        return (int) ((-1 + Math.sqrt(1 + 8.0 * n)) / 2);
    }
}

// class Solution {
//     public int arrangeCoins(int n) {
//         int row = 1;

//         while (n >= row) {
//             n -= row;
//             row++;
//         }

//         return row - 1;
//     }
// }