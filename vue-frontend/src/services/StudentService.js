import axios    from "axios";

const STUDENT_API_URL = "http://localhost:8080/api/students"; //rest api url of the java backend

class StudentService {
    getStudents() {
        return axios.get(STUDENT_API_URL);
    }
}

export default new StudentService();