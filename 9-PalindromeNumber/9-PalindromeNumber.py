# Last updated: 6/22/2025, 11:05:48 AM
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        original=x
        digits=0
        while(x>0):
            digits=(digits*10)+(x%10)
            x//=10
        return digits==original
