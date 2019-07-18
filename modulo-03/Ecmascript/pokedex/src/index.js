let pokeApi = new PokeApi();
//let pokemonEspecifico = pokeApi.buscarTodos();

let result = pokeApi.buscarTodos();

result
    .then( pokemon => { pokemon.results.forEach(element => {
            'console.log(element);
        });
    })

function renderizacaoPokemon( pokemon ){
    let dadosPokemon = document.getElementById('dadosPokemon');
    let name = dadosPokemon.querySelector('.name');
    let id = dadosPokemon.querySelector('.id');
    let height = dadosPokemon.querySelector('.height');
    let weight = dadosPokemon.querySelector('.weight');
    name.innerHTML = pokemon.name;
    id.innerHTML = pokemon.id;
    height.innerHTML = pokemon.height;
    weight.innerHTML = pokemon.weight;
}
