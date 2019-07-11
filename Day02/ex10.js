function printMultiplicationTable()
{
    // read value from textbox
    var output='';
    var input=document.getElementById('num').value.trim();
    // try converting in a number

    if(!input)return false;
    if(!isNaN(input)){
        var num=parseInt(input);
        // if successful generate a string representing table
        for(var i=1; i<=10; i++)
            {
                output += `${num} X ${i} = ${num * i} <br />`;
            }
    }
    else
    {
        // if failed, generate error
        output='Cannot print table for <b> '+ input + '</b>';
    }
    

    //output string to div#d1
    document.getElementById('d1').innerHTML=output;
    return false;
}