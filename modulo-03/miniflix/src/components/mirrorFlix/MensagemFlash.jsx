import React from 'react';
import '../../css/mirrorFlix/mensagemflash.css'

const MensagemFlash = (props) => {
    const { exibirMensagem, mensagemTipo } = props
    const sucesso = <span id="sucesso" >Nota registrada com sucesso!</span>
    const falha = <span id="falha" >Informar uma nota válida (entre 1 e 5)</span>

    function informarCor( cor ) {
        return <span style={{"background-color": cor}}>Exemplo!</span>
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
            <h6>{ exibirMensagem  ? gerarMensagem() : '' }</h6>
            { exibirMensagem ? definirTempo() : ''}
        </div>
    )
}

export default MensagemFlash 