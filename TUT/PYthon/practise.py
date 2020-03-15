import random
seen = []
for x in range(25):
    a = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24]
    a.remove(x)
    b = True
    while b:
        y = random.sample(a, 7)
        if y not in seen:
            seen.append(y)
            if x not in y:
                print(x, y)
                b = False































# for i in range(1, 101):
#     if i % 15 == 0:
#         print("FizzBuzz\n", end="   ")
#         continue
#     elif i % 3 == 0:
#         print("Fizz", end="   ")
#         continue
#     elif i % 5 == 0:
#         print("Buzz", end="   ")
#         continue
#     else:
#         print(i)

# for y in x:
#     print(y, end="  ")

# for x in range(1, 11):
#     if x == 5:
#         pass
#     print(x)
