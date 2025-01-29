# Python

def quadrado(numero):
    resultado = numero ** 2  # Variável local
    return resultado

print("Quadrado de 5:", quadrado(5))

# Passagem por valor
def dobro_valor(n):
    return n * 2

# Passagem por referência (simulada com lista)
def dobro_referencia(n_lista):
    n_lista[0] *= 2

num = 10
print("Dobro por valor:", dobro_valor(num))
print("Valor original após chamada:", num)

num_lista = [10]
dobro_referencia(num_lista)
print("Dobro por referência:", num_lista[0])

# Sobrecarga de funções em Python (simulada usando argumentos padrões e *args)
def soma(a, b, c=None):
    if c is None:
        return a + b
    return a + b + c

def soma_float(a: float, b: float) -> float:
    return a + b

print("Soma de dois inteiros:", soma(3, 4))
print("Soma de três inteiros:", soma(3, 4, 5))
print("Soma de dois floats:", soma_float(3.5, 2.5))
