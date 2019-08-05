import React, { Component } from 'react';
import NavBar from './generics/NavBar';
export default class Home extends Component {

    constructor(props){
        super(props)
    }

    logout() {
        localStorage.removeItem('Authorization');
    }

    render() {
        return (
            <div className="text-center">
                <NavBar></NavBar>
            </div>
        )
    }
}