import PropTypes from 'prop-types';

export default class Serie {
    constructor(titulo, anoEstreia, diretor, genero, elenco, temporadas, numeroEpisodios, distribuidora, imagem) {
        this.titulo = titulo
        this.anoEstreia = anoEstreia
        this.diretor = diretor
        this.genero = genero
        this.elenco = elenco
        this.temporadas = temporadas
        this.numeroEpisodios = numeroEpisodios
        this.distribuidora = distribuidora
        this.imagem = imagem
    }
}

Serie.propTypes = {
    titulo: PropTypes.string.isRequired,
    anoEstreia: PropTypes.number.isRequired,
    diretor: PropTypes.arrayOf(PropTypes.string).isRequired,
    genero: PropTypes.arrayOf(PropTypes.string).isRequired,
    elenco: PropTypes.arrayOf(PropTypes.string).isRequired,
    temporadas: PropTypes.number.isRequired,
    numeroEpisodios: PropTypes.number.isRequired,
    distribuidora: PropTypes.string.isRequired
}


// {"titulo":"Stranger Things",
// "anoEstreia":2016,
// "diretor":["Matt Duffer","Ross Duffer"],
// "genero":["Suspense","Ficcao Cientifica","Drama"],
// "elenco":["Winona Ryder","David Harbour","Finn Wolfhard","Millie Bobby Brown","Gaten Matarazzo","Caleb McLaughlin","Natalia Dyer","Charlie Heaton","Cara Buono","Matthew Modine","Noah Schnapp"],
// "temporadas":2,
// "numeroEpisodios":17,
// "distribuidora":"Netflix"}