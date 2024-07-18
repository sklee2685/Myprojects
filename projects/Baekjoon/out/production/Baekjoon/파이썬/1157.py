w = input().upper()
set_w = list(set(w))

cnt_list=[]
for i in set_w:
    cnt=w.count(i)
    cnt_list.append(cnt)

if cnt_list.count(max(cnt_list))>1:
    print('?')
else:
    max_index=cnt_list.index(max(cnt_list))
    print(set_w[max_index])