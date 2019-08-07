import React, { Component } from 'react';

export default class InputFilters extends Component{
    constructor( props ) {
        super( props )
        this.props = props
    }
      
    render() {
      const { filter, placeholder } = this.props
      return (
        <React.Fragment>
            <input type="text" className="input" placeholder={ placeholder } onChange={ filter }/>
        </React.Fragment>
      )
    }
}