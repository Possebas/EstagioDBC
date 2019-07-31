import React, { Component } from 'react';
import { MDBContainer, MDBRow, MDBCol, MDBJumbotron, MDBCardTitle, MDBBtn} from 'mdbreact';
import '../css/home.css';
import RoutesBar from './RoutesBar';

export default class Home extends Component {

    renderizarDoisProjetos() {
        return (
            <MDBContainer >
                <MDBRow>
                    <MDBCol>
                        <MDBJumbotron style={{ padding: 0 }}>
                            <MDBCol id="projeto1" className="text-white text-center px-4 my-5" >
                                <MDBCol id="projeto1info" className="py-5">
                                    <MDBCardTitle className="h1-responsive pt-3 m-5 font-bold"> \ Mirror Flix / </MDBCardTitle>
                                    <p id="especial" className="mx-5 mb-5">
                                        Uma simples interface com alguns episódios de Black Mirror e funcionalidades simples!
                                    </p>
                                    <MDBBtn id="botao" color="primary" rounded className="mb-5"><a id="linke" href="/mirror">Saiba mais sobre o projeto</a></MDBBtn>
                                </MDBCol>
                            </MDBCol>
                        </MDBJumbotron>
                    </MDBCol>
                    <MDBCol>
                        <MDBJumbotron style={{ padding: 0 }}>
                            <MDBCol id="projeto2" className="text-white text-center px-4 my-5">
                                <MDBCol className="py-5">
                                    <MDBCardTitle className="h1-responsive pt-3 m-5 font-bold"> \ Mini Flix / </MDBCardTitle>
                                    <p id="especial" className="mx-5 mb-5">
                                        Uma interface gráfica contendo uma lista de séries e filtros para se obter infomações mais precisas!
                                    </p>
                                    <MDBBtn id="botao" color="primary" rounded className="mb-5"><a id="linke" href="/miniflix">Saiba mais sobre o projeto</a></MDBBtn>
                                </MDBCol>
                            </MDBCol>
                        </MDBJumbotron>
                    </MDBCol>
                </MDBRow>
            </MDBContainer>
        )
    }

    render() {
        return (
            <div style={{background: "#343a40"}}>
                <div> 
                    <RoutesBar></RoutesBar>
                </div>
                {this.renderizarDoisProjetos()}
            </div>
        )
    }
}