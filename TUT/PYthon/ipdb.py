import ipdb
def function(x, y):
    x = x + x
    y = y * x
    z = y - x
    return z

x = 10
y = 15
z = 20
n = 1000

ipdb.set_trace()
function(10,15)
print("Hello World - {} ".format(z))
n = function(1, 5)
print("Hello World - {} ".format(n))
