import React, { Component } from 'react';
import '../css/header.css'
import logo from '../img/logo.png';
import { Image, Nav, Form, FormControl, Button, Navbar, Container } from 'react-bootstrap';

export default class Header extends Component {
    render() {
        // const children = this.props.children
        return (
            <div className="mb-5" id="header">
              <Navbar className="mb-5" id="navetop" fixed="top" bg="dark" variant="red">
                <Nav className="mr-auto" variant="pills" defaultActiveKey="/home">
                  <Nav.Link className="ml-4 mr-2" href="/home"><h6>Inicio</h6></Nav.Link>
                  <Nav.Link className="mr-2" href="/catalogo"><h6>Catálogo</h6></Nav.Link>
                  <Nav.Link className="mr-2" href="/quemsomos"><h6>Sobre nós</h6></Nav.Link>
                  <Nav.Link className="ml-2"  href="/contato"><h6>Contato</h6></Nav.Link>
                </Nav>
                <Image className="align-top mr-auto" width="250px" src={logo} alt="Logo" />
                <Form className="" inline>
                  <FormControl type="text" id="formheader" placeholder="Título, diretor ou ator" className="mr-sm-2" />
                  <Button className="mr-4" variant="outline-info">Buscar</Button>
                </Form>
              </Navbar>
            </div>
        );
    }
}