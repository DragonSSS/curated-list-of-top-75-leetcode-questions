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
  - hint: dfs + memorization
  
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
  - hint: bfs + memorization

## Interval (5)

- [x] LeetCode #57 Insert Interval (NeetCode 150)
  - [description](https://leetcode.com/problems/insert-interval/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/interval/InsertInterval.java)
  - hint: if `newInterval[1] < interval[0]` else if `newInterval[0] > interval[1]` else do sth

- [x] LeetCode #57 Merge Intervals (NeetCode 150)
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
  - hint: minimum spaning tree (MST) using Prim's algorithm (BFS with minHeap) or Kruskal's algorithm (union-find with minHeap)

- [x] LeetCode #2115 Find All Possible Recipes from Given Supplies
  - [description](https://leetcode.com/problems/find-all-possible-recipes-from-given-supplies/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/graph/FindAllPossibleRecipesFromGivenSupplies.java)  
  - hint: topological sort with bfs

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

### BFS

- [x] LeetCode #103 Binary Tree Zigzag Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/BinaryTreeZigzagLevelOrderTraversal.java)
  - hint: bfs with queue or dfs recursion

- [x] LeetCode #199 Binary Tree Right Side View
  - [description](https://leetcode.com/problems/binary-tree-right-side-view/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/bfs/BinaryTreeRightSideView.java)
  - hint: bfs via queue to do level traversal and pick up last node at each level

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
  - hint: convert tree to graph via hashmap, avoid duplicates via hashset, bfs with queue or dfs with recursion

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

- [ ] LeetCode #18 4Sum
  - [description](https://leetcode.com/problems/4sum/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/array/FourSum.java)
  - hint: sorted + two pointers

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
  - hint: bfs via queue to do level traversal and pick up last node at each level

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
  - hint: dfs and meet `null` tree node to return `-1`

- [ ] LeetCode #2096 Step-By-Step Directions From a Binary Tree Node to Another
  - [description](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/StepByStepDirectionsFromBinaryTreeNodeToAnother.java)
  - hint: find LCA of two nodes, traversal from LCA node to two nodes (start, end nodes) by recursion to build the path, combine two path together (reverse the path from LCA node to start node, all `U`)

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
  - hint: similar to #1249 Minimum Remove to Make Valid Parentheses, use count add `(` at left side) to record number of index `)` if stack is empty, return `stack.size() + count`

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
  - monotonic stack

- [x] LeetCode #853 Car Fleet (NeetCode 150)
  - [description](https://leetcode.com/problems/car-fleet/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/CarFleet.java)
  - sorting + monotonic stack, calculate time based on distance and speed and sort data based on position/distance

- [x] LeetCode #84 Largest Rectangle in Histogram (NeetCode 150)
  - [description](https://leetcode.com/problems/largest-rectangle-in-histogram/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/stack/LargestRectangleInHistogram.java)
  - monotonic stack `Stack<int[index, height]>()`, look backward with `start index` with current current to push into stack

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

- [ ] LeetCode #1631 Path With Minimum Effort
  - [description](https://leetcode.com/problems/path-with-minimum-effort/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/PathWithMinimumEffort.java)
  - hint:

- [ ] LeetCode #1102 Path With Maximum Minimum Value
  - [description](https://leetcode.com/problems/path-with-maximum-minimum-value/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/PathWithMaximumMinimumValue.java)
  - hint:

- [x] LeetCode #621 Task Scheduler (NeetCode 150)
  - [description](https://leetcode.com/problems/task-scheduler/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/TaskScheduler.java)
  - hint: PriorityQueue (store cpu task to process) + queue (store awaiting task)

- [x] LeetCode #1046 Last Stone Weight (NeetCode 150)
  - [description](https://leetcode.com/problems/last-stone-weight/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/heap/LastStoneWeight.java)
  - hint: maxHeap

### Design

- [x] LeetCode #146 LRU Cache (NeetCode 150)
  - [description](https://leetcode.com/problems/lru-cache/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/LRUCache.java)
  - hint: double linked list to set head and remove tail node, hashmap to get and put node

- [x] LeetCode # 460 LFU Cache
  - [description](https://leetcode.com/problems/lfu-cache/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/LFUCache.java)
  - hint: three hashmaps: vals map, usage counts map and usage count-listOfvals map. use `min` to track minimum usage count

- [x] LeetCode #588 Design In-Memory File System
  - [description](https://leetcode.com/problems/design-in-memory-file-system/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/DesignInMemoryFileSystem.java)
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
  - hint: use treeMap with `floorKey()` or use arrayList( of `class Value(){}`) with binary search as the value of map

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

- [ ] LeetCode #729 My Calendar I
  - [description](https://leetcode.com/problems/my-calendar-i/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/design/MyCalendarI.java)
  - hint:

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

- [x] LeetCode #1448 Count Good Nodes in Binary Tree
  - [description](https://leetcode.com/problems/count-good-nodes-in-binary-tree/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/tree/CountGoodNodesInBinaryTree.java)
  - hint: pre-order + compare node val with current max

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

- [x] LeetCode #1171 Remove Zero Sum Consecutive Nodes from Linked List
  - [description](https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/)
  - [solution](https://github.com/DragonSSS/curated-list-of-top-75-leetcode-questions/blob/master/leetcode/src/main/java/leetcode/linkedlist/RemoveZeroSumConsecutiveNodesFromLinkedList.java)
  - hint: prefix sum + hashmap
-->
