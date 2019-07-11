let p1={
    name: 'Dakshi',
    city: 'Bangalore',
    phone: '8081901265',
    email: 'dakshi884@gmail.com'
};

let nums = [10, 20, 30, 40, 50];
// spread operator
let p2={ ...p1};
p2.email='dakshi.suri@publicissapient.com';
console.log(p1);
console.log(p2);

let[a, b, ...c]=nums;//rest operator, a=10, b=20, c=[30 40 50 ]
let newArray=[...nums, 1, 55];
console.log(newArray);