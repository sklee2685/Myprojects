for i in range(int(input())//4):
    print("long",end=" ")
print("int")

#입력 받은 N 을 4로 나누고, 그 결과만큼 반복해서 long을 출력하고, end=" "를 통해 공백 추가

#4의 배수가 아닐때 오류 출력
byte=int(input())

for i in range(byte//4):
    if(byte%4==0):
        print("long",end=" ")
    else:
        print("4의 배수로 입력해 주세요.")
if (byte%4==0):
    print("int")