str=input()
li=str.split(" ")
num1=int(li[0])
num2=int(li[2])
op=li[1]
if op=='+':
  result=num1+num2
elif op=='-':
  result=num1-num2
elif op=='*':
  result=num1*num2
elif op=='/':
  result=num1/num2
elif op=='%':
  result=num1%num2
print (int(result))
  
