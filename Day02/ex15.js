function shuffle(array)
{
    array.sort(function(){return Math.random()-0.5;});
    return array;
}
$(function()
{
    var nums=[];
    for(var i=0;i<=15;i++)
    {
       nums.push(i);
    }
    shuffle(nums);
    var k=0;
    for(var i=0;i<4;i++)
    {
        for(var j=0;j<4;j++)
        {
            var val=nums[k++];
            if(val===0)val="&nbsp";
            $("<button>")
                .on("click", function(){
                    console.log($(this).id +' '+ $(this).j);
                    alert('you have clicked '+ $(this).html())
                })
                .html(val)
                .attr('id', k)
                .appendTo("#puzzle");
        }
        $("<br>").appendTo("#puzzle");
    }
});