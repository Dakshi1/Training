function greet(name='friend', city= 'your city')
{
    console.log(`Hello ${name}, how is weather in ${city}?`);
}
module.exports=greet;
greet();
greet('Dakshi', 'Bangalore');