import React from 'react';
import Membro from './Membro';

export default (props) => [
    props.nome,
    props.sobrenome
]

/* 
<React.Fragment>
        {props.nome} {props.sobrenome}
    </React.Fragment> */

/* <React.Fragment>
        {props.nome} {props.sobrenome}
    </div> */