/**
 * @param {number} n
 * @return {number}
 */
var subtractProductAndSum = function(n) {
    let sum = 0;
    let product = 1;
    String(n).split('').forEach(e =>{
        e = Number(e);
        product *= e;
        sum += e;
    });
    //console.log(product);
    //console.log(sum);
    return product - sum;
};