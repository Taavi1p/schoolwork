"""def caesar_cypher(word):
    alphabet = "a b c d e f g h i j k l m n o p q r s t u v w x y z"
    alphabet_list = alphabet.split()
    print(alphabet_list)"""


def caesar_cipher(word):
    result = ""
    for i in range(len(word)):
        char = word[i]

        if (char.isupper()):
            result += chr((ord(char) - 65 + 1) % 26 + 65)

        else:
            result += chr((ord(char) - 97 + 1) % 26 + 97)
    print(result)


caesar_cipher("abcdef")