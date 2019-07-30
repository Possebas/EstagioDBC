export default class Episodio{
    constructor( nome, duracao, temporada, ordemEpisodio, thumbUrl, qtdVezesAssistido, nota ) {
        this.nome = nome
        this.duracao = duracao
        this.temporada = temporada
        this.ordemEpisodio = ordemEpisodio
        this.thumbUrl = thumbUrl
        this.qtdVezesAssistido = qtdVezesAssistido || 0
        this.nota = nota
    }

    avaliar ( nota ) {
        this.nota = parseInt( nota )
    }

    get duracaoEmMin(){
        return ` ${ this.duracao }  min`
    }
    
    get temporadaEpisodio(){
        return ` ${ this.temporada.toString().padStart(2,'0') } / ${ this.ordemEpisodio.toString().padStart(2,'0')} `
    }

}