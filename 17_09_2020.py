fail = open("eksam.txt")
andmed = []

for rida in fail:
     andmed.append(rida.strip().split("|"))

#for sore

best_score = 0
best_student_name = ""


print(andmed)

for student in andmed:
    tulemus = int(student[2]) + int(student[3])  + int(student[4]) + int(student[5]) + int(student[6]) + int(student[7]) + int(student[8])
    print(student[0] + "eksami tulemused kokku:" + str(tulemus) )

    if tulemus > best_score:
        best_score = student
        best_student_name = student[0]

print("Parim tudeng oli: " + best_student_name + "tulemusega :" + best_score)

