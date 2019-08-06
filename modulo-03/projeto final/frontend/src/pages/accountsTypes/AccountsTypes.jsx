import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';

export default class AccountsTypes extends Component {

    constructor(props){
        super(props)
    }

    render() {
        return (
            <div>
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={false} />
                <h1>SCREEN OF ACCOUNTS ON TYPES!</h1>
            </div>
        )
    }
}