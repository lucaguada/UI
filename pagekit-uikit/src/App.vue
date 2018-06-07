<template>
  <div id="app" class="uk-offcanvas-content">
    <div class="uk-navbar-container" uk-navbar style="background: #2d98da">
      <div class="uk-navbar-left">
        <a class="uk-navbar-item" href="#off-canvas" uk-toggle>
          <span class="fa-stack fa-2x">
            <i class="fas fa-circle fa-stack-2x fa-inverse"></i>
            <i class="fas fa-frog fa-stack-1x"></i>
          </span>
        </a>
        <a class="uk-navbar-item uk-logo beatrix" href="#">BEATRICE</a>
      </div>
      <div class="uk-navbar-right">
        <button class="uk-button uk-button-text">Text</button>
        <ul class="uk-navbar-nav">
          <li>
            <a href="#">Parent</a>
            <div class="uk-navbar-dropdown">
              <ul class="uk-nav uk-navbar-dropdown-nav">
                <li class="uk-active"><a href="#">Active</a></li>
                <li><a href="#">Item</a></li>
                <li class="uk-nav-header">Header</li>
                <li><a href="#">Item</a></li>
                <li><a href="#">Item</a></li>
                <li class="uk-nav-divider"></li>
                <li><a href="#">Item</a></li>
              </ul>
            </div>
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
    families: ['Roboto', 'Open+Sans+Condensed:300']
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

a, a:hover, a:focus, a:active {
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

a.beatrix {
  font-family: 'Open Sans Condensed', Helvetica, Arial, sans-serif;
  color: white;
  font-size: 24pt;
}

div.uk-navbar-container {
  background: #2D98DA;
  padding-left: 1rem;
  padding-right: 1rem;
}
</style>
