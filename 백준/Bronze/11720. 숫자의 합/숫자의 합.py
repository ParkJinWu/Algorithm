# BOJ - 11720

count = int(input())
nums = list(input())
total = 0

for i in range(count): #숫자의 개수만큼 반복
    total += int(nums[i]) #nums리스트의 요소(숫자로된 문자열)를 개수만큼 더한다.
print(total)
