import TelaDetalheEpisodio from '../TelaDetalheEpisodio';
import React, { Component } from 'react';

export default class ListaAvaliacoes extends Component {
    constructor(props) {
        super(props)
        this.props = props
    }

    get listaAvaliados() {
        const { lista } = this.props
        return lista.filter(element => element.nota > 0)
    }

    ordenarPorOrdemEpisodio(a, b) {
        if (a < b) {
            return -1;
        }
        if (a > b) {
            return 1;
        }
        return 0;
    }


    get listaAvaliadosPorOrdemEpisodio() {
        const { lista } = this.props
        const listaAvaliados = lista.filter(element => element.nota > 0)
        return listaAvaliados.sort((a, b) => {
            if (a.temporada < b.temporada) {
                return -1;
            }
            if (a.temporada > b.temporada) {
                return 1;
            }
            return this.ordenarPorOrdemEpisodio(a.ordemEpisodio, b.ordemEpisodio)
        })
    }

    
    gerarAvaliados = (lista) => {
        return (
            lista.map((episodio, index) => {
                return (
                    <TelaDetalheEpisodio episodio={ episodio } key={ index }>
                        <p> { episodio.nome } => { episodio.nota } </p>
                    </TelaDetalheEpisodio>
                )
            })
        )
    }

    render() {
        const { mostrarAvaliados } = this.props
        const lista = this.listaAvaliadosPorOrdemEpisodio

        return (
            <div>
                {
                    mostrarAvaliados ? this.gerarAvaliados(lista) : ''
                }
            </div>
        )
    }
}