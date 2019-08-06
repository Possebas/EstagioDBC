import React from 'react';
import {
  MDBNavbar, MDBNavbarNav, MDBNavbarToggler, MDBCollapse,
  MDBNavItem, MDBNavLink, MDBMask, MDBView, MDBIcon,
  MDBDropdown, MDBDropdownToggle, MDBDropdownItem, MDBDropdownMenu
} from 'mdbreact';
import '../../css/navbar.css';

import { BrowserRouter as Router } from 'react-router-dom';

class NavBar extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      collapse: false,
      isWideEnough: false,
    };
    this.onClick = this.onClick.bind(this);
  }

  logout() {
    localStorage.removeItem('Authorization');
  }

  onClick() {
    this.setState({
      collapse: !this.state.collapse,
    });
  }

  render() {
    return (
      <div>
        <header>
          <Router>
            <MDBNavbar color="bg-primary" fixed="top" dark expand="md" scrolling transparent>
              <MDBIcon className="mr-3 text-center" icon="piggy-bank" size="2x" />
              {!this.state.isWideEnough && <MDBNavbarToggler onClick={this.onClick} />}
              <MDBCollapse isOpen={this.state.collapse} navbar>
                <MDBNavbarNav className="ml-3" left>
                  <MDBNavItem className="mr-1" active>
                    <a className="nav-link Ripple-parent" href="/"> Home </a>
                  </MDBNavItem>
                  <MDBNavItem className="mr-1">
                    <a className="nav-link Ripple-parent" href="/agencies"> Agencies </a>
                  </MDBNavItem>
                  <MDBNavItem className="mr-1">
                    <a className="nav-link Ripple-parent" href="/customers"> Customers </a>
                  </MDBNavItem>
                  <MDBNavItem className="mr-1">
                    <a className="nav-link Ripple-parent" href="/typeacc"> Account Type </a>
                  </MDBNavItem>
                  <MDBNavItem className="mr-1">
                    <a className="nav-link Ripple-parent" href="/clientsacc"> Customer account </a>
                  </MDBNavItem>
                </MDBNavbarNav>
                <MDBNavbarNav right>
                  <MDBNavItem>
                    <MDBNavLink className="waves-effect waves-light" to="#!">
                      <MDBIcon fab icon="twitter" />
                    </MDBNavLink>
                  </MDBNavItem>
                  <MDBNavItem>
                    <MDBDropdown>
                      <MDBDropdownToggle nav caret>
                        <MDBIcon icon="user" />
                      </MDBDropdownToggle>
                      <MDBDropdownMenu className="dropdown-default">
                        <MDBDropdownItem href="#!">My account</MDBDropdownItem>
                        <MDBDropdownItem onClick={this.logout} href="/login">Logout</MDBDropdownItem>
                      </MDBDropdownMenu>
                    </MDBDropdown>
                  </MDBNavItem>
                </MDBNavbarNav>
              </MDBCollapse>
            </MDBNavbar>
          </Router>
        </header>
        <MDBView src={this.props.src} alt="Image fail">
          {this.props.body ? bodyHome : ''}
        </MDBView>
      </div>
    );
  }
}

const bodyHome = () => (
  <MDBMask id="descricao" overlay="purple-light" className="flex-center flex-column text-white text-center ">
    <h2>Digital Bank - ComeBe <span id="registered">®</span></h2>
    <h5>We are different</h5>
    <p>In Brazil, paying the world's highest rates and interest for its banking services. We know that technology and design can solve this problem. <br />We are a startup that develops simple, secure and 100% digital solutions for you to have control of your money literally in your hands.</p> <br />
    <p>That's why we came together in 2013 to redefine people's relationship with money through a more efficient and transparent experience. <br />If you have tired of the same solutions to old problems, if you want to come up with new ideas, and <br />if you believe design, technology, and good service solve any problem, learn about our careers. <br />We are looking for people to simplify the world. </p><br />
    <p>Our goal is to end complexity and give back control of one's financial life.</p>
  </MDBMask>
)

export default NavBar;