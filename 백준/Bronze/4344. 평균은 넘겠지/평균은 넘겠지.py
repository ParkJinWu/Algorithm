# BOJ-평균은 넘겠지(4344)

C = int(input()) # 테스트 케이스의 개수


for i in range(C): #테스트 케이스 만큼 반복
    nums = list(map(int,input().split())) # N명의 점수
    avg =  sum(nums[1:])/nums[0] # 점수의 첫번 째(nums[1:])점수부터 끝까지 더하고 학생의 수(nums[0])로 나눠 평균을 구한다.
    cnt = 0 #각 테스트케이스에서의 평균이 넘는 인원을 체크할 변수

    for score in nums[1:]: #점수의 첫번 째(nums[1:])점수부터 끝까지 score에 넣는다.
        if score > avg: #만약 테스트케이스의 평균 보다 높으면 
            cnt += 1  # 카운트 증가
    ratio = cnt/nums[0] * 100 #평균이상의 학생들을 학생의 수로 나누고 백분율을 구하기위해 100을 곱한다.

    print("%.3f"%ratio + '%') # 총 소수점 3자리 (.3f)로 출력


