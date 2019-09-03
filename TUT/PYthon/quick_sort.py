# QUick sort
# https://interactivepython.org/courselib/static/pythonds/SortSearch/TheQuickSort.html


def quickSort(alist):
    quickSortHelper(alist, 0, len(alist) - 1)


def quickSortHelper(alist, first, last):
    if first < last:
        splitpoint = partition(alist, first, last)

        quickSortHelper(alist, first, splitpoint - 1)
        quickSortHelper(alist, splitpoint + 1, last)


def partition(alist, first, last):
    # ~ pivotindex = get_pivot(alist, first, last)
    # For sake of convienience we are taking the first value as Pivot
    pivotindex = first
    pivotvalue = alist[first]

    pivotvalue, alist[first] = alist[first], pivotvalue
    border = first
    print(border)
    print(pivotvalue)
    for i in range(first, last + 1):
        if alist[i] < pivotvalue:
            border += 1
            alist[i], alist[border] = alist[border], alist[i]
    alist[first], alist[border] = alist[border], alist[first]
    print(alist)
    return border


# ~ alist = [54,26,93,17,77,31,44,55,20]
# ~ alist = [1,2,3,4,5,6,7]
# ~ quickSort(alist)
# ~ print(alist)
# ~ print()
# ~ alist = [5,6,7,1,2,3,4]
# ~ quickSort(alist)
# ~ print(alist)
# ~ print()
# ~ alist = [7,6,5,4,3,2,1]
# ~ quickSort(alist)
# ~ print(alist)

alist = [65, 43, 54, 26, 38, 48, 50]
quickSort(alist)
print(alist)


# ~ Insertion sort only depends on the best pick of Pivot value that you are taking. For a better Pivot value, always take the median of the first, last and middle value something like  this.

# ~ def get_pivot(A, low, hi):
# ~ mid = (hi + low) // 2
# ~ s = sorted([A[low], A[mid], A[hi]])
# ~ if s[1] == A[low]:
# ~ return low
# ~ elif s[1] == A[mid]:
# ~ return mid
# ~ return hi
