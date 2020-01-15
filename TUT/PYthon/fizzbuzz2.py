# Replace number containing digit 3 or 5: Instead of replacing numbers that have 3 or 5 as a factor, the game can be played by replacing numbers containing the digit 3 or 5 with “fizz” or “buzz”.
#For Example: 1, 2, Fizz, 4, Buzz, 6, 7, 8, 9, 10, 11, 12, Fizz, 14, Buzz, 16, 17, 18, 19, 20, 21, 22, Fizz, 24, Buzz, 26, 27, 28, 29, Fizz, Fizz, Fizz, Fizz, Fizz, Fizz Buzz, Fizz, Fizz, Fizz, Fizz, 40, 41, 42, Fizz, 44, Buzz, …

a = []
for i in range(0, 101):
    x = str(i)
    if "3" in x:
        a.append("Fizz")
        if "5" in x:
            a.append("Buzz")
            continue
    elif "5" in x:
        a.append("Buzz")
        if "3" in x:
            a.append("Fizz")
            continue
    else:
        a.append(i)

for y in a:
    print(y, end="  ")
