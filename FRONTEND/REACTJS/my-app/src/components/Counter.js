import React from 'react';

class Counter extends React.Component {

    constructor() {
        super();
        this.state = {
            counter: 0
        }
        //this.increment = this.increment.bind(this);
        //this.decrement = this.decrement.bind(this);
    }

    increment = () => {
        //increment the counter i.e updating the state
        this.setState({
            counter: this.state.counter + 1
        })
    }

    decrement = () => {
        //increment the counter i.e updating the state
        this.setState({
            counter: this.state.counter - 1
        })
    }

    render() {
        return (
            <div>
                <h1>Counter Component</h1>
                <h3>Counter : {this.state.counter}</h3>
                <button onClick={this.increment}>+</button> &nbsp;&nbsp;
                <button onClick={this.decrement}>-</button>
            </div>
        )
    }
}
export default Counter;