<template>
  <nav>
    <router-link to="/">Home</router-link>
    <router-link to="/about">About</router-link>
    <router-link to="/students">Students</router-link>
    <router-link to="/student-form">Student Form</router-link>
  </nav>
  <router-view/>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  text-align: left;
  padding: 15px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
  margin-right: 15px;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
