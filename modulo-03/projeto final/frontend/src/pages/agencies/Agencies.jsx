import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';
import RequestApi from '../../components/requestsApi/RequestApi';
import '../../css/agencies.css'
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


    componentWillMount() {
        this.backData.requestAgenciesDefault()
        setTimeout(() => {
            this.setState({
                agenciesList: this.backData.listDefaultAgencies
            })
        }, 1000)
    }

    searchInput(evt) {
        const id = evt.target.value
        console.log("id: ", id)
        // if (evt.target.checked) {
        //     for (let i = 0; i < agenciesList.length; i++) {
        //         if (agenciesList[i].id == id)
        //             agenciesList[i].is_digital = true
        //     }
        // }
        // else {
        //     for (let i = 0; i < agenciesList.length; i++) {
        //         if (agenciesList[i].id == id)
        //             agenciesList[i].is_digital = false
        //     }
        // }
        // this.setState({
        //     agenciesList
        // })
    }

    filterDigital(evt) {
        console.log("evt", evt.checked)
        // if (evt.target.checked) {
        //     const { agenciesList } = this.state
        //     const checks = agenciesList.filter(agen => {
        //         if (agen.is_digital)
        //             return true
        //         return false
        //     })
        //     this.setState({
        //         agenciesList: checks
        //     })
        // }
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

                <h3 id="title" className="my-2"> | Our agencies | </h3>
                <div className="container-fluid">
                    <div className="text-center" id="filtros">
                        <input type="text" placeholder="Search by ID" className="mr-3" onBlur={this.searchInput} />
                        <input id="inputDigital" type="checkbox" className="ml-3" onClick={this.filterDigital} />
                        <label className="form-check-label" id="digital" className="ml-2" htmlFor="inputDigital"> Digitals </label>
                    </div>
                    <div className="row col-lg-6 col-xl-6 col-sm-12 py-2" >
                        { agenciesList ? agenciesList.map( ( agen, index) => {
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
                                                <input type="checkbox" className="form-check-input" id="isDigital" />
                                                <label className="form-check-label" htmlFor="isDigital"> Digital </label>
                                            </div>
                                            <button className="btn btn-dark">Show more</button>
                                        </div>
                                    </div>
                                </div>
                            )
                        }) : <p id="load" className="">CARREGANDO...</p>}
                    </div>
                </div>
            </div>
        )
    }
}