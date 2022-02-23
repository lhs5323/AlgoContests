import sys
input = sys.stdin.buffer.readline
encoding = 'utf-8'
for _ in range(int(input())):
    s = str(input(), encoding)
    print('YES' if (s.index('g')<s.index('G') and s.index('r')<s.index('R') and s.index('b')<s.index('B')) else 'NO')
