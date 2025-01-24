import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import Footer from './components/Footer';
import Main from './components/Main';
import Counter from './components/Counter';
import Parent from './components/Parent';


function App() {
  return (
    <div className="App">
      <h1>My React App</h1>
      <Header />
      {/* <Main /> */}
      {/* <Counter/> */}
      <Parent/>
      <Footer />
    </div>
  );
}

export default App;
