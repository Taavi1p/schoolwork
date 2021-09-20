
kujund = input("Kujundi nimi: ")

while kujund != "Ruut" and kujund != "Ristkülik" and kujund != "Ring" and kujund != "Kolmnurk":
    kujund = input("Sisesta päris kujund: ")

suurus = 0
laius = 0
pikkus = 0

if (kujund == "Ruut" or kujund == "Kolmnurk" or kujund == "Ring"):
    suurus = int(input("suurus: "))
    while (suurus <= 0):
        suurus = int(input("sisesta positiivne arv: "))

else:
    laius = int(input("laius: "))
    while (laius <= 0):
        laius = int(input("sisesta positiivne arv: "))
    pikkus = int(input("pikkus: "))
    while (pikkus <= 0):
        pikkus = int(input("sisesta positiivne arv: "))

import turtle
t = turtle.Turtle()

t.speed(0.8)

if (kujund == "Ruut"):
    for i in range(100):
        t.forward(suurus * 10)
        t.right(90)
        suurus = suurus - 1

if (kujund == "Kolmnurk"):
    for i in range(suurus):
        t.forward(suurus * 10)
        t.right(120)
        suurus = suurus - 1

if (kujund == "Ring"):
    for i in range(suurus):
        t.circle(i,1)
        suurus = suurus - 1

if (kujund == "Ristkülik"):
    for i in range(pikkus):
        t.forward(laius * 10)
        t.right(90)
        t.forward(pikkus * 10)
        laius = laius - 1
        pikkus = pikkus - 1
