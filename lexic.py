str1=input()
li=list(str1)
for i in range(len(li)):
  for j in range(len(li)):
    if li[i]>li[j]:
      temp=li[i]
      li[i]=li[j]
      li[j]=temp
print(''.join(li))
