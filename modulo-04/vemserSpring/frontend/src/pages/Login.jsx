import React, { Component } from 'react';
import api from "../services/api";
import { login } from "../services/auth";
import TemplateLogin from '../components/TemplateLogin';
import '../css/login.css';

export default class Login extends Component {
    
    constructor(props){
        super(props)
        this.state = {
            username: '',
            password: ''
        }
        this.trocaValoresState = this.trocaValoresState.bind( this )
    }

    trocaValoresState( e ) {
        const { name, value } = e.target
        this.setState({
            [name]: value
        })
    }

    logar = async e => { 
        e.preventDefault();

        const { username, password } = this.state
        try {
            const response = await api.post("/login", { username, password });
            login(response.headers.authorization);
            this.props.history.push("/");
        }catch (err) {
            console.log("Erro no login: "+err);
        }
    }

    render( ) {

        return  (
            <div id="login">
                <React.Fragment>
                    <h2 id="titulo" className="pt-3 pb-2"><span id="welcome" > Welcome, </span> Sign in! </h2>
                    <TemplateLogin logar={ this.logar.bind( this ) } trocaValoresState={ this.trocaValoresState } />
                    <div className="mt-5 text-center">© 1996-2019, loremipsum.com, Inc. or its affiliates</div>
                </React.Fragment>
            </div>
        )
    }

}
