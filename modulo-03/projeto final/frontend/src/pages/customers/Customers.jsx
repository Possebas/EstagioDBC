import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';

export default class Customers extends Component {

    // eslint-disable-next-line no-useless-constructor
    constructor(props){
        super(props)
    }

    render() {
        return (
            <div>
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={false} />
                <p>SCREEN OF COSTUMERS!</p>
            </div>
        )
    }
}