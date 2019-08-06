/* All librarys */
import React, { Component } from "react";
import { BrowserRouter as Router, Route } from "react-router-dom";

/* Components */
import Login from "../src/pages/Login";
import Home from "./pages/Home";
import AccountsClients from "./pages/accountsClient/AccountsClients";
import AccountsTypes from "./pages/accountsTypes/AccountsTypes";
import Agencies from "./pages/agencies/Agencies";
import Customers from "./pages/customers/Customers";
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
          <PrivateRoute path="/agencies"  exact component={Agencies} />
          <PrivateRoute path="/customers" exact component={Customers} />
          <Route path="/login" exact component={Login} />
        </React.Fragment>
      </Router>
    );
  }
}