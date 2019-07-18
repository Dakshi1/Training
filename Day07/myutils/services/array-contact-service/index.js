
const service = {}
const data = require('../../../data');
service.createNewContact = (contact) => {

    requiredFields = ['firstname', 'email', 'phone', 'city'];
    missingFields = []
    requiredFields.forEach(f => {

        if (!(f in contact)) {
            missingFields.push(f);
        }
    })
    data.map(c =>{

        if(c.phone===contact.phone || c.email===contact.email)
            throw new Error('data exists');
    })
    let x=Math.max(...data.map(c => c.id))+1;
    console.log(x);
    contact.id=x;
    if (missingFields.length !== 0) {
        console.log("missing required fields ", missingFields.toString());
        return ;
    }
    data.push(contact);
}

service.getAllContacts = (pageNum = 1, pageSize = 10, sortBy = 'id', sortOrder = 'asc') => {

    if (typeof pageNum !== 'number' || pageNum <= 0) {
        throw new Error('pageNum must be a valid number');
    }
    if (typeof pageSize !== 'number' || pageSize <= 1) {
        throw new Error('pageSize must be a valid number');
    }
    if (!data[0].hasOwnProperty(sortBy))
        throw new Error('sortBy must be a valid parameter');
    if (!(sortOrder === 'asc' || sortOrder === 'desc'))
        throw new Error('sortOrder must be a valid parameter');

    const begin = (pageNum - 1) * pageSize;
    const end = begin + pageSize;
    const newData = data.slice(begin, end);
    if (sortOrder === 'asc') {
        console.log('ascending');
        newData.sort((a, b) => a[sortBy] < b[sortBy] ? -1 : 1);
    }
    else {
        newData.sort((a, b) => a[sortBy] < b[sortBy] ? 1 : -1);
    }
    return [...newData];
}

service.getContactById = (id) => {

    if (typeof id !== 'number') {
        throw new Error('id must be a valid number');
    }
    const index = data.findIndex(c => c._id === id);
    if (index === -1){
        
    }

    return { ...data[index] };
    //console.error('getContactById not implemented');
}

service.updateContact = (contact) => {

    console.error(' updateContact not implemented');
}

service.deleteContact = (id) => {

    if (typeof id !== 'number') {
        throw new Error('id must be a valid number');
    }
    const index = data.findIndex(c => c.id === id);
    if (index === -1) return null;
    data.splice(index, 101);
    console.error('deleteContact not implemented');
}
module.exports = service;