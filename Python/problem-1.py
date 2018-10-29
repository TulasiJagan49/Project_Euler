#!/bin/python3

import sys


t = int(input().strip())
for a0 in range(t):
    n = int(input().strip())
    n1 = (n - 1) // 3
    n1 = 3 * (n1 * (n1 + 1)//2)
    n2 = (n - 1) // 5
    n2 = 5 * (n2 * (n2 + 1)//2)
    n3 = (n - 1) // 15
    n3 = 15 * (n3 * (n3 + 1)//2)
    print(n1 + n2 - n3)
    
sys.exit(0)