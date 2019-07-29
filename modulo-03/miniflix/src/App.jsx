import React, { Component } from 'react';

// import './css/section.css';
import ListaSeries from './models/ListaSeries';
import Footer from './components/Footer';
import Screen from './components/Screen';
import Header from './components/Header';


class App extends Component {
  constructor(props) {
    super(props)
    this.listaSeries = new ListaSeries()
    this.state = {
      series: this.listaSeries.todasSeries
    }
    console.log(this.state)
  }

  exibirTodas() {
    let todas = this.listaSeries.todasSeries
    this.setState({ series: todas })
  }

  exibirInvalidas() {
    let seriesInvalidas = this.listaSeries.invalidas
    this.setState({ series: seriesInvalidas })
  }

  exibirPorAnos = (evt) => {
    let seriesPorAnos = this.listaSeries.filtrarPorAno(evt.target.value)
    this.setState({ series: seriesPorAnos })
  }

  exibirPorNomes = (evt) => {
    const seriesPorNomes = this.listaSeries.procurarPorNome(evt.target.value)
    this.setState({ series: seriesPorNomes })
  }

  exibirMediaEpisodios() {
    const seriesMedias = this.listaSeries.mediaDeEpisodios()
    this.setState({ series: seriesMedias })
  }

  exibirTotalSalarios = (evt) => {
    const seriesSalarios = this.listaSeries.totalSalarios(evt.target.value)
    this.setState({ series: seriesSalarios })
  }

  exibirGeneros = (evt) => {
    const seriesPorGeneros = this.listaSeries.queroGenero(evt.target.value)
    this.setState({ series: seriesPorGeneros })
  }

  exibirTitulos = (evt) => {
    const seriesPorTitulo = this.listaSeries.queroTitulo(evt.target.value)
    this.setState({ series: seriesPorTitulo })
  }

  exibirCreditos = (evt) => {
    const seriesPorCreditos = this.listaSeries.creditos(evt.target.value)
    this.setState({ series: seriesPorCreditos })
  }

  exibirHashTag = (evt) => {
    const seriesPorHash = this.listaSeries.hashTag(evt.target.value)
    this.setState({ series: seriesPorHash })
  }

  render() {
    const { series } = this.state
    return (
      <div id="maisdefora" >
        <div>
          <Header exibirTodas={this.exibirTodas.bind(this)} exibirInvalidas={this.exibirInvalidas.bind(this)} 
                  exibirPorAnos={this.exibirPorAnos.bind(this)} exibirPorNomes={this.exibirPorNomes.bind(this)}
                  exibirMediaEpisodios={this.exibirMediaEpisodios.bind(this)} exibirTotalSalarios={this.exibirTotalSalarios.bind(this)}
                  exibirGeneros={this.exibirGeneros.bind(this)} exibirTitulos={this.exibirTitulos.bind(this)}
                  exibirCreditos={this.exibirCreditos.bind(this)} exibirHashTag={this.exibirHashTag.bind(this)} >  
          </Header>
          <Screen series={ series } ></Screen>
          <Footer ></Footer>
        </div>
      </div>
    );
  }
}

export default App;