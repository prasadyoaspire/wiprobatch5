import { useState } from "react";
import { Link } from "react-router-dom";

function Counter() {

    const[counter,setCounter] = useState(0); // declaring a new state variable called counter and initialized with zero

    const increment = () => {
        //update the state 
        setCounter(counter+1);
    }

    const decrement = () => {
        //update the  state value
        setCounter(counter-1);
    }

    return(
        <div>
            <h2>Counter Value: {counter}</h2>
            <button onClick={increment}>+</button>&nbsp;&nbsp;&nbsp;
            <button onClick={decrement}>-</button>

            <p><Link to='/'>Back To Home</Link></p>

        </div>
    )
}

export default Counter;