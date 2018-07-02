<template>
  <el-row type="flex" :gutter="20" style="margin: 0; text-align: right;">
    <el-col :span="14" style="text-align: right; padding: 1rem 2rem 0 0">
      <search-input></search-input>
    </el-col>
    <el-col :span="8" style="text-align: right; padding: 1rem 2rem 0 0">
      <add-button></add-button>
    </el-col>
    <el-col :span="1" style="text-align: right; padding: 0.8rem 2rem 0 0">
      <el-button type="text">
        <el-badge :value="100" :max="10" class="item">
          <i class="fas fa-2x fa-bell" style="color: #f5f6fa"></i>
        </el-badge>
      </el-button>
    </el-col>
    <el-col :span="1">
      <el-popover placement="bottom" trigger="click">
        <el-card class="box-card">
          <div slot="header" class="clearfix">
            <span>Card name</span>
            <el-button style="float: right; padding: 3px 0" type="text">Operation button</el-button>
          </div>
          <div v-for="o in 4" :key="o" class="text item">
            {{'List item ' + o }}
          </div>
        </el-card>
        <el-button slot="reference" type="text"><img id="avatar" src="/static/avatar.png" width="42" height="42">
        </el-button>
      </el-popover>
    </el-col>
  </el-row>
</template>

<script>
import SearchInput from '@/components/SearchInput'
import AddButton from '@/components/AddButton'

export default {
  name: 'Topbar',
  components: {AddButton, SearchInput}
}
</script>

<style>
.text {
  font-size: 14px;
}

.item {
  margin-bottom: 18px;
}

.clearfix:before,
.clearfix:after {
  display: table;
  content: "";
}

.clearfix:after {
  clear: both
}

.box-card {
  width: 480px;
}
</style>
