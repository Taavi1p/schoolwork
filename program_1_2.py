algkiirus = int(input("Sisesta algkiirus: "))
while algkiirus < 0:
    algkiirus = int(input("Positiivne arv palun! Sisesta algkiirus uuesti: "))

kiirus = int(input("Sisesta kiirus: "))
while kiirus < 0:
        kiirus = int(input("Positiivne arv palun! Sisesta kiirus uuesti: "))

aeg = int(input("Sisesta aeg: "))
while aeg < 0:
        aeg = int(input("Positiivne arv palun! Sisesta aeg uuesti: "))


print( (kiirus - algkiirus)/ aeg)