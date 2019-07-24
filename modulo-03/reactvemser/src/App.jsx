import React, { Component } from 'react';
import './App.css';
import ListaEpisodios from './models/ListaEpisodios';
//import CompA, { CompB } from './ExemploComponenteBasico';
//import  Filho from './exemplos/Filhos';
//import Familia from './exemplos/Familia'

class App extends Component {
  constructor(props) {
    super(props)
    this.listaEpisodios = new ListaEpisodios()
    // this.sortear = this.sortear.bind( this );
    this.state = {
      episodio: this.listaEpisodios.episodiosAleatorios
    }
    // console.log(ListaEpisodios) 
  }

  sortear() {
    const episodio = this.listaEpisodios.episodiosAleatorios
    this.setState({
      episodio
    })
  }

  marcarComoAssistido() {
    const { episodio } = this.state
    this.listaEpisodios.marcarComoAssistido(episodio)
    this.setState({
      episodio
    })
  }

  render() {
    const { episodio } = this.state
    return (
      <div className="App">
        <div className="App-Header">
          <div className="episodio">
            <p id="nome">Nome: {episodio.nome}</p>
            <img id="imagem" src={episodio.thumbUrl} alt={episodio.nome}></img>
            <p id="temporada" >N° temporada: {episodio.temporada}</p>
            <p id="duracao" >Duração: {episodio.duracao} minutos</p>
            <p id="sequencia" >Sequência: {episodio.ordemEpisodio} </p>
            <button id="sortear" onClick={this.sortear.bind(this)}>Sortear!</button> <br></br>
            <button id="assistido" onClick={() => this.marcarComoAssistido(episodio)}>Já assisti</button>
          </div>
        </div>
      </div>
    );
  }
}

export default App;
