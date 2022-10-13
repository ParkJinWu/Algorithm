#BOJ - 1427 소트인사이드

n = list(map(int,str(input())))
#print(n)
n.sort(reverse=True)
#print(n)
for i in n:
    print(i,end="")