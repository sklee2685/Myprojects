#a,b,c=map(int,input().split())
import random


a=random.randint(1,6)
b=random.randint(1,6)
c=random.randint(1,6)
print('주사위 숫자 3개:%d,%d,%d'%(a,b,c))

if a == b == c:
    print(10000+a*1000)
elif a == b:
    print(1000+a*100)
elif a == c:
    print(1000+a*100)
elif b == c:
    print(1000+b*100)
else:
    print(100 * max(a,b,c))
