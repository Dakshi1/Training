function showCurrentTime()
{
    console.log(new Date());
}
function sleep(delay = 1000)
{
    var startTime=Date.now();
    while((Date.now())<= (startTime+delay));

}
function showTimeAfterDelay(delay = 3000)
{
    console.log('before sleep....')
    sleep(delay);
    console.log('after sleep...');
    showCurrentTime();
}
function execAfterDelay(callbackFn, delay)
{
    if(typeof callbackFn !== 'function')
        {
            throw 'callback is not a function';
        }
    console.log('going to sleep');
    sleep(delay);
    console.log('wokeup now');
    callbackFn();
}

console.log('Start of Script');
setTimeout(showCurrentTime, 0);
console.log('End of Script');