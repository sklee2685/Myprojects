a=[]
b=[]
for i in range(10):
    a.append(int(input()))
    b.append(a[i]%42)
b=set(b)
print(len(b))

# a=[]
# for i in range(10):
#     n=int(input())
#     a.append(n%42)
# a=set(a)
# print(len(a))
