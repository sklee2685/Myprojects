N = int(input()) #N개의 정수를 입력
n_list=[0 for i in range(N)] # N개의 리스트 크기
n_list = list(map(int, input().split())) #공백을 기준으로 정수를 각각 리스트인 n_list에 입력
v = int(input()) #리스트에서 찾을 정수 v

print(n_list.count(v)) # .count를 통해 n_list에 v가 몇개 있는지 출력 
