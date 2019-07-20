// eslint-disable-next-line no-unused-vars
class Trainer {
  constructor( trainerNick ) {
    this.trainerNick = trainerNick;
    this.pokemonTeam = [];
  }

  add( pokemonName ) {
    this.pokemonName = pokemonName;
    fetch( `https://pokeapi.co/api/v2/pokemon/${ pokemonName }/` ).then(
      response => {
        const { data } = response;
        const { name } = data;
        const sprite = data.sprites.front_default;
        const id = data.game_indices[0].game_index;
        const ability = data.abilities[0].ability.name;
        const hp = data.stats[5].base_stat;
        const attk = data.stats[4].base_stat;
        const def = data.stats[3].base_stat;
        this.pokemonTeam.push(
          new Pokemon( name, id, sprite, ability, attk, def, hp ),
        );
      },
    );
  }

  all() {
    console.log( this.pokemonTeam );
  }
}

// let red = new Trainer("Red");
// red.add("Bulbasaur");
// red.add("Ekans");
// red.add("Scolipedes");
// red.all();
