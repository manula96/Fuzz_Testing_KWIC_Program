/* The Triangle program, which determines if three inputs specify an equilateral triangle, an isosceles 
triangle, an ordinary triangle, or non-triangle. */
#include <stdio.h>
#include <klee/klee.h>
void triangle(int a, int b, int c) {
    if ((a + b > c) && (a + c > b) && (b + c > a)) {
        if (a == b || a == c || b == c) {
            if (a == c && a == b)
                printf("equilateral triangle.\n");
            else if (a == c || b == c)
                printf("isosceles triangle.\n");
        } else
            printf("triangle.\n");
    } else
        printf("non-triangle.\n");
    return;
}

int main() {
    int a, b, c;
    klee_make_symbolic(&a, sizeof(a), "a");
    klee_make_symbolic(&b, sizeof(b), "b");
    klee_make_symbolic(&c, sizeof(c), "c");
    triangle(a, b, c);
    return 0;
}