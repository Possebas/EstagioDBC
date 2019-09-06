import React from "react";
import { MDBBtn, MDBBtnGroup, MDBCol, MDBRow } from "mdbreact";
import RadioRace from "../components/RadioRace";
import { Link } from 'react-router-dom';
import { logout } from "../services/auth";
import '../css/routes.css'


const RoutesBar = (props) => {

    return (
        <MDBRow id="linha">
            <MDBCol style={{ background: "black", width: "100%" }} xl="12" md="12" sm="12" className="mb-xl-0">
                <MDBBtnGroup className="my-3 mr-5">
                    <MDBBtn color="primary"><Link id="linke" to="/">| Início |</Link></MDBBtn>
                    <MDBBtn color="warning"><Link id="linke" to="/"> | Personagens |</Link></MDBBtn>
                    <MDBBtn color="danger" className="mr-5" ><Link id="linke" onClick={logout.bind(this)} to="/login"> | Deslogar |</Link></MDBBtn>
                </MDBBtnGroup>
                <MDBBtnGroup className="ml-5">
                    <RadioRace getTipos={props.getTipos}></RadioRace>
                </MDBBtnGroup>
            </MDBCol>
        </MDBRow>
    )
}

export default RoutesBar