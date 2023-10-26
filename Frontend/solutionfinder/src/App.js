import './App.css';
import SearchPage from './pages/SearchPage';
import { Routes,Route } from 'react-router-dom';
import ShayriPage from './pages/ShayriPage';

function App() {
  return (

    <div >
      <div >
      {/* <Routes>
        <Route path='/' element={<SearchPage/>}/>
        <Route path='/shayri' element={<ShayriPage/>}/>
      </Routes> */}
  <SearchPage/>
    </div>
     
      
    </div>
  );
}

export default App;
