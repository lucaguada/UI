import Vue from 'vue'
import Router from 'vue-router'
import DataTable from '@/components/DataTable'
import Profile from '@/components/Profile'

Vue.use(Router)

export default new Router({
  routes: [{
    path: '/',
    name: 'DataTable',
    component: DataTable
  }, {
    path: '/datatable',
    name: 'DataTable',
    component: DataTable
  }, {
    path: '/profile',
    name: 'Profile',
    component: Profile
  }]
})
