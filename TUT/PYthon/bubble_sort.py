# Bubble Sort in Python
# https://www.youtube.com/playlist?list=PLj8W7XIvO93rJHSYzkk7CgfiLQRUEC2Sq

def bubble_sort(a):
    print("Original -  {}".format(a))
    for i in range(0, len(a)-1):
        for j in range(0, len(a)-1-i):
            if a[j]>a[j+1]:
                a[j], a[j+1] = a[j+1], a[j]
            print("Running  -  {}".format(a))
    print("Sorted  -  {}".format(a))

bubble_sort([1,10,2,5,4])
print()
bubble_sort([1,23,4,57,8,9,345,67,6,8,0])
print()
bubble_sort([1,2,77,3,88,99,6,78,5,9,8,444,1,5,74,0,9])

