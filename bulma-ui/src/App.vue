<template>
  <div id="app" class="has-background-white-ter has-text-grey-darker">
    <sidemenu></sidemenu>
  </div>
</template>

<script>
import Topbar from '@/components/Topbar'
import Sidemenu from '@/components/Sidemenu'

export default {
  name: 'App',
  components: {Topbar, Sidemenu}
}
</script>

<style>
html, body {
  font-family: 'Roboto', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  padding: 0;
  margin: 0;
  height: 100%;
  width: 100%;
}

#app {
  height: 100%;
  width: 100%;
}

.full-height {
  height: 100%;
  min-height: 100%;
}
</style>
