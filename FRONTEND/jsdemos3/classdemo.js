class Product {

    constructor() {
        this.productId = 0;
        this.productName = null;
        this.productPrice = 0.0;
    }      
    displayProduct() {
        console.log(this.productId+" "+this.productName+" "+this.productPrice);
    }
}

let myProduct1 = new Product();
myProduct1.productId = 10;
myProduct1.productName = "Samsugn Ultra";
myProduct1.productPrice = 58000;

console.log("Id: "+myProduct1.productId);
console.log("Name: "+myProduct1.productName);
console.log("Price: "+myProduct1.productPrice);

myProduct1.displayProduct();



