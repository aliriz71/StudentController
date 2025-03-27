<template>
    <div class = "container">
        <h1 class="text-center"> Students List</h1>

        <table class="table table-bordered">
            <thead>
                    <th>Student Number</th>
                    <th>Student Name</th>
                    <th>Student Email</th>
                    <th>Year</th>
            </thead>
            <tbody>
                <tr v-for = "student in students" :key = "student.id">
                    <td>{{student.studentNum}}</td>
                    <td>{{student.studentName}}</td>
                    <td>{{student.studentEmail}}</td>
                    <td>{{student.year}}</td>

                </tr>

            </tbody>
        </table>
    </div>
</template>


<script>

import StudentService from '@/services/StudentService';

export default {
    name: 'StudentList',
    data(){
        return {
            students: []
        }
    },
    methods: {
        getStudents(){
            StudentService.getStudents().then(response => {
                this.students = response.data;
            });
        }
    },
    created(){
        this.getStudents();
    }
}

</script>


<!-- 
<style>

</style> -->  