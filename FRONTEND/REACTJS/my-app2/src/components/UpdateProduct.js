import axios from 'axios';
import { useEffect, useState } from 'react';
import { useParams } from 'react-router-dom';

function UpdateProduct() {

    const [pid, setPid] = useState('');
    const [pname, setPname] = useState('');
    const [pprice, setPprice] = useState('');
    const [mfd, setMfd] = useState('');
    const [category, setCategory] = useState('');

    const { pId } = useParams();

    useEffect(() => {
        axios.get("http://localhost:8081/product/get/" + pId).then(resp => {
            const product = resp.data;
            setPid(product.productId);
            setPname(product.productName);
            setPprice(product.productPrice);
            setMfd(product.mfd);
            setCategory(product.category);
        });
    }, [pId])

    const updateProduct = () => {
        const payload = {
            productId: pid,
            productName: pname,
            productPrice: pprice,
            mfd: mfd,
            category: category
        }
        axios.put("http://localhost:8081/product/update", payload).then(resp => {
            alert("Product Updated Successfully!");
        })
    }

    return (
        <>
            <h2>Update Product Form</h2>
            <div>
                <label>Product Id</label>
                <input type="text" name="pid" value={pid} onChange={(event) => setPid(event.target.value)} disabled />
            </div>
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

            <button onClick={updateProduct}>Update</button>
        </>
    )
}

export default UpdateProduct;