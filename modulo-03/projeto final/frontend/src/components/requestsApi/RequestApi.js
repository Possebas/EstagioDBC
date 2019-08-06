import * as axios from 'axios';

export default class RequestApi {
    constructor(port) {
        this.data = []
        this.baseUrl = `http://localhost:${port}`
    }

    reqApi( url, id ) {
        url += id ? `:${id}` : ''
        axios.get(`${this.baseUrl}${url}`, { 
            headers: {
                authorization: 'banco-vemser-api-fake'
            }
        })
        .then( resp => {
            this.data = resp.data
        }).catch( function ( error ) {
            console.log( "Error that's request: "+url+"  "+ error )
        })
    }

    requestAgenciesDefault() {
        this.reqApi( '/agencias' )
    }

    requestCustomersList() {
        this.reqApi( '/clientes' )
    }

    requestAccountTypesList() {
        this.reqApi( '/tipoContas' )
    }

    requestAccountClientsList() {
        this.reqApi( '/conta/clientes' )
    }

    get listDefaultAgencies() {
        // console.log( this.data.agencias )
        return this.data.agencias
    }

    get listDefaultClients() {
        return this.data.clientes;
    }

    get listDefaultTypesAcc() {
        return this.data.tipos;
    }

    get listAllAccClient() {
        return this.data.cliente_x_conta;
    }

    requestAgency( id ) {
        this.reqApi( '/agencia', id )
    }
}