const fs = require('fs');// core module file system
const path = require('path');// core module path operations

const filename = path.join(__dirname, '..', 'Day07', 'ex01.js'); //'../Day07/ex01.js';
if (fs.existsSync(filename)) {
    // console.log(filename);

    const content=fs.readFileSync(filename, 'utf-8');
    console.log(content.toString());
}