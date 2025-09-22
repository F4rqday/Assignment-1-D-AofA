# Algorithms Project

## Architecture Notes
I try to control memory and recursion depth.  
- In MergeSort I use only one buffer.  
- In QuickSort I go to the smaller part first.  
- In Select (Median of Medians) I work inside the array.  
- In Closest Pair I sort by x once and then use recursion.

## Recurrence Analysis
- **MergeSort**: two parts + merge → O(n log n).  
- **QuickSort**: average O(n log n), worst O(n^2).  
- **Select (MoM5)**: groups of 5, median → O(n).  
- **Closest Pair**: split by two, check strip → O(n log n).

## Summary
Theory and practice are close.  
- MergeSort is a bit slower.  
- QuickSort is fast in most cases.  
- Select is O(n) but slow on small arrays.  
- Closest Pair works in O(n log n).  

Result: the algorithms work like in the theory.
