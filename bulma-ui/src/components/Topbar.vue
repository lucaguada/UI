<template>
  <nav class="navbar is-danger">
    <div class="navbar-brand">
      <a class="navbar-item" href="#">
        <i class="fas fa-2x fa-gem" style="color:#55efc4"></i>
        <span class="logo">&nbsp;Esmeralda</span>
      </a>
      <div class="navbar-burger burger" data-target="navbarExampleTransparentExample">
        <span></span>
        <span></span>
        <span></span>
      </div>
    </div>
    <div class="navbar-menu">
      <div class="navbar-start">
        <div class="navbar-item has-dropdown is-hoverable">
          <a class="navbar-link">Left</a>
          <div class="navbar-dropdown is-boxed">
            <a class="navbar-item">Overview</a>
            <a class="navbar-item">Elements</a>
            <a class="navbar-item">Components</a>
            <hr class="navbar-divider">
            <div class="navbar-item">
              Version 0.7.1
            </div>
          </div>
        </div>
      </div>
      <div class="navbar-end">
        <div class="navbar-item has-dropdown is-hoverable">
          <a class="navbar-link">
            Right
          </a>
          <div class="navbar-dropdown is-right">
            <a class="navbar-item">
              Overview
            </a>
            <a class="navbar-item">
              Elements
            </a>
            <a class="navbar-item">
              Components
            </a>
            <hr class="navbar-divider">
            <div class="navbar-item">
              Version 0.7.1
            </div>
          </div>
        </div>
      </div>
    </div>
  </nav>
</template>

<script>
import WebFont from 'webfontloader'
import 'fontawesome'
import 'fa-solid'

WebFont.load({
  google: {
    families: ['Lobster', 'Roboto', 'Open+Sans+Condensed:300', 'Comfortaa']
  }
})

export default {
  name: 'Topbar'
}
</script>

<style>
span.logo {
  font-family: 'Lobster';
  font-size: 18pt;
}
</style>
