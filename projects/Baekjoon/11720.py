# 반복문for 사용
a=int(input())
num=input()
sum=0
for i in range(a):
    sum += int(num[i])
print(sum)

# map사용
n = input()
print(sum(map(int,input())))