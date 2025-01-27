import logo from './logo.svg';
import './App.css';
import Counter from './components/Counter';
import FetchAllProducts from './components/FetchAllProducts';
import ProductForm from './components/ProductForm';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Home from './components/Home';
import ProductDetails from './components/ProductDetails';
import UpdateProduct from './components/UpdateProduct';

function App() {
  return (
      <BrowserRouter>
        <Routes>
          <Route path='/' element={<Home/>}/>
          <Route path='/counter' element={<Counter/>}/>
          <Route path='/product/all' element={<FetchAllProducts/>}/>
          <Route path='/product/add' element={<ProductForm/>}/>
          <Route path='/product/view/:pId' element={<ProductDetails/>}/>
          <Route path='/product/edit/:pId' element={<UpdateProduct/>}/>        
        </Routes>
      </BrowserRouter>
  );
}

export default App;
