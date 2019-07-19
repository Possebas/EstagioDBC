class PokeApi {
    constructor() { }

    buscarTodos() {
        let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/`);
        return pokemon.then(data => data.json());
    }

    buscarPorID(id) {
        let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/${id}`);
        return pokemon.then(data => data.json());
    }

    buscarNome(pokemonName) {
        let pokemon = fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonName}/`);
        return pokemon.then(data => data.json());
    }

}