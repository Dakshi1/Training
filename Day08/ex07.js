const fs = require('fs');
const path = require('path');

const filename = path.join(__dirname, '..', 'Day07', 'ex01.js');

fs.exists(filename, (exists) => {
    if (exists) {
        // console.log('File exists');
        fs.readFile(filename, 'utf-8', (err, data) => {
            if (err) {
                console.log('error exists', err);
            }
            else {
                console.log(data);
            }
        });
    }
    else {
        console.log('file doesnot exists');
    }

})