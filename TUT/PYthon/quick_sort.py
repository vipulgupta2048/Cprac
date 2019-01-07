# QUick sort
# https://interactivepython.org/courselib/static/pythonds/SortSearch/TheQuickSort.html

def quickSort(alist):
    quickSortHelper(alist,0,len(alist)-1)

def quickSortHelper(alist,first,last):
    if first<last:
        splitpoint = partition(alist,first,last)

        quickSortHelper(alist,first,splitpoint-1)
        quickSortHelper(alist,splitpoint+1,last)


def partition(alist,first,last):
    # ~ pivotindex = get_pivot(alist, first, last)
    # For sake of convienience we are taking the first value as Pivot
    pivotindex = first
    pivotvalue = alist[first]

    pivotvalue, alist[first] = alist[first], pivotvalue
    border = first

    for i in range(first, last+1):
        if alist[i] < pivotvalue:
            border += 1
            alist[i], alist[border] = alist[border], alist[i]
    alist[first], alist[border] = alist[border], alist[first]

    return (border)

# ~ alist = [54,26,93,17,77,31,44,55,20]
alist = [1,2,77,3,88,99,6,78,5,9,8,444,1,5,74,0,9]
quickSort(alist)
print(alist)

# ~ Insertion sort only depends on the best pick of Pivot value that you are taking. For a better Pivot value, always take the median of the first, last and middle value something list this.

# ~ def get_pivot(A, low, hi):
	# ~ mid = (hi + low) // 2
	# ~ s = sorted([A[low], A[mid], A[hi]])
	# ~ if s[1] == A[low]:
		# ~ return low
	# ~ elif s[1] == A[mid]:
		# ~ return mid
	# ~ return hi
