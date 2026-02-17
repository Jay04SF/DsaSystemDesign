# DSA Pattern

Yep — a few important “standard interview” patterns were missing (or only implied) in our earlier list. Most notably: Trie, Sweep Line, Coordinate Compression, Segment Tree / Fenwick (BIT), Multi-source / Bidirectional BFS, 0–1 BFS, SCC / Bridges, Binary Lifting / Euler Tour, plus a couple DP/string “specials” that show up in tougher rounds.

Here’s the updated master list: patterns + common question types, topic-by-topic.

## Arrays

## Patterns
Two pointers (opposite / same direction)

Sliding window (fixed / variable; at most/exactly K)

Prefix sums (1D/2D), Prefix XOR

Difference array / range updates

Sorting + scan

Cyclic sort

Dutch national flag (3-way partition)

Merge intervals / interval union

Line sweep on intervals (array form)

Coordinate compression (often paired with sweep line / BIT / segment tree)

## Question types

Longest/shortest subarray with condition

Subarray sum/XOR = K; count subarrays

Range sum queries / range updates

Missing/duplicate numbers; smallest missing positive

Merge/insert intervals; overlaps; meeting rooms

## Strings

## Patterns
Sliding window + frequency map

Two pointers (palindrome / cleanup)

Hashing (rolling hash / Rabin–Karp)

KMP / prefix-function (pattern search)

Z-algorithm (pattern occurrences)

Manacher (longest palindromic substring) (less common but standard for hard)

