def switch(arg):
    switcher = {
        1: "This is case one.",
        3: "This is case three.",
        4: "This is case four."
    }
    return switcher.get(arg, "nothign")

print(switch(3))
