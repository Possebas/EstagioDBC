import React from 'react';

const EpisodioPadrao = props => {
    const { episodio } = props
    return (
        <React.Fragment>
            <h2 id="nome">{episodio.nome}</h2>
            <img id="imagem" src={episodio.thumbUrl} alt={episodio.nome}></img>
            <p id="temporada" >| Temporada: {episodio.temporada} | Episodio: {episodio.ordemEpisodio} | </p>
            <p id="duracao" >Duração: {episodio.duracao} minutos</p>
            <h4>Assistido ? {episodio.assistido ? 'Sim' : 'Não'}, {episodio.qtdVezesAssistido} vez(es)</h4>
            <h4>Nota: {episodio.nota || 'sem nota'}</h4>
            <button id="sortear" onClick={ props.sortearNoComp }>Sortear</button>
            <button id="assistido" onClick={ () => props.marcarNoComp() } >Já assisti</button>
        </React.Fragment>
    ) 
}

export default EpisodioPadrao 