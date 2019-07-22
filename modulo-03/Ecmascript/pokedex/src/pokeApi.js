/* eslint-disable no-empty-function */
class PokeApi { // eslint-disable-line no-unused-vars
  // eslint-disable-next-line no-useless-constructor
  constructor() { }
  
  buscarTodos() {
    const pokemon = fetch( 'https://pokeapi.co/api/v2/pokemon/' );
    return pokemon.then( data => data.json() );
  }

  buscarPorID( id ) {
    const pokemon = fetch( `https://pokeapi.co/api/v2/pokemon/${ id }` );
    return pokemon.then( data => data.json() );
  }

  buscarNome( pokemonName ) {
    const pokemon = fetch( `https://pokeapi.co/api/v2/pokemon/${ pokemonName }/` );
    return pokemon.then( data => data.json() );
  }
}
