# Python
# Exercício 1
num1 = int(input("Digite um número inteiro: "))
num2 = int(input("Digite outro número inteiro: "))
decimal = float(input("Digite um número decimal: "))

print("Soma:", num1 + num2)
print("Subtração:", num1 - num2)
print("Multiplicação:", num1 * num2)
print("Divisão:", num1 / num2)
print("Resto da divisão inteira:", num1 % num2)
print("Decimal ao quadrado:", decimal ** 2)

# Exercício 2
num3 = int(input("Digite mais um número inteiro: "))
print("O primeiro é maior que o segundo?", num1 > num2)
print("O terceiro é igual à soma dos dois primeiros?", num3 == num1 + num2)

# Exercício 3
print("O primeiro é maior que o segundo E o terceiro é igual à soma dos dois?", (num1 > num2) and (num3 == num1 + num2))
print("O primeiro é maior que o segundo OU o terceiro é igual à soma dos dois?", (num1 > num2) or (num3 == num1 + num2))

# Exercício 4
inteiro = 10
decimal = 5.5
texto = "Teste"

inteiro = 20  # Atribuição simples
decimal += inteiro  # Atribuição mista
texto += " atualizado"  # Concatenação

print("Inteiro:", inteiro)
print("Decimal:", decimal)
print("Texto:", texto)