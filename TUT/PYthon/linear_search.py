# Linear Search Algo


def searching(alist, x):
    for i in range(0, len(alist)):
        if alist[i] == x:
            return "Element found at " + str(i)
    return "element not found"


alist = [1, 2, 77, 3, 88, 99, 6, 78, 5, 9, 8, 444, 1, 5, 74, 0, 9]
# element to find is x
x = 444

print(searching(alist, x))
