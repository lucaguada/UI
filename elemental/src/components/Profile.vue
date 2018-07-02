<template>
  <el-row :gutter="20">
    <el-col :span="6">
      <el-card class="box-card" style="width: 100%; background: #273c75; border: 0; color: #fafafa">
        <div slot="header" class="clearfix">
          <img id="profile-avatar" src="/static/profile.png" width="128" height="128">
          <h2>Walter Hartwell White</h2>
          <el-tag size="small" type="warning">Vamonos Pest</el-tag>
          <i class="fas fa-fw fa-eye-dropper" style="color: #F56C6C"></i>
          256 drops
        </div>
        <el-form label-position="top" label-width="100px" style="text-align: left" size="mini">
          <el-form-item label="Email">
            walter.white@vamonopest.com
          </el-form-item>
          <el-form-item label="Activity zone">
            Albuquerque
          </el-form-item>
          <el-form-item label="Activity form">
            Cook
          </el-form-item>
        </el-form>
      </el-card>
    </el-col>
    <el-col :span="18">
      <el-tabs type="border-card" style="width: 100%; background: #273c75; border: 0; color: #fafafa">
        <el-tab-pane label="User">User</el-tab-pane>
        <el-tab-pane label="Config">Config</el-tab-pane>
        <el-tab-pane label="Role">Role</el-tab-pane>
        <el-tab-pane label="Task">Task</el-tab-pane>
      </el-tabs>
    </el-col>
  </el-row>
</template>

<script>
export default {
  name: 'Profile'
}
</script>

<style>
.el-form-item__label {
  color: #7f8fa6 !important;
}
</style>
