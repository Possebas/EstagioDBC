import React, { Component } from 'react';
import PropTypes from 'prop-types';

export default class TesteRenderizacao extends Component {

    render() {
        const children = this.props.children
        return (
            children
        )
    }
}

TesteRenderizacao.propTypes = {
    children: PropTypes.element.isRequired
}