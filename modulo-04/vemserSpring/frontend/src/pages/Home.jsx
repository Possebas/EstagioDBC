import React, { Component } from 'react';

import RoutesBar from "../components/RoutesBar";
import { MDBCol, MDBContainer, MDBRow } from 'mdbreact';
import api from "../services/api";
import { isAuthenticated } from '../services/auth';
// {listaRender ? '': ''}
export default class Home extends Component {

    constructor(props) {
        super(props)
        this.state = {
            listaRender: []
        }
    }

    componentDidMount() {
        if (isAuthenticated) {
            try {
                api.get('/api/personagens/').then(resp => {
                    console.log(resp)
                    const lista = resp.data;
                    this.setState({
                        listaRender: lista,
                    })
                }
                )
            } catch (err) {
                console.log("Erro na requisição = > " + err)
            }
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
        //const { listaRender } = this.state
        return (
            <div className="text-center">
                <div id="links">
                    <RoutesBar />
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
            </div>)
    }
}