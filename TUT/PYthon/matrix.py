a,b = map(int,input().split())
m = []
count = 1
for x in range(1,a+1):
    n = []
    for y in range(1,b+1):
        n.append(count)
        count = count + 1
    m.append(n)
print ("",m)

for i in range(a):
    for j in range(b):
        if (j==b-1):
            print(m[i][j], end="")
        else:
            print(m[i][j], end=" ")
    if (i != a-1):
        print()
