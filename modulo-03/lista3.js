



function cardapioIFood( veggie = true, comLactose = false ) {
    const cardapio = [
      'enroladinho de salsicha',
      'cuca de uva'
    ]
    
  
    if ( !comLactose ) {
      cardapio.push( 'pastel de queijo' )
    }
  
    cardapio.push('pastel de carne', 'empada de legumes marabijosa')
  
    if ( veggie ) {
      // TODO: remover alimentos com carne (é obrigatório usar splice!)
      const indiceEnroladinho = cardapio.indexOf( 'enroladinho de salsicha' )
      arr = cardapio.splice(indiceEnroladinho, 1)
      const indicePastelCarne = cardapio.indexOf( 'pastel de carne' )
      arr = cardapio.splice(indicePastelCarne, 1)
    }
    
    let resultadoFinal = []

    for (let i = 0; i < cardapio.length; i++) {
      resultadoFinal[i] = cardapio[i].toUpperCase()
    }
    return resultadoFinal;
  }
  
  console.log(cardapioIFood()) // esperado: [ 'CUCA DE UVA', 'PASTEL DE QUEIJO', 'EMPADA DE LEGUMES MARABIJOSA' ]