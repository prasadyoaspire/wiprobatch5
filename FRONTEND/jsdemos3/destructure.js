let emp = {
    empId : 1001,
    name : 'krish',
    age : 25
}

const {empId,name:empname,age} =  emp;

// console.log("Id: "+emp.empId);
// console.log("name: "+emp.name);
// console.log("Age: "+emp.age);
console.log("Id: "+empId);
console.log("Name: "+empname);
console.log("Age: "+age);