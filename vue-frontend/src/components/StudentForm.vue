<template>
    <div class="form-container">
        <form @submit.prevent="submitForm">
            <div class="form-group">
                <label for="studentName">Name:</label>
                <input type="text" v-model="student.studentName" id="studentName" required />
            </div>
            <div class="form-group">
                <label for="studentEmail">Email:</label>
                <input type="email" v-model="student.studentEmail" id="studentEmail" required />
            </div>
            <div class="form-group">
                <label for="year">Year:</label>
                <input type="number" v-model="student.year" id="year" required />
            </div>
            <button type="submit">Submit</button>
        </form>
    </div>
</template>

<script>
export default {
    data() {
        return {
            student: {
                studentName: '',
                studentEmail: '',
                year: null
            }
        };
    },
    methods: {
        async submitForm() {
            try {
                await fetch('http://localhost:8080/api/students', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.student)
                });
                alert('Student saved successfully');
            } catch (error) {
                console.error('Error saving student:', error);
            }
        }
    }
};
</script>

<style>
.form-container {
    width: 300px;
    margin: 20px auto;
    padding: 20px;
    border: 1px solid black;
    border-radius: 8px;
    background-color: #f9f9f9;
}

.form-group {
    display: flex;
    flex-direction: column;
    margin-bottom: 10px;
}

label {
    font-weight: bold;
    margin-bottom: 5px;
}

input {
    padding: 8px;
    border: 1px solid #ccc;
    border-radius: 4px;
    width: 100%;
}

button {
    padding: 8px 12px;
    background-color: #007bff;
    color: white;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

button:hover {
    background-color: #0056b3;
}
</style>
