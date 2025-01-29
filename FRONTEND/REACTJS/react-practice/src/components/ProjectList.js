import { useEffect, useState } from 'react';
import { crowdFundingService } from '../crowdFundingService';

function ProjectList() {
    const [projects, setProjects] = useState([]);
    useEffect(() => {
        crowdFundingService.getAllProjects().then(resp => setProjects(resp.data));
    }, [])

    return (
        <>
            <h3>Project List</h3>
            {
                projects.length > 0 &&
                projects.map(p => <div>
                    <p><b>Name</b> : {p.name}</p>
                    <p><b>Description</b>: {p.description}</p>
                    <p><b>Goal </b>: {p.goalAmount}</p>
                    <p><b>Amount </b>: {p.amountRaised}</p>
                    <p><button>Edit</button>  <button>Delete</button> <button>Get all investmets</button></p>
                </div>)
            }
        </>
    )
}
export default ProjectList;