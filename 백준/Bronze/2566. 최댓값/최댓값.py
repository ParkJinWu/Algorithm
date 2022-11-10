max_num = 0
col = 0
row = 0

for i in range(9):
    row_num = list(map(int,input().split()))
    if max(row_num) > max_num:
        max_num =max(row_num)
        row = i
        col = row_num.index(max_num)

print(max_num)
print(row+1,col+1)
