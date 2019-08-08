import React, { Component } from 'react';
import FilterBars from '../../components/generics/FilterBars';
import NavBar from '../../components/generics/NavBar';
import RequestApi from '../../components/requestsApi/RequestApi';
import '../../css/accTypes.css'

export default class AccountsTypes extends Component {

    constructor(props) {
        super(props)
        this.backData = new RequestApi(1337)
        this.state = {
            accTypes: this.backData.listDefaultTypesAcc
        }
    }

    componentWillMount() {
        this.backData.requestAccountTypesList()
        setTimeout(() => {
            this.setState({
                accTypes: this.backData.listDefaultTypesAcc
            })
        }, 1000)
    }

    searchInput = (evt) => {
        const accTypes = this.state.accTypes
        const pesquisa = evt.target.value
        if (pesquisa) {
            const filter = accTypes.filter(a => a.nome.toUpperCase().includes(pesquisa.toUpperCase()))
            this.setState({
                accTypes: filter
            })
        } else {
            this.setState({
                accTypes: this.backData.listDefaultTypesAcc
            })
        }
    }

    render() {
        const { accTypes } = this.state
        return (
            <div className="text-center" id="linha">
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={true} />
                {/* 
                {   id: 1,
                    nome: 'Corrente'},
                    { id: 2,
                    nome: 'Conjunta'},
                    { id: 3,
                    nome: 'Digital'},
                    { id: 4,
                    nome: 'Investimento'},
                    { id: 5,
                    nome: 'Poupança'},
                    { id: 6,
                    nome: 'Salario'}, */}
                <p id="title" className="my-2"> | Our account types | </p>

                <div className="container-fluid">
                    <div className="text-center my-5" id="filtros">
                        <FilterBars placeholder={"Search by name"} className="mr-3" filter={this.searchInput.bind(this)} />
                    </div>
                    <div className="row col-lg-12 col-xl-12 col-sm-12 py-2" >
                        {accTypes ? accTypes.map((types, index) => {
                            return (
                                <div className="col-sm-12 py-2 col-lg-2 col-xl-2" key={index}>
                                    <div className="card deep-purple darken-2" id="cardzinho" >
                                        <div className="card-body">
                                            <h5 className="card-title"> {types.nome}</h5>
                                        </div>
                                        <p className="card-text text-muted">ID: {types.id} </p>
                                    </div>
                                </div>
                            )
                        }) : ''}
                    </div>
                </div>
            </div>
        )
    }
}