import React, { Component } from "react";
import { MDBFormInline, MDBInput } from "mdbreact";
import "../css/radiorace.css"

class RadioRace extends Component {

  state = {
    radio: "personagem"
  }

  onClick = nr => ( ) => {
    this.setState({
      radio: nr
    });
    this.props.getTipos(nr)
  }

  render() {
    return (
      <React.Fragment>
        <MDBFormInline className="mt-1" id="radiorace">
          <div id="radiorace" className="mr-4">Selecione um filtro: </div>
          <MDBInput gap onClick={this.onClick("personagem")} valueDefault checked={this.state.radio === "personagem" ? true : false} label="Personagens" type="radio" id="personagem" />
          <MDBInput gap onClick={this.onClick("elfo")} checked={this.state.radio === "elfo" ? true : false} label="Elfos" type="radio" id="elfo" />
          <MDBInput gap onClick={this.onClick("dwarf")} checked={this.state.radio === "dwarf" ? true : false} label="Dwarfs" type="radio" id="dwarf" />
        </MDBFormInline>
      </React.Fragment>
    );
  }
}

export default RadioRace;