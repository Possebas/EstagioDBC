import Serie from './Serie';
import PropTypes from 'prop-types';

function verificaCampo(serie) {
    if (!serie.titulo) return true
    if (!serie.anoEstreia) return true
    if (!serie.diretor) return true
    if (!serie.genero) return true
    if (!serie.elenco) return true
    if (!serie.temporadas) return true
    if (!serie.numeroEpisodios) return true
    if (!serie.distribuidora) return true
}

export default class ListaSeries {
    constructor() {
        this.todos = [
            { "titulo": "Stranger Things", "anoEstreia": 2016, "diretor": ["Matt Duffer", "Ross Duffer"], "genero": ["Suspense", "Ficcao Cientifica", "Drama"], "elenco": ["Winona Ryder", "David Harbour", "Finn Wolfhard", "Millie Bobby Brown", "Gaten Matarazzo", "Caleb McLaughlin", "Natalia Dyer", "Charlie Heaton", "Cara Buono", "Matthew Modine", "Noah Schnapp"], "temporadas": 2, "numeroEpisodios": 17, "distribuidora": "Netflix" },
            { "titulo": "Game Of Thrones", "anoEstreia": 2011, "diretor": ["David Benioff", "D. B. Weiss", "Carolyn Strauss", "Frank Doelger", "Bernadette Caulfield", "George R. R. Martin"], "genero": ["Fantasia", "Drama"], "elenco": ["Peter Dinklage", "Nikolaj Coster-Waldau", "Lena Headey", "Emilia Clarke", "Kit Harington", "Aidan Gillen", "Iain Glen ", "Sophie Turner", "Maisie Williams", "Alfie Allen", "Isaac Hempstead Wright"], "temporadas": 7, "numeroEpisodios": 67, "distribuidora": "HBO" },
            { "titulo": "The Walking Dead", "anoEstreia": 2010, "diretor": ["Jolly Dale", "Caleb Womble", "Paul Gadd", "Heather Bellson"], "genero": ["Terror", "Suspense", "Apocalipse Zumbi"], "elenco": ["Andrew Lincoln", "Jon Bernthal", "Sarah Wayne Callies", "Laurie Holden", "Jeffrey DeMunn", "Steven Yeun", "Chandler Riggs ", "Norman Reedus", "Lauren Cohan", "Danai Gurira", "Michael Rooker ", "David Morrissey"], "temporadas": 9, "numeroEpisodios": 122, "distribuidora": "AMC" },
            { "titulo": "Band of Brothers", "anoEstreia": 20001, "diretor": ["Steven Spielberg", "Tom Hanks", "Preston Smith", "Erik Jendresen", "Stephen E. Ambrose"], "genero": ["Guerra"], "elenco": ["Damian Lewis", "Donnie Wahlberg", "Ron Livingston", "Matthew Settle", "Neal McDonough"], "temporadas": 1, "numeroEpisodios": 10, "distribuidora": "HBO" },
            { "titulo": "The JS Mirror", "anoEstreia": 2017, "diretor": ["Lisandro", "Jaime", "Edgar"], "genero": ["Terror", "Caos", "JavaScript"], "elenco": ["Daniela Amaral da Rosa", "Antônio Affonso Vidal Pereira da Rosa", "Gustavo Lodi Vidaletti", "Bruno Artêmio Johann Dos Santos", "Márlon Silva da Silva", "Izabella Balconi de Moura", "Diovane Mendes Mattos", "Luciano Maciel Figueiró", "Igor Ceriotti Zilio", "Alexandra Peres", "Vitor Emanuel da Silva Rodrigues", "Raphael Luiz Lacerda", "Guilherme Flores Borges", "Ronaldo José Guastalli", "Vinícius Marques Pulgatti"], "temporadas": 1, "numeroEpisodios": 40, "distribuidora": "DBC" },
            { "titulo": "10 Days Why", "anoEstreia": 2010, "diretor": ["Brendan Eich"], "genero": ["Caos", "JavaScript"], "elenco": ["Brendan Eich", "Bernardo Bosak"], "temporadas": 10, "numeroEpisodios": 10, "distribuidora": "JS" },
            { "titulo": "Mr. Robot", "anoEstreia": 2018, "diretor": ["Sam Esmail"], "genero": ["Drama", "Techno Thriller", "Psychological Thriller"], "elenco": ["Rami Malek", "Carly Chaikin", "Portia Doubleday", "Martin Wallström", "Christian Slater"], "temporadas": 3, "numeroEpisodios": 32, "distribuidora": "USA Network" },
            { "titulo": "Narcos", "anoEstreia": 2015, "diretor": ["Paul Eckstein", "Mariano Carranco", "Tim King", "Lorenzo O Brien"], "genero": ["Documentario", "Crime", "Drama"], "elenco": ["Wagner Moura", "Boyd Holbrook", "Pedro Pascal", "Joann Christie", "Mauricie Compte", "André Mattos", "Roberto Urbina", "Diego Cataño", "Jorge A. Jiménez", "Paulina Gaitán", "Paulina Garcia"], "temporadas": 3, "numeroEpisodios": 30, "distribuidora": null },
            { "titulo": "Westworld", "anoEstreia": 2016, "diretor": ["Athena Wickham"], "genero": ["Ficcao Cientifica", "Drama", "Thriller", "Acao", "Aventura", "Faroeste"], "elenco": ["Anthony I. Hopkins", "Thandie N. Newton", "Jeffrey S. Wright", "James T. Marsden", "Ben I. Barnes", "Ingrid N. Bolso Berdal", "Clifton T. Collins Jr.", "Luke O. Hemsworth"], "temporadas": 2, "numeroEpisodios": 20, "distribuidora": "HBO" },
            { "titulo": "Breaking Bad", "anoEstreia": 2008, "diretor": ["Vince Gilligan", "Michelle MacLaren", "Adam Bernstein", "Colin Bucksey", "Michael Slovis", "Peter Gould"], "genero": ["Acao", "Suspense", "Drama", "Crime", "Humor Negro"], "elenco": ["Bryan Cranston", "Anna Gunn", "Aaron Paul", "Dean Norris", "Betsy Brandt", "RJ Mitte"], "temporadas": 5, "numeroEpisodios": 62, "distribuidora": "AMC" }
        ].map(e => new Serie(e.titulo, e.anoEstreia, e.diretor, e.genero, e.elenco, e.temporadas, e.numeroEpisodios, e.distribuidora))
    }

