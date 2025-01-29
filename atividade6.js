

// Função para calcular o quadrado de um número
function quadrado(numero) {
    let resultado = Math.pow(numero, 2); // Variável local
    return resultado;
}
console.log("Quadrado de 5:", quadrado(5));

// Passagem por valor
function dobroValor(n) {
    return n * 2;
}

// Passagem por referência (simulada com array)
function dobroReferencia(nArray) {
    nArray[0] *= 2;
}

let num = 10;
console.log("Dobro por valor:", dobroValor(num));
console.log("Valor original após chamada:", num);

let numLista = [10];
dobroReferencia(numLista);
console.log("Dobro por referência:", numLista[0]);

// Simulando sobrecarga de funções usando parâmetros opcionais
function soma(a, b, c = null) {
    if (c === null) {
        return a + b;
    }
    return a + b + c;
}

// Função separada para soma de floats
function somaFloat(a, b) {
    return a + b;
}

console.log("Soma de dois inteiros:", soma(3, 4));
console.log("Soma de três inteiros:", soma(3, 4, 5));
console.log("Soma de dois floats:", somaFloat(3.5, 2.5));
