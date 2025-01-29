// JavaScript

// Exercício 1
const num1 = parseInt(prompt("Digite um número inteiro: "));
const num2 = parseInt(prompt("Digite outro número inteiro: "));
const decimal = parseFloat(prompt("Digite um número decimal: "));

console.log("Soma:", num1 + num2);
console.log("Subtração:", num1 - num2);
console.log("Multiplicação:", num1 * num2);
console.log("Divisão:", num1 / num2);
console.log("Resto da divisão inteira:", num1 % num2);
console.log("Decimal ao quadrado:", Math.pow(decimal, 2));

// Exercício 2
const num3 = parseInt(prompt("Digite mais um número inteiro: "));
console.log("O primeiro é maior que o segundo?", num1 > num2);
console.log("O terceiro é igual à soma dos dois primeiros?", num3 === num1 + num2);

// Exercício 3
console.log("O primeiro é maior que o segundo E o terceiro é igual à soma dos dois?", (num1 > num2) && (num3 === num1 + num2));
console.log("O primeiro é maior que o segundo OU o terceiro é igual à soma dos dois?", (num1 > num2) || (num3 === num1 + num2));

// Exercício 4
let inteiro = 10;
let decimalVar = 5.5;
let texto = "Teste";

inteiro = 20; // Atribuição simples
decimalVar += inteiro; // Atribuição mista
texto += " atualizado"; // Concatenação

console.log("Inteiro:", inteiro);
console.log("Decimal:", decimalVar);
console.log("Texto:", texto);
