
function sum(a,b=10) {

    console.log("a ="+ a);
    console.log("b ="+b);

    return a+b;
}

let result1 = sum(10); //calling
let result2 = sum(10,30); //calling

console.log("Sum1: "+result1);
console.log("Sum2: "+result2);