<template>
  <div id="app" class="uk-offcanvas-content">
    <div class="uk-navbar-container uk-light" uk-navbar style="background: #2d98da">
      <div class="uk-navbar-left">
        <a class="uk-navbar-item uk-logo ui-logo" href="#off-canvas" uk-toggle>
          <i class="fas fa-frog"></i>&nbsp;UI&#8226;Logo
        </a>
        <ul class="uk-navbar-nav">
          <li>
            <a href="#">
              <div class="uk-text-center">
                <i class="fas fa-2x fa-university"></i>
                <div class="uk-navbar-subtitle">
                  <button class="uk-button uk-button-text">Establishments</button>
                </div>
              </div>
            </a>
          </li>
          <li>
            <a href="#">
              <div class="uk-text-center">
                <i class="fas fa-2x fa-user"></i>
                <div class="uk-navbar-subtitle">
                  <button class="uk-button uk-button-text">Users</button>
                </div>
              </div>
            </a>
          </li>
        </ul>
      </div>
      <div class="uk-navbar-right">
        <ul class="uk-navbar-nav" style="background: #45aaf2">
          <li>
            <a href="#">
              <div class="uk-text-center">
                Edgar Lee Masters
                <div class="uk-navbar-subtitle">
                  Astronaut
                </div>
              </div>
            </a>
          </li>
          <li>
            <a href="#"><i class="fas fa-3x fa-user-astronaut"></i></a>
          </li>
        </ul>
      </div>
    </div>
    <router-view/>
      <div id="off-canvas" uk-offcanvas="overlay: true">
        <div class="uk-offcanvas-bar">
          <button class="uk-offcanvas-close" type="button" uk-close></button>
          <h3>UIKit + Vue integration</h3>
          <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
        </div>
      </div>
  </div>
</template>

<script>
import WebFont from 'webfontloader'
import UIKit from 'uikit'
import Icons from 'uikit-icons'
import 'uikit-css'
import 'fontawesome'
import 'fa-solid'

UIKit.use(Icons)

WebFont.load({
  google: {
    families: ['Roboto', 'Open+Sans+Condensed:300', 'Comfortaa']
  }
})

export default {
  name: 'App'
}
</script>

<style>
html, body {

  font-family: 'Roboto', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
}

a,
a:hover, a:focus, a:active {
  text-decoration: none;
}

.uk-navbar-nav > li > a {
  color: #d1d8e0;
  color: #2c3e50;

}

.uk-navbar-nav > li:hover > a,
.uk-navbar-nav > li > a.uk-open,
.uk-navbar-nav > li > a:focus,
.uk-navbar-nav > li > a:active {
  color: #fff;

}

.uk-button-text, .uk-button-text:focus, .uk-button-text:hover, .uk-button-text::before {
  color: #fff;
  border-bottom-color: #fff;

}

a.ui-logo {
  font-family: 'Comfortaa', Helvetica, Arial, sans-serif;
  font-weight: bold;
  font-size: 24pt;

}

div.uk-navbar-container {
  background: #2D98DA;
  padding-left: 1rem;
  padding-right: 1rem;
}
</style>
