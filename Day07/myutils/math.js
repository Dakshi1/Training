// module name relative to Day07 is
// ./myutils/math

module.exports.factorial =(num) =>{

    if(num <= 1)return 1;
    else return num*module.exports.factorial(num-1);
}
module.exports.AUTHOR='Dakshi Suri';