
const name='Dakshi';
const city='Bengaluru';
const message=`${name} lives in ${city}`;
console.log(message);

// use arrow functions
const greet =  name => `Hello ${name}, how are you?`;

console.log(greet('Dakshi'));

// practical uses of arrow functions:

const nums = [10, 22, 23, 21, 45, 456, 120, 11, 39, 55];
let searchNum=2000;
const index = nums.findIndex(n => n===searchNum);
let evenNums= nums.filter(n => n%2 === 0);
let numsOer50= nums.filter(n => n>=20);
console.log(index);
console.log(evenNums);
console.log(numsOer50);
const squares=nums.map(n => n*n);
console.log(nums, squares);
const names = ['Dakshi', 'Abhishek', 'Anant', 'Titto', 'Shivam'];
const codes=names.map((n, i)=> `${n.toUpperCase().substr(0, 3)}-${i}`);
console.log(codes);

// object destructuring

const p1={fullname: 'Dakshi', email: 'dakshi884@gmail.com'};
let {fullname, email}=p1;
console.log(`Fullname is ${fullname} and email is ${email}`);