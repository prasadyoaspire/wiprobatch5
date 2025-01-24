import Child from "./Child";

let Parent = () => {
    
    let msg = "Hello Child, How are you?";
    let customer = {
        customerId : 100,
        firstName : "Rohit",
        lastName : "Sharma"
    }
    return (
        <div>
            <h2>Parent Component</h2>

            <Child message = {msg} myCustomer={customer}/>

        </div>
    )
}

export default Parent;