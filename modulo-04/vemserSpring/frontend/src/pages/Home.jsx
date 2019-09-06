import React, { Component } from 'react';

import RoutesBar from "../components/RoutesBar";
import { MDBCol, MDBContainer, MDBRow } from 'mdbreact';
import api from "../services/api";
import { isAuthenticated } from '../services/auth';

export default class Home extends Component {

    constructor(props){
        super(props)
        this.state = {
            ListaRender : []
        }
    }

    componentDidMount() {
        if (isAuthenticated) {
            try {
                api.get('/api/elfo/').then(resp => {
                    const lista = resp.data;
                    this.setState({
                        listaRender: lista
                    })},
                )
            } catch (err) {
                console.log("Erro na requisição = > " + err)
            }
        } else{
            alert ("Usuário deslogado")
        }
    }

    getTipos = async e => {
        console.log(e)
        if (isAuthenticated){
            try{
                api.get( `/api/${e}/`).then( resp => {
                    const lista = resp.data;
                    this.setState({
                        listaRender: lista,
                    })}
                )
                console.log(this.state.listaRender)
            } catch (err){
                console.log("Tentativar de pegar nao deu");
            }
        } else{
            alert ("Usuário deslogado")
        }
    }

    /*     { listaRender.map((item, index) => { 
            return(
                <React.Fragment key={index}>
                    <div> 
                            ID: {item.id}
                            Nome: {item.nome}
                            Experiencia: {item.experiencia} 
                            Vida: {item.vida} 
                            Dano: {item.dano} 
                    </div>
                </React.Fragment> 
            )
        }) } */

    render() {
        const { ListaRender } = this.state
        return (
            <div className="text-center">
                <div id="links">
                    <RoutesBar getTipos={ this.getTipos.bind( this ) } />
                </div>
                <MDBContainer className="mt-2">
                    <MDBRow>
                        <MDBCol>
                            F O R M U L A R I O
                        </MDBCol>
                        <MDBCol>
                            P E R S O N A G E N S
                        </MDBCol>
                    </MDBRow>
                </MDBContainer>
            </div>
        )
    }
}