class Pokemon {
    constructor(obj) {
        this.name = obj.name;
        this.id = obj.id;
        this.image = obj.sprites.front_default;
        this.height = obj.height * 10;
        this.weight = obj.weight / 10;
        this.types = obj.types;
        this.stats = obj.stats;
    }
}