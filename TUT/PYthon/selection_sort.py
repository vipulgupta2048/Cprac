# Selection Sort in Python
# https://www.youtube.com/playlist?list=PLj8W7XIvO93rJHSYzkk7CgfiLQRUEC2Sq

def selection_sort(a):
    print("Original -  {}".format(a))
    for i in range(0, len(a)-1):
        minIndex = i
        for j in range(i+1, len(a)):
            if a[j] < a[minIndex]:
                minIndex = j
        if minIndex != i:
            a[i], a[minIndex] = a[minIndex], a[i]
        print("Running  -  {}".format(a))
    print("Sorted  -  {}".format(a))

selection_sort([1,10,2,5,4])
print()
selection_sort([1,23,4,57,8,9,345,67,6,8,0])
print()
selection_sort([1,2,77,3,88,99,6,78,5,9,8,444,1,5,74,0,9])

