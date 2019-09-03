sum = 0
num = 371  # which is an armstrong number
temp = num

while temp > 0:
    digit = temp % 10
    sum = sum + (digit ** 3)
    temp = temp // 10

if num == sum:
    print("Armstrong")
else:
    print("Not Armstrong")
