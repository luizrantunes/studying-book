velocidadeMotorista = 10

if velocidadeMotorista > 110:
    print("Você tá muito rápido!")
elif velocidadeMotorista > 40 and velocidadeMotorista <= 110:
    print("Tá dentro do limite de velocidade!")
elif velocidadeMotorista < 40:
    print("Cê tá indo devagar demais")
else:
    print("Null")