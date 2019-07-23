
let pokemonNaTela;

function renderizacaoPokemon( pokemon ) {
  const name = document.getElementById( 'name' );
  const id = document.getElementById( 'id' );
  const image = document.getElementById( 'image' );
  const height = document.getElementById( 'height' );
  const weight = document.getElementById( 'weight' );
  const types = document.getElementById( 'types' );
  const stats = document.getElementById( 'stats' );

  const newName = pokemon.name.toUpperCase();

  pokemonNaTela = pokemon.id;
  name.textContent = `Nome: ${ newName }`;
  id.textContent = `ID: ${ pokemon.id }`;
  image.src = pokemon.image;
  height.textContent = `Altura: ${ pokemon.convertHeight( 10 ) } cm`;
  weight.textContent = `Peso: ${ pokemon.convertWeight( 10 ) } kg`;

  while ( stats.hasChildNodes() ) {
    stats.removeChild( stats.firstChild );
  }
  pokemon.stats.forEach( estatistica => {
    const elem = document.createElement( 'li' );
    elem.textContent = ` ${ estatistica.stat.name } : ${ estatistica.base_stat }%`;
    stats.appendChild( elem );
  } );

  while ( types.hasChildNodes() ) {
    types.removeChild( types.firstChild );
  }
  pokemon.types.forEach( tipo => {
    const elem = document.createElement( 'li' );
    elem.textContent = tipo.type.name;
    types.appendChild( elem );
  } );
}

function getPokemon( id ) {
  const pokeApi = new PokeApi();
  const pokemonEspecifico = pokeApi.buscarPorID( id );
  pokemonEspecifico.then( pokemon => {
    const poke = new Pokemon( pokemon )
    renderizacaoPokemon( poke );
  } )
}

function verificaIgual( idInt ) {
  // eslint-disable-next-line eqeqeq
  return idInt == pokemonNaTela;
}

function testaLimites( idInt ) {
  return ( idInt > 0 || idInt < 803 );
}


function pokemonAleatorio() {
  const idAleatorio = Math.floor( 802 * Math.random() ) + 1;
  if ( verificaIgual( idAleatorio ) ) {
    // eslint-disable-next-line no-alert
    alert( 'ID do pokemon digitado ja está na tela' );
  } else {
    getPokemon( idAleatorio );
  }
}

function loadEvent() {
  getPokemon( 1 );
  const inputID = document.getElementById( 'identify' );
  inputID.addEventListener( 'blur', () => {
    // eslint-disable-next-line no-shadow
    const inputID = document.getElementById( 'identify' );
    const id = inputID.value;
    inputID.value = '';
    if ( verificaIgual( id ) ) {
      // eslint-disable-next-line no-alert
      alert( 'ID do pokemon digitado ja está na tela' );
    } else if ( testaLimites( id ) ) {
      // eslint-disable-next-line no-alert
      alert( 'ID inválido para buscar!' );
    } else {
      getPokemon( id );
    }
  } )

  const button = document.getElementById( 'random' )
  button.addEventListener( 'click', pokemonAleatorio );
}

// eslint-disable-next-line no-restricted-globals
addEventListener( 'load', loadEvent );
