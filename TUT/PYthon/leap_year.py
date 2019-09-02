def year(n):
    return "{0} is {1} about being a leap year".format(n, (n%4 == 0) and (n % 100 != 0) or (n % 400 == 0))

print(year(2000))
print(year(1000))
print(year(3))
print(year(4))
print(year(16000000))
print(year(2004))
print(year(2010))
