
import { Route ,Routes} from 'react-router-dom';
import './App.css';
import Navebar from './component/Navebar';
import AddProduct from './component/AddProduct';
import Home from './component/Home';
import EditProduct from './component/EditProduct';

function App() {
  return (
    <>
      <Navebar />

      <Routes>
        <Route path='/' element={<Home />}></Route>
        <Route path='/addProduct' element={<AddProduct />}></Route>
        <Route path='/editProduct/:id' element={<EditProduct />}></Route>
      </Routes>

    </>
  );
}

export default App;
