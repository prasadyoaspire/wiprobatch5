//function definition without return value
function sayHello() {  
    console.log("Hello")
}

sayHello(); //calling void function

//funciton definition with return value
function sum(a,b) {
    let c = a+b;
    //console.log("Sum: "+c);
    return c;
}

let r = sum(10,20); //calling function which returns a value and store that value inside variable r
console.log(r);


