import React, { Component } from 'react';

export default class Screen extends Component {

    constructor( props ){
        super( props )
        this.list = props.list
        this.state = {
            agencies: props.agencies,
            types: props.types,
            customers: props.customers,
            accCli: props.accCli
        }
    }

    renderAgencies = ( list ) =>  {
        return (
            <div>OPA OPA</div>
        )
    }


    render() {
        const { list } = this.state
        return (
            this.renderAgencies ( list )
        )
    }
}