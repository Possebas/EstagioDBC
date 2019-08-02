import React from "react";
import { MDBBtn, MDBBtnGroup, MDBCol, MDBRow } from "mdbreact";
import { Link } from 'react-router-dom';
import '../css/routes.css'


const RoutesBar = (  ) => {

    function logout( ) {
        localStorage.removeItem('Authorization');
    }

    return (
        <MDBRow id="linha">
            <MDBCol style={{ background: "black", width: "100%"}} xl="12" md="12" sm="12" className="mb-xl-0">
                <MDBBtnGroup className="my-3">
                    <MDBBtn color="primary"><Link  id="linke" to="/">| Início |</Link></MDBBtn>
                    <MDBBtn color="warning"><Link id="linke" to="/mirror"> | MirrorFlix |</Link></MDBBtn>
                    <MDBBtn color="danger"><Link id="linke" to="/miniflix"> | MiniFlix |</Link></MDBBtn>
                    <MDBBtn color="light" className="mr-1" ><Link id="linke" onClick={logout.bind(this)} to="/miniflix"> | Deslogar |</Link></MDBBtn>
                </MDBBtnGroup>
            </MDBCol>
        </MDBRow>
    )
}

export default RoutesBar