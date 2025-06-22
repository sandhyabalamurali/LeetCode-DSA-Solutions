# Last updated: 6/22/2025, 11:05:49 AM
class Solution:
    def reverse(self, x: int) -> int:
        digits=0
        neg=x<0
        x=abs(x)
        while(x>0):
            digits=(digits*10)+x%10
            x//=10
        if neg:
            digits=(-digits)
        if digits < -2**31 or digits > 2**31 - 1:
            return 0
        return digits

        