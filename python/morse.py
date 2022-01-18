


def morse_to_normal(user_str,database,s_b_w,s_b_l):
    # working....
    final_ans=""
    split_string_into_words=user_str.split(s_b_w)
    for tmp_word in split_string_into_words:
        split_string_into_letters=tmp_word.split(s_b_l)
        for letters in split_string_into_letters:
            final_ans+=str(database[letters])
        final_ans+=str(" ")
    

    # test code
    # for tmp_word in split_string_into_words:
    #     print("word>>",tmp_word)
    #     # words are separated fine...
    #     split_letters=tmp_word.split("   ")
    #     for tmp_letter in split_letters:
    #         print("letter> ",tmp_letter)
    return final_ans
def normal_to_morse(user_str,database):
    # working..
    final_ans=""
    for letter in user_str:
        try:
            if letter==str(" "):
                final_ans+=str("    ")
            else:
                final_ans+=str(database[letter])+str("   ")
        except KeyError:
            print(final_ans)
    return final_ans
# driver code
print("1: morse to normal\n2: normal to morse\n3: exit\n in the next line eneter your message")
user_choice=int(input())
user_msg=input()
space_between_words="       " #7 units
space_between_letters="   "#3 units
dataBase2={
    # keyname : value
    "A":". _",
    "B":"_ . . .",
    "C":"_ . _ .",
    "D":"_ . .",
    "E":".",
    "F":". . _ .",
    "G":"_ _ .",
    "H":". . . .",
    "I":". .",
    "J":". _ _ _",
    "K":"_ . _",
    "L":". _ . .",
    "M":"_ _",
    "N":"_ .",
    "O":"_ _ _",
    "P":". _ _ .",
    "Q":"_ _ . _",
    "R":". _ .",
    "S":". . .",
    "T":"_",
    "U":". . _",
    "V":". . . _",
    "W":". _ _",
    "X":"_ . . _",
    "Y":"_ . _ _",
    "Z":"_ _ . .",
}
dataBase1={
    ". _":"A",
    "_ . . .":"B",
    "_ . _ .":"C",
    "_ . .":"D",
    ".":"E",
    ". . _ .":"F",
    "_ _ .":"G",
    ". . . .":"H",
    ". .":"I",
    ". _ _ _":"J",
    "_ . _":"K",
    ". _ . .":"L",
    "_ _":"M",
    "_ .":"N",
    "_ _ _":"O",
    ". _ _ .":"P",
    "_ _ . _":"Q",
    ". _ .":"R",
    ". . .":"S",
    "_":"T",
    ". . _":"U",
    ". . . _":"V",
    ". _ _":"W",
    "_ . . _":"X",
    "_ . _ _":"Y",
    "_ _ . .":"Z",
}
if user_choice==1:
        print(morse_to_normal(user_msg,dataBase1,space_between_words,space_between_letters))
elif user_choice==2:
        print(normal_to_morse(user_msg.upper(),dataBase2))
