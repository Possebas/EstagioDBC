/* let pokeApi = new PokeApi();

pokemonEspecifoco.then(pokemon =>{
    //console.log(pokemon);
    let poke = new Pokemon(pokemon)
    renderizacaoPokemon(poke);
}) */

function renderizacaoPokemon(pokemon){
    let name = document.getElementById("name");
    let id = document.getElementById("id");
    let image = document.getElementById("image");
    let height = document.getElementById("height");
    let weight = document.getElementById("weight");
    let types = document.getElementById("types");
    let stats= document.getElementById("stats");

    name.textContent = `Nome: ${pokemon.name}`;
    id.textContent = `ID: ${pokemon.id}`;
    image.src = pokemon.image;
    height.textContent = `Altura: ${pokemon.height} cm`;
    weight.textContent = `Peso: ${pokemon.weight} kg`;

    while (stats.hasChildNodes()) {   
        stats.removeChild(stats.firstChild);
    }
    pokemon.stats.forEach( estatistica => {
        let elem = document.createElement("li");
        elem.textContent = ` ${estatistica.stat.name} base: ${estatistica.base_stat} `;
        stats.appendChild(elem);
    });

    while (types.hasChildNodes()) {   
        types.removeChild(types.firstChild);
    }
    pokemon.types.forEach( tipo => {
        let elem = document.createElement("li");
        elem.textContent = tipo.type.name;
        types.appendChild(elem);
    });
    
}

function getPokemon(id) {
    let pokeApi = new PokeApi();
    let pokemonEspecifico = pokeApi.buscarEspecifico(id);
    pokemonEspecifico.then(pokemon =>{
        let poke = new Pokemon(pokemon)
        renderizacaoPokemon(poke);
    })
}

function pokemonAleatorio() {
    let idAleatorio = Math.floor( 802 * Math.random() ) + 1;
    getPokemon(idAleatorio);
}

function loadEvent() {
    getPokemon(1);
    let inputID = document.getElementById("identify");
    inputID.addEventListener('blur',function(){
        let inputID = document.getElementById("identify");
        let id = inputID.value;
        getPokemon(id);  
    })

    let button = document.getElementById("random")
    button.addEventListener('click',pokemonAleatorio); // cada vez que um click for feito, gera um numero aleatorio 
                                                       // e renderiza o pokemon
}

addEventListener('load',loadEvent);