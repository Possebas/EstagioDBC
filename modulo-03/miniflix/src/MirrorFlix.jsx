import React, { Component } from 'react';
import './css/mirrorFlix.css';
import ListaEpisodios from './models/ListaEpisodios';
import EpisodioPadrao from './components/EpisodioPadrao';
import RoutesBar from './components/RoutesBar';


export default class MirrorFlix extends Component {
  constructor(props) {
    super(props)
    this.listaEpisodios = new ListaEpisodios()
    this.state = {
      episodio: this.listaEpisodios.episodiosAleatorios,
      exibirMensagem: false
    }
    // console.log(ListaEpisodios) 
  }

  sortear() {
    const episodio = this.listaEpisodios.episodiosAleatorios
    this.setState({
      episodio
    })
  }

  marcarComoAssistido = () => {
    const { episodio } = this.state
    this.listaEpisodios.marcarComoAssistido(episodio)
    this.setState({
      episodio
    })
  }

  registrarNota(event) {
    const { episodio } = this.state
    episodio.avaliar(event.target.value)
    this.setState({
      episodio,
      exibirMensagem: true
    })
    setTimeout(() => {
      this.setState({
        exibirMensagem: false
      })
    }, 4000)
  }

  gerarCampoNota() {
    return (
      <div>
        {
          this.state.episodio.assistido && (
            <div>
              <span id="pergunta">Qual sua nota para este episodio ? </span>
              <input id="nota" maxLength="1" min="1" max="5" type="number" onBlur={this.registrarNota.bind(this)} placeholder="1~5" />
            </div>
          )
        }
      </div>
    )
  }


  render() {
    const { episodio, exibirMensagem } = this.state
    return (
      <div id="contact">
        <div id="links">
          <RoutesBar></RoutesBar>
        </div>
        <div className="episodio">
          <EpisodioPadrao episodio={episodio}
            sortearNoComp={this.sortear.bind(this)} marcarNoComp={this.marcarComoAssistido} ></EpisodioPadrao>
          {this.gerarCampoNota()}
          <h5> {exibirMensagem ? 'Nota registrada com sucesso!' : ''} </h5>
        </div>
      </div>
    );
  }
}