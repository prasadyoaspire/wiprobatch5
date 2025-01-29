import { useState } from "react";
import { crowdFundingService } from "../crowdFundingService";

function ProjectForm() {
    const[name,setName] = useState('');
    const[description, setDescription] = useState('');
    const[goalAmount,setGoalAmount] = useState('');
    const[amountRaised,setAmountRaised] = useState('');

    const handleSubmit = () => {
        const projectData = {    
            name: name,
            description: description,
            goalAmount: goalAmount,
            amountRaised: amountRaised,
            investments : []
        }
        crowdFundingService.createProject(projectData)
        .then(resp=>console.log(resp));
    }

    return(
        <div>
            <h2>Manage Projects</h2>

            <label>Project Name</label>
            <input type="text" name="name" value={name} 
            onChange={event=>setName(event.target.value)} placeholder="Project Name"/>
            
            <label>Project Description</label>
            <textarea name="description" value={description} 
            onChange={event=>setDescription(event.target.value)} placeholder="Project Description"/>
            
            <label>Goal Amount</label>
            <input type="text" name="goalAmount" value={goalAmount} 
            onChange={event=>setGoalAmount(event.target.value)} placeholder="Goal Amount"/>
            
            <label>Amount Raised</label>
            <input type="text" name="amountRaised" value={amountRaised} 
            onChange={event=>setAmountRaised(event.target.value)} placeholder="Amount Raised"/>

            <button onClick={handleSubmit}>Create Project</button>     
        </div>
    )
}

export default ProjectForm;