<template>
  <el-menu
    style="height: 100%; border: 0;"
    default-active="1"
    background-color="#273c75"
    text-color="#7f8fa6"
    active-text-color="#487eb0"
    :collapse="true">
    <el-menu-item index="0" style="margin-bottom: 2rem; padding: 0.5rem">
      <img id="logo" src="/static/logo.png" width="48" height="48">
    </el-menu-item>
    <el-menu-item index="1">
      <i class="fas fa-2x fa-map-marker-alt"></i>
      <span slot="title">Map</span>
    </el-menu-item>
    <el-menu-item index="2">
      <i class="fas fa-2x fa-folder"></i>
      <span slot="title">Documents</span>
    </el-menu-item>
    <el-menu-item index="3">
      <i class="fas fa-2x fa-chart-bar"></i>
      <span slot="title">Charts</span>
    </el-menu-item>
    <el-menu-item index="4">
      <i class="fas fa-2x fa-calendar-alt"></i>
      <span slot="title">Scheduler</span>
    </el-menu-item>
    <el-menu-item index="5">
      <i class="fas fa-2x fa-cog"></i>
      <span slot="title">Settings</span>
    </el-menu-item>
  </el-menu>
</template>

<script>
export default {
  name: 'Sidemenu'
}
</script>
