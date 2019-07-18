//Exercicio 01

function calcularCirculo({ raio, tipoCalculo} ){
    if (tipoCalculo === 'A') {
        return (3.14 * (raio * raio));
    } else if (tipoCalculo === 'C') {
        return (3.14 * (2 * raio));
    }
    return 0;
}


let circulo = { raio: 2 , tipoCalculo: 'A'};
let circulo2 = { raio: 2 , tipoCalculo: 'C'};
var resultado = calcularCirculo(circulo);
//console.log(resultado);


//Exercicio 02

function naoBissexto(ano) {
    if (ano % 4 == 0 && ano % 100 != 0)
        return false;
    else if (ano % 400 == 0)
        return false;
    else
        return true;
}

// console.log(naoBissexto(2016)) // false
// console.log(naoBissexto(2017)) // true

// const testes = {
//     diaAula: "Segundo",
//     local: "DBC",
//     naoBissexto(ano) {
//         return (ano %400 === 0 ) || (ano %4 ==0 && ano %100 !== 0) ? false : true;
//     }
// }


//Exercicio 03

function somarPares(numeros) {
    let total = 0;
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
// console.log(resultado, resultado2);

//Exercicio 04

// function adicionar(x) {
//     return function(y){
//        return x + y
//     }
// }

// console.log(adicionar(20)(21));

let adicionar = op1 => op2 => op1+op2;

/* const is_divisivel = (divisor, numero) => !(numero % divisor);
const divisor = 2;
console.log(is_divisivel(divisor,20));
console.log(is_divisivel(divisor,11));
console.log(is_divisivel(divisor,12)); */

/* const divisivelPor = (divisor, numero) => !(numero % divisor);
const is_divisivel = divisivelPor(2);
console.log(is_divisivel(20));
console.log(is_divisivel(11));
console.log(is_divisivel(12)); */

//Exercicio 05

function arredondar(numero, precisao = 2){
    const fator = Math.pow(10,precisao);
    return Math.ceil(numero * fator)/fator;
}

function imprimirBRL(numero){
    let qtdCasasMilhares = 3;
    let separadorMilhar = '.';
    let separadorDecimal = ',';
    
    let stringBuffer = [];
    let parteDecimal = arredondar(Math.abs(numero)%1);
    let parteInteira = Math.trunc(numero);
    let parteInteiraString = Math.abs(parteInteira).toString();
    let parteInteiraTamanho = parteInteiraString.length;

    let c = 1;
    while(parteInteiraString.length > 0){
        if(c % qtdCasasMilhares == 0){
            stringBuffer.push( `${separadorMilhar}${parteInteiraString.slice( parteInteiraTamanho - c )}` );
            parteInteiraString = parteInteiraString.slice(0, parteInteiraTamanho - c );
        } else if(parteInteiraString.length < qtdCasasMilhares){
            stringBuffer.push( parteInteiraString );
            parteInteiraString = '';
        }
        c++;
    }
    stringBuffer.push(parteInteiraString);
    let decimalString = parteDecimal.toString().replace('0.', '').padStart(2,'0');
    return `${parteInteira >=0 ? 'R$' : '-R$'}${stringBuffer.reverse().join('')}${ separadorDecimal } ${ decimalString }`
}

console.log(imprimirBRL(0));
console.log(imprimirBRL(3498.99));
console.log(imprimirBRL(-3498.99));
console.log(imprimirBRL(2313477.0135));

