[![curated-list-of-coding-questions-master Actions Status](https://github.com/DragonSSS/curated-list-of-coding-questions/workflows/curated-list-of-coding-questions/badge.svg)](https://github.com/DragonSSS/curated-list-of-coding-questions/actions)

# Curated List of Top 75 LeetCode Questions

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
  
- [x] LeetCode #15 3Sum
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
  - hint: recursion + memorization

- [x] LeetCode #300 Longest Increasing Subsequence
  - [description](https://leetcode.com/problems/longest-increasing-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/LongestIncreasingSubsequence.java)
  - hint: two pointers of current index and previous index (`start with -1`) + recursion + memorization

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

- [x] LeetCode #133 Clone Graph
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
  - hint: dfs + memorization
  
- [x] LeetCode #200 Number of Islands
  - [description](https://leetcode.com/problems/number-of-islands/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/NumberOfIslands.java)
  - hint: dfs + memorization

- [x] LeetCode #128 Longest Consecutive Sequence
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/LongestConsecutiveSequence.java)
  - hint: sort first + iteration with while loop (could use union-find or hashtable as well)
  
- [x] LeetCode #269 Alien Dictionary
  - [description](https://leetcode.com/problems/coin-change/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/AlienDictionary.java)
  - hint: build graph + indegree map + bfs with queue

- [x] LeetCode #261 Graph Valid Tree
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/GraphValidTree.java)
  - hint: dfs/bfs + memorization

- [x] LeetCode #323 Number of Connected Components in an Undirected Graph
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/GraphValidTree.java)
  - hint: bfs + memorization

## Interval (5)

- [x] LeetCode #57 Insert Interval
  - [description](https://leetcode.com/problems/insert-interval/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/InsertInterval.java)
  - hint: if `newInterval[1] < interval[0]` else if `newInterval[0] > interval[1]` else

- [x] LeetCode #57 Merge Intervals
  - [description](https://leetcode.com/problems/merge-intervals/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MergeIntervals.java)
  - hint: same as Insert Interval, if `newInterval[1] < interval[0]` else if `newInterval[0] > interval[1]` else

- [x] LeetCode #435 Non-overlapping Intervals
  - [description](https://leetcode.com/problems/meeting-rooms/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/NonOverlappingIntervals.java)
  - hint: sort array first by start of interval, record preEnd and compare it with intervals

- [x] LeetCode #252 Meeting Rooms
  - [description](https://leetcode.com/problems/meeting-rooms/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/MeetingRooms.java)
  - hint: sort array first by start of interval, compare two intervals with sliding window size of 2

- [x] LeetCode #253 Meeting Rooms II
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

- [x] LeetCode #73 Set Matrix Zeroes
  - [description](https://leetcode.com/problems/set-matrix-zeroes/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/SetMatrixZeroes.java)
  - hint: use hashtable/hashset to record row and column of 0 in matrix

- [x] LeetCode #54 Spiral Matrix
  - [description](https://leetcode.com/problems/spiral-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/SpiralMatrix.java)
  - hint: four pointers for corners: top, bottom, left and right when res.size() < m * n
  
- [x] LeetCode #48 Rotate Image
  - [description](https://leetcode.com/problems/rotate-image/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/RotateImage.java)
  - hint: clockwise rotate = reverse up to down + swap the symmetry, anticlockwise = reverse left to right + swap the symmetry

- [x] LeetCode #79 Word Search
  - [description](https://leetcode.com/problems/word-search/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/matrix/WordSearch.java)
  - hint: dfs + memorization + backtracking
  
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
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindrome.java)
  - hint: stack

- [x] LeetCode #125 Valid Palindrome
  - [description](https://leetcode.com/problems/valid-palindrome/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindrome.java)
  - hint: two pointers
  
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
  - hint: length + '/' +str + length + '/' + str

## Tree (14)

- [x] LeetCode #104 Maximum Depth of Binary Tree
  - [description](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/MaximumDepthOfBinaryTree.java)
  - hint: recursion + dfs

- [x] LeetCode #100 Same Tree
  - [description](https://leetcode.com/problems/same-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SameTree.java)
  - hint: recursion
  
- [x] LeetCode #266 Invert Binary Tree
  - [description](https://leetcode.com/problems/invert-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/InvertBinaryTree.java)
  - hint: queue + bfs or recursion
  
- [x] LeetCode #124 Binary Tree Maximum Path Sum
  - [description](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeMaximumPathSum.java)
  - hint: recursion

- [x] LeetCode #102 Binary Tree Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeMaximumPathSum.java)
  - hint: dfs + recursion or bfs + queue

- [x] LeetCode #297 Serialize and Deserialize Binary Tree
  - [description](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/SerializeDeserializeBinaryTree.java)
  - hint: tree traversal (pre-order, in-order and post-order), bfs iteratively and dfs recursively
  
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
  - hint: trie + dfs + memorization + backtracking
  
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
  - hint: priorityQueue as heap

- [x] LeetCode #347 Top K Frequent Elements
  - [description](https://leetcode.com/problems/top-k-frequent-elements/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/TopKFrequentElements.java)
  - hint: hashmap + priorityQueue as heap

- [x] LeetCode #295 Find Median from Data Stream
  - [description](https://leetcode.com/problems/find-median-from-data-stream/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/FindMedianfromDataStream.java)
  - hint: two priorityQueue as heap, smallHalf as reverse order, largeHalf as increasing order

## High Frequency (Bonus)

### Graph

- [x] LeetCode #332 Reconstruct Itinerary
  - [description](https://leetcode.com/problems/reconstruct-itinerary/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/ReconstructItinerary.java)
  - hint: post traversal with removing edge: dfs + priorityQueue + `list.add(0, ticket)` for reverse result list or backtracking with dfs
  
### DFS

- [x] LeetCode #301 Remove Invalid Parentheses
  - [description](https://leetcode.com/problems/remove-invalid-parentheses/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/RemoveInvalidParentheses.java)
  - hint: dfs, use count as stack to figure out where delete invalid char, record lastRemove position, reverse string for another round dfs to cover the case with more left parentheses

- [x] LeetCode #332 Reconstruct Itinerary
  - [description](https://leetcode.com/problems/reconstruct-itinerary/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/ReconstructItinerary.java)
  - hint: post traversal with removing edge: dfs + priorityQueue + `list.add(0, ticket)` for reverse result list or backtracking with dfs

### BFS

- [x] LeetCode #103 Binary Tree Zigzag Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeZigzagLevelOrderTraversal.java)
  - hint: bfs with queue or dfs recursion

- [x] LeetCode #199 Binary Tree Right Side View
  - [description](https://leetcode.com/problems/binary-tree-right-side-view/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeRightSideView.java)
  - hint: bfs via queue to do level traversal and pick up last node at each level

- [ ] LeetCode #301 Remove Invalid Parentheses
  - [description](https://leetcode.com/problems/remove-invalid-parentheses/)

### Array

- [x] LeetCode #4 Median of Two Sorted Arrays
  - [description](https://leetcode.com/problems/median-of-two-sorted-arrays/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/MedianOfTwoSortedArrays.java)
  - hint: binary search with the shortest array, cut two arrays and compare leftMax/rightMin

- [x] LeetCode #42 Trapping Rain Water
  - [description](https://leetcode.com/problems/trapping-rain-water/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/TrappingRainWater.java)
  - hint: two pointers or you can use two arrays to record leftMax and rightMax

- [x] LeetCode #162 Find Peak Element
  - [description](hhttps://leetcode.com/problems/find-peak-element/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FindPeakElement.java)
  - hint: linear scan to find the first index that drops or binary search via comparing `nums[mid]` and `nums[mid + 1]`
  
### Dynamic Programming

- [x] LeetCode #741 Cherry Pickup
  - [description](https://leetcode.com/problems/cherry-pickup/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/CherryPickup.java)
  - hint: simulate two ppl collect cherries together to right-down corner cell, return `Integer.MIN_VALUE` for invalid path
  
- [x] LeetCode #343 Integer Break
  - [description](https://leetcode.com/problems/integer-break/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/IntegerBreak.java)
  - hint: use dp array to record max product for `i`, the formula is `dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[i - j] * j));` where `i` starts with 3 and `j` smaller than `i`
  
### Tree

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
  - hint: bfs via queue to do level traversal and pick up last node at each level

- [x] LeetCode #314 Binary Tree Vertical Order Traversal (Tree, BFS, even DFS or HashTable)
  - [description](https://leetcode.com/problems/binary-tree-vertical-order-traversal)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeVerticalOrderTraversal.java)
  - hint: dfs to get min and max vertical levels (root is 0), bfs (two queues) to put node into res with vertical level, or hashtable(treemap, red-black tree) + bfs (two queues)
  
- [x] LeetCode #99 Recover Binary Search Tree
  - [description](https://leetcode.com/problems/recover-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/RecoverBinarySearchTree.java)
  - hint: in-order traversal, use gloabl variables to track the previous, first, and second nodes. At end swap values between first and second nodes.

### LinkedList

- [x] LeetCode #61 Rotate List
  - [description](https://leetcode.com/problems/rotate-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RotateList.java)
  - hint: make the linked list to a circle and count total number `n` of nodes, then iterate nodes and return new head using `n - k % n - 1`
  
### Stack

- [x] LeetCode #71 Simplify Path
  - [description](https://leetcode.com/problems/simplify-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SimplifyPath.java)
  - hint: use stack to track the parent directory, `..` triggers `stack.pop()` and `dir` triggers `stack.push(dir)`

- [x] LeetCode #173 Binary Search Tree Iterator (Tree)
  - [description](https://leetcode.com/problems/binary-search-tree-iterator/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/BinarySearchTreeIterator.java)
  - hint: keep pushing left node into stack, if stack is not empty, it means `hasNext()` returns true. `next()` add right node into stack
  
### String

- [x] LeetCode #71 Simplify Path
  - [description](https://leetcode.com/problems/simplify-path/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/SimplifyPath.java)
  - hint: use stack to track the parent directory, `..` triggers `stack.pop()` and `dir` triggers `stack.push(dir)`

### Greedy

- [x] LeetCode #134 Gas Station
  - [description](https://leetcode.com/problems/gas-station/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/GasStation.java)
  - hint: record current gas amount and total gas amount across all stations, update res station if current gas amount is negative, check total gas amount at end for returning `-1`

### Backtracking

- [x] LeetCode #40 Combination Sum II
  - [description](https://leetcode.com/problems/combination-sum-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/backtracking/CombinationSumII.java)
  - hint: dfs + backtracking
  
### Heap

- [x] LeetCode #378 Kth Smallest Element in a Sorted Matrix
  - [description](https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/KthSmallestElementInSortedMatrix.java)
  - hint: priorityQueue or binary search by counting the numbers that are less or equal mid value (`low = matrix[0][0]` and `high = matrix[n - 1][n - 1]`)

### Design

- [ ] LeetCode #146 LRU Cache
  - [description](https://leetcode.com/problems/lru-cache/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/LRUCache.java)
  - hint: double linked list to set head and remove tail node, hashmap to get and put node

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
  
- [x] LeetCode #438 Find All Anagrams in a String (String)
  - [description](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/FindAllAnagramsInString.java)
  - hint: sliding window + hashtable + two pointers
  
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
  
- [x] LeetCode #140 Word Break II (DP)
  - [description](https://leetcode.com/problems/word-break-ii/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/dp/WordBreakII.java)
  - hint: dfs + memorization + recursion

- [x] LeetCode #392 Is Subsequence (String)
  - [description](https://leetcode.com/problems/is-subsequence/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/string/IsSubsequence.java)
  - hint: two pointers or binary search
 
- [x] LeetCode #791 Accounts Merge (Graph)
  - [description](https://leetcode.com/problems/accounts-merge/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/AccountsMerge.java)
  - hint: build undirected graph using email + dfs
 
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

- [x] LeetCode #234 Palindrome Linked List (Linked List)
  - [description](https://leetcode.com/problems/palindrome-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/PalindromeLinkedList.java)
  - hint: slow and fast pointers, reverse second part and compare two sub linkedlists

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
  
- [ ] LeetCode #127 Word Ladder (Graph)
  - [description](https://leetcode.com/problems/word-ladder/)
  
- [ ] LeetCode #126 Word Ladder II (Graph)
  - [description](https://leetcode.com/problems/word-ladder-ii/)

- [ ] LeetCode #1268 Search Suggestions System (Tree)
  - [description](https://leetcode.com/problems/search-suggestions-system/)
  - hint: trie

- [ ] LeetCode #588 Design In-Memory File System (Tree)
  - [description](https://leetcode.com/problems/design-in-memory-file-system/)
  - hint: trie

- [ ] LeetCode #1166 Design File System (Tree)
  - [description](https://leetcode.com/problems/design-file-system/)
  - hint: trie

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

- [x] LeetCode #366 Find Leaves of Binary Tree (Tree)
  - [description](https://leetcode.com/problems/find-leaves-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FindLeavesOfBinaryTree.java)
  - hint: recursion using height to the deepest TreeNode as index of arraylist

- [x] LeetCode #863 All Nodes Distance K in Binary Tree (Tree)
  - [description](https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/AllNodesDistanceKInBinaryTree.java)
  - hint: convert tree to graph via hashmap, avoid duplicates via hashset, bfs with queue or dfs with recursion

- [x] LeetCode #987 Vertical Order Traversal of a Binary Tree (Tree)
  - [description](https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/VerticalOrderTraversalOfBinaryTree.java)
  - hint: similar to  LeetCode #314, but use dfs (vertical and horizontal params) + `TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map`, time complexity `O(nlogn)`

- [x] LeetCode #1094 Car Pooling
  - [description](https://leetcode.com/problems/car-pooling/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/greedy/CarPooling.java)
  - hint: greedy, use hashmap to store the number of ppl (`pick up` - `drop off`) at each station (the relative change in amount of ppl per station)

- [x] LeetCode #513 Find Bottom Left Tree Value (Tree)
  - [description](https://leetcode.com/problems/find-bottom-left-tree-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/FindBottomLeftTreeValue.java)
  - hint: bfs using queue or dfs recursively

- [x] LeetCode #1396 Design Underground System (Design)
  - [description](https://leetcode.com/problems/design-underground-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/UndergroundSystem.java)
  - hint: two hashtables

- [x] LeetCode #365 Water and Jug Problem
  - [description](https://leetcode.com/problems/water-and-jug-problem/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/WaterAndJugProblem.java)
  - hint: bfs `[x, -x, y, -y]`

- [x] LeetCode #1448 Count Good Nodes in Binary Tree
  - [description](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CountGoodNodesInBinaryTree.java)
  - hint: pre-order + compare node val with current max
-->
