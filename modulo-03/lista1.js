//Exercicio 01

function calcularCirculo({ raio }, tipoCalculo) {
    if (tipoCalculo === 'A') {
        return (3.14 * (raio * raio));
    } else if (tipoCalculo === 'C') {
        return (3.14 * (2 * raio));
    }
    return 0;
}


let circulo = { raio: 2 }
var resultado = calcularCirculo(circulo, 'A');
console.log(resultado);


//Exercicio 02

function naoBissexto(ano) {
    if (ano % 4 == 0 && ano % 100 != 0)
        return false;
    else if (ano % 400 == 0)
        return false;
    else
        return true;
}

console.log(naoBissexto(2016)) // false
console.log(naoBissexto(2017)) // true


//Exercicio 03

function somarPares(numeros) {
    var total = 0;
    for (let index = 0; index < numeros.length; index++) {
        if (index % 2 === 0) {
            total += numeros[index];
        }
    }
    return total;
}

let vetor = [1, 2, 3, 4, 5, 6];
let vetor2 = [1, 56, 4.34, 6, -2];
var resultado = somarPares(vetor);
var resultado2 = somarPares(vetor2);
console.log(resultado, resultado2);

//Exercicio 04

function adicionar(x) {
    return function(y){
       return x + y
    }
}

console.log(adicionar(20)(21));

//Exercicio 05

//FAZER 
