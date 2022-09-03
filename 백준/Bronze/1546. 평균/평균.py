# BOJ-평균(1546)


N = int(input()) #시험 본 과목의 개수

score = list(map(int, input().split())) # 현재 성적
M = max(score) #성적의 최댓값

new_score = [] #새로운 성적을 받기위해 빈 리스트 초기화

for a in score: #점수를 a에넣어주고
    new_score.append(a/M *100) #append()함수를 이용해 새로운 점수를 추가한다.

result = sum(new_score)/N #sum()함수를 이용해 합을 구하고 평균을 구한다.
print(result)




