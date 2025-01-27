import { useState } from "react";
import axios from 'axios';
import { Link } from "react-router-dom";

function ProductForm() {

    const [pname, setPname] = useState('');
    const [pprice, setPprice] = useState('');
    const [mfd, setMfd] = useState('');
    const [category, setCategory] = useState('');

    const saveProduct = () => {
        const payload = {
            productName: pname,
            productPrice: pprice,
            mfd: mfd,
            category: category
        }

        //call backend api to save product
        axios.post("http://localhost:8081/product/save", payload).then(resp => {
            alert("New Product is created with id: " + resp.data.productId);
        })
    }

    return (
        <>
            <h3>Product Form</h3>
            <div>
                <label>Product Name</label>
                <input type="text" name="pname" value={pname} onChange={(event) => setPname(event.target.value)} />
            </div>
            <div>
                <label>Product Price</label>
                <input type="number" name="pprice" value={pprice} onChange={(event) => setPprice(event.target.value)} />
            </div>
            <div>
                <label>Manufacture Date</label>
                <input type="date" name="mfd" value={mfd} onChange={(event) => setMfd(event.target.value)} />
            </div>
            <div>
                <label>Category</label>
                <input type="category" name="category" value={category} onChange={(event) => setCategory(event.target.value)} />
            </div>

            <button onClick={saveProduct}>Save</button>

            <p><Link to='/'>Back To Home</Link></p>
        </>
    )
}

export default ProductForm;