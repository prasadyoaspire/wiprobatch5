import { useEffect, useState } from "react";
import axios from 'axios';
import { useParams } from "react-router-dom";

function ProductDetails() {

    const[product,setProduct] = useState(null) ;

    //get productId from url path
    const {pId} = useParams();

    useEffect(() => {
            axios.get("http://localhost:8081/product/get/"+pId).then(resp=>setProduct(resp.data));
        },[pId])

    return(
        <>
            <h2>Product Details Page</h2>
            {
                product !== null && 
                <div>
                    <h3>Name: {product.productName}</h3>
                    <h4>Price: {product.productPrice}</h4>
                    <h5>MFD: {product.mfd}</h5>
                    <h5>Category: {product.category}</h5>
                </div>
            }        
        </>
    )
}

export default ProductDetails;