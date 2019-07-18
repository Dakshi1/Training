const fs = require('fs');
const path = require('path');
const filename = path.join(__dirname, 'contacts.json');
let data = [];
if (fs.existsSync(filename)) {
    data = JSON.parse(fs.readFileSync(filename, 'utf-8'));
}
const requiredFields = ['firstname', 'email', 'phone', 'city'];
const availableFields = ['_id', 'firstname', 'email', 'phone', 'city'];
class ContactService {

    constructor() {

    }

    getContactById(id, callbackFn) {
        if (!callbackFn || typeof callbackFn != 'function') {
            callbackFn('callbackFn was not supplied or was not a function');
            return;
        }
        if (typeof id !== 'number') {
            callbackFn('id was not a number');
            return;
        }
        const index = data.findIndex(c => c.id === id);
        if (index === -1) {
            callbackFn('id does not exist');
            return;
        }
        callbackFn(null, ...data[index]);
        return ;
    }
    deleteContact(id, callbackFn) {
        
    }
    updateContact(contact, callbackFn) {

    }
    // our asynchronous function
    getAllContacts(options, callbackFn) {

        if (!callbackFn || typeof callbackFn != 'function') {
            callbackFn('callbackFn was not supplied or was not a function');
            return;
        }


        setTimeout(() => {

            let { pageNum = 1, pageSize = 10, sortBy = '_id', sortOrder = 'asc' } = options;

            if (typeof pageNum !== 'number' || typeof pageSize !== 'number') {
                callbackFn('either pagenum or pagesize is not a number');
                return;
            }
            if (!(sortOrder === 'asc' || sortOrder === 'desc')) {
                callbackFn('sortOrder is ambigious');
                return;
            }
            // let check=false;
            // forEach(keys in availableFields)
            // {
            //     if(keys===sortBy){
            //         check=true;
            //         break;
            //     }
            // }
            // i
            // if(!check){
            //     callbackFn('sortBy field is incorrect');
            // }
            if (!(availableFields.find(field => field === sortBy))) {
                callbackFn('sortBy field is incorrect');
            }
            let begin = (pageNum - 1) * pageSize;
            let end = begin + pageSize;
            let newData = data.slice(begin, end);
            if (sortOrder === 'asc') {
                newData.sort((a, b) => a[sortBy] < b[sortBy] ? -1 : 1);
            }
            else {
                newData.sort((a, b) => a[sortBy] < b[sortBy] ? 1 : -1);
            }
            callbackFn(null, newData);
        });
    }

    addNewContact(contact, callbackFn) {
        if (!callbackFn || typeof callbackFn != 'function') {
            callbackFn('callbackFn was not supplied or was not a function');
            return;
        }

        // to make our function as asynchronous from this point forwars,
        // we use the setTimeout, builtin asynchronous function with a 
        // delay of 0
        setTimeout(() => {
            if (!contact || typeof contact !== 'object') {
                let err = { code: 1001, meassage: 'contact was not supplied or was not a object' };
                callbackFn(err);
                return;
            }
            const missingField = []
            requiredFields.forEach(f => {
                if (!(f in contact)) {
                    missingField.push(f);
                }
            });
            if (missingField.length) {
                let err = { code: 1001, meassage: 'misssing requrired fields ' + missingField.join(', ') };
                callbackFn(err);
                return;
            }
            if (data.length === 0) {
                contact._id = 1;
            }
            else {
                contact._id = 1 + Math.max(...data.map(c => c.id));
            }
            data.push(contact);
            fs.writeFile(filename, JSON.stringify(data), (err) => {
                if (err) {
                    callbackFn(err);
                    return;
                }
                callbackFn(null, { ...contact });
            });
        }, 0);


    }
}

module.exports = new ContactService();