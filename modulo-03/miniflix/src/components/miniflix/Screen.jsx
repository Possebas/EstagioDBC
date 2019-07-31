/* eslint-disable jsx-a11y/anchor-is-valid */
/* eslint-disable jsx-a11y/anchor-has-content */
import React from 'react';
import '../../css/miniflix/screen.css'
import { MDBCard, MDBCardBody, MDBCardImage, MDBCardTitle, MDBCardText, MDBRow, MDBCol } from 'mdbreact';


// function formatarDiretores(serie) {
//   let diretores = serie.diretor.toString()
//   let final = diretores.replace(',', ', ')
//   return final
// }

// function formatarGenero(serie) {
//   let generos = serie.genero.toString()
//   let final = generos.replace(",", ", ")
//   return final
// }

// function formatarElenco(serie) {
//   let elenco = serie.elenco.toString()
//   let final = elenco.replace(",", ", ")
//   return final
// }

const listazona = (series) => {
  return (
    <React.Fragment>
      <MDBRow id="cardGrupo">
        {series.map((serie, index) => {
          return (
            <MDBCol id="cardCol" key={index}>
              <MDBCard id="cardizinho" reverse>
                <MDBCardImage cascade id="cardImage" style={{ height: '20rem' }} alt="Imagem falhou!" src={serie.imagem} />
                <MDBCardBody cascade className="text-center">
                  <MDBCardTitle>{serie.titulo}</MDBCardTitle>
                  <MDBCardText id="infos">
                    <strong>Diretores: </strong> {serie.diretor.toString()}<br></br>
                    <strong>Gênero: </strong> {serie.genero.toString()}<br></br>
                    <strong>Estréia:</strong> {serie.anoEstreia}<br></br>
                    <strong>Temporada(s):</strong> {serie.temporadas}<br></br>
                    <strong>N° Episodios:</strong> {serie.numeroEpisodios}<br></br>
                    <strong>Distribuidora: </strong>{serie.distribuidora}<br></br>
                    <strong>Elenco:</strong> {serie.elenco.toString()}
                  </MDBCardText>
                  <button type="button" id="saiba" className="btn btn-lg btn-block btn-rounded">Saiba mais</button>
                </MDBCardBody>
              </MDBCard>
            </MDBCol>
          )
        })}
      </MDBRow>
    </React.Fragment>
  )
}

const valor = (series) => {
  return(
    <div id="teste">
      <h3>Resultado para o método: { series }</h3>
    </div>
  )
}

const Screen = (props) => {
  const { listagem, series } = props
  return (
    (listagem ? listazona(series) : valor(series))
  )
}

export default Screen;
