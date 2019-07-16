//Exercicio 05

function arredondar(numero, precisao = 2){
    const fator = Math.pow(10,precisao);
    return Math.ceil(numero * fator)/fator;
}

function imprimirMoeda(params){
    const {
        numero,
        separadorMilhar,
        separadorDecimal,
        colocarMoeda,
        colocarNegativo
    } = params
    let qtdCasasMilhares = 3;
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
    const numeroFormatado = `${stringBuffer.reverse().join('')}${ separadorDecimal } ${ decimalString }`
    return parteInteira >= 0 ? colocarMoeda(numeroFormatado) : colocarNegativo(colocarMoeda(numero));
}


function imprimirBRL(numero){
    return imprimirMoeda({
        numero, 
        separadorMilhar: '.', 
        separadorDecimal: ',',
        colocarMoeda: numeroFormatado => `R$ ${numeroFormatado}`,
        colocarNegativo: numeroFormatado => ` - ${numeroFormatado}`,
    })
}

function imprimirGBP(numero){
    return imprimirMoeda({
        numero, 
        separadorMilhar: ',', 
        separadorDecimal: '.',
        colocarMoeda: numeroFormatado => `£ ${numeroFormatado}`,
        colocarNegativo: numeroFormatado => `- ${numeroFormatado}`
    })
}

function imprimirGBP(numero){
    return imprimirMoeda({
        numero, 
        separadorMilhar: ',', 
        separadorDecimal: '.',
        colocarMoeda: numeroFormatado => `€ ${numeroFormatado}`,
        colocarNegativo: numeroFormatado => `- ${numeroFormatado}`
    })
}



console.log(imprimirBRL(0));
/* console.log(imprimirMoeda(3498.99));
console.log(imprimirMoeda(-3498.99));
console.log(imprimirMoeda(2313477.0135)); */