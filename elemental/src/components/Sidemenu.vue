<template>
  <el-menu
    style="height: 100%; border: 0;"
    :router="true"
    default-active="/datatable"
    background-color="#273c75"
    text-color="#7f8fa6"
    active-text-color="#487eb0"
    :collapse="true">
    <el-menu-item id="logo" index="/">
      <img src="/static/logo.png" width="48" height="48">
    </el-menu-item>
    <el-menu-item index="/datatable">
      <i class="fas fa-2x fa-table"></i>
      <span slot="title">Data</span>
    </el-menu-item>
    <el-menu-item index="/profile">
      <i class="fas fa-2x fa-user-circle"></i>
      <span slot="title">Profile</span>
    </el-menu-item>
    <el-menu-item index="3">
      <i class="fas fa-2x fa-folder"></i>
      <span slot="title">Documents</span>
    </el-menu-item>
    <el-menu-item index="4">
      <i class="fas fa-2x fa-chart-bar"></i>
      <span slot="title">Charts</span>
    </el-menu-item>
    <el-menu-item index="5">
      <i class="fas fa-2x fa-calendar-alt"></i>
      <span slot="title">Scheduler</span>
    </el-menu-item>
    <el-menu-item index="6">
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

<style>
#logo {
  margin-bottom: 2rem !important;
  padding: 0.5rem !important;
  height: 72px !important;
}
</style>
