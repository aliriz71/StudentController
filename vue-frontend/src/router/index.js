import { createRouter, createWebHistory } from 'vue-router'
import Student from '@/components/Student.vue'
import StudentForm from '@/components/StudentForm.vue'
//import HomePage from '@/components/HomePage.vue'
const routes = 
[  
  // {
  //   path: '/',
  //   name: 'HomePage',
  //   component: HomePage
  // },
  {
    path: '/students',
    name: 'Student',
    component: Student
  },
  {
    path: '/student-form',
    name: 'StudentForm',
    component: StudentForm
  },
  {
    path: '/about',
    name: 'about',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/AboutView.vue')
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
