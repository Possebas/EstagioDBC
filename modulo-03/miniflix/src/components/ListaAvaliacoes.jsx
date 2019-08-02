import React, { Component } from 'react';

const ListaAvalicoes = (props) => {
    const { listaAvalicoes } = props
    const listarTudo = (listaAvalicoes) => (
        <ul>
            {listaAvalicoes.map((episodio, index) => {
                return (
                    <li key={index}>
                        Temporadas/Episodio: {episodio.temporadaEpisodio}
                        Nota: {episodio.nota}
                    </li>
                )
            })}
        </ul>
    )
    return (
        <div>
            { listaAvalicoes ? listarTudo(listaAvalicoes) : '' }
        </div>
    )
}

export default ListaAvalicoes;
