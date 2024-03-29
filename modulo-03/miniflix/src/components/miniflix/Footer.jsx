import React, { Component } from 'react';
import { MDBCol, MDBContainer, MDBRow, MDBFooter } from 'mdbreact';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {
  faYoutube,
  faFacebook,
  faTwitter,
  faInstagram
} from '@fortawesome/free-brands-svg-icons';
import '../../css/miniflix/footer.css';


export default class Footer extends Component {
    render() {
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
}



  