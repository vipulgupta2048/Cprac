# insertion SORT in python
# https://www.youtube.com/playlist?list=PLj8W7XIvO93rJHSYzkk7CgfiLQRUEC2Sq


def insertion_sort(a):
    print("Original -  {}".format(a))
    for i in range(1, len(a)):
        key = a[i]
        j = i - 1
        while key < a[j] and j >= 0:
            a[j + 1] = a[j]
            j = j - 1
            print("Running  -  {}".format(a))
        a[j + 1] = key
    print("Sorted   -  {}".format(a))


insertion_sort([1, 10, 2, 5, 4])
print()
insertion_sort([1, 23, 4, 57, 8, 9, 345, 67, 6, 8, 0])
print()
insertion_sort([1, 2, 77, 3, 88, 99, 6, 78, 5, 9, 8, 444, 1, 5, 74, 0, 9])
