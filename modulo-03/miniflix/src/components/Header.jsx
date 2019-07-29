import React from 'react';
import '../css/header.css';
import logo from '../img/logo.png';
import { Image, Nav, Navbar, NavDropdown } from 'react-bootstrap';



const Header = props => {

    function gerarInputAno() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Um ano!" onChange={props.exibirPorAnos} />
                }
            </div>
        )
    }

    function gerarInputNome() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Um nome!" onChange={props.exibirPorNomes} />
                }
            </div>
        )
    }

    function gerarInputGenero() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Um gênero!" onChange={props.exibirGeneros} />
                }
            </div>
        )
    }

    function gerarInputTitulo() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Um prefixo titulo!" onChange={props.exibirTitulos} />
                }
            </div>
        )
    }

    function gerarInputCredito() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Uma série!" onChange={props.exibirCreditos} />
                }
            </div>
        )
    }

    function gerarInputHashTag() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Uma hastag!" onChange={props.exibirHashTag} />
                }
            </div>
        )
    }

    function gerarInputSalarios() {
        return (
            <div>
                {
                    <input id="parametroRecebido" type="search" placeholder="Uma série!" onChange={props.exibirTotalSalarios} />
                }
            </div>
        )
    }


    // const { metodo } = props
    return (
        <React.Fragment>
            <Navbar className="m3-5" id="navetop" bg="dark" variant="red">
                <Nav className="mr-auto" variant="pills" defaultActiveKey="/home">
                    <Nav.Link className="ml-4 mr-2" href="/home"><h6>Inicio</h6></Nav.Link>
                    <Nav.Link className="mr-2" disabled href="/catalogo"><h6>Catálogo</h6></Nav.Link>
                    <Nav.Link className="mr-2" disabled href="/quemsomos"><h6>Sobre nós</h6></Nav.Link>
                    <Nav.Link className="ml-2" disabled href="/contato"><h6>Contato</h6></Nav.Link>
                </Nav>
                <Image className="align-top mr-auto" width="250px" src={logo} alt="Logo" />
                <NavDropdown id="collasible-nav-dropdown" className="mr-4" title="Escolha um filtro">
                    <NavDropdown.Item href="#" onClick={() => props.exibirTodas()}>Listar todas</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => props.exibirInvalidas()} href="#">Inválidas</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputAno()} href="#">Filtrar por ano</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputNome()} href="#">Buscar por nome</NavDropdown.Item>
                    <NavDropdown.Item onClick={() => props.exibirMediaEpisodios()} href="#">Média episodios</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputSalarios()} href="#">Total salários</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputGenero()} href="#">Por gênero</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputTitulo()} href="#">Por título</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputCredito()} href="#">Créditos</NavDropdown.Item>
                    <NavDropdown.Item onClick={gerarInputHashTag()} href="#">Hashtag secreta</NavDropdown.Item>
                </NavDropdown>
            </Navbar>
        </React.Fragment>
    );
}

export default Header




