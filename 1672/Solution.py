class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        max_wealth = 0
        for i in range(len(accounts)):
            w = 0
            for j in range(len(accounts[i])):
               w += accounts[i][j]
            max_wealth = max(max_wealth, w)
        return max_wealth