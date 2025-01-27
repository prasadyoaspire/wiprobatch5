import { Link } from "react-router-dom";

function Home() {

    return (
        <>
            <h3>My Home Page</h3>
            <p><Link to="/counter">Counter Page</Link></p>
            <p><Link to="/product/all">View All Products</Link></p>
            <p><Link to="/product/add">Add New Product</Link>   </p>
        </>
    )
}

export default Home;