Trie-based prefix search (see Trie section## )

Question types

Longest substring w/ constraints (distinct chars, replacements, etc.)

Anagrams / grouping / frequency constraints

Pattern match occurrences

Palindrome problems (count/longest/min cuts)

Hashing

## Patterns

Frequency map / set membership

Complement lookup (two-sum family)

Hash + prefix sum/XOR

Hash + sliding window

“Encode a state” (tuple key: (i,j), counts, normalized form)

## Question types

Two-sum variants (pairs/triples)

Count subarrays meeting a condition

Dedup / group anagrams / isomorphic strings

“First unique”, “most frequent”, etc.

Linked List

## Patterns

Fast/slow pointers

In-place reversal (iterative / recursive)

Dummy head

Merge technique

Split into halves + merge (reorder)

Cycle entry math

## Question types

Reverse / reverse in k-group

Detect cycle / find entry

Merge sorted lists / sort list

Remove Nth from end, intersection

Stack

## Patterns

Monotonic stack (increasing/decreasing)

Stack simulation

Expression evaluation (infix→postfix, RPN)

“Next greater/smaller” family

## Question types

Valid parentheses; min remove to make valid

Next greater element; stock span

Largest rectangle in histogram

Evaluate expression / decode string

Queue / Deque

## Patterns

Monotonic deque (sliding window max/min)

BFS layer traversal support

Deque for 0–1 BFS (graph)

## Question types

Sliding window max/min

Scheduling / buffering simulations

Shortest path with 0/1 weights

Binary Search

## Patterns

Classic binary search

Lower/upper bound

Binary search on answer (“min feasible”, “max feasible”)

Rotated array search

Peak/valley finding

“Parametric search” with greedy check

## Question types

First/last occurrence

Min capacity / min days / max distance type optimization

Search in rotated / mountain array

Heap / Priority Queue

## Patterns

Top-K (min-heap or max-heap)

K-way merge

Two heaps (median maintenance)

Lazy deletion (heap + hashmap)

“Best-first search” (Dijkstra-like expansions)

## Question types

Kth largest/smallest

Merge K sorted lists/arrays

Streaming median

Schedule tasks / meeting rooms II

Greedy

## Patterns

Sort + greedy choice

Interval scheduling / earliest finish

Sweep-line + heap (rooms/platforms)

Exchange-argument style (local→global)

Greedy with monotonic structure

## Question types

Activity selection, meeting rooms

Min arrows, min intervals to remove

Gas station, jump game

Job scheduling variants

Recursion

## Patterns

Divide & conquer

Recursion with state parameters

Tree recursion templates (return info to parent)

## Question types

Tree computations (height, balance, diameter)

Classic recursive reductions

Backtracking

## Patterns

Include/exclude

Choose-next (for-loop recursion)

Constraint pruning

Dedup with sorting + skip duplicates

Bitmask backtracking (small N)

## Question types

Subsets / permutations / combinations

Combination sum / partitioning

N-Queens, Sudoku, word search

Trees (Binary + General)

## Patterns

DFS traversals (pre/in/post)

BFS level order

Path sum / root-to-leaf constraints

Diameter / “two-way” path pattern

LCA (basic recursion or binary lifting)

Serialize/deserialize

“Return multiple values” (min/max, balanced flag, etc.)

Euler tour (tin/tout) for subtree queries (important add)

Binary lifting (jump pointers) (important add)

## Question types

Views (left/right/top/bottom)

LCA queries / kth ancestor

Subtree sums / path constraints

Build tree from traversals

BST

## Patterns

Inorder = sorted

Two-sum in BST (inorder + two pointers)

Successor/predecessor

Validate BST with bounds

Augmented BST idea (counts) (conceptual)

## Question types

Kth smallest/largest

Validate / recover swapped BST

Range sum in BST

Graphs

## Patterns

BFS / DFS (implicit & explicit graphs)

Multi-source BFS (important add)

Bidirectional BFS (important add)

Topological sort (Kahn / DFS)

Cycle detection (directed/undirected)

Union-Find / DSU (components, cycle)

Shortest paths:

Dijkstra

0–1 BFS (important add)

Bellman-Ford (rare but standard)

MST (Kruskal/Prim)

SCC (Kosaraju/Tarjan) (important add)

Bridges / articulation points (important add)

Graph with “state” (node,mask) using BFS/Dijkstra (common in hard)

## Question types

Islands / flood fill / regions

Course schedule / prerequisites

Shortest path variants (word ladder, grid shortest path)

Connectivity queries / redundant connection

Critical connections (bridges), SCC-based condensation

Dynamic Programming

## Patterns

1D DP (linear)

2D DP (grid/table)

DP on subsequences (LIS/LCS family)

Knapsack:

0/1

Unbounded

Interval DP (partition, bursts) (important add)

DP on trees (postorder states)

Bitmask DP (TSP-like) (important add)

Digit DP (important add; shows up in hard)

DP optimization patterns:

Space optimization

Monotonic queue optimization (advanced but standard)

“State compression” / bitsets (advanced)

## Question types

Coin change, house robber, climbing stairs

Unique paths/min path sum

Palindrome DP (min cuts, count pal substrings)

Partition equal subset / subset sum

Burst balloons / matrix chain style

Traveling salesman (small N)

Bit Manipulation

##Patterns

XOR tricks (pair canceling)

Bitmasking (subset enumeration)

Count bits / DP over bits

Two’s complement / sign edge cases

SOS DP (subset sums) (advanced/rare)

## Question types

Single number / missing number

Generate subsets

Max XOR pair/subarray

Bitwise AND/OR constraints

Trie (Missing before — now added)

##Patterns

Trie insert/search

Prefix queries

Trie + DFS on board

Bitwise trie (max XOR)

## Question types

Autocomplete / prefix count

Replace words (dictionary roots)

Word search II

Max XOR of two numbers

Range Query Data Structures (Missing before — now added)

##Patterns

Fenwick Tree / BIT (prefix sums with updates)

Segment Tree (range query + point/range update)

Lazy propagation (range updates)

Sparse Table (static RMQ) (rare in interviews but can appear)

Coordinate compression + BIT/segment tree

## Question types

Dynamic range sum / inversion count

Count of smaller numbers after self

Range min/max/sum with updates

Sweep line event counting (overlaps)

Intervals & Sweep Line (Missing as a named pattern — now added)

##Patterns

Sort endpoints + event processing

Sweep line + heap (active intervals)

Difference array (discrete sweep)

Coordinate compression

## Question types

Meeting rooms / min rooms

Overlap counting, max concurrent events

Skyline (hard)

Merge/insert intervals (basic)

Math / Number Theory

##Patterns

GCD/LCM

Modular arithmetic

Fast power (binary exponentiation)

Sieve primes

Combinatorics precompute (nCr) (sometimes)

## Question types

Prime checks, factorization

Modular exponent / mod inverse (occasionally)

Counting / probability-like DP combos

“Design a Data Structure” DSA (Often appears in interviews)

##Patterns

HashMap + Doubly Linked List (LRU)

Two stacks (queue)

Stack + auxiliary structure (min stack)

Heap + hashmap (frequency stack / lazy deletion)

## Question types

LRU / LFU cache

Min stack / max stack

Design Twitter / stream-like simplified designs