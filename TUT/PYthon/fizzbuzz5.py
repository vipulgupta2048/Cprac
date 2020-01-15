# Write a program that prints the numbers from 1 to 100 and for multiples of '3' print "Fizz" instead of the number and for the multiples of '5' print "Buzz".


def voice(i, a):
    switcher = {
        i % 15 == 0: a.append("Fizzbuzz"),
        i % 3 == 0: a.append("Fizz"),
        i % 5 == 0: a.append("Buzz"),
    }
    return switcher.get(i, a.append(i))


a = []
for i in range(1, 21):
    voice(i, a)

print(a)
