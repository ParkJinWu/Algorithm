#BOJ - 1181 단어 정렬
import sys

n = int(sys.stdin.readline())

word = []

for i in range(n):
    word.append(sys.stdin.readline().strip())

#print(set(word))

word = list(set(word))
#print("정렬 전:",word)
word.sort()
word.sort(key=len)
#print("정렬 후:",word)

for i in word:
    print(i)
