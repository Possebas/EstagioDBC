



function cardapioIFood( veggie = true, comLactose = false ) {
    const cardapio = [
      'enroladinho de salsicha',
      'cuca de uva'
    ]
    
  
    if ( !comLactose ) {
      cardapio.push( 'pastel de queijo' )
    }
  
    cardapio.concat( [
      'pastel de carne',
      'empada de legumes marabijosa'
    ] )
    var i = cardapio.length;
    if ( veggie ) {
      // TODO: remover alimentos com carne (é obrigatório usar splice!)
      //const indiceEnroladinho = cardapio.indexOf( 'enroladinho de salsicha' )
      const indicePastelCarne = cardapio.indexOf( 'pastel de carne' )
      //arr = cardapio.splice( cardapio.indexOf( 'enroladinho de salsicha' ), indiceEnroladinho )
      arr = cardapio.splice( cardapio.indexOf( 'pastel de carne' ), indicePastelCarne )
    }
    
    let resultadoFinal = []
    while (i < arr.lenght - 1) {
      resultadoFinal[i] = arr[i].toUpperCase()
      i++
    }
    return resultadoFinal;
  }
  
  console.log(cardapioIFood()) // esperado: [ 'CUCA DE UVA', 'PASTEL DE QUEIJO', 'EMPADA DE LEGUMES MARABIJOSA' ]