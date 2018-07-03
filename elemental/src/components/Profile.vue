<template>
  <el-row :gutter="20">
    <el-col :span="6">
      <el-card class="box-card" style="width: 100%; background: #273c75; border: 0; color: #f5f6fa">
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
      <el-tabs type="border-card">
        <el-tab-pane>
          <div slot="label" class="tab-label"><i class="fas fa-fw fa-id-card"></i> Details</div>
          <el-card></el-card>
          <el-card></el-card>
          <el-card></el-card>
          <el-card></el-card>
          <el-card></el-card>
          <el-card></el-card>
        </el-tab-pane>
        <el-tab-pane>
          <div slot="label" class="tab-label"><i class="fas fa-fw fa-id-card"></i> Details</div>
        </el-tab-pane>
        <el-tab-pane>
          <div slot="label" class="tab-label"><i class="fas fa-fw fa-id-card"></i> Details</div>
        </el-tab-pane>
        <el-tab-pane>
          <div slot="label" class="tab-label"><i class="fas fa-fw fa-id-card"></i> Details</div>
        </el-tab-pane>
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
.el-tabs--border-card {
  border-radius: 3px;
  border-color: #192a56;
}

.el-form-item__label, .el-tabs__item {
  color: #7f8fa6;
}

.el-tabs--border-card>.el-tabs__header .el-tabs__item.is-active {
  background-color: #273c75;
  color: #f5f6fa;
}

.el-tabs__active-bar {
  background-color: #40739e;
}

div.tab-label {
  margin: 0 1rem 1rem 1rem;
  font-weight: bold;
  text-transform: uppercase;
  font-variant: small-caps;
}

div.tab-label.el-tabs__item.is-active {
  color: #487eb0;
}

div.el-tabs__content {
  background-color: #273c75;
}
</style>
