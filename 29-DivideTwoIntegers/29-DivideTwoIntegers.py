# Last updated: 6/22/2025, 11:05:34 AM
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        INT_MAX = 2**31 - 1
        INT_MIN = -2**31
        if dividend==INT_MIN and divisor==-1:
            return INT_MAX
        quotient=dividend/divisor
        return int(quotient)
        # if quotient<(((2**31)-1) or (-(2**31))):
        #     res=quotient-1
        #     return res

        