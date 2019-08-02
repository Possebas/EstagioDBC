import React, { Component } from 'react';
import * as axios from  'axios';
import {Link} from 'react-router-dom';

export default class Login extends Component {
    
    constructor(props){
        super(props)
        this.state = {
            email: '',
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

    logar( e ) { 
        e.preventDefault();

        const { email, password } = this.state
        if ( email && password){
            axios.post( 'http://localhost:1337/login', {
                email: this.state.email,
                password: this.state.password
            }).then( resp => {
                localStorage.setItem( 'Authorization', resp.data.token )
                this.props.history.push("/")
            })
        }
    }

    render( ) {
        return  (
            <div>
                <React.Fragment>
                    <h5>Login</h5>
                    <input type="text" name="email" id="email" placeholder="Email" onChange={this.trocaValoresState} />
                    <input type="password" name="password" id="password" placeholder="Password" onChange={this.trocaValoresState} />
                    <button type="button" onClick={ this.logar.bind( this ) } >Login!</button>
                </React.Fragment>
            </div>
        )
    }

}
