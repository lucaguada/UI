<template>
  <div id="app">
    <el-container id="main">
      <el-aside width="auto"><sidemenu></sidemenu></el-aside>
      <el-container>
        <el-header><topbar></topbar></el-header>
        <el-main>
          <router-view/>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>

<script>
import Sidemenu from '@/components/Sidemenu'
import Topbar from '@/components/Topbar'

export default {
  name: 'App',
  components: {Sidemenu, Topbar}
}
</script>

<style>
html, body {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  display: block;
  height: 100%;
  width: 100%;
  margin: 0;
  padding: 0;
  background: #192a56;
}

#main {
  height: 100%;
  width: 100%;
}

#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  height: inherit;
  width: inherit;
  color: #2c3e50;
}
</style>
