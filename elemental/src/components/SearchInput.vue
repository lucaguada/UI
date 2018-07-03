<template>
  <el-input id="search-input" placeholder="Search...">
    <i slot="prefix" class="el-input__icon fas fa-search"></i>
    <i slot="suffix" class="el-input__icon fas fa-chevron-down"></i>
  </el-input>
</template>

<script>
export default {
  name: 'SearchInput'
}
</script>

<style>
input#search-input.el-input__inner {
  border-radius: 20px;
  background: #273c75;
  border: 0;
  color: #f5f6fa
}
</style>
