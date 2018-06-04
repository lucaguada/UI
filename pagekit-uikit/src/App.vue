<template>
  <div id="app" class="uk-offcanvas-content">
    <div class="uk-navbar-container" uk-navbar style="background: #2d98da">
      <div class="uk-navbar-left">
        <a href="#off-canvas" uk-toggle class="uk-navbar-item uk-logo" uk-icon="icon: uikit; ratio: 2"></a>
      </div>
      <div class="uk-navbar-right">
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
import UIKit from 'uikit'
import Icons from 'uikit-icons'
import 'uikit-css'

UIKit.use(Icons)

export default {
  name: 'App'
}
</script>

<style>
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

.uk-button {
  border-radius: 500px;
  color: #fff;
}

div.uk-navbar-container {
  background: #2D98DA;
  padding-left: 1rem;
  padding-right: 1rem;
}

a.uk-logo {
  color: #ecf0f1;
  color: white;
}
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
}
</style>
