# a=[]
# sc=[]

# n=int(input())
# a = list(map(int, input().split()))
# max=max(a)

# for i in range(n):
#     sc.append(a[i]/max*100)
# print(sum(sc)/n)

n = int(input())  # 과목 수
test_list = list(map(int, input().split()))
max_score = max(test_list)

new_list = []
for score in test_list :
    new_list.append(score/max_score *100)  # 새로운 점수 생성
print(sum(new_list)/n)