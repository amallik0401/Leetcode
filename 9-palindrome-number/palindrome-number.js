/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    a = x.toString().split('').reverse().join('');

    if(a==x){
        return true;
    }
    else{
        return false;
    }
};