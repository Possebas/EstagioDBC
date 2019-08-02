import React, { Component } from 'react';
import '../css/mirrorFlix/mirrorFlix.css';
import ListaEpisodios from '../models/ListaEpisodios';
import EpisodioPadrao from './mirrorFlix/EpisodioPadrao';
import RoutesBar from './RoutesBar';
import MensagemFlash from './mirrorFlix/MensagemFlash';
import MeuInputNumero from './mirrorFlix/MeuInputNumero';
import ListaAvaliacoes from './ListaAvaliacoes';

export default class MirrorFlix extends Component {
  constructor(props) {
    super(props)
    this.listaEpisodios = new ListaEpisodios()
    this.state = {
      episodio: this.listaEpisodios.episodiosAleatorios,
      assistido: false,
      exibirMensagem: false,
      mensagemTipo: true,
      listaAvaliados: []
    }
    // console.log(ListaEpisodios) 
  }

  sortear() {
    const episodio = this.listaEpisodios.episodiosAleatorios
    this.setState({
      episodio,
      assistido: this.state.assistido
    })
    console.log(this.listaAvaliados)
  }

  marcarComoAssistido = () => {
    const { episodio } = this.state
    this.listaEpisodios.marcarComoAssistido(episodio)
    this.setState({
      episodio: episodio,
      assistido: true,
      // listaAvaliados: this.state.listaAvaliados.push(episodio)
    })
  }

  notaValida(nota) {
    return nota >= 1 && nota <= 5
  }

  alterarExibirMensagem() {
    this.setState({
      exibirMensagem: !this.state.exibirMensagem
    })
  }

  registrarNota(event) {
    const { episodio } = this.state
    const nota = event.target.value
    if (this.notaValida(nota)) {
      episodio.avaliar(nota)
      this.setState({
        mensagemTipo: true
      })
    } else {
      this.setState({
        mensagemTipo: false
      })
    }
    this.setState({
      episodio,
      exibirMensagem: true,
    })
  }

  render() {
    const { episodio, exibirMensagem, assistido, mensagemTipo,listaAvaliados} = this.state
    return (
      <div id="contact">
        <div id="links">
          <RoutesBar></RoutesBar>
        </div>
        <div className="episodio">
          <EpisodioPadrao episodio={episodio}
            sortearNoComp={this.sortear.bind(this)} marcarNoComp={this.marcarComoAssistido} />
          <MeuInputNumero assistido={assistido} episodio={episodio} registrarNota={this.registrarNota.bind(this)}
            placeholderInput="Nota de 1 a 5" mensagemSpan="Nota: " obrigatorio={true} />
          <MensagemFlash exibirMensagem={exibirMensagem} registrarNota={this.registrarNota.bind(this)} assistido={assistido} episodio={episodio}
            mensagemTipo={mensagemTipo} alterarExibirMensagem={this.alterarExibirMensagem.bind(this)} />
        <ListaAvaliacoes listaAvaliados={listaAvaliados} />
        </div>
      </div>
    );
  }
}