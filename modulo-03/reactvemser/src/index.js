import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App.jsx';
import * as serviceWorker from './serviceWorker';

/* const elemento =
    (<div>
        <h1> E ai jovem</h1>
        <ul>
            <li>Porto Alegre</li>
            <li>Esteio</li>
            <li>Canoas</li>
        </ul>
    </div>)
 */

ReactDOM.render(<App /> , document.getElementById('root'));

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
