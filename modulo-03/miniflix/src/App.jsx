import React, { Component } from 'react';

// import './css/section.css';
import ListaSeries from './models/ListaSeries';
import Header from './components/Header';
import Footer from './components/Footer';
import Screen from './components/Screen';


class App extends Component {
  constructor(props) {
    super(props)
    this.ListaSeries = new ListaSeries()
    this.state = {
      series: this.ListaSeries.todos
    }
    // console.log(this.state)
  }

  /* <EpisodioPadrao episodio= { episodio } sortearNoComp={ this.sortear.bind(this) } marcarNoComp={ this.marcarComoAssistido} /> */

  render() {
    const { seriesAtuais } = this.state
    return (
      <div id="maisdefora" >
        <Header></Header>
        <Screen ordernarSeries={seriesAtuais}></Screen>
        <Footer></Footer>
      </div>
    );
  }
}

export default App;