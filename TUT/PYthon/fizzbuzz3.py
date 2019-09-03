# Replace the digits(3 or 5) only in the number: In this variation, only the actual digit is replaced, so 23 becomes “twenty-fizz” and 50 is “buzzty”. This variation can be combined with the original to form an even more challenging sequence.

# For Example: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, Fizz, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, Fizz, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, Fizz, Fizz, Fizz, Fizz, Fizz, Fizz Buzz, Fizz, Fizz, Fizz, Fizz, Buzz, 41, Fizz, Fizz, 44, Fizz Buzz, …

a = []
x = {
    3: "Fizz",
    35: "Fizzty-buzz",
    53: "Buzzity-fizz",
    52: "Buzzity-two",
    99: "ninety-nine",
    63: "sixty-fizz",
}

for i in range(0, 101):
    y = str(i)
    if "3" in y:
        try:
            a.append(x[i])
            continue
        except KeyError as e:
            continue
    elif "5" in y:
        try:
            a.append(x[i])
            continue
        except KeyError as e:
            continue
    else:
        a.append(i)


for z in a:
    print(z, end="  ")

#  My output
# () ➜  PYthon git:(master) ✗ python3 fizzbuzz3.py
# 0  1  2  Fizz  4  6  7  8  9  10  11  12  14  16  17  18  19  20  21  22  24  26  27  28  29  Fizzty-buzz  40  41  42  44  46  47  48  49  Buzzity-two  Buzzity-fizz  60  61  62  sixty-fizz  64  66  67  68  69  70  71  72  74  76  77  78  79  80  81  82  84  86  87  88  89  90  91  92  94  96  97  98  99  100  ⏎
