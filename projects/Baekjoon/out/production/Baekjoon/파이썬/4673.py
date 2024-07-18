range_num=set(range(1,10001))
no_self_number=set()

for num in range(1,10001):
    for i in str(num):
        num += int(i)
    no_self_number.add(num)
    
self_num=sorted(range_num-no_self_number)

for i in self_num:
    print(i)