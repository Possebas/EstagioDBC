import React, { Component } from 'react';
// import './css/section.css';
import ListaSeries from './models/ListaSeries';
import Footer from './components/Footer';
import Screen from './components/Screen';
import Header from './components/Header';
import RoutesBar from './components/RoutesBar';


export default class InfoMiniFlix extends Component {
    constructor(props) {
        super(props)
        this.listaSeries = new ListaSeries()
        this.state = {
            series: this.listaSeries.todasSeries,
            campo: '',
            listagem: true,
        }
        // console.log(this.state)
    }

    alterarCampo ( valor )  {
        this.setState({
            campo: valor
        })

    }

    exibirTodas() {
        let todas = this.listaSeries.todasSeries
        this.setState({ series: todas, campo: '', listagem:true})
    }

    exibirInvalidas() {
        let seriesInvalidas = this.listaSeries.invalidas()
        this.setState({ series: seriesInvalidas, campo: '', listagem:true})
    }

    exibirPorAnos = (valor ) => {

        let seriesPorAnos = this.listaSeries.filtrarPorAno(valor)
        // console.log(this.state.campo)
        // console.log(seriesPorAnos)
        this.setState({ series: seriesPorAnos, campo: this.state.campo, listagem:true })
    }

    exibirPorNomes = (valor) => {
        const seriesPorNomes = this.listaSeries.procurarPorNome(valor)
        // console.log(seriesPorNomes)
        this.setState({ series: seriesPorNomes, campo: '', listagem:true})
    }

    exibirMediaEpisodios() {
        const seriesMedias = this.listaSeries.mediaDeEpisodios()
        this.setState({ series: seriesMedias, campo: '' , listagem: false})
    }

    exibirTotalSalarios = (valor) => {
        const seriesSalarios = this.listaSeries.totalSalarios(valor)
        this.setState({ series: seriesSalarios, campo: '', listagem:false})
    }

    exibirGeneros = (valor) => {
        const seriesPorGeneros = this.listaSeries.queroGenero(valor)
        // console.log(seriesPorGeneros)
        this.setState({ series: seriesPorGeneros, campo: '', listagem:true })
    }

    exibirTitulos = (valor) => {
        const seriesPorTitulo = this.listaSeries.queroTitulo(valor)
        // console.log(seriesPorTitulo)
        this.setState({ series: seriesPorTitulo, campo: '', listagem:true})
    }

    exibirCreditos = (valor) => {
        const seriesPorCreditos = this.listaSeries.creditos(valor)
        console.log(seriesPorCreditos)
        this.setState({ series: seriesPorCreditos, campo: '', listagem:true})
    }

    exibirHashTag = (valor) => {
        const seriesPorHash = this.listaSeries.hashTag(valor)
        // console.log(seriesPorHash)
        this.setState({ series: seriesPorHash, campo: '', listagem:false })
    }

    render() {
        const { series, campo, listagem } = this.state
        return (
            <div id="maisdefora" >
                <div>
                    <RoutesBar></RoutesBar>
                </div>
                <Header exibirTodas={this.exibirTodas.bind(this)} campo={campo} alterarCampo={this.alterarCampo.bind(this)} exibirInvalidas={this.exibirInvalidas.bind(this)}
                        exibirPorAnos={this.exibirPorAnos.bind(this)} exibirPorNomes={this.exibirPorNomes.bind(this)}
                        exibirMediaEpisodios={this.exibirMediaEpisodios.bind(this)} exibirTotalSalarios={this.exibirTotalSalarios.bind(this)}
                        exibirGeneros={this.exibirGeneros.bind(this)} exibirTitulos={this.exibirTitulos.bind(this)}
                        exibirCreditos={this.exibirCreditos.bind(this)} exibirHashTag={this.exibirHashTag.bind(this)} >
                </Header>
                <Screen series={series} listagem={listagem} ></Screen>
                <Footer ></Footer>
            </div>
        );
    }
}
