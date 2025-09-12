# LeetCode #9: Palindrome Number

## 📝 Problem Statement  
Given an integer `x`, return **true** if `x` is a palindrome, **false** otherwise.  
An integer is a palindrome when it reads the same backward as forward. :contentReference[oaicite:0]{index=0}

---

## 🔍 Examples

| # | Input | Output | Explanation |
|---|--------|---------|-------------|
| 1 | `x = 121`   | `true`  | 121 reads the same forward and backward. :contentReference[oaicite:1]{index=1} |
| 2 | `x = -121`  | `false` | From left to right it's `-121`, from right to left `121-`. Not a palindrome. :contentReference[oaicite:2]{index=2} |
| 3 | `x = 10`    | `false` | Reads as `01` backward (leading zero), doesn’t match the original. :contentReference[oaicite:3]{index=3} |

---

## ⚙ Constraints

- `-2³¹ <= x <= 2³¹ - 1` (fits in 32-bit signed integer). :contentReference[oaicite:4]{index=4}  
- You cannot use the same element twice (this applies more to other problems, not here).  
- Follow-up: Can you do this without converting the integer to a string? :contentReference[oaicite:5]{index=5}

---

## 🚀 Approaches

Here are **3–4 common approaches** to solve this, with trade-offs:

| Approach | Idea | Time Complexity | Space Complexity | Pros / Cons |
|----------|------|------------------|-------------------|-----------------------------|
| **1. Convert to String & Reverse** | Turn the integer into a string, reverse the string, compare with original. | O(n), where n = number of digits. :contentReference[oaicite:6]{index=6} | O(n) (for string storage & reverse) | ✅ Easy to write; ❌ Uses extra space; string operations. |
| **2. Reverse the Whole Number Numerically** | Reverse the integer by modulo/division until the number is reversed, then compare with original. | O(n) or O(log x) (because digits count) :contentReference[oaicite:7]{index=7} | O(1) | ✅ No strings; simple logic; possible overflow in some languages if reversed exceeds integer limits. |
| **3. Reverse Half the Number** | Only reverse half of the digits, compare that with the other half. Avoid overflow and extra work. | O(log x) | O(1) | ✅ More optimal; handles odd/even digit lengths; covers edge cases well. :contentReference[oaicite:8]{index=8} |
| **4. Leading & Trailing Digits (Two-Pointer numeric)** *(less common)* | Find highest power of 10 to extract the first digit, compare with last digit, strip them off, repeat. | O(log x) | O(1) | ✅ Good for understanding; slightly more complex to implement. |

---

## ✅ Recommended Approach

- Use **Reverse Half the Number** for best balance: **O(log x)** time, **O(1)** space.  
- Also handle special cases up front:
  1. Negative numbers → `false` immediately (because of the `-`).  
  2. Numbers that end in `0` but are not `0` themselves → `false` (leading zeros problem when reversed). :contentReference[oaicite:9]{index=9}

---

## 🧮 Complexity Summary

| Scenario | Time Complexity | Space Complexity |
|----------|------------------|-------------------|
| Brute / full reverse (string or numeric) | O(n) / O(log x) | O(n) or O(1) |
| Reverse half / numeric split | O(log x) | O(1) |

---

## 💡 Example Usage

```text
Input: x = 12321  
Output: true  

Input: x = 1221  
Output: true  

Input: x = -121  
Output: false  

Input: x = 10  
Output: false  
