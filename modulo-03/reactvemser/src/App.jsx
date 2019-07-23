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

  sortear(){
    const episodio = this.listaEpisodios.episodiosAleatorios
    this.setState({
      episodio
    })
  }

  marcarComoAssistido(){
    const { episodio } = this.state
    this.listaEpisodios.marcarComoAssistido( episodio )
    this.setState( { 
      episodio
     } )
  }

  render() {
    const { episodio } = this.state
    return (
      <div className="App">
        <div className="App-Header">
          <h2>Nome: { episodio.nome }</h2>
          <img src={ episodio.thumbUrl } alt= { episodio.nome }></img>
          <h3>Temporada: { episodio.temporada }</h3>
          <h5>Duração: { episodio.duracao } minutos</h5>
          <button onClick= { this.sortear.bind(this) }>Sortear!</button> <br></br>
          <button onClick= { () => this.marcarComoAssistido(episodio) }>Já assisti</button>
        </div>
      </div>
    );
  }
}

export default App;
