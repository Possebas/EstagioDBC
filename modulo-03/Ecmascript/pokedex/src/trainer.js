class Trainer {
  constructor(trainerNick) {
    this.trainerNick = trainerNick;
    this.pokemonTeam = [];
  }

  add(pokemonName) {
    this.pokemonName = pokemonName;
    fetch(`https://pokeapi.co/api/v2/pokemon/${pokemonName}/`).then(
      response => {
        let data = response.data;
        let name = data.name;
        let sprite = data.sprites.front_default;
        let id = data.game_indices[0].game_index;
        let ability = data.abilities[0].ability.name;
        let hp = data.stats[5].base_stat;
        let attk = data.stats[4].base_stat;
        let def = data.stats[3].base_stat;
        this.pokemonTeam.push(
          new Pokemon(name, id, sprite, ability, attk, def, hp)
        );
      }
    );
  }
  all() {
    console.log(this.pokemonTeam);
  }
}

// let red = new Trainer("Red");
// red.add("Bulbasaur");
// red.add("Ekans");
// red.add("Scolipedes");
// red.all();