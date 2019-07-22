class Pokemon { // eslint-disable-line no-unused-vars
  constructor( obj ) {
    this.name = obj.name;
    this.id = obj.id;
    this.image = obj.sprites.front_default;
    this.height = obj.height;
    this.weight = obj.weight;
    this.types = obj.types;
    this.stats = obj.stats;
  }

  convertHeight( multiplicador ) {
    return this.height * multiplicador
  }

  convertWeight( multiplicador ) {
    return this.weight / multiplicador
  }
}
