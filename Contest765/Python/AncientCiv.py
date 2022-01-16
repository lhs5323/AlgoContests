
# T = int(input())
# for _ in range(T):
#     n, L = map(int, input().split())
#     xs = list(map(int, input().split()))
#
#     construct = 0
#     for i in range(L):
#         if 2 * sum(x & (1 << i) > 0 for x in xs) >= n:
#             construct += 1 << i
#
#     print(construct)
import sys
input=sys.stdin.buffer.readline

for t in range(int(input())):
  N,L=map(int,input().split())
  X=list(map(int,input().split()))
  ANS=0
  for i in range(L):
    C=0
    for j in range(N):
      print('X[j]>>i&1'+ str((X[j]<<i)&1))
      C+=(X[j]<<i)&1
      print('C ' + str(C))
    if C*2>=N:
      ANS|=(1<<i)
      print('ANS ' + str(ANS))
  print(ANS)
