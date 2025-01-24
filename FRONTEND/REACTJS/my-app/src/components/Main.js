function Main() {
    let myName = "Raj Kumar";
    let product = {
        productId : 10,
        productName : "Samsung Ultra",
        productPrice : 85000
    }
    return(
        <div>
            <h3>Main Component</h3>            
             <h3>Hello, {myName} </h3>
             <h3>Sum : {10+20}</h3>
             <h4>Product Details</h4>
             <p>ProductId: {product.productId}</p>
             <p>ProductName: {product.productName}</p>            
             <p>ProductPrice: {product.productPrice}</p>             
           </div>
    )
}
export default Main;