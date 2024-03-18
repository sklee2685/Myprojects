n=int(input())

case=[]
for i in range(n):
    case=list(input())
    sum=0
    num=1
    for i in case:
        if i=='O':
            sum +=num
            num +=1
        else:
            num=1
    print(sum)
