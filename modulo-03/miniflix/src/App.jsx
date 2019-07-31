import React, { Component } from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import InfoMiniFlix from './components/InfoMiniFlix';
import MirrorFlix from './components/MirrorFlix';
import Home from './components/Home';
import './css/app.css';


class App extends Component {

    render() {
        return (
            <div className="App">
                <Router>
                    <React.Fragment>
                        <section>
                            <Route path="/" exact component={Home} />
                            <Route path="/miniflix" exact component={InfoMiniFlix} />
                            <Route path="/mirror" extact component={MirrorFlix} />
                        </section>
                    </React.Fragment>
                </Router>
            </div>
        )
    }
}

export default App;