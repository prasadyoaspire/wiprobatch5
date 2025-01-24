function test(a,b) {
    console.log(a);
    console.log(b);
    b();
}

let myFun = function f1() {
    console.log("F1 function");
 }
 
//test(10,30);

// test (10,function f1() { console.log("f1 function")});

test(10,myFun);

