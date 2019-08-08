import React, { Component } from 'react';
import FilterBars from '../../components/generics/FilterBars';
import NavBar from '../../components/generics/NavBar';
import RequestApi from '../../components/requestsApi/RequestApi';
import '../../css/customers.css';

export default class Customers extends Component {

    // eslint-disable-next-line no-useless-constructor
    constructor(props) {
        super(props)
        this.backData = new RequestApi(1337)
        this.state = {
            customersList: this.backData.listDefaultClients
        }
    }

    componentWillMount() {
        this.backData.requestCustomersList()
        setTimeout(() => {
            this.setState({
                customersList: this.backData.listDefaultClients
            })
        }, 1000)
    }

    searchInput = (evt) => {
        const customers = this.state.customersList
        const pesquisa = evt.target.value
        if (pesquisa) {
            const filter = customers.filter(a => a.nome.toUpperCase().includes(pesquisa.toUpperCase()))
            this.setState({
                customersList: filter
            })
        } else {
            this.setState({
                customersList: this.backData.listDefaultClients
            })
        }
    }

    render() {
        const { customersList } = this.state
        return (
            <div className="text-center" id="linha">
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={true} />

                {
                    /*  id: 1,
                     nome: 'Facilitador Vem Ser 3',
                     cpf: '000.000.000-00',
                     agencia: {
                     id: 1,
                     codigo: 0001,
                     nome: 'passo dareia',
                     endereco: {
                     logradouro: 'av. andarai',
                     numero: 531,
                     bairro: 'Passo dareia',
                     cidade: 'Porto Alegre',
                     uf: 'RS' */
                }
                <h3 id="title" className="my-2"> | Our clients | </h3>

                <div class="container-fluid">
                    <div className="text-center my-5" id="filtros">
                        <FilterBars placeholder={"Search by name"} className="mr-3" filter={this.searchInput.bind(this)} />
                    </div>
                    <div className="row col-lg-6 col-xl-6 col-sm-12 py-2" >
                        {customersList ? customersList.map((client, index) => {
                            return (
                                <div className="col-sm-12 py-2 col-lg-6 col-xl-6" key={index}>
                                    <div className="card deep-purple darken-2" id="cardzinho" >
                                        <div className="card-body">
                                            <h5 className="card-title"> {client.nome.toUpperCase()}</h5>
                                        </div>
                                        <p className="card-text">CPF: {client.cpf} </p>
                                        <p> Sobre agência </p>
                                        <p> Nome: {client.agencia.nome} </p>
                                        <p> Código: {client.agencia.codigo} </p>
                                        <p> Logradouro: {client.agencia.endereco.logradouro} </p>
                                        <p> Número: {client.agencia.endereco.numero} </p>
                                        <p> Bairro: {client.agencia.endereco.bairro} </p>
                                        <p> Cidade: {client.agencia.endereco.cidade} </p>
                                        <p> Estado: {client.agencia.endereco.uf} </p>
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