    invalidas() {
        let anoAtual = new Date().getFullYear()
        let todasSeries = this.todos
        let init = "Séries inválidas: "
        let todasInvalidas = []
        for ( let i = 0; i < todasSeries.length; i++ ) {
            const serie = todasSeries[i];
            if( (serie.anoEstreia > anoAtual) || verificaCampo( serie ) ){
                todasInvalidas.push(` | ${serie.titulo} `)
            }
        }
        let resultado = init.concat(todasInvalidas).replace(",", "").replace()
        return resultado
    }

    filtrarPorAno( ano ) {
        let filtradosAno = this.todos.map(serie => serie.anoEstreia >= ano ? serie : null)
        filtradosAno = filtradosAno.filter(serie => serie != null)
        return filtradosAno
    }

    procurarPorNome(nome) {
        const verifica = this.todos.map(serie => serie.elenco.includes( nome ) )
        return verifica != null ? `Contém ${nome} em um dos elencos`  : `Não contém ${nome} em um dos elencos`
    }

    mediaDeEpisodios() {
        let qtdEpisodioSeries = 0
        let qtdSerie = this.todos.length
        this.todos.forEach(serie => qtdEpisodioSeries += serie.numeroEpisodios)
        return (qtdEpisodioSeries / qtdSerie)
    }

    totalSalarios( indice ) {
        let serieNoIndice = this.todos[indice]
        let qtdDiretores = serieNoIndice.diretor.length
        let qtdElenco = serieNoIndice.elenco.length
        let salarioDiretores = qtdDiretores * 100000
        let salarioElenco = qtdElenco * 40000
        return salarioElenco + salarioDiretores
    }

    queroGenero( genero ) {
        let final = []
        // eslint-disable-next-line no-unused-vars
        let porGenero = this.todos.map(serie => serie.genero.includes( genero ) ? serie : null).filter( serie => serie != null )
        porGenero = porGenero.forEach(serie => final.push( serie.titulo ) )
        return final
    }

    queroTitulo( prefix ) {
        let final = []
        // eslint-disable-next-line no-unused-vars
        let porGenero = this.todos.map(serie => serie.titulo.includes( prefix ) ? serie : null).filter( serie => serie != null )
        porGenero = porGenero.forEach(serie => final.push( serie.titulo ) )
        return final
    }
}

ListaSeries.propTypes = {
    invalidas: PropTypes.array,
    filtrarPorAno: PropTypes.array,
    procurarPorNome: PropTypes.array,
    mediaDeEpisodios: PropTypes.array,
    queroGenero: PropTypes.array,
    queroTitulo: PropTypes.array
}


/* Array.prototype.invalidas() = function() {
    let anoAtual = new Date().getFullYear()
    let todasSeries = this.todos
    let todasInvalidas = []
    for ( let i = 0; i < todasSeries.length; i++ ) {
        const serie = todasSeries[i];
        if( (serie.anoEstreia > anoAtual) && verificaCampo( serie ) ){
            todasInvalidas.push(serie)
        }
    }
    return todasInvalidas
} */
