let f1 = function () {
    console.log("Hello Function");
}

f1();

//From ES6

let f2 = () => {
    console.log("Hello Arrow Function");
}

f2();

let f3 = (a, b) => {
    let c = a+b;
    return c;
}

let r = f3(10,30);
console.log("r = "+r);