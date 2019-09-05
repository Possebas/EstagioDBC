/* All librarys */
import React, { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

/* Components */
import Login from "./pages/Login";
import Home from "./pages/Home";
import { PrivateRoute } from './components/PrivateRoute';

/* CSS */
import "./App.css";

export default class App extends Component {
  render() {
    return (
      <Router>
        <React.Fragment>
          <PrivateRoute path="/" exact component={Home} /> 
          <Route path="/login" component={Login} />
        </React.Fragment>
      </Router>
    );
  }
}