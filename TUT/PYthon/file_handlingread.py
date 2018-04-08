xrange = range
x = [1,2,3,4,5,6,7,8,9,0]
for y in x:
    create = open("hello.txt", "w")
    #create.write("hello")
    for a in x:
        create.write("yellow")
    #print (create.read())
    create.close()


#file = open(filename, "w+")
#file.write ("line")
#file.close()

