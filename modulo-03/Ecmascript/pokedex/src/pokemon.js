class Pokemon{
    constructor(obj){
        this.name = obj.name;/* 
        this.image = obj.sprites.back_default; */
        this.id = obj.id;
        this.height = (obj.height * 10); //altura
        this.weight = (obj.weight * 10); //peso
        /* this.types = obj.types;
        this.base_experience = obj.base_experience; */
    }

}