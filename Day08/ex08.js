const fs = require('fs');
const path = require('path');

const filename = path.join(__dirname, 'names.txt');

const names = `dakshi
anant
neeraj
sagar
`;
const options={
    flag: 'a'
}
fs.writeFile(filename, names, options,  (err) => {
    if (err) {
        throw err;
    }
    console.log('write operation successful');
});
console.log('end of script');