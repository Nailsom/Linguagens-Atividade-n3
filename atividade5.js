// JavaScript

// Exercício 1: Classificação por idade e nota
let idade = parseInt(prompt("Digite sua idade: "));
if (idade < 12) {
    console.log("Criança");
} else if (idade < 18) {
    console.log("Adolescente");
} else {
    console.log("Adulto");
}

let nota = parseFloat(prompt("Digite sua nota: "));
if (nota >= 7) {
    console.log("Aprovado");
} else if (nota >= 5) {
    console.log("Recuperação");
} else {
    console.log("Reprovado");
}

// Exercício 2: Tabuada
let num = parseInt(prompt("Digite um número positivo: "));
while (num <= 0) {
    num = parseInt(prompt("Entrada inválida! Digite um número positivo: "));
}

for (let i = 1; i <= 10; i++) {
    console.log(`${num} x ${i} = ${num * i}`);
}

// Exercício 3: Ler números até que o usuário digite 0
while (true) {
    let numero = parseInt(prompt("Digite um número (0 para sair): "));
    if (numero === 0) {
        break;
    }
    if (numero < 0) {
        continue;
    }
    console.log("Você digitou:", numero);
}

// Exercício 4: Divisão segura
try {
    let num1 = parseFloat(prompt("Digite o primeiro número: "));
    let num2 = parseFloat(prompt("Digite o segundo número: "));
    if (num2 === 0) {
        throw new Error("Erro: Divisão por zero não é permitida.");
    }
    let resultado = num1 / num2;
    console.log("Resultado:", resultado);
} catch (error) {
    console.log(error.message);
}