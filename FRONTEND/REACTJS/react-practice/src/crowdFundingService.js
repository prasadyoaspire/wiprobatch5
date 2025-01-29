import axios from 'axios';

const BACKEND_URL = "http://localhost:7070";

export const crowdFundingService = {
    getAllProjects : async () => {
        return axios.get(BACKEND_URL+"/projects/");    
    },
    getProjectById : async (projectId) => {
        return axios.get(BACKEND_URL+"/projects/"+projectId);
    },
    
    createProject: async (projectData) => {
        return axios.post(BACKEND_URL+"/projects/",projectData);
    },

    updateProject: async (projectId, projectData) => {
        // write your logic here
        return null
    },

    deleteProject: async (projectId) => {
        // write your logic here
        return null
    },

}