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
            { "titulo": "Stranger Things", "anoEstreia": 2016, "diretor": ["Matt Duffer", "Ross Duffer"], "genero": ["Suspense", "Ficcao Cientifica", "Drama"], "elenco": ["Winona Ryder", "David Harbour", "Finn Wolfhard", "Millie Bobby Brown", "Gaten Matarazzo", "Caleb McLaughlin", "Natalia Dyer", "Charlie Heaton", "Cara Buono", "Matthew Modine", "Noah Schnapp"], "temporadas": 2, "numeroEpisodios": 17, "distribuidora": "Netflix", "imagem": "https://pics.filmaffinity.com/Stranger_Things_3_TV_Series-150349350-mmed.jpg" },
            { "titulo": "Game Of Thrones", "anoEstreia": 2011, "diretor": ["David Benioff", "D. B. Weiss", "Carolyn Strauss", "Frank Doelger", "Bernadette Caulfield", "George R. R. Martin"], "genero": ["Fantasia", "Drama"], "elenco": ["Peter Dinklage", "Nikolaj Coster-Waldau", "Lena Headey", "Emilia Clarke", "Kit Harington", "Aidan Gillen", "Iain Glen ", "Sophie Turner", "Maisie Williams", "Alfie Allen", "Isaac Hempstead Wright"], "temporadas": 7, "numeroEpisodios": 67, "distribuidora": "HBO", "imagem": "http://br.web.img3.acsta.net/pictures/19/03/21/16/15/4239577.jpg" },
            { "titulo": "The Walking Dead", "anoEstreia": 2010, "diretor": ["Jolly Dale", "Caleb Womble", "Paul Gadd", "Heather Bellson"], "genero": ["Terror", "Suspense", "Apocalipse Zumbi"], "elenco": ["Andrew Lincoln", "Jon Bernthal", "Sarah Wayne Callies", "Laurie Holden", "Jeffrey DeMunn", "Steven Yeun", "Chandler Riggs ", "Norman Reedus", "Lauren Cohan", "Danai Gurira", "Michael Rooker ", "David Morrissey"], "temporadas": 9, "numeroEpisodios": 122, "distribuidora": "AMC", "imagem": "https://upload.wikimedia.org/wikipedia/pt/thumb/2/2d/The_Walking_Dead_Temporada_9_Poster.jpg/220px-The_Walking_Dead_Temporada_9_Poster.jpg" },
            { "titulo": "Band of Brothers", "anoEstreia": 20001, "diretor": ["Steven Spielberg", "Tom Hanks", "Preston Smith", "Erik Jendresen", "Stephen E. Ambrose"], "genero": ["Guerra"], "elenco": ["Damian Lewis", "Donnie Wahlberg", "Ron Livingston", "Matthew Settle", "Neal McDonough"], "temporadas": 1, "numeroEpisodios": 10, "distribuidora": "HBO", "imagem": "data:image/jpeg;base64,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" },
            { "titulo": "The JS Mirror", "anoEstreia": 2017, "diretor": ["Lisandro", "Jaime", "Edgar"], "genero": ["Terror", "Caos", "JavaScript"], "elenco": ["Daniela Amaral da Rosa", "Antônio Affonso Vidal Pereira da Rosa", "Gustavo Lodi Vidaletti", "Bruno Artêmio Johann Dos Santos", "Márlon Silva da Silva", "Izabella Balconi de Moura", "Diovane Mendes Mattos", "Luciano Maciel Figueiró", "Igor Ceriotti Zilio", "Alexandra Peres", "Vitor Emanuel da Silva Rodrigues", "Raphael Luiz Lacerda", "Guilherme Flores Borges", "Ronaldo José Guastalli", "Vinícius Marques Pulgatti"], "temporadas": 1, "numeroEpisodios": 40, "distribuidora": "DBC", "imagem": "https://media.licdn.com/dms/image/C4E0BAQE9dlrH6qj9lg/company-logo_200_200/0?e=2159024400&v=beta&t=E5uRlO_-KuBgwMEcOV7ap5YZY72zew52-s1m1FmSBLc" },
            { "titulo": "10 Days Why", "anoEstreia": 2010, "diretor": ["Brendan Eich"], "genero": ["Caos", "JavaScript"], "elenco": ["Brendan Eich", "Bernardo Bosak"], "temporadas": 10, "numeroEpisodios": 10, "distribuidora": "JS", "imagem": "data:image/png;base64,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" },
            { "titulo": "Mr. Robot", "anoEstreia": 2018, "diretor": ["Sam Esmail"], "genero": ["Drama", "Techno Thriller", "Psychological Thriller"], "elenco": ["Rami Malek", "Carly Chaikin", "Portia Doubleday", "Martin Wallström", "Christian Slater"], "temporadas": 3, "numeroEpisodios": 32, "distribuidora": "USA Network", "imagem": "http://br.web.img3.acsta.net/c_216_288/pictures/16/06/14/19/46/337804.jpg" },
            { "titulo": "Narcos", "anoEstreia": 2015, "diretor": ["Paul Eckstein", "Mariano Carranco", "Tim King", "Lorenzo O Brien"], "genero": ["Documentario", "Crime", "Drama"], "elenco": ["Wagner Moura", "Boyd Holbrook", "Pedro Pascal", "Joann Christie", "Mauricie Compte", "André Mattos", "Roberto Urbina", "Diego Cataño", "Jorge A. Jiménez", "Paulina Gaitán", "Paulina Garcia"], "temporadas": 3, "numeroEpisodios": 30, "distribuidora": null, "imagem": "https://miro.medium.com/max/1200/1*TFM1vblzzZH51pXK4cEUtg.jpeg" },
            { "titulo": "Westworld", "anoEstreia": 2016, "diretor": ["Athena Wickham"], "genero": ["Ficcao Cientifica", "Drama", "Thriller", "Acao", "Aventura", "Faroeste"], "elenco": ["Anthony I. Hopkins", "Thandie N. Newton", "Jeffrey S. Wright", "James T. Marsden", "Ben I. Barnes", "Ingrid N. Bolso Berdal", "Clifton T. Collins Jr.", "Luke O. Hemsworth"], "temporadas": 2, "numeroEpisodios": 20, "distribuidora": "HBO", "imagem": "https://m.media-amazon.com/images/M/MV5BNThjM2Y3MDUtYTIyNC00ZDliLWJlMmItNWY1N2E5NjhmMGM4XkEyXkFqcGdeQXVyNjU2ODM5MjU@._V1_.jpg" },
            { "titulo": "Breaking Bad", "anoEstreia": 2008, "diretor": ["Vince Gilligan", "Michelle MacLaren", "Adam Bernstein", "Colin Bucksey", "Michael Slovis", "Peter Gould"], "genero": ["Acao", "Suspense", "Drama", "Crime", "Humor Negro"], "elenco": ["Bryan Cranston", "Anna Gunn", "Aaron Paul", "Dean Norris", "Betsy Brandt", "RJ Mitte"], "temporadas": 5, "numeroEpisodios": 62, "distribuidora": "AMC", "imagem": "https://m.media-amazon.com/images/M/MV5BMjhiMzgxZTctNDc1Ni00OTIxLTlhMTYtZTA3ZWFkODRkNmE2XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_UY1200_CR116,0,630,1200_AL_.jpg" }
        ].map(e => new Serie(e.titulo, e.anoEstreia, e.diretor, e.genero, e.elenco, e.temporadas, e.numeroEpisodios, e.distribuidora,e.imagem))
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

    creditos( indice ){
        let serieNoIndice = this.todos[indice]
        let titulo = serieNoIndice.titulo
        let diretores = serieNoIndice.diretor
        let str = titulo.concat("- Diretores: ")
        
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
