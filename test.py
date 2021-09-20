list = [1,2,3,4]
list2 = ["a","b","c","d"]
list3 = []

for i in list:
    for j in list2:
        paar = (i, j)
        list3.append(paar)

print(list3)
for x in range(len(list3)):
    print(list3[x])

