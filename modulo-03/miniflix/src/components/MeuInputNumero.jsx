import React from 'react';

const MeuInputNumero = props => {
    const { assistido, episodio, obrigatorio } = props

    const campoNota = ( cor = "white", obrigatorio ) => {
        const corAplicar = cor
        const estilo = `3px solid ${corAplicar}`
        return (
            episodio.assistido && (
                <div className="mr-1 ml-1 mt-4">
                    {typeof props.mensagemSpan !== undefined ? <span>{props.mensagemSpan}</span> : ''}
                    <input className="mb-3" type="number" style={{ border: estilo }} placeholder={props.placeholderInput} onBlur={props.registrarNota} />
                    { obrigatorio ? <span>*obrigatório*</span> : ''}
                </div>
            )
        )
    }

    function gerarCampoNota(obrigatorio) {
        return (
            <div>
                {
                    obrigatorio ? campoNota( "red", obrigatorio ) : campoNota(obrigatorio)
                }
            </div>
        )
    }

    return (
        <React.Fragment>
            <div className="novoInput">
                {assistido ? gerarCampoNota(obrigatorio) : ''}
            </div>
        </React.Fragment>
    )
}
export default MeuInputNumero;