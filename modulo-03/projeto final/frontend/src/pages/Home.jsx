import React, { Component } from 'react';
import NavBar from '../components/generics/NavBar';
import SpinnerPage from '../components/generics/SpinnerPage';
export default class Home extends Component {

    // eslint-disable-next-line no-useless-constructor
    constructor(props){
        super(props)
    }

    logout() {
        localStorage.removeItem('Authorization');
    }

    render() {
        return (
            <div className="text-center">
                <NavBar src="https://mdbootstrap.com/img/Photos/Others/img%20(40).jpg" body={true} />
            </div>
        )
    }
}