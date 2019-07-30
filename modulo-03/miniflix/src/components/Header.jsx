import React from 'react';
import '../css/header.css';
import logo from '../img/logo.png';
import { Image, Nav, Navbar, NavDropdown, Form, FormControl} from 'react-bootstrap';

const Header = props => {


    function pegarAno(){
        let numero1 = document.querySelector("#campo").value
        props.exibirPorAnos(numero1)
    }

    function pegarNome(){
        let numero1 = document.querySelector("#campo").value
        props.exibirPorNomes(numero1)
    }

    function pegarSalarios(){
        let numero1 = document.querySelector("#campo").value
        props.exibirTotalSalarios(numero1)
    }

    function pegarGenero(){
        let numero1 = document.querySelector("#campo").value
        props.exibirGeneros(numero1)
    }

    function pegarTitulo(){
        let numero1 = document.querySelector("#campo").value
        props.exibirTitulos(numero1)
    }

    function pegarCredito(){
        let numero1 = document.querySelector("#campo").value
        props.exibirCreditos(numero1)
    }

    function pegarHash(){
        let numero1 = document.querySelector("#campo").value
        props.exibirHashTag(numero1)
    }


    // const { metodo } = props
    return (
        <React.Fragment>
            <Navbar className="m3-5" id="navetop" bg="dark" variant="red">
                <Nav className="mr-auto" variant="pills" defaultActiveKey="/">
                    <Nav.Link className="ml-2 mr-2" href="/"><h6>Inicio</h6></Nav.Link>
                    <Nav.Link className="mr-2" disabled href="/catalogo"><h6>Catálogo</h6></Nav.Link>
                    <Nav.Link className="mr-2" disabled href="/quemsomos"><h6>Sobre nós</h6></Nav.Link>
                    <Nav.Link className="ml-2" disabled href="/contato"><h6>Contato</h6></Nav.Link>
                </Nav>
                <Image className="align-top mr-3" width="250px" src={logo} alt="Logo" />
                <Form id="formu" inline className="ml-5 mr-0">
                    <FormControl type="text" id="campo" placeholder="Parâmetro" />
                </Form>
                <NavDropdown id="collasible-nav-dropdown" className="mr-4" title="Escolha um filtro">
                    <NavDropdown.Item href="#" onClick={() => props.exibirTodas()}>Listar todas</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => props.exibirInvalidas()} href="#">Inválidas</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarAno()} href="#">Filtrar por ano</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarNome()} href="#">Buscar por nome</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => props.exibirMediaEpisodios()} href="#">Média episodios</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarSalarios()} href="#">Total salários</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarGenero()} href="#">Por gênero</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarTitulo()} href="#">Por título</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarCredito()} href="#">Créditos</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => pegarHash()} href="#">Hashtag secreta</NavDropdown.Item> 
                </NavDropdown>
            </Navbar>
        </React.Fragment>
    );
}

export default Header




