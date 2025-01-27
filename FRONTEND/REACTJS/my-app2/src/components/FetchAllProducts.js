import { useEffect, useState } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";

function FetchAllProducts() {

    const [products, setProducts] = useState([]);

    useEffect(() => {
        axios.get("http://localhost:8081/product/get/all").then(resp => setProducts(resp.data));
    },[]) // to run the effect only one time, pass an empty array as second argument

    return (
        <>
            <h2>All Products</h2>
            {
                products.length > 0 &&
                products.map(p => <div>
                    <p>
                        {p.productId}  {p.productName}  {p.productPrice}&nbsp;&nbsp;&nbsp;&nbsp;
                        <Link to={`/product/view/${p.productId}`}>View</Link>&nbsp;&nbsp;&nbsp;&nbsp;
                        <Link to={`/product/edit/${p.productId}`}>Edit</Link>&nbsp;&nbsp;&nbsp;&nbsp;                      
                    </p>
                </div>)
            }

            <p><Link to='/'>Back To Home</Link></p>
        </>
    )
}
export default FetchAllProducts;