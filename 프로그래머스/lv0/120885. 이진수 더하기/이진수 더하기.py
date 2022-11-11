def solution(bin1, bin2):
    a = int(bin1,2) #2 -> 10
    b = int(bin2,2)
    #print(bin(a+b).replace("0b",""))
    return bin(a+b).replace("0b","")
    
