const {MongoClient} =require('mongodb');
const url='mongodb://localhost';

MongoClient.connect(url, (err, conn)=>{

    if(err) throw err;
    const db=conn.db('trainingdb');
    const contacts=db.collection('contacts');
    contacts.findOne((err, c1)=>{
        conn.close();
        if(err) throw err;
        console.log(c1);
    });
});