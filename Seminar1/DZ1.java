// №1768. Merge Strings Alternately
// You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
// If a string is longer than the other, append the additional letters onto the end of the merged string.
// Return the merged string.

Class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ind = 0;
        StringBuilder ans = new StringBuilder();
        while (ind < word1.length() || ind word2.length()) {
            if (ind < word1.length()) {
                ans.append(word1.charAt(ind));
            }
            if (ind < word2.length()) {
                ans.append(word2.charAt(ind));
            }
            ind += 1;
        }
        return ans.toString();
    }
}

// -------------------------------------------------------------------
// 27. Remove Element

// class Solution {
//     public int removeElement(int[] nums, int val) {
//         int copyInd = 0;
//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] != val) {
//                 nums[copyInd] = nums[i];
//                 copyInd += 1;
//             }
//         }
//         return copyInd;
//     }
// }

// -------------------------------------------------------------------
// 88. Merge Sorted Array

// class Solution {
//     public void merge(int[] nums1, int m, int[] nums2, int n) {
//         n -= 1;
//         m -= 1;
//         int copyInd = nums1.length - 1;

//         while (n >= 0) {
//             if (m >= 0 && nums1[m] > nums2[n]) {
//                 nums1[copyInd] = nums1[m--];
//             } else {
//                 nums1[copyInd] = nums2[n--];
//             }
//             copyInd -= 1;
//         }
//     }
// }

// -------------------------------------------------------------------
// 151. Reverse Words in a String

// class Solution {
//     public String reverseWords(String s) {
//         StringBuilder sb = new StringBuilder();
//         int end = s.length() - 1;
//         while (end >= 0) {
//             if (s.charAt(end) == ' ') {
//                 end -= 1;
//                 continue;
//             }

//             int start = end - 1;

//             while (start >= 0 && s.charAt(start) != ' ') {
//                 start -=1;
//             }
//             sb.append(" ");
//             sb.append(s.substring(start + 1, end + 1));
//             end = start -1;
//         }
//         if (sb.length() > 0) {
//             sb.deleteCharAt(0);
//         }
//         return sb.toString();

//     }
// }

// -------------------------------------------------------------------
// 125. Valid Palindrome


// class Solution {
//     public boolean isPalindrome(String s) {
//         int left = 0;
//         int right = s.length() - 1;

//         while (left < right) {
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left += 1;
//             }

//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right -= 1; 
//             }

//             char leftChar = Character.toLowerCase(s.charAt(left));
//             char rightChar = Character.toLowerCase(s.charAt(right));
//             if (leftChar != rightChar) {
//                 return false;
//             }

//             left += 1;
//             right -= 1;
//         }

//         return true;
//     }
// }