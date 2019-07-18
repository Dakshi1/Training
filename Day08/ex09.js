const {addNewContact} =require('./services/file-contact-service');

let c1={
    firstname: 'Dakshi',
    email: 'dakshi884@gmail.com',
    phone: '8081901265',
    city: 'Bangalore'
};

addNewContact(c1, (err, c) =>{

    if(err){
        console.log('error ', err);
    }
    else{
    console.log(c);
    }
})