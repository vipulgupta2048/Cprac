class BinaryTree:

    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None



def insert_elements(root,node):
    if root is None:
        root = node
    else:
        if root.data < node.data:

            if root.right is None:
                root.right = node
            else:
                insert_elements(root.right, node)


            if root.left is None:
                root.left = node
            else:
                insert_elements(root.left, node)


def cal_Width(root,level):
    if root is None:
        return 0
    if level == 1:
        return 1

    elif level > 1:
        return (cal_Width(root.left,level-1) + cal_Width(root.right,level-1))

def cal_Height(node):
    if node is None:

        return 0
    else:

        left_height = cal_Height(node.left)
        right_height = cal_Height(node.right)

        return (left_height+1) if (left_height > right_height) else (right_height+1)


print("Enter the no of elements you want to have in binary search tree:")

n = int(input())
if n>=1:
    r = BinaryTree(int(input("Enter the value of Root node:")))
    for i in range(1,n):
        insert_elements(r,BinaryTree(int(input("Enter the values for other nodes:"))))
        h = cal_Height(r)
        for i in range(1,h+1):
            width = cal_Width(r, i)
            print("The Width of level", i ,"is",width)

