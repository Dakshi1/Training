const {createServer}=require('http');
const process=require('process');
const server=createServer((req, resp) =>{
    console.log(req.url);
    resp.end(new Date().toString());
    
});
const port=print.env.PORT || 4000;

server.listen(port, ()=>{
    console.log(`server 10.150.120.40:${port}`);
})