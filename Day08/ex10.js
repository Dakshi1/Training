const {getContactById} =require('./services/file-contact-service');

const options={
    pageNum:5, sortBy:'firstname'
}
// getAllContacts(options, (err, data)=>{

//     if(err){
//         console.log(err);
//     }
//     else{
//         console.log(data);
//     }
// });
getContactById(5, (err, dat)=>{

    if(err){
        console.log(err);
    }
    else{
        console.log(data);
    }
});