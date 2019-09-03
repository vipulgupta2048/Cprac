print(" *-*-*-*-*-  diceSimulator2018   *-*-*-*-*-")
import random

while True:
    pipe = input("Type y to roll the dice ")
    if pipe in ("y"):
        numbers = [1, 2, 3, 4, 5, 6]
        x = random.choice(numbers)
        print(x)
    else:
        print("GoodBye, nigga")
        break
