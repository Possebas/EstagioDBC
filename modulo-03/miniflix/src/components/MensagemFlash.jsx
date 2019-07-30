import React from 'react';
import '../css/mensagemflash.css'

const MensagemFlash = (props) => {
    const { exibirMensagem, assistido, episodio, mensagemTipo } = props
    const sucesso = <span id="sucesso">Nota registrada com sucesso!</span>
    const falha = <span id="falha">Informar uma nota válida (entre 1 e 5)</span>
    
    function gerarCampoNota() {
        return (
            <div>
                {
                    episodio.assistido && (
                        <div>
                            <span id="pergunta">Qual sua nota para este episodio ? </span>
                            <input id="nota" maxLength="1" type="number" onBlur={props.registrarNota} placeholder="1~5" />
                        </div>
                    )
                }
            </div>
        )
    }

    function definirTempo( valor ){
        setTimeout(() => {
            props.alterarExibirMensagem()
          }, valor || 3000)
    }

    function gerarMensagem() {
        return ( mensagemTipo ? sucesso : falha)
    }


    return (
        <div>
            { assistido ? gerarCampoNota() : '' }
            <h6>{ exibirMensagem  ? gerarMensagem() : '' }</h6>
            { exibirMensagem ? definirTempo() : ''}
        </div>
    )
}

export default MensagemFlash