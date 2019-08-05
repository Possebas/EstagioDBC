import React, { Component } from 'react';
import * as axios from  'axios';
import TemplateLogin from '../components/generics/TemplateLogin';
import '../css/login.css';

export default class Login extends Component {
    
    constructor(props){
        super(props)
        this.state = {
            email: '',
            senha: ''
        }
        this.trocaValoresState = this.trocaValoresState.bind( this )
    }

    trocaValoresState( e ) {
        const { name, value } = e.target
        this.setState({
            [name]: value
        })
    }

    logar( e ) { 
        e.preventDefault();

        const { email, senha } = this.state
        if ( email && senha){
            axios.post( 'http://localhost:1337/login', {
                email: this.state.email,
                senha: this.state.senha
            }).then( resp => {
                localStorage.setItem( 'Authorization', resp.data.token )
                this.props.history.push("/")
            })
        }
    }

    render( ) {

        return  (
            <div id="login">
                <React.Fragment>
                    <TemplateLogin logar={ this.logar.bind( this ) } trocaValoresState={ this.trocaValoresState } />
                </React.Fragment>
            </div>
        )
    }

}
