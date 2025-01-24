let ary = [10,20,30];

let ary2 = [...ary]; //new array is created by copying ary values

let ary3 = [1,2,...ary,50];

for(let i=0;i<ary3.length;i++) {
    console.log(ary3[i]);
}

