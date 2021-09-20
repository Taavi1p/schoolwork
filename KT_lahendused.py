def ul1():
    fail = open("nimed.txt", "r")

    for rida in fail:

        andmed = rida.strip().split()
        perenimi = andmed[-1]
        eesnimi = ""
        for i in range(len(andmed) - 1):
            eesnimi += andmed[i][0] + ". "

        print(eesnimi + perenimi)

    fail.close()

from turtle import *
def ristkülik(a, b):
    for i in range(2):
        fd(a)
        left(90)
        fd(b)
        left(90)
def ul2():
    vahe = 10
    while True:
        kulg_a = int(input("A külg: "))
        kulg_b = int(input("B külg: "))
        if kulg_a > 0 and kulg_b >0:
            break
    while kulg_a > 0 and kulg_b > 0:
        ristkülik(kulg_a, kulg_b)
        pu()
        fd(vahe)
        left(90)
        fd(vahe)
        right(90)
        pd()
        kulg_a = kulg_a - 2 * vahe
        kulg_b = kulg_b - 2 * vahe

    exitonclick()

ul2()