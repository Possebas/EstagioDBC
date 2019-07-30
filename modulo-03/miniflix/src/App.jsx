import React, { Component } from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import InfoMiniFlix from './InfoMiniFlix';
import MirrorFlix from './MirrorFlix';
import Home from './Home';
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