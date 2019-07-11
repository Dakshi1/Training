var fetchContactDetails= function(){
    var id=document.getElementById('contactId').value;
    if(!id)return;
    var url="http://10.150.120.87:4000/contacts/"+id;
    var XHR=new XMLHttpRequest();
    console.log('xhr.readyState is ', XHR.readyState);
    XHR.open('GET', url, true);
    console.log('xhr.readyState is ', XHR.readyState);
    XHR.onreadystatechange=function(){
        if(XHR.readyState===4)
            {
                //job to be done when response is complete
                if(XHR.status===200)
                {
                    console.log(XHR.responseText);
                    var p1=JSON.parse(XHR.responseText);
                    document.getElementById('name').innerHTML=p1.firstname+' '+p1.lastname;
                    document.getElementById('email').innerHTML=p1.email;
                    document.getElementById('phone').innerHTML=p1.phone;
                    document.getElementById('picture').setAttribute('src', p1.picture);
                }
                else
                    {
                        alert('No data found for '+id);
                    }
            }
    };
    XHR.send();// request sent readyStae is #2, 3(when becomes interactive), 4 complete
}