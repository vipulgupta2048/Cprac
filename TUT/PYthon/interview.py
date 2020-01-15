# sum = 0
def averageFile(filepath):
    sum = 0
    with open('x') as file:
        # x = file.readlines
        for y,x in enumerate(iter(file.readline, "")):
            x = int(x)
            sum = sum + x
        print(sum)
        average = sum / y
        print(average)

averageFile("bro")
