import React, { Component } from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';

// Components
import InfoMiniFlix from './components/InfoMiniFlix';
import MirrorFlix from './components/MirrorFlix';
import Home from './components/Home';
import Login from './components/Login';
import { PrivateRoute } from './components/PrivateRoute';

// CSS
import './css/app.css';


class App extends Component {

    render() {
        return (
            <div className="App">
                <Router>
                    <React.Fragment>
                        <section>
                            <PrivateRoute path="/" exact component={Home} />
                            <Route path="/login"  component={Login} />
                            <PrivateRoute path="/miniflix" component={InfoMiniFlix} />
                            <PrivateRoute path="/mirror"  component={MirrorFlix} />
                        </section>
                    </React.Fragment>
                </Router>
            </div>
        )
    }
}

export default App;