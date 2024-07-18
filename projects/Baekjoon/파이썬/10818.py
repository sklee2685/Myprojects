# n= int(input())
# b = list(map(int, input().split()))
# print(min(b),max(b))

n= int(input())
while True:
        b = list(map(int, input().split()))
        if len(b)==n:
            break
        elif len(b) !=n:
            print('처음 입력한 값과 동일하지 X')
            continue

print(min(b),max(b))
