[![curated-list-of-coding-questions-master Actions Status](https://github.com/DragonSSS/curated-list-of-coding-questions/workflows/curated-list-of-coding-questions/badge.svg)](https://github.com/DragonSSS/curated-list-of-coding-questions/actions)
# Curated List of Top 75 Leetcode Questions

## TL;DR
## Categories
### Array (10)

- [x] LeetCode #1 Two Sum
  - [description](https://leetcode.com/problems/two-sum/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/TwoSum.java)
  - hint: hashtable `{key: rest_value, value: index}`

- [x] LeetCode #121 Best Time to Buy and Sell Stock
  - [description](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/BestTimeToBuyAndSellStock.java)
  - hint: minPrice + maxProfit + one loop

- [x] LeetCode #217 Contains Duplicate
  - [description](https://leetcode.com/problems/contains-duplicate/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/ContainsDuplicate.java)
  - hint: hashset

- [x] LeetCode #238 Product of Array Except Self
  - [description](https://leetcode.com/problems/product-of-array-except-self/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/ProductOfArrayExceptSelf.java)
  - hint: prefix product + backward

- [x] LeetCode #53 Maximum Subarray
  - [description](https://leetcode.com/problems/maximum-subarray/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/MaximumSubarray.java)
  - hint: dp

- [x] LeetCode #53 Maximum Product Subarray
  - [description](https://leetcode.com/problems/maximum-product-subarray/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/MaximumProductSubarray.java)
  - hint: dp

- [x] LeetCode #153 Find Minimum in Rotated Sorted Array
  - [description](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/FindMinimumInRotatedSortedArray.java)
  - hint: binary search
 
- [ ] LeetCode #33 Search in Rotated Sorted Array
  - [description](https://leetcode.com/problems/search-in-rotated-sorted-array/)

### Binary (5)

- [x] LeetCode #371 Sum of Two Integers
  - [description](https://leetcode.com/problems/sum-of-two-integers/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/binary/SumOfTwoIntegers.java)
  - hint: use carry with shift 1 to get common components, xor operation is to get opposite components

- [ ] LeetCode #191 Number of 1 Bits
  - [description](https://leetcode.com/problems/number-of-1-bits/)
  
- [ ] LeetCode #338 Counting Bits
  - [description](https://leetcode.com/problems/counting-bits/)

- [x] LeetCode #268 Missing Number
  - [description](https://leetcode.com/problems/missing-number/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/binary/MissingNumber.java)
  - xor operation or binary search on sorted array
  
- [ ] LeetCode #190 Reverse Bits
  - [description](https://leetcode.com/problems/reverse-bits/)

### Dynamic Programming (11)

- [ ] LeetCode #70 Climbing Stairs
  - [description](https://leetcode.com/problems/climbing-stairs/)

- [x] LeetCode #332 Coin Change
  - [description](https://leetcode.com/problems/coin-change/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/dp/CoinChange.java)
  - hint: recursion + memorization
  
- [ ] LeetCode #62 Unique Paths
  - [description](https://leetcode.com/problems/coin-change/)
  - hint: top-down + memorization + recursion
  
- [x] LeetCode #139 Word Break
  - [description](https://leetcode.com/problems/word-break/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/dp/WordBreak.java)
  - hint: dfs + memorization + recursion

### Graph (8)

- [x] LeetCode #133 Clone Graph
  - [description](https://leetcode.com/problems/clone-graph/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/CloneGraph.java)
  - hint: dfs + hashmap
  
- [x] LeetCode #207 Course Schedule
  - [description](https://leetcode.com/problems/course-schedule/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/CourseSchedule.java)
  - hint: topological sort (indegree and neighbours map + queue + bfs)

- [x] Leetcode #417 Pacific Atlantic Water Flow
  - [description](https://leetcode.com/problems/pacific-atlantic-water-flow/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/PacificAtlanticWaterFlow.java)
  - hint: dfs + memorization
  
- [x] Leetcode #200 Number of Islands
  - [description](https://leetcode.com/problems/number-of-islands/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/NumberOfIslands.java)
  - hint: dfs + memorization

- [x] Leetcode #128 Longest Consecutive Sequence
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/LongestConsecutiveSequence.java)
  - hint: sort first + iteration with while loop (could use union-find or hashtable as well)
  
- [x] LeetCode #269 Alien Dictionary
  - [description](https://leetcode.com/problems/coin-change/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/AlienDictionary.java)
  - hint: build graph + indegree map + bfs with queue

- [x] Leetcode #261 Graph Valid Tree
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/GraphValidTree.java)
  - hint: dfs/bfs + memorization

- [x] Leetcode #323 Number of Connected Components in an Undirected Graph
  - [description](https://leetcode.com/problems/longest-consecutive-sequence/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/GraphValidTree.java)
  - hint: bfs + memorization

### Interval (5)

### Linked List (6)

- [x] LeetCode #206 Reverse Linked List
  - [description](https://leetcode.com/problems/reverse-linked-list/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/ReverseLinkedList.java)
  - hint: previous ListNode pointer

- [x] LeetCode #141 Linked List Cycle
  - [description](https://leetcode.com/problems/linked-list-cycle/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/LinkedListCycle.java)
  - hint: slow and fast pointers
  
- [x] LeetCode #21 Merge Two Sorted Lists
  - [description](https://leetcode.com/problems/merge-two-sorted-lists/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/MergeTwoSortedLists.java)
  - hint: two pointers with while loop + extra linked list

- [x] LeetCode #23 Merge k Sorted Lists
  - [description](https://leetcode.com/problems/merge-k-sorted-lists/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/MergeKSortedLists.java)
  - hint: heap/priority queue or merge sort

- [x] LeetCode #19 Remove Nth Node From End of List
  - [description](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/RemoveNthNodeFromEndOfList.java)
  - hint: slow and fast pointers + sliding window

- [x] LeetCode #143 Reorder List
  - [description](https://leetcode.com/problems/reorder-list/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/ReorderList.java)
  - hint: find the mid to split two linked lists, reverse second one and merge two linked list into one
  
### Matrix (4)

- [x] LeetCode #73 Set Matrix Zeroes
  - [description](https://leetcode.com/problems/set-matrix-zeroes/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/matrix/SetMatrixZeroes.java)
  - hint: use hashtable/hashset to record row and column of 0 in matrix

- [x] LeetCode #54 Spiral Matrix
  - [description](https://leetcode.com/problems/spiral-matrix/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/matrix/SpiralMatrix.java)
  - hint: four pointers for corners: top, bottom, left and right when res.size() < m * n
  
- [x] LeetCode #48 Rotate Image
  - [description](https://leetcode.com/problems/rotate-image/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/matrix/RotateImage.java)
  - hint: clockwise rotate = reverse up to down + swap the symmetry, anticlockwise = reverse left to right + swap the symmetry

- [x] LeetCode #79 Word Search
  - [description](https://leetcode.com/problems/word-search/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/matrix/WordSearch.java)
  - hint: dfs + memorization + backtracking
  
### String (10)

- [x] LeetCode #3 Longest Substring Without Repeating Characters
  - [description](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/LongestSubstringWithoutRepeatingCharacters.java)
  - hint: two pointers + sliding window
  
- [x] LeetCode #424 Longest Repeating Character Replacement
  - [description](https://leetcode.com/problems/longest-repeating-character-replacement/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/LongestRepeatingCharacterReplacement.java)
  - hint: two pointers + sliding window

- [x] LeetCode #76 Minimum Window Substring
  - [description](https://leetcode.com/problems/minimum-window-substring/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/MinimumWindowSubstring.java)
  - hint: two pointers + hashtable + sliding window

- [x] LeetCode #242 Valid Anagram
  - [description](https://leetcode.com/problems/valid-anagram/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/ValidAnagram.java)
  - hint: hashtable
  
- [x] LeetCode #49 Group Anagrams
  - [description](https://leetcode.com/problems/group-anagrams/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/GroupAnagrams.java)
  - hint: hashtable + Arrays.toString()
  
- [x] LeetCode #20 Valid Parentheses
  - [description](https://leetcode.com/problems/valid-parentheses/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindrome.java)
  - hint: stack

- [x] LeetCode #125 Valid Palindrome
  - [description](https://leetcode.com/problems/valid-palindrome/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/ValidPalindrome.java)
  - hint: two pointers
  
- [x] LeetCode #5 Longest Palindromic Substring
  - [description](https://leetcode.com/problems/longest-palindromic-substring/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/LongestPalindromicSubstring.java)
  - hint: two pointers + expand around center
 
- [x] LeetCode #647 Palindromic Substrings
  - [description](https://leetcode.com/problems/palindromic-substrings/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/PalindromicSubstrings.java)
  - hint: two pointers + expand around center
  
- [x] LeetCode #271 Encode and Decode Strings
  - [description](https://leetcode.com/problems/encode-and-decode-strings/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/EncodeAndDecodeStrings.java)
  - hint: length + '/' +str + length + '/' + str

### Tree (14)

- [x] LeetCode #104 Maximum Depth of Binary Tree
  - [description](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/MaximumDepthOfBinaryTree.java)
  - hint: recursion + dfs

- [x] LeetCode #100 Same Tree
  - [description](https://leetcode.com/problems/same-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/SameTree.java)
  - hint: recursion
  
- [x] LeetCode #266 Invert Binary Tree
  - [description](https://leetcode.com/problems/invert-binary-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/InvertBinaryTree.java)
  - hint: queue + bfs or recursion
  
- [x] LeetCode #124 Binary Tree Maximum Path Sum
  - [description](https://leetcode.com/problems/binary-tree-maximum-path-sum/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeMaximumPathSum.java)
  - hint: recursion

- [x] LeetCode #102 Binary Tree Level Order Traversal
  - [description](https://leetcode.com/problems/binary-tree-level-order-traversal/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/BinaryTreeMaximumPathSum.java)
  - hint: dfs + recursion or bfs + queue

- [x] LeetCode #297 Serialize and Deserialize Binary Tree
  - [description](https://leetcode.com/problems/serialize-and-deserialize-binary-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/SerializeDeserializeBinaryTree.java)
  - hint: tree traversal (pre-order, in-order and post-order), bfs iteratively and dfs recursively
  
- [x] LeetCode #572 Subtree of Another Tree
  - [description](https://leetcode.com/problems/subtree-of-another-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/SubtreeOfAnotherTree.java)
  - hint: use SameTree recursion + one more recursion
  
- [x] LeetCode #105 Construct Binary Tree from Preorder and Inorder Traversal
  - [description](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/ConstructBinaryTreeFromPreorderAndInorderTraversal.java)
  - hint: recursion + use preorder to find root + use inorder to split array into right and left tree

- [x] LeetCode #208 Implement Trie (Prefix Tree)
  - [description](https://leetcode.com/problems/implement-trie-prefix-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/Trie.java)
  - hint: prefix tree (Trie data structure)
  
- [x] LeetCode #98 Validate Binary Search Tree
  - [description](https://leetcode.com/problems/validate-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/ValidateBinarySearchTree.java)
  - hint: preorder traversal + stack or recursion with max and min boundaries 
  
- [x] LeetCode #235 Lowest Common Ancestor of a Binary Search Tree
  - [description](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/LowestCommonAncestorOfBinarySearchTree.java)
  - hint: recursion + bst
  
- [x] LeetCode #212 Word Search II
  - [description](https://leetcode.com/problems/word-search-ii/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/WordSearch2.java)
  - hint: trie + dfs + memorization + backtracking
  
- [x] LeetCode #230 Kth Smallest Element in a BST
  - [description](https://leetcode.com/problems/kth-smallest-element-in-a-bst/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/KthSmallestElementInBST.java)
  - hint: inorder traversal
  
- [x] LeetCode #211 Design Add and Search Words Data Structure
  - [description](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/tree/AddSearchWord.java)
  - hint: trie + dfs
  
### Heap (3)

- [x] LeetCode #23 Merge k Sorted Lists
  - [description](https://leetcode.com/problems/merge-k-sorted-lists/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/heap/MergeKSortedLists.java)
  - hint: priorityQueue as heap

- [x] LeetCode #347 Top K Frequent Elements
  - [description](https://leetcode.com/problems/top-k-frequent-elements/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/heap/TopKFrequentElements.java)
  - hint: hashmap + priorityQueue as heap

- [x] LeetCode #295 Find Median from Data Stream
  - [description](https://leetcode.com/problems/find-median-from-data-stream/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/heap/FindMedianfromDataStream.java)
  - hint: two priorityQueue as heap, smallHalf as reverse order, largeHalf as increasing order
  
### Add-on

- [ ] LeetCode #34 Find First and Last Position of Element in Sorted Array (Array)
  - [description](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/FindFirstLastPositionOfElementInSortedArray.java)
  - hint: two binary search

- [x] LeetCode #1557 Minimum Number of Vertices to Reach All Nodes (Graph)
  - [description](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/MinimumNumberOfVerticesToReachAllNodes.java)
  - hint: vertices.filter(vertex => vertex.inDegree == 0)
  
- [x] LeetCode #438 Find All Anagrams in a String (String)
  - [description](https://leetcode.com/problems/find-all-anagrams-in-a-string/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/FindAllAnagramsInString.java)
  - hint: sliding window + hashtable + two pointers
  
- [x] LeetCode #332 Reconstruct Itinerary (Graph)
  - [description](https://leetcode.com/problems/reconstruct-itinerary/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/ReconstructItinerary.java)
  - hint: dfs + priorityQueue
  
- [ ] LeetCode #64 Minimum Path Sum (DP)
  - [description](https://leetcode.com/problems/minimum-path-sum/)
  - hint: top-down + memorization + recursion
  
- [ ] LeetCode #979 Distribute Coins in Binary Tree (Tree)
  - [description](https://leetcode.com/problems/distribute-coins-in-binary-tree/)
  - hint: dfs + post-order
  
- [ ] LeetCode #1443 Minimum Time to Collect All Apples in a Tree (Tree)
  - [description](https://leetcode.com/problems/minimum-time-to-collect-all-apples-in-a-tree/)
  - hint: dfs
  
- [x] LeetCode #140 Word Break II (DP)
  - [description](https://leetcode.com/problems/word-break-ii/)
  - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/dp/WordBreakII.java)
  - hint: dfs + memorization + recursion

- [x] LeetCode #392 Is Subsequence (String)
 - [description](https://leetcode.com/problems/is-subsequence/)
 - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/string/IsSubsequence.java)
 - hint: two pointers or binary search
 
- [x] LeetCode #791 Accounts Merge (Graph)
 - [description](https://leetcode.com/problems/accounts-merge/)
 - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/graph/AccountsMerge.java)
 - hint: build undirected graph using email + dfs
 
- [ ] LeetCode #1138 Alphabet Board Path (String)
 - [description](https://leetcode.com/problems/alphabet-board-path/)

- [x] LeetCode #303 Range Sum Query - Immutable (DP, Array)
 - [description](https://leetcode.com/problems/range-sum-query-immutable/)
 - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/array/RangeSumQuery.java)
 - hint: dp, sum from i to j inclusively = sums[j] - sums[i - 1]

- [x] LeetCode #304 Range Sum Query 2D - Immutable (DP, Matrix)
 - [description](https://leetcode.com/problems/range-sum-query-2d-immutable/)
 - [solution](https://github.com/DragonSSS/T.B.D/blob/master/leetcode/src/main/java/leetcode/dp/RangeSumQuery2D.java)
 - hint: dp

- [ ] LeetCode #42 Trapping Rain Water
 - [description](https://leetcode.com/problems/trapping-rain-water/)

- [ ] LeetCode #234 Palindrome Linked List (Linked List)
 - [description](https://leetcode.com/problems/palindrome-linked-list/)
