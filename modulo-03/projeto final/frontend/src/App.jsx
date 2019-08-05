/* All librarys */
import React, { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

/* Components */
import Login from "./components/Login";
import Home from "./components/Home";
import AccountsClients from "./components/accountsClient/AccountsClients";
import AccountsTypes from "./components/accountsTypes/AccountsTypes";
import Agencies from "./components/agencies/Agencies";
import Costumers from "./components/costumers/Costumers";
import { PrivateRoute } from "./components/PrivateRoute";

/* CSS */
import "./App.css";

export default class App extends Component {
  render() {
    return (
      <Router>
        <React.Fragment>
          <PrivateRoute path="/" exact component={Home} />
          <PrivateRoute path="/clientsacc" exact component={AccountsClients} />
          <PrivateRoute path="/typeacc" exact component={AccountsTypes} />
          <PrivateRoute path="/agencies"  component={Agencies} />
          <PrivateRoute path="/costumers" exact component={Costumers} />
          <Route path="/login" component={Login} />
        </React.Fragment>
      </Router>
    );
  }
}