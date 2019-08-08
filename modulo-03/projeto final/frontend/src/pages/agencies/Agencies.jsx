import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';
import FilterBars from '../../components/generics/FilterBars';
import RequestApi from '../../components/requestsApi/RequestApi';
import '../../css/agencies.css';

// import Screen from '../../components/Screen';
/* <Screen list={ agenciesList } agencies={ true } types={ false }
                                customers={ false } accCli={ false } />                                                                       
*/

export default class Agencies extends Component {

    constructor(props) {
        super(props)
        this.backData = new RequestApi(1337)
        this.state = {
            showMore: false,
            agenciesList: this.backData.listDefaultAgencies
        }
    }


    componentDidMount() {
        this.backData.requestAgenciesDefault()
        setTimeout(() => {
            this.setState({
                agenciesList: this.backData.listDefaultAgencies
            })
        }, 1000)
    }

    isDigital = (evt) => {
        const id = evt.target.value
        const agencies = this.state.agenciesList
        if (evt.target.checked) {
            for (let index = 0; index < agencies.length; index++) {
                if (agencies[index].id === id) {
                    agencies[index].is_digital = true
                }

            }
        }
        else {
            for (let index = 0; index < agencies.length; index++) {
                if (agencies[index].id === id) {
                    agencies[index].is_digital = false
                }
            }
        }
        this.setState({
            agenciesList: agencies
        })
    }

    searchInput = (evt) => {
        const agencies = this.state.agenciesList
        const pesquisa = evt.target.value
        if (pesquisa) {
            const filter = agencies.filter(a => a.nome.toUpperCase().includes(pesquisa.toUpperCase()))
            this.setState({
                agenciesList: filter
            })
        } else {
            this.setState({
                agenciesList: this.backData.listDefaultAgencies
            })
        }
    }

    filterDigital(evt) {
        const agencies = this.state.agenciesList
        if (evt.target.checked) {
            const checks = agencies.filter(agen => agen.is_digital === true)
            this.setState({
                agenciesList: checks
            })
        } else (
            this.setState({
                agenciesList: this.backData.listDefaultAgencies
            })
        )

    }

    render() {
        const { agenciesList, showMore } = this.state
        return (
            <div className="text-center" id="linha">
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={true} home={false} />

                {/* id: 1, codigo: 0001, nome: 'passo dareia', endereco: {
                    logradouro: 'av. andarai',
                    numero: 531,
                    bairro: 'Passo dareia',
                    cidade: 'Porto Alegre',
                    uf: 'RS' */}

                <h3 id="title" className="my-2"> Our agencies </h3>
                <div className="container-fluid">
                    <div className="text-center my-5" id="filtros">
                        <FilterBars placeholder={"Search by name"} className="mr-3" filter={this.searchInput.bind(this)} />
                        <input id="inputDigital" type="checkbox" className="ml-3" onClick={this.filterDigital.bind(this)} />
                        <label className="form-check-label" id="digital" className="ml-2" htmlFor="inputDigital"> Digitals </label>
                    </div>
                    <div className="row col-lg-6 col-xl-6 col-sm-12 py-2" >
                        {agenciesList ? agenciesList.map((agen, index) => {
                            return (
                                <div className="col-sm-12 py-2 col-lg-6 col-xl-6" item={agen.id} key={index}>
                                    <div className="card deep-purple darken-2" id="cardzinho" >
                                        <div className="card-body">
                                            <h5 className="card-title"> {agen.nome.toUpperCase()}</h5>
                                            <p className="card-text">ID: {agen.id} </p>
                                            <p> Código: {agen.codigo} </p>
                                            <p> Logradouro: {agen.endereco.logradouro} </p>
                                            <p> Número: {agen.endereco.numero} </p>
                                            <p> Bairro: {agen.endereco.bairro} </p>
                                            <p> Cidade: {agen.endereco.cidade} </p>
                                            <p> Estado: {agen.endereco.uf} </p>
                                            <div className="form-check">
                                                <input type="checkbox" className="form-check-input" value={agen.id} id="isDigital" onClick={this.isDigital.bind(this)} />
                                                <label className="form-check-label" htmlFor="isDigital"> Digital </label>
                                            </div>
                                            <button className="btn btn-dark">Show more</button>
                                        </div>
                                    </div>
                                </div>
                            )
                        }) : <span id="load" className="text-center">CARREGANDO...</span>}
                    </div>
                </div>
            </div>
        )
    }
}