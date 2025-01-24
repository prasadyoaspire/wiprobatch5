function Child(props) {
    let cust = props.myCustomer;
    return(
        <div>
            <h2>Child Component</h2>
            <h3>Message : {props.message}</h3>
            <p>{cust.customerId}</p>
            <p>{cust.firstName}</p>
            <p>{cust.lastName}</p>
        </div>
    )
}

export default Child;