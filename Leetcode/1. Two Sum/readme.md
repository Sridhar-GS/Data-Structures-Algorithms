# LeetCode 1. Two Sum

### 📖 Problem Statement
Given an array of integers `nums` and an integer `target`,  
return **indices of the two numbers** such that they add up to `target`.

---

## Approaches

### 1️⃣ Brute Force  
- Check every pair `(i, j)`.  
- **Time:** O(n²)  
- **Space:** O(1)  
- ✅ Easy to implement, ❌ Slow for large input.

---

### 2️⃣ Hash Map (One-Pass)  
- Iterate through `nums`, store each value in a map.  
- For each element, check if `target - num` exists.  
- **Time:** O(n)  
- **Space:** O(n)  
- ✅ Optimal & most common solution.

---

### 3️⃣ Hash Map (Two-Pass)  
- First loop: store all numbers in map.  
- Second loop: check complements.  
- **Time:** O(n)  
- **Space:** O(n)  
- ✅ Simple logic, ❌ Requires two passes.

---

### 4️⃣ Sorting + Two Pointers (if indices not required)  
- Sort array + use two pointers (left & right).  
- Move pointers based on sum compared to target.  
- **Time:** O(n log n)  
- **Space:** O(1) or O(n) (if storing original indices).  
- ✅ Efficient after sorting, ❌ Not valid if indices required without extra storage.

---

##  Solutions

- **Java** → [Brute Force](two_sum_bruteforce.java), [Hash Map](two_sum_hashmap.java)  
- **Python** → [Brute Force](two_sum_bruteforce.py), [Hash Map](two_sum_hashmap.py)  
- **C++** → [Brute Force](two_sum_bruteforce.cpp), [Hash Map](two_sum_hashmap.cpp)  

---

##  Complexity Comparison
---------------------------------------------------------------------------------
| Approach               | Time       | Space | Notes                           |
|------------------------|------------|-------|---------------------------------|
| Brute Force            | O(n²)      | O(1)  | Very slow for large input       |
| Hash Map (Two-Pass)    | O(n)       | O(n)  | Simple but less efficient       |
| Hash Map (One-Pass)    | O(n)       | O(n)  | ✅ Best Choice                 |
| Sorting + Two Pointers | O(n log n) | O(1) | Only works if indices not needed |
---------------------------------------------------------------------------------


✨ **Recommendation:** Use **Hash Map (One-Pass)** for coding interviews.
