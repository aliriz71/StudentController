<template>
    <div class="StudentForm">
      <StudentForm/>
    </div>
</template>
  
  
  <script>
  import StudentForm from './components/StudentForm.vue';

  
  
  export default {
    name: 'App',
    components: {
      StudentForm

    }
  }
  </script>
  
  <style>
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
  </style>
  