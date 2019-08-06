import React, { Component } from 'react';
import NavBar from '../../components/generics/NavBar';
import RequestApi from '../../components/requestsApi/RequestApi';
import Screen from '../../components/Screen';

export default class Agencies extends Component {

    constructor(props){
        super(props)
        this.backData = new RequestApi(1337)
        this.state = {
            agenciesList: this.backData.listDefaultAgencies
        }
    }

    
    componentWillMount() {
        this.backData.requestAgenciesDefault()
        setTimeout(() => {
            this.setState({
                agenciesList: this.backData.listDefaultAgencies
            })
        }, 1000)
    }

    render() {
        const { agenciesList } = this.state
        {console.log( agenciesList )}
        return (
            <div className="text-center">
                <NavBar src="https://dovethemes.com/wp-content/uploads/2016/11/Dark-Line-Surface-Background.jpg" body={false}/>
                <Screen list={ agenciesList } agencies={ true } types={ false }
                                customers={ false } accCli={ false } />
            </div>
        )
    }
}