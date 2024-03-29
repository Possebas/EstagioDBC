/*
Exercicio 01
Criar uma função que receba um multiplicador e vários valores a serem multiplicados, 
o retorno deve ser um array!
Ex.:
multiplicar(5, 3, 4) // [15, 20]								                                                                        
multiplicar(5, 3, 4, 5) // [15, 20, 25]
*/
function multiplicar(multiplicador, ...params) {
    return params.map(valor => valor * multiplicador)
}
console.log(multiplicar(5, 3, 4));  // [15, 20]
console.log(multiplicar(5, 3, 4, 5));  // [15, 20, 25]


