class PokeApi {
    constructor() {}

    buscarTodos(){  
        let pokemon = fetch('https://pokeapi.co/api/v2/pokemon/');
        return pokemon.then((data) => data.json())
    //pending 
    //resolver
    //reject
    }

    buscarEspecifico(id){  
        let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/${id}`);
        return pokemon.then((data) => data.json())
    }

    buscarEspecificoPorURL(url){  
        let pokemon = fetch(url);
        return pokemon.then((data) => data.json())
    }
}