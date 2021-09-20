eesnimi = input("Teie eesnimi: ")
if (eesnimi[0].islower()):
    eesnimi = eesnimi.capitalize()

perekonnanimi = input("Teie perekonnanimi: ")
if (perekonnanimi[0].islower()):
    perekonnanimi = perekonnanimi.capitalize()

email = input("Sisesta email: ")
telefoni_number = input("sisesta telefoni number: ")

isikukood = input("sisesta isikukood: ")

while (len(isikukood) != 11 or isikukood.isnumeric() == False):
    isikukood = input("sisesta isikukood uuesti: ")
