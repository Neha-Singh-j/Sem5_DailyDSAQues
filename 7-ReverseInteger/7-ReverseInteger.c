// Last updated: 8/1/2025, 10:43:05 PM
// int reverse(int x){

// #include <limits.h>

int reverse(int x) {
    int result = 0;

    while (x != 0) {
        int digit = x % 10;

        // Check for overflow
        if (result > INT_MAX / 10 || (result == INT_MAX / 10 && digit > 7)) return 0;
        if (result < INT_MIN / 10 || (result == INT_MIN / 10 && digit < -8)) return 0;

        result = result * 10 + digit;
        x /= 10;
    }

    return result;
}
