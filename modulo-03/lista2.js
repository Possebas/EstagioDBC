function calcularCirculo({ raio, tipoCalculo:tipo }){
    return Math.ceil(tipo == "A" ? Math.PI * Math.pow( raio, 2 ) : 2 * Math.PI * raio) ;
}

let circulo = {
    raio : 3,
    tipoCalculo : "A"
}

//console.log(calcularCirculo(circulo));

/*function naoBissexto(ano) {
    return (ano %400 === 0) || (ano %4 == 0 && ano %100 !== 0) ? false : true;
}*/

let naoBissexto = ano => (ano %400 === 0) || (ano %4 == 0 && ano %100 !== 0) ? false : true;

/*const testes = {
    diaAula : "Segundo",
    local : "DBC",
    naoBissexto(ano) {
        return (ano %400 === 0) || (ano %4 == 0 && ano %100 !== 0) ? false : true;
    }
}*/

//console.log(testes.naoBissexto(2016));

function somarPares(numeros) {
    let resultado = 0;
    for (let i = 0; i < numeros.length; i++) {
        if (i % 2 == 0){
            resultado += numeros[i];
        }
    }
    return resultado;
}

//console.log(somarPares([1, 56, 4.34, 6, -2]));

/*function adicionar(op1){
    return function(op2){
        return op1+op2;
    }
}*/

let adicionar = op1 => op2 => op1 + op2

//console.log(adicionar(3)(4)); //7
//console.log(adicionar(5642)(8749)); //14391

/* const is_divisivel = (divisor, numero) => !(numero % divisor);
const divisor = 2;
console.log(is_divisivel(divisor, 20));
console.log(is_divisivel(divisor, 11));
console.log(is_divisivel(divisor, 12)); */

const divisivelPor = divisor => numero => !(numero % divisor);
const is_divisivel = divisivelPor(2);
const is_divisivel3 = divisivelPor(3);
/* console.log(is_divisivel(20));
console.log(is_divisivel(11));
console.log(is_divisivel(12));
console.log(is_divisivel3(20));
console.log(is_divisivel3(11));
console.log(is_divisivel3(12)); */

let moedas = ( function() {
    
    //Tudo que é privado aqui
    function imprimirMoeda( params ){
        
        function arredondar(numero, precisao = 2) {
            const fator = Math.pow( 10, precisao )
            return Math.ceil( numero * fator ) / fator
        }

        const {
            numero,
            separadorMilhar,
            separadorDecimal,
            colocarMoeda,
            colocarNegativo
        } = params
    
        let qtdCasasMilhares = 3
        let stringBuffer = []
        let parteDecimal = arredondar(Math.abs(numero)%1)
        let parteInteira = Math.trunc(numero)
        let parteInteiraString = Math.abs(parteInteira).toString()
        let parteInteiraTamanho = parteInteiraString.length
    
        let c = 1
        while (parteInteiraString.length > 0) {
            if (c % qtdCasasMilhares == 0) {
                stringBuffer.push( `${separadorMilhar}${parteInteiraString.slice( parteInteiraTamanho - c )}`)
                parteInteiraString = parteInteiraString.slice(0, parteInteiraTamanho - c )
            } else if (parteInteiraString.length < qtdCasasMilhares) {
                stringBuffer.push( parteInteiraString )
                parteInteiraString = ''
            } 
            c++
        }
        stringBuffer.push( parteInteiraString )
        
        let decimalString = parteDecimal.toString().replace('0.', '').padStart(2, '0')
        const numeroFormatado = `${ stringBuffer.reverse().join('') }${ separadorDecimal }${ decimalString }`;
        return parteInteira >= 0 ? colocarMoeda(numeroFormatado) : colocarNegativo(colocarMoeda(numeroFormatado));
    }

    //Tudo que é público
    return {
        imprimirBRL: (numero) => 
            imprimirMoeda({
                numero,
                separadorMilhar : '.',
                separadorDecimal: ',',
                colocarMoeda : numeroFormatado => `R$ ${ numeroFormatado }`,
                colocarNegativo : numeroFormatado => `-${ numeroFormatado }`,
            }),
            imprimirGBP: (numero)=>
                imprimirMoeda({
                    numero,
                    separadorMilhar : ',',
                    separadorDecimal: '.',
                    colocarMoeda : numeroFormatado => `£ ${ numeroFormatado }`,
                    colocarNegativo : numeroFormatado => `-${ numeroFormatado }`,
                }),
            imprimirFR: (numero) =>
                imprimirMoeda({
                    numero,
                    separadorMilhar : '.',
                    separadorDecimal: ',',
                    colocarMoeda : numeroFormatado => `${ numeroFormatado } €`,
                    colocarNegativo : numeroFormatado => `-${ numeroFormatado }`,
                })
        }

})()

/* console.log(moedas.imprimirBRL(0));
console.log(moedas.imprimirBRL(3498.99));
console.log(moedas.imprimirBRL(-3498.99));
console.log(moedas.imprimirBRL(2313477.0135));

console.log(moedas.imprimirGBP(0));
console.log(moedas.imprimirBRL(3498.99));
console.log(moedas.imprimirBRL(-3498.99));
console.log(moedas.imprimirBRL(2313477.0135)); */