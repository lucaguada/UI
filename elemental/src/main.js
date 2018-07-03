// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import router from './router'
import ElementUI from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
import App from './App'
import WebFont from 'webfontloader'
import 'fontawesome'
import 'fa-solid'
import 'fa-regular'
import 'fa-brands'

Vue.use(ElementUI)

WebFont.load({
  google: {
    families: ['Lobster', 'Roboto', 'Open+Sans+Condensed:300', 'Comfortaa']
  }
})

Vue.config.productionTip = false

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  components: { App },
  template: '<App/>'
})
