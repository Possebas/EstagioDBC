class PokeApi{
    constructor(){}

    buscarTodos(){
    let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/`);
    pokemon.then(data => data.json());
    }

    buscarEspecifico(id){
    let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/${ id }`);
    return pokemon.then(data => data.json());
    }


}