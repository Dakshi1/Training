const getAllContacts=require('./myutils/services/array-contact-service').getAllContacts;
const service=require('./myutils/services/array-contact-service');

const contacts=service.getAllContacts(11, 10, 'firstname', 'desc');
console.log(contacts);
const contact1={firstname:'dakshi', email:'dakshi884@gmail.com', phone:'8081901265', city: 'bangalore'};
const contact2={firstname:'dakshi', email:'dakshi884@gmail.com', phone:'8081901265', city: 'bangalore'};
service.createNewContact(contact1);
service.createNewContact(contact2);
service.deleteContact(101);
const v=service.getContactById(101);
console.log(v);
//const ans=getContactById(13);
//console.log(ans);