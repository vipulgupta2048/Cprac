#!/usr/bin/python3

class E:
   'Common base class for all employees'
   empCount = 0

   def __init__(self, name, salary):
      self.name = name
      self.salary = salary
      E.empCount += 1

   def displayCount(self):
     print ("Total Employee %d" % E.empCount)

   def displayEmployee(self):
      print (n"Name : ", self.name,  ", Salary: ", self.salary)


#This would create first object of Employee class"
emp1 = E("Zara", 2000)
#This would create second object of Employee class"
emp2 = E("Manni", 5000)
emp1.displayEmployee()
emp2.displayEmployee()

