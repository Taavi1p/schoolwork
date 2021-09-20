sõna = input("kirjuta üks sõna: ")
def shortener(word):
    list = word.split()
    for i in range(len(list)):
        if (list[i] == list[i+1]):
            list[i] = ""
    word = "".join(list)
    print(word)

shortener("heyaa")