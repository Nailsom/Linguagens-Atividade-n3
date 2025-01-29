# Python

# Exercício 1: Classificação por idade e nota
idade = int(input("Digite sua idade: "))
if idade < 12:
    print("Criança")
elif idade < 18:
    print("Adolescente")
else:
    print("Adulto")

nota = float(input("Digite sua nota: "))
if nota >= 7:
    print("Aprovado")
elif nota >= 5:
    print("Recuperação")
else:
    print("Reprovado")

# Exercício 2: Tabuada
num = int(input("Digite um número positivo: "))
while num <= 0:
    num = int(input("Entrada inválida! Digite um número positivo: "))

for i in range(1, 11):
    print(f"{num} x {i} = {num * i}")

# Exercício 3: Ler números até que o usuário digite 0
while True:
    numero = int(input("Digite um número (0 para sair): "))
    if numero == 0:
        break
    if numero < 0:
        continue
    print("Você digitou:", numero)

# Exercício 4: Divisão segura
try:
    num1 = float(input("Digite o primeiro número: "))
    num2 = float(input("Digite o segundo número: "))
    resultado = num1 / num2
    print("Resultado:", resultado)
except ZeroDivisionError:
    print("Erro: Divisão por zero não é permitida.")
except ValueError:
    print("Erro: Entrada inválida. Digite apenas números.")
