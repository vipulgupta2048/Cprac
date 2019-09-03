a_in = int(input())
counter = 0
for x in range(1, 51):
    x = int(x)
    if x % a_in == 0 and x != a_in:
        counter = counter + 1

print("", counter)
