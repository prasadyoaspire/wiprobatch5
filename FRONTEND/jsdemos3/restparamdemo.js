function add(x,...a) {
    let sum = x;
    for(let i=0;i<a.length;i++) {
      sum = sum+a[i];
    }
    return sum;
}

let r = add(10);
console.log(r);

let r1 = add(10,20);
console.log(r1);


let r2 = add(10,20,30,40);
console.log(r2);