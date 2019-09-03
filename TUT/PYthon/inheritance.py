class user:
    name = ""

    def __init__(self, name):
        self.name = name

    def givename(self):
        print("", self.name)


class programmer(user):
    def __init__(self, name):
        self.name = name

    def programming(self):
        print("I ama programmer")


brian = user("Brian")
brian.givename()

diana = programmer("Diana")
diana.givename()
diana.programming()
