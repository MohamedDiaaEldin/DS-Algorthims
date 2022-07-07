

def roman_to_integer(roman):
    sym_nums = {
        "I":1,
        "V":5,
        "X":10,
        "L":50,
        "C":100,
        "D":500,
        "M":1000
    }
    val = 0
    for i  in range(len(roman) -1):
            if sym_nums.get(roman[i]) < sym_nums.get(roman[i+1]):
                val -= sym_nums.get(roman[i])
            else:
                val += sym_nums.get(roman[i])
    val += sym_nums.get(roman[len(roman)-1])
    return val

print(roman_to_integer("MCMXCIV"))