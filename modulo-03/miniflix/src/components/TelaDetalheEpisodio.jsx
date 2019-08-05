import React, { Component } from 'react';
import '../css/teladetalheepisodio.css'; 

/* Crie um componente TelaDetalheEpisodio que, quando você clicar no episódio na listagem de avaliações 
(ListaAvaliacoes), navega para este componente e exibe as seguintes informações (escolha livre de layout):

Nome
Imagem
Temporada / Episódio
Duração
Sinopse
Data de estreia no formato “DD/MM/YYYY”
Nota que você deu
Nota do IMDB (convertido para escala de 1 a 5 que usamos) */

export default class TelaDetalheEpisodio extends Component {

    constructor(props) {
        super(props)
        this.state = {
            mostrarDetalhe: false,
            episodio: this.props.episodio
        }
    }

    expandirDetalhe(episodio) {
        return (
            <div>
                <h5> { episodio.nome } </h5>
                <img src={episodio.thumbUrl} alt="Imagem falhou"/>
                <p>Temporada/Episodio: { episodio.temporadaEpisodio() }</p>
                <p>Duração: { episodio.duracao }</p>
                <p>Sinopse: </p>
                <p>Data estréia: </p>
                <p>Minha nota: { episodio.nota } </p>
                <p>Nota IMDB: </p>

            </div>
        )
    }

    render() {
        const { episodio, mostrarDetalhe } = this.state
        return (
            mostrarDetalhe ? this.expandirDetalhe(episodio) : ''
        )
    }
}