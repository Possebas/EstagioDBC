import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';
import RequestApi from '../../components/requestsApi/RequestApi';
import '../../css/accClients.css'

export default class AccountsClients extends Component {

    constructor(props) {
        super(props)
        this.backData = new RequestApi(1337)
        this.state = {
            clientsAcc: this.backData.listAllAccClient
            
        }
    }

    componentWillMount() {
        this.backData.requestAccountClientsList()
        setTimeout(() => {
            this.setState({
                clientsAcc: this.backData.listAllAccClient
            })
        }, 1000)
    }

    render() {
        const { clientsAcc } = this.state
        return (
            <div className="text-center" id="linha">
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={true} />
              
                    {/* { id: 1,
                        codigo: 00001,
                        tipo: {
                          id: 1,
                          nome: 'Corrente'
                        },
                        cliente: {
                          id: 1,
                          nome: 'Facilitador Vem Ser 3',
                          cpf: '000.000.000-00',
                        }
                      } */}
                
                <div className="container-fluid">
                    <div className="row col-lg-6 col-xl-6 col-sm-12 py-2" >
                        {clientsAcc ? clientsAcc.map((accClient, index) => {
                            return (
                                <div className="col-sm-12 py-2 col-lg-6 col-xl-6" key={index}>
                                    <div className="card deep-purple darken-2" id="cardzinho" >
                                        <div className="card-body">
                                            <h5 className="card-title"> {accClient.cliente.nome}</h5>
                                        </div>
                                        <p className="card-text">CPF: {accClient.cliente.cpf} </p>
                                        <p> Sobre a conta </p>
                                        <p> Tipo: {accClient.tipo.nome} </p>
                                    </div>
                                </div>
                            )
                        }) : <h1 className="text-center">CARREGANDO...</h1>}
                    </div>
                </div>
            </div>
        )
    }
}