# Array Problems

This folder contains solutions to common **array problems** in Java.  
Each problem includes a **Java implementation** with comments and a **main method** to test the solution.

## Problem List

1. **Remove Element**
   - Remove all occurrences of a given value from an array in-place.
   - Approach: Two-pointer technique.
   - Time Complexity: O(n)
   - Space Complexity: O(1)

2. **Two Sum**
   - Find two numbers in an array that add up to a target value.
   - Approach: HashMap for complement lookup.
   - Time Complexity: O(n)
   - Space Complexity: O(n)

3. **Group Anagrams**
   - Group anagrams together from a list of strings.
   - Approach: Use a HashMap with sorted string as key.
   - Time Complexity: O(n * k log k) (n = number of strings, k = max length of string)
   - Space Complexity: O(n)

## How to Use
- Each `.java` file is **self-contained**.
- You can **compile and run** each file using:
```bash
javac FileName.java
java FileName

