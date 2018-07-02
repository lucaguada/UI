<template>
  <el-popover
    style="border: 0"
    name="hi-there"
    :visible-arrow="false"
    placement="bottom"
    width="auto"
    trigger="click">
    <el-menu
      id="add-menu"
      style="border: 0; margin: 0;"
      background-color="#273c75"
      text-color="#7f8fa6"
      active-text-color="#487eb0">
      <el-menu-item index="1"><i class="fas fa-fw fa-user"></i> User</el-menu-item>
      <el-menu-item index="2"><i class="fas fa-fw fa-user"></i> Establishment</el-menu-item>
      <el-menu-item index="3"><i class="fas fa-fw fa-users"></i> Group</el-menu-item>
      <el-menu-item index="4"><i class="fas fa-fw fa-piggy-bank"></i> Bank</el-menu-item>
    </el-menu>
    <el-button type="success" slot="reference" round><i class="fas fa-fw fa-plus-circle"></i> Add
      <i class="fas fa-fw fa-chevron-down"></i></el-button>
  </el-popover>
</template>

<script>
export default {
  name: 'AddButton',
  mounted () {
    const popover = document.getElementById('add-menu').parentElement
    popover.classList.add('add-menu-popover')
  }
}
</script>

<style>
.add-menu-popover {
  padding: 0 !important;
  border-color: #273c75 !important;
}
</style>
