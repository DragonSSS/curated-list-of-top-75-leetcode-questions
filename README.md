[![curated-list-of-coding-questions-master Actions Status](https://github.com/DragonSSS/curated-list-of-coding-questions/workflows/curated-list-of-coding-questions/badge.svg)](https://github.com/DragonSSS/curated-list-of-coding-questions/actions)

# Curated List of Top 75 LeetCode Questions

- [Curated List of Top 75 LeetCode Questions](#curated-list-of-top-75-leetcode-questions)
  - [TL;DR](#tldr)
  - [Array (10)](#array-10)
  - [Binary (5)](#binary-5)
  - [Dynamic Programming (11)](#dynamic-programming-11)
  - [Graph (8)](#graph-8)
  - [Interval (5)](#interval-5)
  - [Linked List (6)](#linked-list-6)
  - [Matrix (4)](#matrix-4)
  - [String (10)](#string-10)
  - [Tree (14)](#tree-14)
  - [Heap (3)](#heap-3)
  - [High Frequency (Bonus)](#high-frequency-bonus)
    - [Graph](#graph)
    - [DFS](#dfs)
    - [BFS](#bfs)
    - [Array](#array)
    - [Binary Search](#binary-search)
    - [Prefix Sum](#prefix-sum)
    - [Dynamic Programming](#dynamic-programming)
    - [Tree](#tree)
    - [LinkedList](#linkedlist)
    - [Stack](#stack)
    - [String](#string)
    - [Greedy](#greedy)
    - [Backtracking](#backtracking)
    - [Heap (Priority Queue)](#heap-priority-queue)
    - [Design](#design)
    - [Monotonic Queue](#monotonic-queue)
    - [Interval](#interval)
    - [Bit Manipulation (Bitmask)](#bit-manipulation-bitmask)

## TL;DR

[source](https://www.teamblind.com/post/New-Year-Gift---Curated-List-of-Top-75-LeetCode-Questions-to-Save-Your-Time-OaM1orEU)

## Array (10)

- [x] LeetCode #1 Two Sum
  - [description](https://leetcode.com/problems/two-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/TwoSum.java)
  - hint: hashtable `{key: rest_value, value: index}`

- [x] LeetCode #121 Best Time to Buy and Sell Stock
  - [description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/BestTimeToBuyAndSellStock.java)
  - hint: minPrice + maxProfit + one loop

- [x] LeetCode #217 Contains Duplicate
  - [description](https://leetcode.com/problems/contains-duplicate/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ContainsDuplicate.java)
  - hint: hashset

- [x] LeetCode #238 Product of Array Except Self
  - [description](https://leetcode.com/problems/product-of-array-except-self/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ProductOfArrayExceptSelf.java)
  - hint: prefix product + backward

- [x] LeetCode #53 Maximum Subarray
  - [description](https://leetcode.com/problems/maximum-subarray/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumSubarray.java)
  - hint: dp

- [x] LeetCode #152 Maximum Product Subarray
  - [description](https://leetcode.com/problems/maximum-product-subarray/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumProductSubarray.java)
  - hint: dp

- [x] LeetCode #153 Find Minimum in Rotated Sorted Array
  - [description](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindMinimumInRotatedSortedArray.java)
  - hint: binary search, compare `nums[mid]` with `nums[end]`

- [x] LeetCode #33 Search in Rotated Sorted Array
  - [description](https://leetcode.com/problems/search-in-rotated-sorted-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SearchInRotatedSortedArray.java)
  - hint: binary search, compare `target` with `nums[mid]`
  
- [x] LeetCode #15 3Sum (NeetCode 150)
  - [description](https://leetcode.com/problems/3sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ThreeSum.java)
  - hint: sorted + two pointers

- [x] LeetCode #11 Container With Most Water
  - [description](https://leetcode.com/problems/container-with-most-water/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ContainerWithMostWater.java)
  - hint: two pointers
  
## Binary (5)

- [x] LeetCode #371 Sum of Two Integers
  - [description](https://leetcode.com/problems/sum-of-two-integers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/SumOfTwoIntegers.java)
  - hint: use carry with shift 1 to get common components, xor operation is to get opposite components

- [x] LeetCode #191 Number of 1 Bits
  - [description](https://leetcode.com/problems/number-of-1-bits/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/NumberOfOneBits.java)
  - hint: `res += n & 1` and unsigned right shift `n >>>= 1`
  
- [x] LeetCode #338 Counting Bits
  - [description](https://leetcode.com/problems/counting-bits/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/CountingBits.java)
  - hint: dp, n is `2^x` (`dp[n] = 1`) or `n % 2 == 0` (`dp[n] = dp[n / 2]`) or `n % 2 == 1` (`dp[n] = dp[n - 1] + 1`)

- [x] LeetCode #268 Missing Number
  - [description](https://leetcode.com/problems/missing-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/MissingNumber.java)
  - hint: xor operation or binary search on sorted array
  
- [x] LeetCode #190 Reverse Bits
  - [description](https://leetcode.com/problems/reverse-bits/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/ReverseBits.java)
  - hint: left shift `<<=` on result, right shift `>>=` on number

## Dynamic Programming (11)

- [x] LeetCode #70 Climbing Stairs
  - [description](https://leetcode.com/problems/climbing-stairs/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/ClimbingStairs.java)
  - hint: recursion + memorization

- [x] LeetCode #332 Coin Change
  - [description](https://leetcode.com/problems/coin-change/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CoinChange.java)
  - hint: bfs or recursion + memorization

- [x] LeetCode #300 Longest Increasing Subsequence
  - [description](https://leetcode.com/problems/longest-increasing-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/LongestIncreasingSubsequence.java)
  - hint: two pointers of current index and previous index (`start with -1`) + recursion + memorization, or dp

- [x] LeetCode #1143 Longest Common Subsequence
  - [description](https://leetcode.com/problems/longest-common-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/LongestCommonSubsequence.java)
  - hint: recursion + memorization
  
- [x] LeetCode #139 Word Break
  - [description](https://leetcode.com/problems/word-break/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/WordBreak.java)
  - hint: dfs + memorization + recursion

- [x] LeetCode #377 Combination Sum IV
  - [description](https://leetcode.com/problems/combination-sum-iv/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CombinationSumIV.java)
  - hint: top-down recursion + memorization

- [x] LeetCode #198 House Robber
  - [description](https://leetcode.com/problems/house-robber/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/HouseRobber.java)
  - hint: top-down recursion + memorization or dp

- [x] LeetCode #213 House Robber II
  - [description](https://leetcode.com/problems/house-robber-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/HouseRobberII.java)
  - hint: top-down recursion + memorization (using two helper func) or dp

- [x] LeetCode #91 Decode Ways
  - [description](https://leetcode.com/problems/decode-ways/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/DecodeWays.java)
  - hint: top-down + memorization + recursion

- [x] LeetCode #62 Unique Paths
  - [description](https://leetcode.com/problems/unique-paths/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/UniquePaths.java)
  - hint: top-down + memorization + recursion

- [x] LeetCode #55 Jump Game
  - [description](https://leetcode.com/problems/jump-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/JumpGame.java)
  - hint: greedy (ascending or descending order)

## Graph (8)

- [x] LeetCode #133 Clone Graph (NeetCode 150)
  - [description](https://leetcode.com/problems/clone-graph/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/CloneGraph.java)
  - hint: dfs + hashmap
  
- [x] LeetCode #207 Course Schedule
  - [description](https://leetcode.com/problems/course-schedule/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/CourseSchedule.java)
  - hint: topological sort (indegree and neighbours map + queue + bfs)

- [x] LeetCode #417 Pacific Atlantic Water Flow
  - [description](https://leetcode.com/problems/pacific-atlantic-water-flow/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/PacificAtlanticWaterFlow.java)
  - hint: dfs + memorization or bfs
  
- [x] LeetCode #200 Number of Islands
  - [description](https://leetcode.com/problems/number-of-islands/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/NumberOfIslands.java)
  - hint: dfs + memorization

- [x] LeetCode #128 Longest Consecutive Sequence (NeetCode 150)
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/LongestConsecutiveSequence.java)
  - hint: sort first + iteration with while loop (could use union-find or hashtable as well)
  
- [x] LeetCode #269 Alien Dictionary
  - [description](https://leetcode.com/problems/alien-dictionary/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/AlienDictionary.java)
  - hint: build graph + indegree map + bfs with queue

- [x] LeetCode #261 Graph Valid Tree
  - [description](https://leetcode.com/problems/graph-valid-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/GraphValidTree.java)
  - hint: dfs/bfs + memorization

- [x] LeetCode #323 Number of Connected Components in an Undirected Graph
  - [description](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/NumberOfConnectedComponentsInUndirectedGraph.java)
  - hint: bfs/dfs + memorization or union-find

## Interval (5)

- [x] LeetCode #57 Insert Interval (NeetCode 150)
  - [description](https://leetcode.com/problems/insert-interval/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/InsertInterval.java)
  - hint: if `newInterval[1] < interval[0]` else if `newInterval[0] > interval[1]` else do sth

- [x] LeetCode #56 Merge Intervals (NeetCode 150)
  - [description](https://leetcode.com/problems/merge-intervals/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MergeIntervals.java)
  - hint: same as Insert Interval, if `newInterval[1] < interval[0]` else if `newInterval[0] > interval[1]` else do sth

- [x] LeetCode #435 Non-overlapping Intervals (NeetCode 150)
  - [description](https://leetcode.com/problems/non-overlapping-intervals/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/NonOverlappingIntervals.java)
  - hint: sort array first by start of interval, record preEnd and compare it with intervals

- [x] LeetCode #252 Meeting Rooms (NeetCode 150)
  - [description](https://leetcode.com/problems/meeting-rooms/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MeetingRooms.java)
  - hint: sort array first by start of interval, compare two intervals with sliding window size of 2

- [x] LeetCode #253 Meeting Rooms II (NeetCode 150)
  - [description](https://leetcode.com/problems/meeting-rooms-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MeetingRoomsII.java)
  - hint: sort array first by start of interval, use priorityQueue (sorted by end of interval) to record the intervals as required rooms

## Linked List (6)

- [x] LeetCode #206 Reverse Linked List
  - [description](https://leetcode.com/problems/reverse-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/ReverseLinkedList.java)
  - hint: previous ListNode pointer

- [x] LeetCode #141 Linked List Cycle
  - [description](https://leetcode.com/problems/linked-list-cycle/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/LinkedListCycle.java)
  - hint: slow and fast pointers
  
- [x] LeetCode #21 Merge Two Sorted Lists
  - [description](https://leetcode.com/problems/merge-two-sorted-lists/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/MergeTwoSortedLists.java)
  - hint: two pointers with while loop + extra linked list

- [x] LeetCode #23 Merge k Sorted Lists
  - [description](https://leetcode.com/problems/merge-k-sorted-lists/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/MergeKSortedLists.java)
  - hint: heap/priority queue or merge sort

- [x] LeetCode #19 Remove Nth Node From End of List
  - [description](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RemoveNthNodeFromEndOfList.java)
  - hint: slow and fast pointers + sliding window

- [x] LeetCode #143 Reorder List
  - [description](https://leetcode.com/problems/reorder-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/ReorderList.java)
  - hint: find the mid to split two linked lists, reverse second one and merge two linked list into one
  
## Matrix (4)

- [x] LeetCode #73 Set Matrix Zeroes (NeetCode 150)
  - [description](https://leetcode.com/problems/set-matrix-zeroes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/SetMatrixZeroes.java)
  - hint: use hashtable/hashset to record row and column of 0 in matrix

- [x] LeetCode #54 Spiral Matrix (NeetCode 150)
  - [description](https://leetcode.com/problems/spiral-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/SpiralMatrix.java)
  - hint: four pointers for corners: top, bottom, left and right when `res.size() < m * n`
  
- [x] LeetCode #48 Rotate Image (NeetCode 150)
  - [description](https://leetcode.com/problems/rotate-image/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/RotateImage.java)
  - hint: `clockwise rotate = reverse up to down + swap the symmetry`, `anticlockwise = reverse left to right + swap the symmetry`

- [x] LeetCode #79 Word Search
  - [description](https://leetcode.com/problems/word-search/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/WordSearch.java)
  - hint: dfs + backtracking
  
## String (10)

- [x] LeetCode #3 Longest Substring Without Repeating Characters
  - [description](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestSubstringWithoutRepeatingCharacters.java)
  - hint: two pointers + sliding window
  
- [x] LeetCode #424 Longest Repeating Character Replacement
  - [description](https://leetcode.com/problems/longest-repeating-character-replacement/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestRepeatingCharacterReplacement.java)
  - hint: two pointers + sliding window

- [x] LeetCode #76 Minimum Window Substring
  - [description](https://leetcode.com/problems/minimum-window-substring/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MinimumWindowSubstring.java)
  - hint: two pointers + hashtable + sliding window

- [x] LeetCode #242 Valid Anagram
  - [description](https://leetcode.com/problems/valid-anagram/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidAnagram.java)
  - hint: hashtable
  
- [x] LeetCode #49 Group Anagrams
  - [description](https://leetcode.com/problems/group-anagrams/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/GroupAnagrams.java)
  - hint: hashtable + Arrays.toString()
  
- [x] LeetCode #20 Valid Parentheses
  - [description](https://leetcode.com/problems/valid-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidParentheses.java)
  - hint: stack

- [x] LeetCode #125 Valid Palindrome (NeetCode 150)
  - [description](https://leetcode.com/problems/valid-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindrome.java)
  - hint: two pointers + `Character.isLetterOrDigit()`
  
- [x] LeetCode #5 Longest Palindromic Substring
  - [description](https://leetcode.com/problems/longest-palindromic-substring/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestPalindromicSubstring.java)
  - hint: two pointers + expand around center

- [x] LeetCode #647 Palindromic Substrings
  - [description](https://leetcode.com/problems/palindromic-substrings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/PalindromicSubstrings.java)
  - hint: two pointers + expand around center
  
- [x] LeetCode #271 Encode and Decode Strings
  - [description](https://leetcode.com/problems/encode-and-decode-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/EncodeAndDecodeStrings.java)
  - hint: `length + '/' + str + length + '/' + str`

## Tree (14)

- [x] LeetCode #104 Maximum Depth of Binary Tree
  - [description](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/MaximumDepthOfBinaryTree.java)
  - hint: dfs

- [x] LeetCode #100 Same Tree
  - [description](https://leetcode.com/problems/same-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SameTree.java)
  - hint: dfs
  
- [x] LeetCode #266 Invert Binary Tree
  - [description](https://leetcode.com/problems/invert-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/InvertBinaryTree.java)
  - hint: queue + bfs or dfs
  
- [x] LeetCode #124 Binary Tree Maximum Path Sum
  - [description](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeMaximumPathSum.java)
  - hint: dfs

- [x] LeetCode #102 Binary Tree Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeLevelOrderTraversal.java)
  - hint: dfs or bfs + queue

- [x] LeetCode #297 Serialize and Deserialize Binary Tree
  - [description](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SerializeDeserializeBinaryTree.java)
  - hint: tree traversal (**pre-order**, in-order and post-order), bfs iteratively and **dfs** recursively
  
- [x] LeetCode #572 Subtree of Another Tree
  - [description](https://leetcode.com/problems/subtree-of-another-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SubtreeOfAnotherTree.java)
  - hint: use SameTree recursion + one more recursion
  
- [x] LeetCode #105 Construct Binary Tree from Preorder and Inorder Traversal
  - [description](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConstructBinaryTreeFromPreorderAndInorderTraversal.java)
  - hint: recursion + use preorder to find root + use inorder to split array into right and left tree

- [x] LeetCode #208 Implement Trie (Prefix Tree)
  - [description](https://leetcode.com/problems/implement-trie-prefix-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/Trie.java)
  - hint: prefix tree (Trie data structure)
  
- [x] LeetCode #98 Validate Binary Search Tree
  - [description](https://leetcode.com/problems/validate-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ValidateBinarySearchTree.java)
  - hint: preorder traversal + stack or recursion with max and min boundaries
  
- [x] LeetCode #235 Lowest Common Ancestor of a Binary Search Tree
  - [description](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/LowestCommonAncestorOfBinarySearchTree.java)
  - hint: recursion + bst
  
- [x] LeetCode #212 Word Search II
  - [description](https://leetcode.com/problems/word-search-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/WordSearch2.java)
  - hint: trie + dfs + backtracking
  
- [x] LeetCode #230 Kth Smallest Element in a BST
  - [description](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/KthSmallestElementInBST.java)
  - hint: inorder traversal
  
- [x] LeetCode #211 Design Add and Search Words Data Structure
  - [description](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/AddSearchWord.java)
  - hint: trie + dfs
  
## Heap (3)

- [x] LeetCode #23 Merge k Sorted Lists
  - [description](https://leetcode.com/problems/merge-k-sorted-lists/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/MergeKSortedLists.java)
  - hint: priorityQueue as minHeap

- [x] LeetCode #347 Top K Frequent Elements
  - [description](https://leetcode.com/problems/top-k-frequent-elements/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/TopKFrequentElements.java)
  - hint: hashmap + priorityQueue as minHeap

- [x] LeetCode #295 Find Median from Data Stream
  - [description](https://leetcode.com/problems/find-median-from-data-stream/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/FindMedianfromDataStream.java)
  - hint: two priorityQueue as heaps, smallHalf as maxHeap, largeHalf as minHeap

## High Frequency (Bonus)

### Graph

- [x] LeetCode #1761 Minimum Degree of a Connected Trio in a Graph
  - [description](https://leetcode.com/problems/minimum-degree-of-a-connected-trio-in-a-graph/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MinimumDegreeOfConnectedTrioInGraph.java)  
  - hint: compute degree for each node, build hashmap for each edge to indicate if it is a edge with given two nodes, calculate min degree by sum of degree of three nodes in a trio

- [x] LeetCode #684 Redundant Connection (NeetCode 150)
  - [description](https://leetcode.com/problems/redundant-connection/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/RedundantConnection.java)  
  - hint: union-find or recurisvely dfs graph before adding the current edge into graph

- [x] LeetCode #785 Is Graph Bipartite
  - [description](https://leetcode.com/problems/is-graph-bipartite/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/IsGraphBipartite.java)  
  - hint: dfs recursively colorize graph with two colors or union-find

- [x] LeetCode #1584 Min Cost to Connect All Points (NeetCode 150)
  - [description](https://leetcode.com/problems/min-cost-to-connect-all-points/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MinCostToConnectAllPoints.java)  
  - hint: minimum spaning tree (MST) using Prim's algorithm (BFS with minHeap) or Kruskal's algorithm (union-find with minHeap that tracks the distance between each pair of nodes)

- [x] LeetCode #2115 Find All Possible Recipes from Given Supplies
  - [description](https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/FindAllPossibleRecipesFromGivenSupplies.java)  
  - hint: topological sort with bfs

- [x] LeetCode #1101 The Earliest Moment When Everyone Become Friends
  - [description](https://leetcode.com/problems/the-earliest-moment-when-everyone-become-friends/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/TheEarliestMomentWhenEveryoneBecomeFriends.java)  
  - hint: union-find with path compression and ranking

- [x] LeetCode #802 Find Eventual Safe States
  - [description](https://leetcode.com/problems/find-eventual-safe-states/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/FindEventualSafeStates.java)  
  - hint: bfs + topological sort or dfs + backtracking

- [x] LeetCode #947 Most Stones Removed with Same Row or Column
  - [description](https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MostStonesRemovedWithSameRowOrColumn.java)  
  - hint: dfs or union-find, `the most stones that can be removed = number of stones - number of islands (same row or column of stones are treated as island)`

- [x] LeetCode #791 Accounts Merge
  - [description](https://leetcode.com/problems/accounts-merge/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/AccountsMerge.java)
  - hint: build undirected graph using email + dfs or union-find

- [x] LeetCode #2204 Distance to a Cycle in Undirected Graph
  - [description](https://leetcode.com/problems/distance-to-a-cycle-in-undirected-graph/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/DistanceToCycleInUndirectedGraph.java)
  - hint: dfs (find all nodes in the cycle) + bfs (find min distance to the cycle)

- [x] LeetCode #1615 Maximal Network Rank
  - [description](https://leetcode.com/problems/maximal-network-rank/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MaximalNetworkRank.java)
  - hint: calculate indegree for each node

- [x] LeetCode #2642 Design Graph With Shortest Path Calculator
  - [description](https://leetcode.com/problems/design-graph-with-shortest-path-calculator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/DesignGraphWithShortestPathCalculator.java)
  - hint: Dijkstra's algorithm using minHeap

- [x] LeetCode #1976 Number of Ways to Arrive at Destination
  - [description](https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/NumberOfWaysToArriveAtDestination.java)
  - hint: Dijkstra's algorithm using minHeap

### DFS

- [x] LeetCode #332 Reconstruct Itinerary
  - [description](https://leetcode.com/problems/reconstruct-itinerary/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/ReconstructItinerary.java)
  - hint: post traversal with removing edge: dfs + priorityQueue + `list.add(0, ticket)` for reverse result list or backtracking with dfs

- [x] LeetCode #529 Minesweeper
  - [description](https://leetcode.com/problems/minesweeper/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/Minesweeper.java)
  - hint: dfs recursion

- [x] LeetCode #547 Number of Provinces
  - [description](https://leetcode.com/problems/number-of-provinces/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/NumberOfProvinces.java)
  - hint: dfs or bfs recursively

- [x] LeetCode #695 Max Area of Island
  - [description](https://leetcode.com/problems/max-area-of-island/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/MaxAreaOfIsland.java)
  - hint: dfs recursion

- [x] LeetCode #934 Shortest Bridge
  - [description](https://leetcode.com/problems/shortest-bridge/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/ShortestBridge.java)
  - hint: dfs + bfs

- [x] LeetCode #341 Flatten Nested List Iterator
  - [description](https://leetcode.com/problems/flatten-nested-list-iterator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/FlattenNestedListIterator.java)
  - hint: dfs recursion to flatten nested list

- [x] LeetCode #694 Number of Distinct Islands
  - [description](https://leetcode.com/problems/number-of-distinct-islands/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/NumberOfDistinctIslands.java)
  - hint: dfs recursion, use appending string of directions to store unique shape of island. remember to append `back` after recursion

- [x] LeetCode #339 Nested List Weight Sum
  - [description](https://leetcode.com/problems/nested-list-weight-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/NestedListWeightSum.java)
  - hint: dfs recursion

- [x] LeetCode #363 Nested List Weight Sum II
  - [description](https://leetcode.com/problems/nested-list-weight-sum-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/NestedListWeightSumII.java)
  - hint: two dfs recursion, one find max depth, the other calculate weight sum

- [x] LeetCode #399 Evaluate Division
  - [description](https://leetcode.com/problems/evaluate-division/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/EvaluateDivision.java)
  - hint: build graph based on each equation, dfs to find each result of query

- [x] LeetCode #463 Island Perimeter
  - [description](https://leetcode.com/problems/island-perimeter/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/IslandPerimeter.java)
  - hint: dfs recursion + memorization, trick is to make the condition when return 1 or 0 in recursion func.

- [x] LeetCode #329 Longest Increasing Path in a Matrix (NeetCode 150)
  - [description](https://leetcode.com/problems/longest-increasing-path-in-a-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/LongestIncreasingPathInMatrix.java)
  - hint: dfs recursion + memorization (like addressing DP question)

- [x] LeetCode #733 Flood Fill
  - [description](https://leetcode.com/problems/flood-fill/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/FloodFill.java)
  - hint: dfs recursion

- [x] LeetCode #472 Concatenated Words
  - [description](https://leetcode.com/problems/concatenated-words/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/ConcatenatedWords.java)
  - hint: use trie to store all words, dfs for each word with memeorization and check existence of prefix word by `TrieNode.isWord`

- [x] LeetCode #827 Making A Large Island
  - [description](https://leetcode.com/problems/making-a-large-island/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/MakingALargeIsland.java)
  - hint: group island using group index, calcualte group area by dfs and save `<group, area>` to a map, try four directions for each `gird[][] == 0` and use hash set to track visited groups, record largest area

- [x] LeetCode #1192 Critical Connections in a Network
  - [description](https://leetcode.com/problems/critical-connections-in-a-network/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/CriticalConnectionsInNetwork.java)
  - hint: Tarjan's algorithm, record visitedTimes and lowTimes for each node, dfs with visited set, track previous node and current node

- [x] LeetCode #582 Kill Process
  - [description](https://leetcode.com/problems/kill-process/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/KillProcess.java)
  - hint: dfs or bfs with buidling graph

- [x] LeetCode #256 Paint House
  - [description](https://leetcode.com/problems/paint-house/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/PaintHouse.java)
  - hint: dfs + memorization

- [x] LeetCode #1905 Count Sub Islands
  - [description](https://leetcode.com/problems/count-sub-islands/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/CountSubIslands.java)
  - hint: dfs

- [x] LeetCode #2101 Detonate the Maximum Bombs
  - [description](https://leetcode.com/problems/detonate-the-maximum-bombs/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/DetonateMaximumBombs.java)
  - hint: bfs or dfs

- [x] LeetCode #419 Battleships in a Board
  - [description](https://leetcode.com/problems/battleships-in-a-board/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/BattleshipsInBoard.java)
  - hint: dfs

- [x] LeetCode #1236 Web Crawler
  - [description](https://leetcode.com/problems/web-crawler/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/WebCrawler.java)
  - hint: dfs or bfs

- [x] LeetCode #1242 Web Crawler Multithreaded
  - [description](https://leetcode.com/problems/web-crawler-multithreaded/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/WebCrawlerMultithreaded.java)
  - hint: dfs + multithreaded tasks impl

- [x] LeetCode #886 Possible Bipartition
  - [description](https://leetcode.com/problems/possible-bipartition/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/PossibleBipartition.java)
  - hint: dfs or bfs, union-find

- [x] LeetCode #576 Out of Boundary Paths
  - [description](https://leetcode.com/problems/out-of-boundary-paths/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/OutOfBoundaryPaths.java)
  - hint: dfs

- [x] LeetCode #1239 Maximum Length of a Concatenated String with Unique Characters
  - [description](https://leetcode.com/problems/maximum-length-of-a-concatenated-string-with-unique-characters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dfs/MaximumLengthOfConcatenatedStringWithUniqueCharacters.java)
  - hint: dfs

### BFS

- [x] LeetCode #103 Binary Tree Zigzag Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/BinaryTreeZigzagLevelOrderTraversal.java)
  - hint: bfs with queue or dfs recursion

- [x] LeetCode #301 Remove Invalid Parentheses
  - [description](https://leetcode.com/problems/remove-invalid-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/RemoveInvalidParentheses.java)
  - hint: dfs, use count as stack to figure out where delete invalid char, record lastRemove position, reverse string for another round dfs to cover the case with more left parentheses

- [x] LeetCode #310 Minimum Height Trees
  - [description](https://leetcode.com/problems/minimum-height-trees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/MinimumHeightTrees.java)
  - hint: BFS topological sorting

- [x] LeetCode #127 Word Ladder
  - [description](https://leetcode.com/problems/word-ladder/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/WordLadder.java)
  - hint: bfs, find next possible word by replacing one character every time

- [x] LeetCode #815 Bus Routes
  - [description](https://leetcode.com/problems/bus-routes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/BusRoutes.java)
  - hint: bfs finds shortest number of buses from source to target, build graph based on which buses (value) could reach each stop (key)

- [x] LeetCode #1197 Minimum Knight Moves
  - [description](https://leetcode.com/problems/cheapest-flights-within-k-stops/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/MinimumKnightMoves.java)
  - hint: only bfs on positive ones instead of searching both positieve and negative

- [x] LeeCode #909 Snakes and Ladders
  - [description](https://leetcode.com/problems/snakes-and-ladders/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/SnakesAndLadders.java)
  - hint: bfs with square value `1 to n^2`, one tricky function for converting square one `1 to n^2` to board matrix value `board[x][y]`

- [x] LeetCode #126 Word Ladder II
  - [description](https://leetcode.com/problems/word-ladder-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/WordLadderII.java)
  - hint: use bfs to build the graph and record the distance between beginWord and currentWord, use dfs to find all shortest paths between beginWord and endWord

- [x] LeetCode #210 Course Schedule II
  - [description](https://leetcode.com/problems/course-schedule-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/CourseScheduleII.java)
  - hint: topological sort with bfs or dfs with `int[] visited, 0 - unknown, 1 - visiting, 2 - visited` to detect existing circle.

- [x] LeetCode #1730 Shortest Path to Get Food
  - [description](https://leetcode.com/problems/shortest-path-to-get-food/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ShortestPathToGetFood.java)
  - hint: standard bfs

- [x] LeetCode #752 Open the Lock
  - [description](https://leetcode.com/problems/open-the-lock/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/OpenTheLock.java)
  - hint: standard bfs

- [x] LeetCode #279 Perfect Squares
  - [description](https://leetcode.com/problems/perfect-squares/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/PerfectSquares.java)
  - hint: standard bfs

- [x] LeetCode #994 Rotting Oranges
  - [description](https://leetcode.com/problems/rotting-oranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/RottingOranges.java)
  - hint: standard bfs

- [x] LeetCode #863 All Nodes Distance K in Binary Tree
  - [description](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/AllNodesDistanceKInBinaryTree.java)
  - hint: convert tree to graph via hashmap(`parent node <=> child nodes`), avoid duplicates via hashset, bfs with queue or dfs with recursion

- [x] LeetCode #1291 Sequential Digits
  - [description](https://leetcode.com/problems/sequential-digits/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/SequentialDigits.java)
  - hint: add `1 - 9` into queue, every time poll one number, get lowerest single digit by `% 10`, add next one `cur * 10 + singleDigit + 1` only if `<= high` and `singleDigit < 9`

- [x] LeetCode #1091 Shortest Path in Binary Matrix
  - [description](https://leetcode.com/problems/shortest-path-in-binary-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ShortestPathInBinaryMatrix.java)
  - hint: standard bfs

- [x] LeetCode #818 Race Car
  - [description](https://leetcode.com/problems/race-car/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/RaceCar.java)
  - hint: bfs, try overshooting, and detect overshooting asap with trying reverse

- [x] LeetCode #1293 Shortest Path in a Grid with Obstacles Elimination
  - [description](https://leetcode.com/problems/shortest-path-in-a-grid-with-obstacles-elimination/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ShortestPathInGridWithObstaclesElimination.java)
  - hint: bfs, with `int[]{x, y, k}` where `k` is number of elimination step left

- [x] LeetCode #286 Walls and Gates
  - [description](https://leetcode.com/problems/walls-and-gates/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/WallsAndGates.java)
  - hint: bfs

- [x] LeetCode #317 Shortest Distance from All Buildings
  - [description](https://leetcode.com/problems/shortest-distance-from-all-buildings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ShortestDistanceFromAllBuildings.java)
  - hint: bfs

- [x] LeetCode #1466 Reorder Routes to Make All Paths Lead to the City Zero
  - [description](https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ReorderRoutesToMakeAllPathsLeadToCityZero.java)
  - hint: dfs or bfs starts with zero city, reverse current connection, cost `1`, reverse reversed current connection, cost `0`

- [x] LeetCode #691 Stickers to Spell Word
  - [description](https://leetcode.com/problems/stickers-to-spell-word/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/StickersToSpellWord.java)
  - hint: bfs

- [x] LeetCode #490 The Maze
  - [description](https://leetcode.com/problems/the-maze/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/TheMaze.java)
  - hint: bfs or dfs

- [x] LeetCode #1136 Parallel Courses
  - [description](https://leetcode.com/problems/parallel-courses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ParallelCourses.java)
  - hint: topological sort with bfs

- [x] LeetCode #2050 Parallel Courses III
  - [description](https://leetcode.com/problems/parallel-courses-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ParallelCoursesIII.java)
  - hint: topological sort with tracking max elasped time of courses

- [x] LeetCode #542 01 Matrix
  - [description](https://leetcode.com/problems/01-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/ZeroOneMatrix.java)
  - hint: bfs

- [x] LeetCode #1376 Time Needed to Inform All Employees
  - [description](https://leetcode.com/problems/time-needed-to-inform-all-employees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/TimeNeededToInformAllEmployees.java)
  - hint: bfs

- [x] LeetCode #2385 Amount of Time for Binary Tree to Be Infected
  - [description](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/AmountOfTimeForBinaryTreeToBeInfected.java)
  - hint: bfs

- [x] LeetCode #2850 Minimum Moves to Spread Stones Over Grid
  - [description](https://leetcode.com/problems/minimum-moves-to-spread-stones-over-grid/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/MinimumMovesToSpreadStonesOverGrid.java)
  - hint: bfs

- [x] LeetCode #2477 Minimum Fuel Cost to Report to the Capital
  - [description](https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/MinimumFuelCostToReportToCapital.java)
  - hint: bfs or dfs

### Array

- [x] LeetCode #4 Median of Two Sorted Arrays (NeetCode 150)
  - [description](https://leetcode.com/problems/median-of-two-sorted-arrays/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MedianOfTwoSortedArrays.java)
  - hint: binary search with the shortest array, cut two arrays and compare leftMax/rightMin

- [x] LeetCode #42 Trapping Rain Water
  - [description](https://leetcode.com/problems/trapping-rain-water/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/TrappingRainWater.java)
  - hint: two pointers or you can use two arrays to record leftMax and rightMax (`int bit = Math.min(left[i], right[i]) - height[i]`)

- [x] LeetCode #162 Find Peak Element
  - [description](hhttps://leetcode.com/problems/find-peak-element/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindPeakElement.java)
  - hint: linear scan to find the first index that drops or binary search via comparing `nums[mid]` and `nums[mid + 1]`
  
- [x] LeetCode #1235 Maximum Profit in Job Scheduling
  - [description](https://leetcode.com/problems/maximum-profit-in-job-scheduling/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumProfitInJobScheduling.java)
  - hint: sort jobs based on start time, use dfs + memorization

- [x] LeetCode #811 Subdomain Visit Count
  - [description](https://leetcode.com/problems/subdomain-visit-count/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SubdomainVisitCount.java)
  - hint: hashtable

- [x] LeetCode #1710 Maximum Units on a Truck
  - [description](https://leetcode.com/problems/maximum-units-on-a-truck/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumUnitsOnTruck.java)
  - hint: sort array by numberOfUnitsPerBox first

- [x] LeetCode #937 Reorder Data in Log Files
  - [description](https://leetcode.com/problems/reorder-data-in-log-files/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ReorderDataInLogFiles.java)
  - hint: `Arrays.sort(arr, (a, b) -> {...})`

- [x] LeetCode #1152 Analyze User Website Visit Pattern
  - [description](https://leetcode.com/problems/reorder-data-in-log-files/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/AnalyzeUserWebsiteVisitPattern.java)
  - hint: build userToSite map by `Map<String, TreeMap<Integer, String>>` where timeToSite map is `TreeMap<Integer, String>`, build sequenceCount map by `Map<String, Integer>`

- [x] LeetCode #1151 Minimum Swaps to Group All 1's Together
  - [description](https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumSwapsToGroupAllOnesTogether.java)
  - hint: result is `allOnes - maxOnesInWindow` where window size is `allOnes` or use deque to maintain the window size

- [x] LeetCode #2134 Minimum Swaps to Group All 1's Together II
  - [description](https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumSwapsToGroupAllOnesTogetherII.java)
  - hint: address circular array by doubling array, the result is `allOnes - maxOnesInWindow` where window size is `allOnes`

- [x] LeetCode #1481 Least Number of Unique Integers after K Removals
  - [description](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/LeastNumberOfUniqueIntegersAfterKRemovals.java)
  - hint: use hashtable to store value with its frequency, use priorityQueue to store values by comparing their frequencies

- [x] LeetCode #986 Interval List Intersections
  - [description](https://leetcode.com/problems/interval-list-intersections/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/IntervalListIntersections.java)
  - hint: two points iterate two arrays, calculate `earlyEnd` and `lateStart`

- [x] LeetCode #1366 Rank Teams by Votes
  - [description](https://leetcode.com/problems/rank-teams-by-votes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/RankTeamsByVotes.java)
  - hint: hashtable `Map<Character, int[]> map`

- [x] LeetCode #1567 Maximum Length of Subarray With Positive Product
  - [description](https://leetcode.com/problems/maximum-length-of-subarray-with-positive-product/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumLengthOfSubarrayWithPositiveProduct.java)
  - hint: record latest zeroIndex(`-1`) and first negativeIndex(`-1`), update max length by `i - zeroIndex` and `i - negativeIndex` only if `negativeCount%2 != 0`

- [x] LeetCode #167 Two Sum II - Input Array Is Sorted (NeetCode 150)
  - [description](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/TwoSumII.java)
  - hint: two pointers

- [x] LeetCode #881 Boats to Save People
  - [description](https://leetcode.com/problems/boats-to-save-people/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/BoatsToSavePeople.java)
  - hint: two pointers + greedy, try to put heaviest and lightest ppl in one boat if possible

- [x] LeetCode #554 Brick Wall
  - [description](https://leetcode.com/problems/brick-wall/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/BrickWall.java)
  - hint: use hashtable to store the width index of bricks with its count, so the result is `wall.size() - maxCount`, not consider the last brick

- [x] LeetCode #118 Pascal's Triangle
  - [description](https://leetcode.com/problems/pascals-triangle/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/PascalTriangle.java)
  - hint: two for-loops

- [x] LeetCode #605 Can Place Flowers
  - [description](https://leetcode.com/problems/can-place-flowers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/CanPlaceFlowers.java)
  - hint: for-loop checks if previous and next flower bed are empty

- [x] LeetCode #838 Push Dominoes
  - [description](https://leetcode.com/problems/push-dominoes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/PushDominoes.java)
  - hint: calculate force on each domino, scan from left to right and right to left

- [x] LeetCode #665 Non-decreasing Array
  - [description](https://leetcode.com/problems/non-decreasing-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/NonDecreasingArray.java)
  - hint: greedy, compare `nums[i - 1]` with `nums[i]`

- [x] LeetCode #75 Sort Colors
  - [description](https://leetcode.com/problems/sort-colors/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SortColors.java)
  - hint: three pointers, current index, zero index and two index

- [x] LeetCode #1498 Number of Subsequences That Satisfy the Given Sum Condition
  - [description](https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/NumberOfSubsequencesThatSatisfyGivenSumCondition.java)
  - hint: two pointers + sorted array + pows array

- [x] LeetCode #1968 Array With Elements Not Equal to Average of Neighbors
  - [description](https://leetcode.com/problems/array-with-elements-not-equal-to-average-of-neighbors/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ArrayWithElementsNotEqualToAverageOfNeighbors.java)
  - hint: greedy + two pointers, use the pattern: small, big, small, big..on sorted array

- [x] LeetCode #16 3Sum Closest
  - [description](https://leetcode.com/problems/3sum-closest/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ThreeSumClosest.java)
  - hint: three pointers, track the diff between current sum and target sum, return `target sum - diff`

- [x] LeetCode #416 Partition Equal Subset Sum
  - [description](https://leetcode.com/problems/partition-equal-subset-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/PartitionEqualSubsetSum.java)
  - hint: dfs + memorization, calculate sum and use half of sum as target sum for subset array, `Boolean memo[index][target sum + 1]`

- [x] LeetCode #39 Combination Sum
  - [description](https://leetcode.com/problems/combination-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/CombinationSum.java)
  - hint: dfs + backtracking

- [x] LeetCode #2244 Minimum Rounds to Complete All Tasks
  - [description](https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumRoundsToCompleteAllTasks.java)
  - hint: count the task's frequency by hashtable, consider the frequency cases: [3k, 3k + 1 and 3k + 2](https://leetcode.com/problems/minimum-rounds-to-complete-all-tasks/editorial/)

- [x] LeetCode #36 Valid Sudoku
  - [description](https://leetcode.com/problems/valid-sudoku/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ValidSudoku.java)
  - hint: hashset, the index of (9) boxes is `(r / 3) * 3 + (c / 3)`

- [x] LeetCode #904 Fruit Into Baskets
  - [description](https://leetcode.com/problems/fruit-into-baskets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FruitIntoBaskets.java)
  - hint: sliding window with two pointers

- [x] LeetCode #1343 Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
  - [description](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/NumOfSubarrays.java)
  - hint: sliding window

- [x] LeetCode #1658 Minimum Operations to Reduce X to Zero
  - [description](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumOperationsToReduceXToZero.java)
  - hint: sliding window

- [x] LeetCode #905 Sort Array By Parity
  - [description](https://leetcode.com/problems/sort-array-by-parity/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SortArrayByParity.java)
  - hint: two pointers

- [x] LeetCode #896 Monotonic Array
  - [description](https://leetcode.com/problems/monotonic-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MonotonicArray.java)
  - hint: one for-loop

- [x] LeetCode #1218 Longest Arithmetic Subsequence of Given Difference
  - [description](https://leetcode.com/problems/longest-arithmetic-subsequence-of-given-difference/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/LongestArithmeticSubsequenceOfGivenDifference.java)
  - hint: one loop + hashtable

- [x] LeetCode #852 Peak Index in a Mountain Array
  - [description](https://leetcode.com/problems/peak-index-in-a-mountain-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/PeakIndexInMountainArray.java)
  - hint: binary search

- [x] LeetCode #1823 Find the Winner of the Circular Game
  - [description](https://leetcode.com/problems/find-the-winner-of-the-circular-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/queue/FindWinnerOfCircularGame.java)
  - hint: use queue to simulate the process

- [x] LeetCode #1838 Frequency of the Most Frequent Element
  - [description](https://leetcode.com/problems/frequency-of-the-most-frequent-element/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FrequencyOfTheMostFrequentElement.java)
  - hint: sliding window

- [x] LeetCode #1493 Longest Subarray of 1's After Deleting One Element
  - [description](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/LongestSubarrayOfOneAfterDeletingOneElement.java)
  - hint: sliding window

- [x] LeetCode #1004 Max Consecutive Ones III
  - [description](https://leetcode.com/problems/max-consecutive-ones-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaxConsecutiveOnesIII.java)
  - hint: sliding window

- [x] LeetCode #2747 Count Zero Request Servers
  - [description](https://leetcode.com/problems/count-zero-request-servers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/CountZeroRequestServers.java)
  - hint: sliding window

- [x] LeetCode #2870 Minimum Number of Operations to Make Array Empty
  - [description](https://leetcode.com/problems/minimum-number-of-operations-to-make-array-empty/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumNumberOfOperationsToMakeArrayEmpty.java)
  - hint: hashtable + greedy

- [x] LeetCode #2007 Find Original Array From Doubled Array
  - [description](https://leetcode.com/problems/find-original-array-from-doubled-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindOriginalArrayFromDoubledArray.java)
  - hint: sort + hashtable

- [x] LeetCode #1700 Number of Students Unable to Eat Lunch
  - [description](https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/NumberOfStudentsUnableToEatLunch.java)
  - hint: hashtable

- [x] LeetCode #163 Missing Ranges
  - [description](https://leetcode.com/problems/missing-ranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MissingRanges.java)
  - hint: check boundaries of sorted array with lower and upper limits, loop the sorted array with checking `nums[i + 1] - nums[i] <= 1`

- [x] LeetCode #2191 Sort the Jumbled Numbers
  - [description](https://leetcode.com/problems/missing-ranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SortTheJumbledNumbers.java)
  - hint: hashtable

- [x] LeetCode #228 Summary Ranges
  - [description](https://leetcode.com/problems/summary-ranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SummaryRanges.java)
  - hint: for loop + while loop `while(i < nums.length - 1 && nums[i + 1] == nums[i] + 1) { i++; }`

- [x] LeetCode #939 Minimum Area Rectangle
  - [description](https://leetcode.com/problems/minimum-area-rectangle/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimumAreaRectangle.java)
  - hint: hashtable

- [x] LeetCode #1695 Maximum Erasure Value
  - [description](https://leetcode.com/problems/maximum-erasure-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MaximumErasureValue.java)
  - hint: two pointers + sliding window + hashset

<!-- - [ ] LeetCode #2439 Minimize Maximum of Array
  - [description](https://leetcode.com/problems/minimize-maximum-of-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MinimizeMaximumOfArray.java)
  - hint:

- [ ] LeetCode #18 4Sum
  - [description](https://leetcode.com/problems/4sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FourSum.java)
  - hint: sorted + two pointers -->

### Binary Search

- [x] LeetCode #540 Single Element in a Sorted Array
  - [description](https://leetcode.com/problems/single-element-in-a-sorted-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/SingleElementInSortedArray.java)
  - hint: check left and right boundaries first, check `nums[mid] == nums[mid + 1]` or `nums[mid] == nums[mid + 1]`, then check if number of elements at right half is even

- [x] LeetCode #875 Koko Eating Bananas (NeetCode 150)
  - [description](https://leetcode.com/problems/koko-eating-bananas/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/KokoEatingBananas.java)
  - hint: binary search with speed k `start=1` and `end=max(piles[x])`, calculate current hours with speed `mid`, compare current hours with provided `h`

- [x] LeetCode #1891 Cutting Ribbons
  - [description](https://leetcode.com/problems/cutting-ribbons/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/CuttingRibbons.java)
  - hint: binary search, start with left `1` and right `max(ribbons)`, calculate current `k` number of ribbons using mid and compare with required `k`

- [x] LeetCode #74 Search a 2D Matrix (NeetCode 150)
  - [description](https://leetcode.com/problems/search-a-2d-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/Search2dMatrix.java)
  - hint: binary search

- [x] LeetCode #278 First Bad Version
  - [description](https://leetcode.com/problems/first-bad-version/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/FirstBadVersion.java)
  - hint: binary search

- [x] LeetCode #678 Find K Closest Elements
  - [description](https://leetcode.com/problems/find-k-closest-elements/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/FindKClosestElements.java)
  - hint: binary search

- [x] LeetCode #1011 Capacity To Ship Packages Within D Days
  - [description](https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/CapacityToShipPackagesWithinDays.java)
  - hint: binary search, simiar to `#875 Koko Eating Bananas`

- [x] LeetCode #1898 Maximum Number of Removable Characters
  - [description](https://leetcode.com/problems/maximum-number-of-removable-characters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/MaximumNumberOfRemovableCharacters.java)
  - hint: binary search

- [x] LeetCode #441 Arranging Coins
  - [description](https://leetcode.com/problems/arranging-coins/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/ArrangingCoins.java)
  - hint: binary search

- [x] LeetCode #2616 Minimize the Maximum Difference of Pairs
  - [description](https://leetcode.com/problems/minimize-the-maximum-difference-of-pairs/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/MinimizeTheMaximumDifferenceOfPairs.java)
  - hint: binary search

- [x] LeetCode #1060 Missing Element in Sorted Array
  - [description](https://leetcode.com/problems/missing-element-in-sorted-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/MissingElementInSortedArray.java)
  - hint: binary search or iteration

- [x] LeetCode #1539 Kth Missing Positive Number
  - [description](https://leetcode.com/problems/kth-missing-positive-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/KthMissingPositiveNumber.java)
  - hint: binary search

- [x] LeetCode #1482 Minimum Number of Days to Make m Bouquets
  - [description](https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binarysearch/MinimumNumberOfDaysToMakeBouquets.java)
  - hint: binary search

### Prefix Sum

- [x] LeetCode #560 Subarray Sum Equals K
  - [description](https://leetcode.com/problems/range-addition/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SubarraySumEqualsK.java)
  - hint: `sum[i, j]` = `prefixSum[0, j]` - `prefixSum[0, i]`, use hastable to store prefix sum and its frequency

- [x] LeetCode #370 Range Addition
  - [description](https://leetcode.com/problems/range-addition/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/RangeAddition.java)
  - hint: prefix sum by only applying value at the index of `start` and `end + 1`

- [x] LeetCode #528 Random Pick with Weight
  - [description](https://leetcode.com/problems/random-pick-with-weight/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/RandomPickWithWeight.java)
  - hint: use prefix sum to build an arry, randomly generate value between `[0, totalSum]`, binary search to return target index

- [x] LeetCode #862 Shortest Subarray with Sum at Least K (Monotonic Queue)
  - [description](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ShortestSubarrayWithSumAtLeastK.java)
  - hint: calculate prefix sum array (size is `array.length + 1`) from `[0]` to `[array.length]`, use deque to store and maintain start indexes, before adding `i` index during iteration, check `prefixSum[i] - prefixSum[startIndexes.peek()] >= k` and `prefixSum[i] <= prefixSum[startIndexes.peekLast()]`

- [x] LeetCode #2100 Find Good Days to Rob the Bank
  - [description](https://leetcode.com/problems/find-good-days-to-rob-the-bank/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindGoodDaysToRobTheBank.java)
  - hint: use to arrays to track non-increase (forward) `nonincrease[i - 1]` and non-decrease (backward) `nondecrease[i + 1]` days at current `day[i]`, use `time` to decide which day is fine

- [x] LeetCode #523 Continuous Subarray Sum
  - [description](https://leetcode.com/problems/continuous-subarray-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/ContinuousSubarraySum.java)
  - hint: prefix + hashmap to find existing remainder value by `% k`

- [x] LeetCode #2055 Plates Between Candles
  - [description](https://leetcode.com/problems/plates-between-candles/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/PlatesBetweenCandles.java)
  - hint: for each index of string, find the index of first left candle and the index of first right candle by using two arrays, count prefix sum of candles for each index, calculate the result by `res[index] = rightCandle - leftCandle + 1 - (candlePrefixSum[rightCandle] - candlePrefixSum[leftCandle] + 1);`

- [x] LeetCode #724 Find Pivot Index
  - [description](https://leetcode.com/problems/find-pivot-index/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindPivotIndex.java)
  - hint: prefix sum

- [x] LeetCode #2017 Grid Game
  - [description](https://leetcode.com/problems/grid-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/GridGame.java)
  - hint: prefix sum, the path of robot 2 is predictable with robot 1's path

- [x] LeetCode #2483 Minimum Penalty for a Shop
  - [description](https://leetcode.com/problems/minimum-penalty-for-a-shop/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MinimumPenaltyForShop.java)
  - hint: prefix sum, assume close at index 0 to calculate penalty, then iterate from index 1 with close

### Dynamic Programming

- [x] LeetCode #741 Cherry Pickup
  - [description](https://leetcode.com/problems/cherry-pickup/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CherryPickup.java)
  - hint: simulate two ppl collect cherries together to right-down corner cell, return `Integer.MIN_VALUE` for invalid path
  
- [x] LeetCode #343 Integer Break
  - [description](https://leetcode.com/problems/integer-break/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/IntegerBreak.java)
  - hint: use dp array to record max product for `i`, the formula is `dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));` where `i` starts with 3 and `j` smaller than `i`

- [x] LeetCode #516 Longest Palindromic Subsequence
  - [description](https://leetcode.com/problems/longest-palindromic-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/LongestPalindromicSubsequence.java)
  - hint: recursion with memorization, similar to #1143 Longest Common Subsequence

- [x] LeetCode #1312 Minimum Insertion Steps to Make a String Palindrome
  - [description](https://leetcode.com/problems/minimum-insertion-steps-to-make-a-string-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MinimumInsertionStepsToMakeStringPalindrome.java)
  - hint: similar to #516 Longest Palindromic Subsequence, figure out minimum number of add or deletion to make string palindrome by `s.length() - lps.length()`

- [x] LeetCode #740 Delete and Earn
  - [description](https://leetcode.com/problems/delete-and-earn/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/DeleteAndEarn.java)
  - hint: convert to #198 house robber

- [x] LeetCode #72 Edit Distance (NeetCode 150)
  - [description](https://leetcode.com/problems/edit-distance/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/EditDistance.java)
  - hint: dfs + memorization (starts with len instead of index)

- [x] LeetCode #1048 Longest String Chain
  - [description](https://leetcode.com/problems/longest-string-chain/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/LongestStringChain.java)
  - hint: dfs + memorization

- [x] LeetCode #1220 Count Vowels Permutation
  - [description](https://leetcode.com/problems/count-vowels-permutation/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CountVowelsPermutation.java)
  - hint: dp to track the number of string ending by each character `['a', 'e', 'i', 'o', 'u']`

- [ ] LeetCode #123 Best Time to Buy and Sell Stock III
  - [description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/BestTimeToBuySndSellStockIII.java)
  - hint: dfs + memorization

- [x] LeetCode #97 Interleaving String (NeetCode 150)
  - [description](https://leetcode.com/problems/interleaving-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/InterleavingString.java)
  - hint: 2D dynamic programming

- [x] LeetCode #494 Target Sum (NeetCode 150)
  - [description](https://leetcode.com/problems/target-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/TargetSum.java)
  - hint: recursion, could add memorization to optimize brute force method

- [x] LeetCode #312 Burst Balloons (NeetCode 150)
  - [description](https://leetcode.com/problems/burst-balloons/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/BurstBalloons.java)
  - hint: dp + memorization, use left and right as range to split one question to sub problems, treat ith boolean to last hit instead of first hit

- [x] LeetCode #115 Distinct Subsequences (NeetCode 150)
  - [description](https://leetcode.com/problems/distinct-subsequences/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/DistinctSubsequences.java)
  - hint: dp + memorization, two string index pointers start with `0`

- [x] LeetCode #10 Regular Expression Matching (NeetCode 150)
  - [description](https://leetcode.com/problems/regular-expression-matching/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/RegularExpressionMatching.java)
  - hint: top-down memoization

- [x] LeetCode #2222 Number of Ways to Select Buildings
  - [description](https://leetcode.com/problems/number-of-ways-to-select-buildings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/NumberOfWaysToSelectBuildings.java)
  - hint: kind of dp, result = number of `1..0..1` + number of `0..1..0` (`..` could be blank), use one loop count number of `1`, `0`, `0..1` and `1..0`

- [x] LeetCode #1553 Minimum Number of Days to Eat N Oranges
  - [description](https://leetcode.com/problems/minimum-number-of-days-to-eat-n-oranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MinimumNumberOfDaysToEatOranges.java)
  - hint: top-down dp + memorization or bfs

- [x] LeetCode #1105 Filling Bookcase Shelves
  - [description](https://leetcode.com/problems/filling-bookcase-shelves/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/FillingBookcaseShelves.java)
  - hint: dfs + memorization

- [x] LeetCode #1387 Sort Integers by The Power Value
  - [description](https://leetcode.com/problems/sort-integers-by-the-power-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/SortIntegersByPowerValue.java)
  - hint: dfs + memorization

- [x] LeetCode #120 Triangle
  - [description](https://leetcode.com/problems/triangle/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/Triangle.java)
  - hint: dfs top-down + memorization

- [x] LeetCode #1706 Where Will the Ball Fall
  - [description](https://leetcode.com/problems/where-will-the-ball-fall/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/WhereWillTheBallFall.java)
  - hint: dfs

- [x] LeetCode #221 Maximal Square
  - [description](https://leetcode.com/problems/maximal-square/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MaximalSquare.java)
  - hint: bottom-up dp to find max length of square

- [x] LeetCode #877 Stone Game
  - [description](https://leetcode.com/problems/stone-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/StoneGame.java)
  - hint: dfs + memorization (same as #486 Predict the Winner)

- [x] LeetCode #799 Champagne Tower
  - [description](https://leetcode.com/problems/champagne-tower/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/ChampagneTower.java)
  - hint: dp

- [x] LeetCode #486 Predict the Winner
  - [description](https://leetcode.com/problems/predict-the-winner/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/PredictTheWinner.java)
  - hint: dfs + memorization

- [x] LeetCode #714 Best Time to Buy and Sell Stock with Transaction Fee
  - [description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/BestTimeToBuyAndSellStockWithTransactionFee.java)
  - hint: dp, two dp arrys of `hold` and `sell`

- [x] LeetCode #2369 Check if There is a Valid Partition For The Array
  - [description](https://leetcode.com/problems/check-if-there-is-a-valid-partition-for-the-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CheckValidPartitionForArray.java)
  - hint: dfs + memorization

- [x] LeetCode #808 Soup Servings
  - [description](https://leetcode.com/problems/soup-servings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/SoupServings.java)
  - hint: dfs + memorization

### Tree

- [x] LeetCode #236 Lowest Common Ancestor of a Binary Tree
  - [description](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/LowestCommonAncestorOfBinaryTree.java)
  - hint: dfs with preorder traversal

- [x] LeetCode #95 Unique Binary Search Trees II
  - [description](https://leetcode.com/problems/unique-binary-search-trees-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/UniqueBinarySearchTreesII.java)
  - hint: recursion (top-down) + calculate sub left tree and sub right tree, store new root node with these two sub trees
  
- [x] LeetCode #96 Unique Binary Search Trees
  - [description](https://leetcode.com/problems/unique-binary-search-trees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/UniqueBinarySearchTrees.java)
  - hint: recursion (top-down) + memorization or dp: `dp[i] += dp[j - 1] (left substree) * dp[i - j] (right subtree)` where `i` is the number of node (value), `j` is the current root

- [x] LeetCode #103 Binary Tree Zigzag Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeZigzagLevelOrderTraversal.java)
  - hint: bfs with queue or dfs recursion

- [x] LeetCode #199 Binary Tree Right Side View
  - [description](https://leetcode.com/problems/binary-tree-right-side-view/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeRightSideView.java)
  - hint: bfs via queue to do level traversal and pick up last node at each level or dfs that starts with rightmost child and tracks the level of tree (node val is added into res only if `level == res.size()`, so that only add single node val per level if any node exists)

- [x] LeetCode #314 Binary Tree Vertical Order Traversal (Tree, BFS, even DFS or HashTable)
  - [description](https://leetcode.com/problems/binary-tree-vertical-order-traversal)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeVerticalOrderTraversal.java)
  - hint: dfs to get min and max vertical levels (root is 0), bfs (two queues) to put node into res with vertical level, or hashtable(treemap, red-black tree) + bfs (two queues)
  
- [x] LeetCode #99 Recover Binary Search Tree
  - [description](https://leetcode.com/problems/recover-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/RecoverBinarySearchTree.java)
  - hint: in-order traversal, use gloabl variables to track the previous, first, and second nodes. At end swap values between first and second nodes.
  
- [x] LeetCode #129 Sum Root to Leaf Numbers
  - [description](https://leetcode.com/problems/sum-root-to-leaf-numbers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SumRootToLeafNumbers.java)
  - hint: dfs recursion with `int currentSum = sum * 10 + node.val`

- [x] LeetCode #222 Count Complete Tree Nodes
  - [description](https://leetcode.com/problems/count-complete-tree-nodes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CountCompleteTreeNodes.java)
  - hint: divide and conquer to get left and right height, then compare heights and do recursion if necessary

- [x] LeetCode #366 Find Leaves of Binary Tree
  - [description](https://leetcode.com/problems/find-leaves-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FindLeavesOfBinaryTree.java)
  - hint: dfs and use height (number of edges to lowest node of subtree) as index of subarray in array

- [x] LeetCode #545 Boundary of Binary Tree
  - [description](https://leetcode.com/problems/boundary-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BoundaryOfBinaryTree.java)
  - hint: three recursion: `findLeftBoundary`, `findRightBoundary` and `findLeaves`

- [x] LeetCode #1372 Longest ZigZag Path in a Binary Tree
  - [description](https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/LongestZigZagPathInBinaryTree.java)
  - hint: use flag `isLeft` and track current path with recursion

- [x] LeetCode #333 Largest BST Subtree
  - [description](https://leetcode.com/problems/largest-bst-subtree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/LargestBstSubtree.java)
  - hint: use an array `{ min, max, size }` as a recursion func's result, similar to `Validate Binary Search Tree`

- [x] LeetCode #543 Diameter of Binary Tree
  - [description](https://leetcode.com/problems/diameter-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/DiameterOfBinaryTree.java)
  - hint: dfs, get length of left and right paths recursively

- [x] LeetCode #2096 Step-By-Step Directions From a Binary Tree Node to Another
  - [description](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/StepByStepDirectionsFromBinaryTreeNodeToAnother.java)
  - hint: find LCA of two nodes, traversal from LCA node to two nodes (start, end nodes) by recursion and backtracking to build the path, combine two path together (reverse the path from LCA node to start node, all `U`)

- [x] LeetCode #1448 Count Good Nodes in Binary Tree
  - [description](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CountGoodNodesInBinaryTree.java)
  - hint: dfs pre-order traversal + compare node val with current max

- [x] LeetCode #337 House Robber III
  - [description](https://leetcode.com/problems/house-robber-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/HouseRobberIII.java)
  - hint: dfs, use `new int[2]` as output of helper func, 2 array elements means two states: rob and non-rob

- [x] LeetCode #589 N-ary Tree Preorder Traversal
  - [description](https://leetcode.com/problems/n-ary-tree-preorder-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/NaryTreePreorderTraversal.java)
  - hint: preorder traversal by dfs

- [x] LeetCode #110 Balanced Binary Tree
  - [description](https://leetcode.com/problems/balanced-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BalancedBinaryTree.java)
  - hint: calculate height of current node's left subtree and right substree recusively

- [x] LeetCode #437 Path Sum III
  - [description](https://leetcode.com/problems/path-sum-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/PathSumIII.java)
  - hint: prefix sum + hashtable + preorder + backtracking

- [x] LeetCode #108 Convert Sorted Array to Binary Search Tree
  - [description](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConvertSortedArrayToBinarySearchTree.java)
  - hint: dfs + left and right pointer of array

- [x] LeetCode #101 Symmetric Tree
  - [description](https://leetcode.com/problems/symmetric-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SymmetricTree.java)
  - hint: dfs, similar to Same Tree

- [x] LeetCode #662 Maximum Width of Binary Tree
  - [description](https://leetcode.com/problems/maximum-width-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/MaximumWidthOfBinaryTree.java)
  - hint: bfs, two queues: one is to track index of node, the other is to track tree node itself, check rightmost index and leftmost index: `width = rightmost - leftmost + 1`

- [x] LeetCode #938 Range Sum of BST
  - [description](https://leetcode.com/problems/range-sum-of-bst/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/RangeSumOfBST.java)
  - hint: dfs recursion

- [x] LeetCode #450 Delete Node in a BST
  - [description](https://leetcode.com/problems/delete-node-in-a-bst/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/DeleteNodeInBST.java)
  - hint: dfs recursion

- [x] LeetCode #701 Insert into a Binary Search Tree
  - [description](https://leetcode.com/problems/insert-into-a-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/InsertIntoBinarySearchTree.java)
  - hint: dfs recursion

- [x] LeetCode #1361 Validate Binary Tree Nodes
  - [description](https://leetcode.com/problems/validate-binary-tree-nodes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ValidateBinaryTreeNodes.java)
  - hint: check all nodes connected without a cycle and it is directed graph by dfs or bfs

- [x] LeetCode #515 Find Largest Value in Each Tree Row
  - [description](https://leetcode.com/problems/find-largest-value-in-each-tree-row/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FindLargestValueInEachTreeRow.java)
  - hint: bfs with queue or dfs with tracking depth

- [x] LeetCode #1110 Delete Nodes And Return Forest
  - [description](https://leetcode.com/problems/delete-nodes-and-return-forest/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/DeleteNodesAndReturnForest.java)
  - hint: dfs

- [x] LeetCode #1530 Number of Good Leaf Nodes Pairs
  - [description](https://leetcode.com/problems/delete-nodes-and-return-forest/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/NumberOfGoodLeafNodesPairs.java)
  - hint: dfs

- [x] LeetCode #1161 Maximum Level Sum of a Binary Tree
  - [description](https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/MaximumLevelSumOfBinaryTree.java)
  - hint: dfs or bfs

- [x] LeetCode #652 Find Duplicate Subtrees
  - [description](https://leetcode.com/problems/find-duplicate-subtrees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FinDuplicateSubtrees.java)
  - hint: preorder dfs + hashtable

- [x] LeetCode #894 All Possible Full Binary Trees
  - [description](https://leetcode.com/problems/all-possible-full-binary-trees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/AllPossibleFullBinaryTrees.java)
  - hint: dfs + memorization

- [x] LeetCode #1382 Balance a Binary Search Tree
  - [description](https://leetcode.com/problems/balance-a-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BalanceBinarySearchTree.java)
  - hint: in-order traversal to get list of tree nodes + recontruct BST with index of list

- [x] LeetCode #1302 Deepest Leaves Sum
  - [description](https://leetcode.com/problems/deepest-leaves-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/DeepestLeaveSum.java)
  - hint: bfs

- [x] LeetCode #530 Minimum Absolute Difference in BST
  - [description](https://leetcode.com/problems/minimum-absolute-difference-in-bst/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/MinimumAbsoluteDifferenceInBST.java)
  - hint: in-order traversal + dfs

- [x] LeetCode #1305 All Elements in Two Binary Search Trees
  - [description](https://leetcode.com/problems/all-elements-in-two-binary-search-trees/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/AllElementsInTwoBinarySearchTrees.java)
  - hint: in-order traversal + two queues iteration

- [x] LeetCode #1008 Construct Binary Search Tree from Preorder Traversal
  - [description](https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConstructBinarySearchTreeFromPreorderTraversal.java)
  - hint: dfs, similar to #105

- [x] LeetCode #2265 Count Nodes Equal to Average of Subtree
  - [description](https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CountNodesEqualToAverageOfSubtree.java)
  - hint: dfs

- [x] LeetCode #1038 Binary Search Tree to Greater Sum Tree
  - [description](https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinarySearchTreeToGreaterSumTree.java)
  - hint: dfs (reverse inorder)

- [x] LeetCode #270 Closest Binary Search Tree Value
  - [description](https://leetcode.com/problems/closest-binary-search-tree-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ClosestBinarySearchTreeValue.java)
  - hint: while loop by comparing node val with target `root = root.val > target ? root.left : root.right;`

- [x] LeetCode #536 Construct Binary Tree from String
  - [description](https://leetcode.com/problems/construct-binary-tree-from-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConstructBinaryTreeFromString.java)
  - hint: stack

- [x] LeetCode #958 Check Completeness of a Binary Tree
  - [description](https://leetcode.com/problems/check-completeness-of-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CheckCompletenessOfBinaryTree.java)
  - hint: bfs, after first null node, the rest should be all of null nodes

- [x] LeetCode #606 Construct String from Binary Tree
  - [description](https://leetcode.com/problems/construct-string-from-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConstructStringFromBinaryTree.java)
  - hint: dfs

<!-- - [x] LeetCode #1104 Path In Zigzag Labelled Binary Tree
  - [description](https://leetcode.com/problems/path-in-zigzag-labelled-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/PathInZigzagLabelledBinaryTree.java)
  - hint: math -->

### LinkedList

- [x] LeetCode #61 Rotate List
  - [description](https://leetcode.com/problems/rotate-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RotateList.java)
  - hint: make the linked list to a circle and count total number `n` of nodes, then iterate nodes and return new head using `n - k % n - 1`

- [x] LeetCode #1019 Next Greater Node In Linked List
  - [description](https://leetcode.com/problems/next-greater-node-in-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/NextGreaterNodeInLinkedList.java)
  - hint: use list to store all nodes, use monotonic stack to find array of next greater node

- [x] LeetCode #2130 Maximum Twin Sum of a Linked List
  - [description](https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/MaximumTwinSumOfLinkedList.java)
  - hint: two points to break linkedlist into two parts, reverse second one, iterate two linkedlist

- [x] LeetCode #25 Reverse Nodes in k-Group (NeetCode 150)
  - [description](https://leetcode.com/problems/reverse-nodes-in-k-group/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/ReverseNodesInKGroup.java)
  - hint: reverse the linkedlist by recursion (using sub-linkedlist as split by group size `k`)

- [x] LeetCode #138 Copy List with Random Pointer (NeetCode 150)
  - [description](https://leetcode.com/problems/reverse-nodes-in-k-group/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/CopyListWithRandomPointer.java)
  - hint: hashtable of `<orignialNode, copiedNode>`

- [x] LeetCode #287 Find the Duplicate Number (NeetCode 150)
  - [description](https://leetcode.com/problems/find-the-duplicate-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/FindTheDuplicateNumber.java)
  - hint: linkedlist cycle detection by slow and fast pointers, floyd’s algorithm to find intersaction point

- [x] LeetCode #2 Add Two Numbers (NeetCode 150)
  - [description](https://leetcode.com/problems/add-two-numbers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/AddTwoNumbers.java)
  - hint: two linklist node pointers with while loop, take care of `carry` by `sum / 10`

- [x] LeetCode #328 Odd Even Linked List
  - [description](https://leetcode.com/problems/odd-even-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/OddEvenLinkedList.java)
  - hint: two linklist node pointers, also track evenHead

- [x] LeetCode #876 Middle of the Linked List
  - [description](https://leetcode.com/problems/middle-of-the-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/MiddleOfLinkedList.java)
  - hint: slow and fast pointers

- [x] LeetCode #142 Linked List Cycle II
  - [description](https://leetcode.com/problems/linked-list-cycle-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/LinkedListCycleII.java)
  - hint: slow and fast pointers

- [x] LeetCode #234 Palindrome Linked List
  - [description](https://leetcode.com/problems/palindrome-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/PalindromeLinkedList.java)
  - hint: slow and fast pointers, reverse second part and compare two sub linkedlists

- [x] LeetCode #148 Sort List
  - [description](https://leetcode.com/problems/sort-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/SortList.java)
  - hint: slow and fast pointers to split the linked list into two parts, sort on each part and merge them recursively (merge sort)

- [x] LeetCode #24 Swap Nodes in Pairs
  - [description](https://leetcode.com/problems/swap-nodes-in-pairs/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/SwapNodesInPairs.java)
  - hint: recursion

- [x] LeetCode #1171 Remove Zero Sum Consecutive Nodes from Linked List
  - [description](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RemoveZeroSumConsecutiveNodesFromLinkedList.java)
  - hint: prefix sum + hashmap

- [x] LeetCode #430 Flatten a Multilevel Doubly Linked List
  - [description](https://leetcode.com/problems/flatten-a-multilevel-doubly-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/FlattenMultilevelDoublyLinkedList.java)
  - hint: recursion

- [x] LeetCode #2487 Remove Nodes From Linked List
  - [description](https://leetcode.com/problems/remove-nodes-from-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RemoveNodesFromLinkedList.java)
  - hint: recursion

- [x] LeetCode #160 Intersection of Two Linked Lists
  - [description](https://leetcode.com/problems/intersection-of-two-linked-lists/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/IntersectionOfTwoLinkedLists.java)
  - hint: hashset or two pointers

- [x] LeetCode #708 Insert into a Sorted Circular Linked List
  - [description](https://leetcode.com/problems/insert-into-a-sorted-circular-linked-list//)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/InsertIntoSortedCircularLinkedList.java)
  - hint: two pointers

### Stack

- [x] LeetCode #71 Simplify Path
  - [description](https://leetcode.com/problems/simplify-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SimplifyPath.java)
  - hint: use stack to track the parent directory, `..` triggers `stack.pop()` and `dir` triggers `stack.push(dir)`

- [x] LeetCode #173 Binary Search Tree Iterator (Tree)
  - [description](https://leetcode.com/problems/binary-search-tree-iterator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinarySearchTreeIterator.java)
  - hint: keep pushing left node into stack, if stack is not empty, it means `hasNext()` returns true. `next()` add right node into stack

- [x] LeetCode #496 Next Greater Element I
  - [description](https://leetcode.com/problems/next-greater-element-i/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/NextGreaterElementI.java)
  - hint: use stack to store the number that hasn't found next greater element, pop up if current one `>` peek of stack

- [x] LeetCode #503 Next Greater Element II
  - [description](https://leetcode.com/problems/next-greater-element-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/NextGreaterElementII.java)
  - hint: compared to #496 Next Greater Element I, loop twice and use stack to sore index instead

- [x] LeetCode #901 Online Stock Span
  - [description](https://leetcode.com/problems/online-stock-span/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/StockSpanner.java)
  - hint: use monotonic stack to track consecutive days with less than or equal price of the day by `stack<int[]>` where `arr[0]` is the price and `arr[1]` is the number of consecutive days.

- [x] LeetCode #1249 Minimum Remove to Make Valid Parentheses
  - [description](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MinimumRemoveToMakeValidParentheses.java)
  - hint: use stack to push index of `(`, pop index of `(` if see `)`, record index `)` if stack is empty, any index of `(` in stack left, need to remove, and any recorded index `)`, need to remove

- [x] LeetCode #921 Minimum Add to Make Parentheses Valid
  - [description](https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MinimumAddToMakeParenthesesValid.java)
  - hint: similar to #1249 Minimum Remove to Make Valid Parentheses, use count add `(` at left side to record number of index `)` if stack is empty, return `stack.size() + count`

- [x] LeetCode #772  Basic Calculator
  - [description](https://leetcode.com/problems/basic-calculator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BasicCalculator.java)
  - hint: use one stack to store nums and the other to store operators, handle edge cases of `-(1 + 1)` and `1-(-2)` carefully

- [x] LeetCode #772 Basic Calculator II
  - [description](https://leetcode.com/problems/basic-calculator-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BasicCalculatorII.java)
  - hint: use one stack to store nums and the other to store operators

- [x] LeetCode #772 Basic Calculator III
  - [description](https://leetcode.com/problems/basic-calculator-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BasicCalculatorIII.java)
  - hint: use one stack to store nums and the other to store operators/parenthese

- [x] LeetCode #1597 Build Binary Expression Tree From Infix Expression
  - [description](https://leetcode.com/problems/build-binary-expression-tree-from-infix-expression/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BuildBinaryExpressionTreeFromInfixExpression.java)
  - hint: use one stack to store nums and the other to store operators, create node instead of making operation

- [x] LeetCode #277 Find the Celebrity
  - [description](https://leetcode.com/problems/find-the-celebrity/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/FindTheCelebrity.java)
  - hint: push all people into stack, every time `pop()` two people to check, `push()` the people back to stack if he is possible celebrity

- [x] LeetCode #907 Sum of Subarray Minimums
  - [description](https://leetcode.com/problems/sum-of-subarray-minimums/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/SumOfSubarrayMinimums.java)
  - hint: monotonic stack to find index of preSmaller and nextSmaller for `arr[i]`

- [x] LeetCode #2281 Sum of Total Strength of Wizards
  - [description](https://leetcode.com/problems/sum-of-total-strength-of-wizards/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/SumOfTotalStrengthOfWizards.java)
  - hint: similar to `Sum of Subarray Minimums`, see the detailed comments within the code

- [x] LeetCode #2104 Sum of Subarray Ranges
  - [description](https://leetcode.com/problems/sum-of-subarray-ranges/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/SumOfSubarrayRanges.java)
  - hint: similar to `Sum of Subarray Minimums`, could user monotonic stack to find index of preSmaller nextSmaller, preGreater and nextGreater for `arr[i]`

- [x] LeetCode #735 Asteroid Collision
  - [description](https://leetcode.com/problems/asteroid-collision/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/AsteroidCollision.java)
  - hint: use stack to simulate the asteroid collision

- [x] LeetCode #1047 Remove All Adjacent Duplicates In String
  - [description](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/RemoveAllAdjacentDuplicatesInString.java)
  - hint: stack

- [x] LeetCode #1209 Remove All Adjacent Duplicates In String II
  - [description](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/RemoveAllAdjacentDuplicatesInStringII.java)
  - hint: stack

- [x] LeetCode #1963 Minimum Number of Swaps to Make the String Balanced
  - [description](https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MinimumNumberOfSwapsToMakeStringBalanced.java)
  - hint: stack, trick is to calculate number of swap based size of stack, looking for a pattern, one swap could remove 4 invalid chars

- [x] LeetCode #1653 Minimum Deletions to Make String Balanced
  - [description](https://leetcode.com/problems/minimum-deletions-to-make-string-balanced/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MinimumDeletionsToMakeStringBalanced.java)
  - hint: stack

- [x] LeetCode #456 132 Pattern
  - [description](https://leetcode.com/problems/132-pattern/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/132Pattern.java)
  - hint: stack and scan from right to left

- [x] LeetCode #1762 Buildings With an Ocean View
  - [description](https://leetcode.com/problems/buildings-with-an-ocean-view/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BuildingsWithAnOceanView.java)
  - hint: monotonic stack

- [x] LeetCode #636 Exclusive Time of Functions
  - [description](https://leetcode.com/problems/exclusive-time-of-functions/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/ExclusiveTimeOfFunctions.java)
  - hint: use stack to store function id, and track the previous timestamp, branch code based on `start` or `end`

- [x] LeetCode #150 Evaluate Reverse Polish Notation
  - [description](https://leetcode.com/problems/evaluate-reverse-polish-notation/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/EvaluateReversePolishNotation.java)
  - hint: one stack for operands

- [x] LeetCode #739 Daily Temperatures (NeetCode 150)
  - [description](https://leetcode.com/problems/daily-temperatures/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/DailyTemperatures.java)
  - hint: monotonic stack

- [x] LeetCode #853 Car Fleet (NeetCode 150)
  - [description](https://leetcode.com/problems/car-fleet/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/CarFleet.java)
  - hint: sorting + monotonic stack, calculate time based on distance and speed and sort data based on position/distance

- [x] LeetCode #84 Largest Rectangle in Histogram (NeetCode 150)
  - [description](https://leetcode.com/problems/largest-rectangle-in-histogram/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/LargestRectangleInHistogram.java)
  - hint: monotonic stack `Stack<int[index, height]>()`, look backward with `start index` with current height to push into stack if height decreases, look forward with non-empty stack (increasing height)

- [x] LeetCode #1944 Number of Visible People in a Queue
  - [description](https://leetcode.com/problems/number-of-visible-people-in-a-queue/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/NumberOfVisiblePeopleInQueue.java)
  - hint: monotonic stack, similar to next greater element

- [x] LeetCode #402 Remove K Digits
  - [description](https://leetcode.com/problems/remove-k-digits/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/RemoveKDigits.java)
  - hint: stack + StringBuilder

- [x] LeetCode #895 Maximum Frequency Stack
  - [description](https://leetcode.com/problems/maximum-frequency-stack/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MaximumFrequencyStack.java)
  - hint: two hashmaps: `Map<Integer, Integer> freqOfVal; Map<Integer, Stack<Integer>> freqToVals;`

- [x] LeetCode #844 Backspace String Compare
  - [description](https://leetcode.com/problems/backspace-string-compare/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/BackspaceStringCompare.java)
  - hint: two stacks

- [x] LeetCode #394 Decode String
  - [description](https://leetcode.com/problems/decode-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/DecodeString.java)
  - hint: two stacks, one for digit value, the other for preious string result, track current built string

- [x] LeetCode #32 Longest Valid Parentheses
  - [description](https://leetcode.com/problems/longest-valid-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/LongestValidParentheses.java)
  - hint: stack with tracking the start index

- [x] LeetCode #316 Remove Duplicate Letters
  - [description](https://leetcode.com/problems/remove-duplicate-letters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/RemoveDuplicateLetters.java)
  - hint: greedy + stack + hashmap to track last index of char presence, same as #1081

- [x] LeetCode #946 Validate Stack Sequences
  - [description](https://leetcode.com/problems/validate-stack-sequences/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/ValidateStackSequences.java)
  - hint: stack with pointer

- [x] LeetCode #856 Score of Parentheses
  - [description](https://leetcode.com/problems/score-of-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/ScoreOfParentheses.java)
  - hint: stack with tracking the score integer instead of char

- [x] LeetCode #2751 Robot Collisions
  - [description](https://leetcode.com/problems/robot-collisions/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/RobotCollisions.java)
  - hint: stack

- [x] LeetCode #1793 Maximum Score of a Good Subarray
  - [description](https://leetcode.com/problems/maximum-score-of-a-good-subarray/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MaximumScoreOfGoodSubarray.java)
  - hint: monotonic stack to track previus and next smaller elements

- [x] LeetCode #1541 Minimum Insertions to Balance a Parentheses String
  - [description](https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/MinimumInsertionsToBalanceParenthesesString.java)
  - hint: stack, similar to #921 Minimum Add to Make Parentheses Valid

- [x] LeetCode #388 Longest Absolute File Path
  - [description](https://leetcode.com/problems/longest-absolute-file-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/LongestAbsoluteFilePath.java)
  - hint: stack, split string by `\n`, use nums of `\t` to determine the depth of path

### String

- [x] LeetCode #71 Simplify Path
  - [description](https://leetcode.com/problems/simplify-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SimplifyPath.java)
  - hint: use stack to track the parent directory, `..` triggers `stack.pop()` and `dir` triggers `stack.push(dir)`

- [x] LeetCode #680 Valid Palindrome II
  - [description](https://leetcode.com/problems/valid-palindrome-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindromeII.java)
  - hint: two pointers, recursively to check if it is palindrom

- [x] LeetCode #828 Count Unique Characters of All Substrings of a Given String
  - [description](https://leetcode.com/problems/count-unique-characters-of-all-substrings-of-a-given-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/CountUniqueCharactersOfAllSubstringsoOfGivenString.java)
  - hint: use two arrays to find most left and right positions of char at each index in string, result will be calculated by `res += (i - leftBound + 1) * (rightBound - i + 1)`

- [x] LeetCode #696 Count Binary Substrings
  - [description](https://leetcode.com/problems/count-binary-substrings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/CountBinarySubstrings.java)
  - hint: two pointers: `curRunLength` and `preRunLength`, `res++` only when `preRunLength >= curRunLength`

- [x] LeetCode #926 Flip String to Monotone Increasing
  - [description](https://leetcode.com/problems/flip-string-to-monotone-increasing/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/FlipStringToMonotoneIncreasing.java)
  - hint: use `flipCount` to track `flip 0 -> 1`, and `oneCount` to track `flip 1 -> 0`, do `flipCount = oneCount` if `oneCount < flipCount`

- [x] LeetCode #809 Expressive Words
  - [description](https://leetcode.com/problems/expressive-words/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ExpressiveWords.java)
  - hint: two pointers

- [x] LeetCode #443 String Compression
  - [description](https://leetcode.com/problems/string-compression/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/StringCompression.java)
  - hint: two pointers

- [x] LeetCode #415 Add Strings
  - [description](https://leetcode.com/problems/add-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/AddStrings.java)
  - hint: two pointers

- [x] LeetCode #1268 Search Suggestions System
  - [description](https://leetcode.com/problems/search-suggestions-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SearchSuggestionsSystem.java)  
  - hint: trie, treeNode has additional property `linkedList<String>`, so size could be limited to 3 and sorted by `Collections.sort()`

- [x] LeetCode #249 Group Shifted Strings
  - [description](https://leetcode.com/problems/group-shifted-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/GroupShiftedStrings.java)
  - hint: hashtable

- [x] LeetCode #791 Custom Sort String
  - [description](https://leetcode.com/problems/custom-sort-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/CustomSortString.java)
  - hint: hashtable

- [x] LeetCode #567 Permutation in String
  - [description](https://leetcode.com/problems/permutation-in-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/PermutationInString.java)
  - hint: hashtable + sliding window

- [x] LeetCode #1055 Shortest Way to Form String
  - [description](https://leetcode.com/problems/shortest-way-to-form-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ShortestWayToFormString.java)
  - hint: while loop starts with index of target string, within while loop to do for loop on the source string

- [x] LeetCode #187 Repeated DNA Sequences
  - [description](https://leetcode.com/problems/repeated-dna-sequences/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/RepeatedDnaSequences.java)
  - hint: hashSet

- [x] LeetCode #953 Verifying an Alien Dictionary
  - [description](https://leetcode.com/problems/verifying-an-alien-dictionary/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/VerifyingAnAlienDictionary.java)
  - hint: hashtable

- [x] LeetCode #14 Longest Common Prefix
  - [description](https://leetcode.com/problems/longest-common-prefix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestCommonPrefix.java)
  - hint: sort the array of strings, compare first string with last one with index increment, or trie

- [x] LeetCode #792 Number of Matching Subsequences
  - [description](https://leetcode.com/problems/number-of-matching-subsequences/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/NumberOfMatchingSubsequences.java)
  - hint: hashtable + two pointers (Is Subsequence)

- [x] LeetCode #392 Is Subsequence
  - [description](https://leetcode.com/problems/is-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/IsSubsequence.java)
  - hint: two pointers or binary search

- [x] LeetCode #28 Find the Index of the First Occurrence in a String
  - [description](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/FindIndexOfFirstOccurrenceInString.java)
  - hint: two pointers

- [x] LeetCode #205 Isomorphic Strings
  - [description](https://leetcode.com/problems/isomorphic-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/IsomorphicStrings.java)
  - hint: hashtable

- [x] LeetCode #438 Find All Anagrams in a String
  - [description](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/FindAllAnagramsInString.java)
  - hint: sliding window + hashtable + two pointers

- [x] LeetCode #299 Bulls and Cows
  - [description](https://leetcode.com/problems/bulls-and-cows/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/BullsAndCows.java)
  - hint: hashtable with counting frequency of digit

- [x] LeetCode #43 Multiply Strings
  - [description](https://leetcode.com/problems/multiply-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MultiplyStrings.java)
  - hint: `result[i+j+1] = (nums[i] * nums[j]) % 10` and `result[i+j] = (nums[i] * nums[j]) / 10`

- [x] LeetCode #2131 Longest Palindrome by Concatenating Two Letter Words
  - [description](https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestPalindromeByConcatenatingTwoLetterWords.java)
  - hint: use hashtable to store string with its frequency, and check reverse of string's existence in hashtable

- [x] LeetCode #13 Roman to Integer
  - [description](https://leetcode.com/problems/roman-to-integer/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/RomanToInteger.java)
  - hint: use hashtable to map each Roman char to integer, compare preious and current Roman char to decide add the `value of current char` or `(value of current char - value of preious char)`, e.g. `IV = 5 - 1 = 4`

- [x] LeetCode #179 Largest Number
  - [description](https://leetcode.com/problems/largest-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LargestNumber.java)
  - hint: sort the string of num by `(num2 + num1).compareTo(num1 + num2)`

- [x] LeetCode #1071 Greatest Common Divisor of Strings
  - [description](https://leetcode.com/problems/greatest-common-divisor-of-strings/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/GreatestCommonDivisorOfStrings.java)
  - hint: loop with length range from `Math.min(str1.length(), str2.length()) to 1`

- [x] LeetCode #1647 Minimum Deletions to Make Character Frequencies Unique
  - [description](https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MinimumDeletionsToMakeCharacterFrequenciesUnique.java)
  - hint: hashtable (char frequency) + maxHeap (compare `poll()` with `peek()`) + greedy

- [x] LeetCode #880 Decoded String at Index
  - [description](https://leetcode.com/problems/decoded-string-at-index/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/DecodedStringAtIndex.java)
  - hint: stack or loop string backward (Math)

- [x] LeetCode #2384 Largest Palindromic Number
  - [description](https://leetcode.com/problems/largest-palindromic-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LargestPalindromicNumber.java)
  - hint: hashtable + greedy

- [x] LeetCode #340 Longest Substring with At Most K Distinct Characters
  - [description](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestSubstringWithAtMostKDistinctCharacters.java)
  - hint: sliding window

- [x] LeetCode #2781 Length of the Longest Valid Substring
  - [description](https://leetcode.com/problems/length-of-the-longest-valid-substring/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LengthOfLongestValidSubstring.java)
  - hint: trie + sliding window

- [x] LeetCode #1297 Maximum Number of Occurrences of a Substring
  - [description](https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MaximumNumberOfOccurrencesOfSubstring.java)
  - hint: sliding window

- [x] LeetCode #214 Shortest Palindrome
  - [description](https://leetcode.com/problems/shortest-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ShortestPalindrome.java)
  - hint: recursion

- [x] LeetCode #451 Sort Characters By Frequency
  - [description](https://leetcode.com/problems/sort-characters-by-frequency/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SortCharactersByFrequency.java)
  - hint: hashtable + priorityQueue

- [x] LeetCode #186 Reverse Words in a String II
  - [description](https://leetcode.com/problems/reverse-words-in-a-string-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ReverseWordsInStringII.java)
  - hint: two pointers

- [x] LeetCode #3016 Minimum Number of Pushes to Type Word II
  - [description](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MinimumNumberOfPushesToTypeWordII.java)
  - hint: use hashtable to store the frequency of characters, then sort and be greedy

- [x] LeetCode #1422 Maximum Score After Splitting a String
  - [description](https://leetcode.com/problems/maximum-score-after-splitting-a-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MaximumScoreAfterSplittingString.java)
  - hint: `result = Max(leftZero + rightOne) = Max(leftZero + (totalOne - leftOne)) = Max(leftZero - leftOne) + totalOne`

- [x] LeetCode #2325 Decode the Message
  - [description](https://leetcode.com/problems/decode-the-message/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/DecodeTheMessage.java)
  - hint: hashtable

- [ ] LeetCode #2024 Maximize the Confusion of an Exam
  - [description](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/MaximizeConfusionOfExam.java)
  - hint: sliding window with hashtable

### Greedy

- [x] LeetCode #134 Gas Station
  - [description](https://leetcode.com/problems/gas-station/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/GasStation.java)
  - hint: record current gas amount and total gas amount across all stations, update res station if current gas amount is negative, check total gas amount at end for returning `-1`

- [x] LeetCode #45 Jump Game II
  - [description](https://leetcode.com/problems/jump-game-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/JumpGameII.java)
  - hint: bfs or greedy

- [x] LeetCode #763 Partition Labels (NeetCode 150)
  - [description](https://leetcode.com/problems/partition-labels/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/PartitionLabels.java)
  - hint: use hashtable to track last index of char in the string, greedily split the string at at the last index of any char

- [x] LeetCode #1029 Two City Scheduling
  - [description](https://leetcode.com/problems/two-city-scheduling/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/TwoCityScheduling.java)
  - hint: dfs + memo or greedy: sort costs array by letting ppl go to B instead Of A `diff = cost[i][1] - cost[i][0]`, iterate sorted array to calculate cost

- [x] LeetCode #2214 Minimum Health to Beat Game
  - [description](https://leetcode.com/problems/minimum-health-to-beat-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MinimumHealthToBeatGame.java)
  - hint: greedy

- [x] LeetCode #1899 Merge Triplets to Form Target Triplet (NeetCode 150)
  - [description](https://leetcode.com/problems/merge-triplets-to-form-target-triplet/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MergeTripletsToFormTargetTriplet.java)
  - hint: greedy, skip invalid triplets that has greater value than target one, build the final triplet and check if it is equal to target one

- [x] LeetCode #678 Valid Parenthesis String (NeetCode 150)
  - [description](https://leetcode.com/problems/valid-parenthesis-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/ValidParenthesisString.java)
  - hint: two stacks to iterate each char or greedy using min and mix number of left parenthesis

- [x] LeetCode #2193 Minimum Number of Moves to Make Palindrome
  - [description](https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MinimumNumberOfMovesToMakePalindrome.java)
  - hint: find `String.lastIndexOf()` of first char and `String.indexOf()` of last char, compare the steps move them into palindrome position, `substring` string for each round

- [x] LeetCode #1921 Eliminate Maximum Number of Monsters
  - [description](https://leetcode.com/problems/eliminate-maximum-number-of-monsters/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/EliminateMaximumNumberOfMonsters.java)
  - hint: sort an array of arrival time

- [x] LeetCode #2136 Earliest Possible Day of Full Bloom
  - [description](https://leetcode.com/problems/earliest-possible-day-of-full-bloom/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/EarliestPossibleDayOfFullBloom.java)
  - hint: early plant the seed which takes longer to glow, so that it bloom earlier, sorting + greedy

- [x] LeetCode #1529 Minimum Suffix Flips
  - [description](https://leetcode.com/problems/minimum-suffix-flips/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MinimumSuffixFlips.java)
  - hint: check current char with previous one, flip count + 1 if they are different

- [x] LeetCode #1328 Break a Palindrome
  - [description](https://leetcode.com/problems/break-a-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/BreakPalindrome.java)
  - hint: check any char is not `a`, change the char to `a` if found, otherwise set last char to `b`

- [x] LeetCode #1605 Find Valid Matrix Given Row and Column Sums
  - [description](https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/FindValidMatrixGivenRowAndColumnSums.java)
  - hint: greedy

- [ ] LeetCode #2952 Minimum Number of Coins to be Added
  - [description](https://leetcode.com/problems/minimum-number-of-coins-to-be-added/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MinimumNumberOfCoinsToBeAdded.java)
  - hint: greedy

- [x] LeetCode #135 Candy
  - [description](https://leetcode.com/problems/candy/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/Candy.java)
  - hint: greedy

- [x] LeetCode #1642 Furthest Building You Can Reach
  - [description](https://leetcode.com/problems/furthest-building-you-can-reach/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/FurthestBuildingYouCanReach.java)
  - hint: greedy using miniheap

- [x] LeetCode #2144 Minimum Cost of Buying Candies With Discount
  - [description](https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/MinimumCostOfBuyingCandiesWithDiscount.java)
  - hint: greedy

### Backtracking

- [x] LeetCode #40 Combination Sum II
  - [description](https://leetcode.com/problems/combination-sum-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/CombinationSumII.java)
  - hint: dfs + backtracking

- [x] LeetCode #526 Beautiful Arrangement
  - [description](https://leetcode.com/problems/beautiful-arrangement/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/BeautifulArrangement.java)
  - hint: try every number at each index position, dfs + backtracking

- [x] LeetCode #94 Restore IP Addresses
  - [description](https://leetcode.com/problems/restore-ip-addresses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/RestoreIpAddresses.java)
  - hint: dfs + backtracking

- [x] LeetCode #131 Palindrome Partitioning
  - [description](https://leetcode.com/problems/palindrome-partitioning/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/PalindromePartitioning.java)
  - hint: dfs + backtracking

- [x] LeetCode #2151 Maximum Good People Based on Statements
  - [description](https://leetcode.com/problems/maximum-good-people-based-on-statements/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/MaximumGoodPeopleBasedOnStatements.java)
  - hint: dfs + backtracking

- [x] LeetCode #51 N-Queens
  - [description](https://leetcode.com/problems/n-queens/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/NQueens.java)
  - hint: dfs + backtracking

- [x] LeetCode #46 Permutations
  - [description](https://leetcode.com/problems/permutations/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/Permutations.java)
  - hint: dfs + backtracking

- [x] LeetCode #17 Letter Combinations of a Phone Number
  - [description](https://leetcode.com/problems/letter-combinations-of-a-phone-number/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/LetterCombinationsOfPhoneNumber.java)
  - hint: dfs + backtracking

- [x] LeetCode #140 Word Break II
  - [description](https://leetcode.com/problems/word-break-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/WordBreakII.java)
  - hint: dfs + backtracking

- [x] LeetCode #473 Matchsticks to Square
  - [description](https://leetcode.com/problems/matchsticks-to-square/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/MatchsticksToSquare.java)
  - hint: dfs + backtracking

- [x] LeetCode #22 Generate Parentheses (NeetCode 150)
  - [description](https://leetcode.com/problems/generate-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/GenerateParentheses.java)
  - hint: dfs or backtracking + stack

- [x] LeetCode #679 24 Game
  - [description](https://leetcode.com/problems/24-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/TwentyFourGame.java)
  - hint: backtracking + dfs with an input list of possible cards for this round

- [x] LeetCode #465 Optimal Account Balancing
  - [description](https://leetcode.com/problems/optimal-account-balancing/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/OptimalAccountBalancing.java)
  - hint: hashmap to track each person balance, dfs + backtracking to find minimum transactions

- [x] LeetCode #489 Robot Room Cleaner
  - [description](https://leetcode.com/problems/robot-room-cleaner/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/RobotRoomCleaner.java)
  - hint: backtracking (using robot apis `turnRight()` and `move()`) + dfs, traversal by clockwise

- [x] LeetCode #698 Partition to K Equal Sum Subsets
  - [description](https://leetcode.com/problems/partition-to-k-equal-sum-subsets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/PartitionToKEqualSumSubsets.java)
  - hint: dfs + backtracking

- [x] LeetCode #37 Sudoku Solver
  - [description](https://leetcode.com/problems/sudoku-solver/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/SudokuSolver.java)
  - hint: dfs + backtracking

- [x] LeetCode #2305 Fair Distribution of Cookies
  - [description](https://leetcode.com/problems/fair-distribution-of-cookies/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/FairDistributionOfCookies.java)
  - hint: backtracking

<!-- - [ ] LeetCode #1723 Find Minimum Time to Finish All Jobs
  - [description](https://leetcode.com/problems/find-minimum-time-to-finish-all-jobs/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/FindMinimumTimeToFinishAllJobs.java)
  - hint: -->

### Heap (Priority Queue)

- [x] LeetCode #378 Kth Smallest Element in a Sorted Matrix
  - [description](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/KthSmallestElementInSortedMatrix.java)
  - hint: priorityQueue or binary search by counting the numbers that are less or equal mid value (`low = matrix[0][0]` and `high = matrix[n - 1][n - 1]`)

- [x] LeetCode #973 K Closest Points to Origin
  - [description](https://leetcode.com/problems/k-closest-points-to-origin/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/KClosestPointsToOrigin.java)
  - hint: use priorityQueue to store the points based on shortest distance to origin, `poll()` first kth points

- [x] LeetCode #1167 Minimum Cost to Connect Sticks
  - [description](https://leetcode.com/problems/minimum-cost-to-connect-sticks/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/MinimumCostToConnectSticks.java)
  - hint: the earlier stick combined will be added into cost again, so we want to smaller stick combined first asap and cost will be minimum (greedy)

- [x] LeetCode #1648 Sell Diminishing-Valued Colored Balls
  - [description](https://leetcode.com/problems/sell-diminishing-valued-colored-balls/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/SellDiminishingValuedColoredBalls.java)
  - hint: use priorityqueue to store `Ball(val, 1)`, `poll()` each Ball and compare with `peek()` to see if we can use up all of orders

- [x] LeetCode #1135 Connecting Cities With Minimum Cost
  - [description](https://leetcode.com/problems/connecting-cities-with-minimum-cost/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/ConnectingCitiesWithMinimumCost.java)
  - hint: build graph with next city and its cost, use priorityQueue to choose next city with minimum cost on new edge

- [x] LeetCode #1353 Maximum Number of Events That Can Be Attended
  - [description](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/MaximumNumberOfEventsThatCanBeAttended.java)
  - hint: sort event by starting time, iterate day 1 to 10^5, use priorityQueue to track closing time, `poll()` already closed event, `offer()` the event can be attended at `ith` day, `poll()` event attended, make `res += 1`

- [x] LeetCode #1405 Longest Happy String
  - [description](https://leetcode.com/problems/longest-happy-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/LongestHappyString.java)
  - hint: use priorityQueue to store the char with its frequency

- [x] LeetCode #2102 Sequentially Ordinal Rank Tracker
  - [description](https://leetcode.com/problems/sequentially-ordinal-rank-tracker/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/SORTracker.java)
  - hint: simialr to `Find Median from Data Stream` using minHeap + maxHeap

- [x] LeetCode #767 Reorganize String
  - [description](https://leetcode.com/problems/reorganize-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/ReorganizeString.java)
  - hint: use priorityQueue to store char with its freq, greedy to poll one or two to build string

- [x] LeetCode #692 Top K Frequent Words
  - [description](https://leetcode.com/problems/top-k-frequent-words/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/TopKFrequentWords.java)
  - hint: use priorityQueue to store map entry with string as key and freqency as value

- [x] LeetCode #787 Cheapest Flights Within K Stops (NeetCode 150) (Dijkstra's algorithm)
  - [description](https://leetcode.com/problems/cheapest-flights-within-k-stops/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/CheapestFlightsWithinKStops.java)
  - hint: bfs, dfs(backtracing), Dijkstra's algorithm(minHeap) or Bellman Ford(dp)

- [x] LeetCode #743 Network Delay Time (NeetCode 150) (Dijkstra's algorithm)
  - [description](https://leetcode.com/problems/network-delay-time/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/NetworkDelayTime.java)
  - hint: Dijkstra's algorithm(minHeap)

- [x] LeetCode #778 Swim in Rising Water (NeetCode 150)
  - [description](https://leetcode.com/problems/swim-in-rising-water/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/SwimInRisingWater.java)
  - hint: Dijkstra's algorithm(minHeap)

- [x] LeetCode #1631 Path With Minimum Effort
  - [description](https://leetcode.com/problems/path-with-minimum-effort/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/PathWithMinimumEffort.java)
  - hint: variant of Dijkstra algorithm(minHeap)

- [x] LeetCode #1102 Path With Maximum Minimum Value
  - [description](https://leetcode.com/problems/path-with-maximum-minimum-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/PathWithMaximumMinimumValue.java)
  - hint: variant of Dijkstra algorithm(minHeap)

- [x] LeetCode #621 Task Scheduler (NeetCode 150)
  - [description](https://leetcode.com/problems/task-scheduler/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/TaskScheduler.java)
  - hint: PriorityQueue (store cpu task to process) + queue (store awaiting task)

- [x] LeetCode #1046 Last Stone Weight (NeetCode 150)
  - [description](https://leetcode.com/problems/last-stone-weight/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/LastStoneWeight.java)
  - hint: maxHeap

- [x] LeetCode #1229 Meeting Scheduler
  - [description](https://leetcode.com/problems/meeting-scheduler/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/MeetingScheduler.java)
  - hint: minHeap to store valid slots (`>= duration`), compare `poll()[1]` and `peek()[0] + duration`

- [x] LeetCode #759 Employee Free Time
  - [description](https://leetcode.com/problems/employee-free-time/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/EmployeeFreeTime.java)
  - hint: minHeap to store interval, track previous interval and merge current interval with previous one if need, if previous one has no interaction with current one, add the new interval into result

- [x] LeetCode #1834 Single-Threaded CPU
  - [description](https://leetcode.com/problems/single-threaded-cpu/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/SingleThreadedCpu.java)
  - hint: sorted array + mini heap + two while loop

- [x] LeetCode #502 IPO
  - [description](https://leetcode.com/problems/ipo/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/IPO.java)
  - hint: greedy + sorting + maxHeap

- [x] LeetCode #1882 Process Tasks Using Servers
  - [description](https://leetcode.com/problems/process-tasks-using-servers/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/ProcessTasksUsingServers.java)
  - hint: two heaps, one is for free servers, the other is for used server

- [x] LeetCode #632 Smallest Range Covering Elements from K Lists
  - [description](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/SmallestRangeCoveringElementsFromKLists.java)
  - hint: pq + greedy, every time we have `lists.size()` size of numbers in the pq from sorted lists (start from first/smallest num), track the max num (and start and end of min range) if we offer new num into pq and poll() minimum num from minHeap to compare range, until one of lists exhausted, e.g, imagine that each list only contains one number

- [x] LeetCode #215 Kth Largest Element in an Array
  - [description](https://leetcode.com/problems/kth-largest-element-in-an-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/KthLargestElementInArray.java)
  - hint: minHeap, keep heap size to `k`

- [x] LeetCode #1425 Constrained Subsequence Sum
  - [description](https://leetcode.com/problems/constrained-subsequence-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/ConstrainedSubsequenceSum.java)
  - hint: maxHeap with the entry `new int[]{curMaxSum, curIndex}`

### Design

- [x] LeetCode #146 LRU Cache (NeetCode 150)
  - [description](https://leetcode.com/problems/lru-cache/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/LRUCache.java)
  - hint: double linked list to set head and remove tail node, hashmap to get and put node

- [x] LeetCode # 460 LFU Cache
  - [description](https://leetcode.com/problems/lfu-cache/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/LFUCache.java)
  - hint: three hashmaps: vals map, usage counts map and usage count-listOfKeys map. use `min` to track minimum usage count

- [x] LeetCode #588 Design In-Memory File System
  - [description](https://leetcode.com/problems/design-in-memory-file-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/InMemoryFileSystem.java)
  - hint: use trie with an unit class like `File`

- [x] LeetCode #1396 Design Underground System
  - [description](https://leetcode.com/problems/design-underground-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/UndergroundSystem.java)
  - hint: two hashtables

- [x] LeetCode #380 Insert Delete GetRandom `O(1)`
  - [description](https://leetcode.com/problems/insert-delete-getrandom-o1/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/InsertDeleteGetRandom.java)
  - hint: use list to store val, use map to store val as key and index of val as value. trick is to remove val by swapping last one with removed one

- [x] LeetCode #381 Insert Delete GetRandom `O(1)` - Duplicates allowed
  - [description](https://leetcode.com/problems/insert-delete-getrandom-o1-duplicates-allowed/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/InsertDeleteGetRandomDuplicates.java)
  - hint: use list to store val, use map to store val as key and the list of indexes of val as value. trick is to remove val by swapping last one with removed one

- [x] LeetCode #1570 Dot Product of Two Sparse Vectors
  - [description](https://leetcode.com/problems/dot-product-of-two-sparse-vectors/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/SparseVector.java)
  - hint: use hashmap only store the index with value which is not zero

- [x] LeetCode #981 Time Based Key-Value Store (NeetCode 150)
  - [description](https://leetcode.com/problems/time-based-key-value-store/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/TimeMap.java)
  - hint: use treeMap with `floorKey()` or use `HashMap<String, List<Data>>()` where the `Data` class has two properties: timestamp and value, binary search on timestamp to find the value

- [x] LeetCode #244 Shortest Word Distance II
  - [description](https://leetcode.com/problems/shortest-word-distance-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/WordDistance.java)
  - hint: hashtable

- [x] LeetCode #362 Design Hit Counter
  - [description](https://leetcode.com/problems/design-hit-counter/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/HitCounter.java)
  - hint: use queue or could just use two arrays as buckets (one is for `hits[300]`, the other is `times[300]` and index could be `timestamp mod 300`)

- [x] LeetCode #716 Max Stack
  - [description](https://leetcode.com/problems/max-stack/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MaxStack.java)
  - hint: two stacks, one for max val to track current max

- [x] LeetCode #155 Min Stack
  - [description](https://leetcode.com/problems/min-stack/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MinStack.java)
  - hint: two stacks, one for min val to track current min

- [x] LeetCode #1381 Design a Stack With Increment Operation
  - [description](https://leetcode.com/problems/design-a-stack-with-increment-operation/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/CustomStack.java)
  - hint: use arraylist, `pop()` is to remove from tail of list

- [x] LeetCode #1146 Snapshot Array
  - [description](https://leetcode.com/problems/snapshot-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/SnapshotArray.java)
  - hint: use `List<Map<Integer, Integer>>` to store the diff/delta between each snapshot

- [x] LeetCode #706 Design HashMap
  - [description](https://leetcode.com/problems/design-hashmap/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MyHashMap.java)
  - hint: use array of `ListNode` with `key`, `value` and `next` ListNode

- [x] LeetCode #1472 Design Browser History
  - [description](https://leetcode.com/problems/design-browser-history/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/BrowserHistory.java)
  - hint: double linkedlist

- [x] LeetCode #348 Design Tic-Tac-Toe
  - [description](https://leetcode.com/problems/design-tic-tac-toe/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/TicTacToe.java)
  - hint: the better solution could be to check sum of rows, cols and diagonals with one player `+1` and the other `-1`

- [x] LeetCode #1278 Find Winner on a Tic Tac Toe Game
  - [description](https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/FindWinnerOnTicTacToeGame.java)
  - hint: the better solution could be to check sum of rows, cols and diagonals with one player `+1` and the other `-1`, similar to `Design Tic-Tac-Toe`

- [x] LeetCode #642 Design Search Autocomplete System
  - [description](https://leetcode.com/problems/design-search-autocomplete-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/AutocompleteSystem.java)
  - hint: trie, trieNode uses arraylist to store top 3 hot sentences that pass through current node

- [x] LeetCode #1628 Design an Expression Tree With Evaluate Function
  - [description](https://leetcode.com/problems/design-an-expression-tree-with-evaluate-function/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/TreeBuilder.java)
  - hint: use postorder traveral by recursion to evaluate, use stack to build tree from array

- [x] LeetCode #1166 Design File System
  - [description](https://leetcode.com/problems/design-file-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/FileSystem.java)
  - hint: trie, similar to `Design In-Memory File System`

- [x] LeetCode #353 Design Snake Game
  - [description](https://leetcode.com/problems/design-snake-game/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/SnakeGame.java)
  - hint: use queue to simulate the snake

- [x] LeetCode #355 Design Twitter (NeetCode 150)
  - [description](https://leetcode.com/problems/design-twitter/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/Twitter.java)
  - hint: create `Tweet` and `User` classes, `User` class stores the tweets as the linkedlist by tracking head, use maxHeap to return news feed of recent 10 tweet ids

- [x] LeetCode #2013 Detect Squares (NeetCode 150)
  - [description](https://leetcode.com/problems/detect-squares/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/DetectSquares.java)
  - hint: use hashtable with list to check if diagonal point exists, then verify existence of other two points

- [x] LeetCode #2034 Stock Price Fluctuation
  - [description](https://leetcode.com/problems/stock-price-fluctuation/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/StockPrice.java)
  - hint: hashtable + minheap + maxheap

- [x] LeetCode #729 My Calendar I
  - [description](https://leetcode.com/problems/my-calendar-i/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MyCalendarI.java)
  - hint: brute force or TreeMap using `floorKey` and `ceilingKey`

- [x] LeetCode #715 Range Module
  - [description](https://leetcode.com/problems/range-module/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/RangeModule.java)
  - hint: `TreeMap<left, right>`, use `floorKey()` to find if there is a value before or equal to the key, use `subMap().clear() to remove additional keys`

- [x] LeetCode #1244 Design A Leaderboard
  - [description](https://leetcode.com/problems/design-a-leaderboard/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/Leaderboard.java)
  - hint: hashmap + maxHeap

- [x] LeetCode #1845 Seat Reservation Manager
  - [description](https://leetcode.com/problems/seat-reservation-manager/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/SeatManager.java)
  - hint: minHeap

- [x] LeetCode #703 Kth Largest Element in a Stream
  - [description](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/KthLargest.java)
  - hint: minHeap, keep `queue.size == k`

- [x] LeetCode #232 Implement Queue using Stacks
  - [description](https://leetcode.com/problems/implement-queue-using-stacks/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MyQueue.java)
  - hint: use two stacks, one for input and the other for output

- [x] LeetCode #1600 Throne Inheritance
  - [description](https://leetcode.com/problems/throne-inheritance/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/ThroneInheritance.java)
  - hint: dfs + hashtable

- [x] LeetCode #1797 Design Authentication Manager
  - [description](https://leetcode.com/problems/design-authentication-manager/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/AuthenticationManager.java)
  - hint: hashtable

- [x] LeetCode #2241 Design an ATM Machine
  - [description](https://leetcode.com/problems/design-an-atm-machine/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/AtmMachine.java)
  - hint: greedy

- [x] LeetCode #2043 Simple Bank System
  - [description](https://leetcode.com/problems/simple-bank-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/SimpleBankSystem.java)
  - hint: simulation, reuse the func

- [x] LeetCode #2502 Design Memory Allocator
  - [description](https://leetcode.com/problems/design-memory-allocator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/DesignMemoryAllocator.java)
  - hint: hashtable

- [x] LeetCode #2590 Design a Todo List
  - [description](https://leetcode.com/problems/design-a-todo-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/DesignTodoList.java)
  - hint: hashtable + OOD

- [x] LeetCode #2296 Design a Text Editor
  - [description](https://leetcode.com/problems/design-a-text-editor/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/TextEditor.java)
  - hint: two stacks

- [x] LeetCode #1804 Implement Trie II (Prefix Tree)
  - [description](https://leetcode.com/problems/implement-trie-ii-prefix-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/TrieII.java)
  - hint: track `endCount` and `startCount` in trie node

- [x] LeetCode #1500 Design a File Sharing System
  - [description](https://leetcode.com/problems/design-a-file-sharing-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/FileSharing.java)
  - hint: min heap for tracking ids and hashtable for tracking trunks per id

- [x] LeetCode #281 Zigzag Iterator
  - [description](https://leetcode.com/problems/zigzag-iterator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/ZigzagIterator.java)
  - hint: queue of Iterator

### Monotonic Queue

- [x] LeetCode #239 Sliding Window Maximum (NeetCode 150)
  - [description](https://leetcode.com/problems/sliding-window-maximum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/queue/SlidingWindowMaximum.java)
  - hint: priorityQueue is TLE, use deque to track valid index of nums that is at `peek()`, keep cleaning old index from `peek()` that is out of the window, keep cleaning useless index that has smaller value from `peekLast()`

- [x] LeetCode #1438 Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit
  - [description](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/queue/LongestContinuousSubarrayWithAbsoluteDiffLessThanOrEqualToLimit.java)
  - hint: use two deque to track min and max values with two pointers `left` and `right`

### Interval

- [x] LeetCode #1851  Minimum Interval to Include Each Query (NeetCode 150)
  - [description](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MinimumIntervalToIncludeEachQuery.java)
  - hint: sort two arrays, use minHeap to find smallest interval

- [x] LeetCode #1288 Remove Covered Intervals
  - [description](https://leetcode.com/problems/remove-covered-intervals/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/RemoveCoveredIntervals.java)
  - hint: sort array by start of interval (if starts are equal, compare ends of intervals), loop sorted intervals with comparing current end value

- [ ] LeetCode #2158 Amount of New Area Painted Each Day
  - [description](https://leetcode.com/problems/amount-of-new-area-painted-each-day/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/AmountOfNewAreaPaintedEachDay.java)
  - hint: merge interval + treeMap

### Bit Manipulation (Bitmask)

- [x] LeetCode #1494 Parallel Courses II
  - [description](https://leetcode.com/problems/parallel-courses-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/ParallelCoursesII.java)
  - hint: bitmask + dp

- [x] LeetCode #847 Shortest Path Visiting All Nodes
  - [description](https://leetcode.com/problems/shortest-path-visiting-all-nodes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/ShortestPathVisitingAllNodes.java)
  - hint: bitmask + dp + bfs

- [ ] LeetCode #943 Find the Shortest Superstring
  - [description](https://leetcode.com/problems/find-the-shortest-superstring/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/FindTheShortestSuperstring.java)
  - hint:

- [ ] LeetCode #2035 Partition Array Into Two Arrays to Minimize Sum Difference
  - [description](https://leetcode.com/problems/partition-array-into-two-arrays-to-minimize-sum-difference/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/PartitionArrayIntoTwoArraysToMinimizeSumDifference.java)
  - hint:

- [ ] LeetCode #2184 Number of Ways to Build Sturdy Brick Wall
  - [description](https://leetcode.com/problems/number-of-ways-to-build-sturdy-brick-wall/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/binary/NumberOfWaysToBuildSturdyBrickWall.java)
  - hint:

<!---
## Misc

- [x] LeetCode #34 Find First and Last Position of Element in Sorted Array (Array)
  - [description](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindFirstLastPositionOfElementInSortedArray.java)
  - hint: two binary search

- [x] LeetCode #1557 Minimum Number of Vertices to Reach All Nodes (Graph)
  - [description](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MinimumNumberOfVerticesToReachAllNodes.java)
  - hint: vertices.filter(vertex => vertex.inDegree == 0)
  
- [x] LeetCode #64 Minimum Path Sum (DP)
  - [description](https://leetcode.com/problems/minimum-path-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MinimumPathSum.java)
  - hint: top-down + memorization + recursion (trick: reverse the path)
  
- [x] LeetCode #979 Distribute Coins in Binary Tree (Tree)
  - [description](https://leetcode.com/problems/distribute-coins-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/DistributeCoinsInBinaryTree.java)
  - hint: dfs + post-order traversal recursively
  
- [x] LeetCode #1443 Minimum Time to Collect All Apples in a Tree (Graph)
  - [description](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/MinimumTimeToCollectAllApplesInTree.java)
  - hint: dfs + memorization, each node makes count += 2 except node 0
 
- [x] LeetCode #1138 Alphabet Board Path (String)
  - [description](https://leetcode.com/problems/alphabet-board-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/AlphabetBoardPath.java)
  - hint: calculate x, y of alphabet matrix by `/ 5` and `% 5`, put L U before R D as 'z' is special
 

- [x] LeetCode #303 Range Sum Query - Immutable (DP, Array)
  - [description](https://leetcode.com/problems/range-sum-query-immutable/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/RangeSumQuery.java)
  - hint: dp, sum from i to j inclusively = sums[j] - sums[i - 1]

- [x] LeetCode #304 Range Sum Query 2D - Immutable (DP, Matrix)
  - [description](https://leetcode.com/problems/range-sum-query-2d-immutable/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/RangeSumQuery2D.java)
  - hint: dp

- [x] LeetCode #78 Subsets (Array)
  - [description](https://leetcode.com/problems/subsets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/Subsets.java)
  - hint: dfs + recursion + backtracking

- [x] LeetCode #78 Subsets II (Array)
  - [description](https://leetcode.com/problems/subsets-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/SubsetsII.java)
  - hint: dfs + recursion + backtracking

- [x] LeetCode #916 Word Subsets (String)
  - [description](https://leetcode.com/problems/word-subsets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/WordSubsets.java)
  - hint: hashtable records frequency of chars

- [x] LeetCode #387 First Unique Character in a String (String)
  - [description](https://leetcode.com/problems/first-unique-character-in-a-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/FirstUniqueCharacterInString.java)
  - hint: hashtable records frequency of chars

- [x] LeetCode #109 Convert Sorted List to Binary Search Tree (Tree)
  - [description](https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/ConvertSortedListToBinarySearchTree.java)
  - hint: slow and fast two pointers + recursion

- [x] LeetCode #983 Minimum Cost For Tickets (DP)
  - [description](https://leetcode.com/problems/minimum-cost-for-tickets/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MinimumCostForTickets.java)
  - hint: dp or recursion + memorization (top-down)

- [x] LeetCode #1547 Minimum Cost to Cut a Stick (DP)
  - [description](https://leetcode.com/problems/minimum-cost-to-cut-a-stick/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/MinimumCostToCutStick.java)
  - hint: dp or recursion + memorization (top-down)

- [x] LeetCode #116 Populating Next Right Pointers in Each Node (Tree)
  - [description](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/PopulatingNextRightPointersInEachNode.java)
  - hint: BFS via queue

- [ ] LeetCode #117 Populating Next Right Pointers in Each Node II (Tree)
  - [description](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/)

- [x] LeetCode #518 Coin Change 2 （DP）
  - [description](https://leetcode.com/problems/coin-change-2/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CoinChange2.java)
  - hint: recursion + memorization, two paths - use current coin or not

- [x] LeetCode #409 Longest Palindrome (String)
  - [description](https://leetcode.com/problems/longest-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/LongestPalindrome.java)
  - hint: hashtable

- [x] LeetCode #1306 Jump Game III (DP)
  - [description](https://leetcode.com/problems/jump-game-iii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/JumpGameIII.java)
  - hint: top-down + memorization + recursion

- [x] LeetCode #445 Add Two Numbers II (Linked List)
  - [description](https://leetcode.com/problems/add-two-numbers-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/AddTwoNumbersII.java)
  - hint: two stack, pop up both and record carry

- [x] LeetCode #987 Vertical Order Traversal of a Binary Tree (Tree)
  - [description](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/VerticalOrderTraversalOfBinaryTree.java)
  - hint: similar to  LeetCode #314, but use dfs (vertical and horizontal params) + `TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map`, time complexity `O(nlogn)`

- [x] LeetCode #1094 Car Pooling
  - [description](https://leetcode.com/problems/car-pooling/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/CarPooling.java)
  - hint: greedy, use hashmap to store the number of ppl (`pick up` - `drop off`) at each station (the relative change in amount of ppl per station), priorityQueue is also working with `int[]{endStop, numberOfpplDrop}`

- [x] LeetCode #513 Find Bottom Left Tree Value (Tree)
  - [description](https://leetcode.com/problems/find-bottom-left-tree-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FindBottomLeftTreeValue.java)
  - hint: bfs using queue or dfs recursively

- [x] LeetCode #365 Water and Jug Problem
  - [description](https://leetcode.com/problems/water-and-jug-problem/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/WaterAndJugProblem.java)
  - hint: bfs `[x, -x, y, -y]`

- [x] LeetCode #130 Surrounded Regions (move to dfs)
  - [description](https://leetcode.com/problems/surrounded-regions/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/SurroundedRegions.java)
  - hint: dfs recursively to find the island that cannot be flipped

- [x] LeetCode #404 Sum of Left Leaves
  - [description](https://leetcode.com/problems/sum-of-left-leaves/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SumOfLeftLeaves.java)
  - hint: dfs recursively

- [ ] LeetCode #990 Satisfiability of Equality Equations
  - [description](https://leetcode.com/problems/satisfiability-of-equality-equations/)
  - hint: build graph, find conflict by dfs

- [ ] LeetCode #1319 Number of Operations to Make Network Connected
  - [description](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)
  - hint: similar to number of islands

- [ ] LeetCode #1885 Count Pairs in Two Arrays
  - [description](https://leetcode.com/problems/count-pairs-in-two-arrays/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/CountPairsInTwoArrays.java)
  - hint: sort + two pointers
-->
