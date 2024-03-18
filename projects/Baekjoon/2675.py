n = int(input())

for i in range(n):
    r,s = input().split() #반복 횟수, 반복할 문자열
    p='' #반복된 문자열들이 저장될 공간
    for j in s:
        p += int(r)*j #
    print(p)


# n= int(input())
# p=[]
# for i in range(n):
#     r,s = input().split()
#     r = int(r)
#     s = list(s)

#     for j in range(r):
#         p += s[j]*r
# print(p)