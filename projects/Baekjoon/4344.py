c=int(input())

for i in range(c):
    s=list(map(int, input().split()))
    avg=sum(s[1:])/s[0]
    cnt=0
    for score in s[1:]:
        if score > avg:
            cnt += 1
    rate = cnt/s[0] *100
    print(f'{rate:.3f}%')
