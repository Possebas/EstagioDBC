



function cardapioIFood( veggie = true, comLactose = false ) {
    let cardapio = [
      'enroladinho de salsicha',
      'cuca de uva'
    ]
    
  
    if ( !comLactose ) {
      cardapio.push( 'pastel de queijo' )
    }
  
    cardapio.push('pastel de carne', 'empada de legumes marabijosa')
  
    if ( veggie ) {
      // TODO: remover alimentos com carne (é obrigatório usar splice!)
      cardapio.splice(cardapio.indexOf('enroladinho de salsicha'),1)
      cardapio.splice(cardapio.indexOf('pastel de carne'),1)
    }

    let resultadoFinal = cardapio
                  //.filter(alimento => alimento === 'cuca de uva')
                  .map(alimento => alimento.toUpperCase())
    console.log(resultadoFinal);
    return resultadoFinal;
}

//console.log(cardapioIFood(true, false)) // esperado: [ 'CUCA DE UVA', 'PASTEL DE QUEIJO', 'EMPADA DE LEGUMES MARABIJOSA' ]

function criarSanduiche(pao, recheio, queijo){
  //console.log(`Seu sanduiche tem o pão ${pao} com recheio de ${recheio} e queijo ${queijo}`)
}

const ingredientes = ['3 queijos', 'frango', 'cheddar']
//criarSanduiche(...ingredientes);

function receberValoresIndefinidos(...valores) {
  valores.map(valor => console.log(valor));
}

//receberValoresIndefinidos([1, 3, 4, 5]);

/* let inputTest = document.getElementById('campoTeste');
inputTest.addEventListener('blur', cardapioIFood(true, false));
 */

String.prototype.correr = function(upper = false){
  let texto = `${this} estou correndo`;
  return upper ? texto.toUpperCase() : texto;
}

console.log("ola".correr(true));
