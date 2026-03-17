# NumberSolver

## Overview

`NumberSolver` is a simple Java program that performs basic number system operations for all integers from `1` to `k`.

It currently includes:

* Counting the number of factors for each number
* Calculating the sum of factors for each number

---

## Methods

### printFactorCount(int k)

Prints the number of factors for every integer from `1` to `k`.

### printSumOfFactors(int k)

Prints the sum of all factors for every integer from `1` to `k`.

---

## Example

For `k = 5`, output of `printSumOfFactors`:

```
1
3
4
7
6
```

---

## How to Run

1. Compile:

```
javac NumberSolver.java
```

2. Run:

```
java NumberSolver
```

3. Modify `k` in `main` to test different ranges.

---

## Complexity

* Time Complexity: O(n²)
* Space Complexity: O(1)

---

## Notes

* Uses a brute-force approach for clarity.
* Can be optimized using square root factor logic.
