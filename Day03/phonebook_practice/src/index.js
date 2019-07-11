import React from 'react';
import ReactDOM from 'react-dom';
import Header from './components/Header';
import DetailCard from './components/DetailCard';
import 'jquery';
import 'bootstrap/dist/css/bootstrap.css';
import 'bootstrap/dist/js/bootstrap';

const p1 = {
    "id": 1,
    "firstname": "Darrell",
    "lastname": "Jeyes",
    "gender": "Male",
    "email": "djeyes0@cnet.com",
    "phone": "8185474903",
    "dob": "1977-01-25",
    "address": "29 Mifflin Trail",
    "city": "Northridge",
    "state": "California",
    "country": "United States",
    "picture": "http://kvinod.com/old_ci/randomdata/images/men/1.jpg"
};

const p2 = {
    "id": 2,
    "firstname": "Corrie",
    "lastname": "Martins",
    "gender": "Female",
    "email": "cmartins1@msu.edu",
    "phone": "5158094902",
    "dob": "1982-07-30",
    "address": "3 Eliot Park",
    "city": "Des Moines",
    "state": "Iowa",
    "country": "United States",
    "picture": "http://kvinod.com/old_ci/randomdata/images/women/2.jpg"
};

const p3 = {
    "id": 3,
    "firstname": "Dorolice",
    "lastname": "Handyside",
    "gender": "Female",
    "email": "dhandyside2@sohu.com",
    "phone": "8184359377",
    "dob": "1986-01-13",
    "address": "25797 Derek Center",
    "city": "Glendale",
    "state": "California",
    "country": "United States",
    "picture": "http://kvinod.com/old_ci/randomdata/images/women/3.jpg"
};

const Start = function () {
    return <div>
        <Header title="Practice Book" />
        <hr />
        <p>React app - Dakshi Suri</p>
        <div className="container">
            <ContactCard data={p1} />
            <ContactCard data={p2} />
            <ContactCard data={p3} />
        </div>

    </div>
}

ReactDOM.render(<App />, document.getElementById('root'));

