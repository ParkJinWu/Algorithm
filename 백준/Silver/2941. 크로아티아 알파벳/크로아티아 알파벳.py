#BOJ - 2941 크로아티아 알파벳
croatia = ['c=','c-','dz=','d-','lj','nj','s=','z='] #크로아티아 알파벳을 저장
a = input()

for i in croatia: #크로아티아 알파벳을 각 원소별로 나눠준다.
    a= a.replace(i,'$') #replace()함수를 이용해 입력받은 문자열에서 크로아티아 알바펫(i)가있으면 '$'로바꿔준다.

print(len(a))
