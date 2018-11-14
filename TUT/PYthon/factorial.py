x = int(input("Enter number for factorial: "))
fact = 1
for i in range(1,x+1):
    if (x==0):
        break
    else:
        fact = fact * i

print ("",fact)


