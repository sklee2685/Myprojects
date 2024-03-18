# a,b=input().split()
# a=int(a)
# b=int(b)

a,b=map(int,input().split())

if a>b:
    print('>')
elif a<b:
    print('<')
elif a==b:
    print('==')