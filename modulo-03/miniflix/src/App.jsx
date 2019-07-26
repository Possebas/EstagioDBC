import React, { Component } from 'react';
import logo from './img/logo.png';
import { Image, Nav, Form, FormControl, Button, Navbar } from 'react-bootstrap';
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from 'mdbreact';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {
  faYoutube,
  faFacebook,
  faTwitter,
  faInstagram
} from '@fortawesome/free-brands-svg-icons';


/* import './css/general.css';
import './css/banner.css';  */
import './css/section.css';
import './css/header.css';
import './css/footer.css';
import ListaSeries from './models/ListaSeries';



class App extends Component {
  constructor(props) {
    super(props)
    this.listaSeries = new ListaSeries()
    let exemplo = this.listaSeries
    // let resultado = this.listaSeries.invalidas()
    // let resultado = this.listaSeries.filtrarPorAno(2017)
    // let resultado = this.listaSeries.procurarPorNome("Andrew Lincoln")
    // let resultado = this.listaSeries.mediaDeEpisodios()
    // let resultado = this.listaSeries.queroGenero("Caos")
    // let resultado = this.listaSeries.queroTitulo("The")

    console.log(exemplo)
    // console.log(resultado)
  }

  renderizarHeader() {
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
            <FormControl type="text" placeholder="Título, diretor ou ator" className="mr-sm-2" />
            <Button className="mr-4" variant="outline-info">Buscar</Button>
          </Form>
        </Navbar>
      </div>
    );
  }

  renderizarContainer(){
    return (
      <div id="content" style={{ backgroundColor: "#343a40" }}>
        <div className="container mt-5">
          <div className="row mt-5 justify-content-center">
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.hulu.com">
                <img src="https://apprecs.com/ios-meta/app-icons/256/376510438.jpg" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.netflix.com/fr/">
                <img src="https://cdn1.iconfinder.com/data/icons/metro-ui-dock-icon-set--icons-by-dakirby/256/Netflix.png" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.hulu.com">
                <img src="https://apprecs.com/ios-meta/app-icons/256/376510438.jpg" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.netflix.com/fr/">
                <img src="https://cdn1.iconfinder.com/data/icons/metro-ui-dock-icon-set--icons-by-dakirby/256/Netflix.png" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.hulu.com">
                <img src="https://apprecs.com/ios-meta/app-icons/256/376510438.jpg" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.netflix.com/fr/">
                <img src="https://cdn1.iconfinder.com/data/icons/metro-ui-dock-icon-set--icons-by-dakirby/256/Netflix.png" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.hulu.com">
                <img src="https://apprecs.com/ios-meta/app-icons/256/376510438.jpg" alt="" className="card-img"></img>
              </a>
            </div>
            <div className="card card-custom mx-2 mb-3">
              <a href="https://www.netflix.com/fr/">
                <img src="https://cdn1.iconfinder.com/data/icons/metro-ui-dock-icon-set--icons-by-dakirby/256/Netflix.png" alt="" className="card-img"></img>
              </a>
            </div>
          </div>
        </div>
      </div>
    );
  }

  renderizarFooter() {
    return (
      <div id="footer">
        <MDBFooter style={{ backgroundColor: "#343a40", color: "#fff" }} className="page-footer font-small pt-5">
          <div style={{ backgroundColor: "#6351ce" }}>
            <MDBContainer fluid className="text-center text-md-left pt-1">
              <MDBRow className="py-4 d-flex align-items-center">
                <MDBCol md="6" lg="5" className="text-center text-md-left mb-4 mb-md-0">
                  <h6 className="ml-5 mb-0 white-text">
                    Conecte-se em nossas redes sociais!
                </h6>
                </MDBCol>
                <MDBCol md="6" lg="7" className="text-md-right">
                  <a
                    href="https://www.facebook.com/" style={{ color: "rgb(31, 52, 100)" }}
                    className="facebook social">
                    <FontAwesomeIcon className="mr-lg-5"
                      icon={faFacebook} size="2x" />
                  </a>
                  <a
                    href="https://www.youtube.com/" style={{ color: "red" }}
                    className="ml-0 youtube social">
                    <FontAwesomeIcon className="mr-lg-5"
                      icon={faYoutube} size="2x" />
                  </a>
                  <a
                    href="https://www.instagram.com/" style={{ color: "black" }} className="instagram social">
                    <FontAwesomeIcon className="mr-lg-5"
                      icon={faInstagram} size="2x" />
                  </a>
                  <a href="https://www.twitter.com/" className="twitter social">
                    <FontAwesomeIcon className="mr-lg-5"
                      icon={faTwitter} size="2x" />
                  </a>
                </MDBCol>
              </MDBRow>
            </MDBContainer>
          </div>
          <MDBContainer id="containerbaixo" className="mt-5 mb-4 text-center text-md-left">
            <MDBRow className="mt-3">
              <MDBCol md="3" lg="3" xl="3" className="mb-4">
                <h6 className="text-uppercase font-weight-bold">
                  <strong>Contato</strong>
                </h6>
                <hr className="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style={{ width: "60px" }} />
                <p>
                  <i className="fa fa-contact" /> Porto Alegre, RS, Brazil
                </p>
                <p>
                  <i className="fa fa-envelope" /> miniflix@melhorquenetflix.com
                </p>
                <p>
                  <i className="fa fa-phone" /> + 55 4002 8922
                </p>
              </MDBCol>
              <MDBCol md="6" lg="6" xl="6" className="mb-4">
                <h6 className="text-uppercase font-weight-bold">
                  <strong>MiniFlix</strong>
                </h6>
                <hr className="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style={{ width: "60px" }} />
                <p>
                  Nossa empresa está focada em apresentar um serviço de streaming de maior qualidade
                  e menor custo para que assim seja amplamente difundida, sem restrição de comunidades e associações.
                </p>
              </MDBCol>
              <MDBCol md="3" lg="3" xl="3" className="mb-4">
                <h6 className="text-uppercase font-weight-bold">
                  <strong>Link úteis</strong>
                </h6>
                <hr className="deep-purple accent-2 mb-4 mt-0 d-inline-block mx-auto" style={{ width: "60px" }} />
                <p>
                  <a href="/home">Sua conta</a>
                </p>
                <p>
                  <a href="/home">Afilie-se</a>
                </p>
                <p>
                  <a href="/home">Nossas avaliações</a>
                </p>
                <p>
                  <a href="/home">Help</a>
                </p>
              </MDBCol>
            </MDBRow>
          </MDBContainer>
          <div className="footer-copyright text-center py-3">
            <MDBContainer fluid>
              &copy; {new Date().getFullYear()} Copyright: <a href="/home"> theminiflixbestalways.com </a>
            </MDBContainer>
          </div>
        </MDBFooter>
      </div>
    );
  }

  render() {
    // const { episodio,exibirMensagem } = this.state
    return (
      <div id="maisdefora" >
        {this.renderizarHeader()}
        {this.renderizarContainer()}
        {this.renderizarFooter()}
      </div>
    );
  }
}

export default App;