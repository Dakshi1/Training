// a basic example of express middleware to handle HTTP client requests

const express=require('express');
const process=require('process');
const path=require('path');
const service=require('./services/mongodb-contact-service');
const bodyParser=require('body-parser');


const app=express();
const port=process.env.PORT || 4000;

app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'www')));
app.use((req, resp, next) =>{
    console.log('cors called')
    resp.set('Access-Control-Allow-Origin', '*');
    resp.set('Access-Control-Allow-Methods', 'POST,DELETE,PUT,GET');
    resp.set('Access-Control-Allow-Handlers', '*');
    resp.set('Access-Control-Allow-Headers', '*');
    next();
})
// map http GET request for the url '/contacts' to respond with JSON
// reprentation 

app.get('/api/contacts/', (req, resp) =>{
    service.getAllContacts()
        .then(data => resp.json(data));
});
    
app.delete('/api/contacts/:id', (req, resp)=>{
    let id=req.params['id'];
    service.deleteContact(id)
            .then(()=>resp.end('contact deleted'))
            .catch(err=>resp.end('there was an error'))
});

app.post('/api/contacts/', (req, resp)=>{

    service.addNewContact(req.body)
            .then(data => resp.json(data))
            .catch(err => console.log(err));
});

app.put('/api/contacts/', (req, resp)=>{

    
    service.updateContact(req.body)
            .then(()=>resp.end('contact updated'))
            .catch(err=>resp.end('there was an error'))

});

app.listen(port, ()=> console.log(`server started at http://localhost:${port}`));