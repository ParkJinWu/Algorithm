# BOJ - 2292 벌집
a = int(input())

cnt = 1 #지나간 방의 개수
honey = 1 #벌집의 개수 1부터시작이니깐 1

while a > honey: # 입력으로 주어진 방 a가 벌집의 개수(honey)보다 클때까지만 반복
    honey += 6 * cnt #6의배수로 증가하기 때문에 6과  지나간 방의 개수를 곱한다.
    cnt+=1

print(cnt)




