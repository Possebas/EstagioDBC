import React from 'react';
import Membro from './Membro';

export default (props) => (
    <React.Fragment>
        <Membro nome={props.nome} sobrenome={props.sobrenome} />
    </React.Fragment>
)