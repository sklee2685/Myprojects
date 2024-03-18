# num=input().split()

# num_reverse=[]
# for i in num:
#     a=i[::-1]
#     num_reverse.append(a)

# print(max(num_reverse))

# a,b=input().split()
# a=int(a[::-1])
# b=int(b[::-1])

# if a==b:
#     print("입력하신 두수가 동일합니다.")
# elif a >= 100 and b >= 100:
#     print(max(a,b))
# else:
#     print("세자리 숫자를 입력해주세요.")

a,b=input().split()
a=int(a[::-1])
b=int(b[::-1])

print(max(a,b))