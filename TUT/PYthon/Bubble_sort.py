def bubbleSort(plist):
    for passnum in range(len(plist)-1,0,-1):
        for i in range(passnum):
            if plist[i]>plist[i+1]:
                temp = plist[i]
                plist[i] = plist[i+1]
                plist[i+1] = temp
                print(plist)
            else:
                print(plist)

print("Average Case - Bubble Sort")
plist = [99,1,100,787,3]
bubbleSort(plist)
print(" ")

print("Worst Case - Bubble Sort")
plist2 = [99,87,3,2]
bubbleSort(plist2)
print(" ")

print("Best Case - Bubble Sort")
plist = [1,2,3,4,100]
bubbleSort(plist)
