#BOJ - 2869 달팽이는 올라가고 싶다
# A = 올라갈 수 있는 거리 , B = 미끄러지는 거리 , V= 나무막대 높이
# 올라가야할 거리 = V-B
# 하루에 갈 수 있는 거리 = A - B

A,B,V = map(int,input().split())

# (올라가야할 거리) % (하루에 올라갈 수 있는 거리)가 0이면 날짜 대로 떨어진다는 것. 즉 하루에 다 올라갈 수있는 것
if (V-B) % (A-B) == 0 :
    print((V-B)//(A-B)) #
else: # (올라가야할 거리) % (하루에 올라갈 수 있는 거리)가 0이 아니면 밤에 떨어졌기 때문에 다음날 다시 올라가야한다.
    print((V-B)//(A-B)+1)  # 하루 +1




