/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {

    if(strs==="")
    {
        return str;
    }
    strs.sort((a,b)=>b.length-a.length);

let prefix = strs[0];

for(let i = 1 ; i < strs.length ; i++)
{
    while(!strs[i].startsWith(prefix))
    {
        prefix = prefix.slice(0,-1);
        if(prefix==="")
        {
            break;
        }
    }
}

return prefix;
};