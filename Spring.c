#include <stdio.h>

long long gcd(long long a, long long b) {
    while(b) {
        long long t = b;
        b = a % b;
        a = t;
    }
    return a;
}

long long lcm(long long a, long long b) {
    return (a / gcd(a, b)) * b;
}

int main() {
    int t;
    scanf("%d", &t);

    while(t--) {
        long long a, b, c, m;
        scanf("%lld %lld %lld %lld", &a, &b, &c, &m);

        long long ab = lcm(a, b);
        long long ac = lcm(a, c);
        long long bc = lcm(b, c);
        long long abc = lcm(ab, c);

        long long A = m / a;
        long long B = m / b;
        long long C = m / c;

        long long AB = m / ab;
        long long AC = m / ac;
        long long BC = m / bc;
        long long ABC = m / abc;
      
        long long onlyA = A - AB - AC + ABC;
        long long onlyB = B - AB - BC + ABC;
        long long onlyC = C - AC - BC + ABC;

        long long twoAB = AB - ABC;
        long long twoAC = AC - ABC;
        long long twoBC = BC - ABC;

        long long three = ABC;

        long long alice = onlyA * 6 + (twoAB + twoAC) * 3 + three * 2;
        long long bob   = onlyB * 6 + (twoAB + twoBC) * 3 + three * 2;
        long long carol = onlyC * 6 + (twoAC + twoBC) * 3 + three * 2;

        printf("%lld %lld %lld\n", alice, bob, carol);
    }

    return 0;
}
