import React, { Component } from 'react';
import { BrowserRouter as Router, Route} from 'react-router-dom';
import InfoMiniFlix from './InfoMiniFlix';


class App extends Component {
  render() {
      return (
          <div className="text-center">
              <Router>
                  <React.Fragment>
                      <section>
                          <Route path="/" exact component={ InfoMiniFlix } />
                          <Route path="/teste" component={ TesteRota } />
                      </section>
                  </React.Fragment>
              </Router>
          </div>
      )
  }
}


const TesteRota = () => <h2>Testando rota</h2>

export default App;