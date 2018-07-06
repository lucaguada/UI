<template>
  <span>
    <el-button type="danger" size="small" plain circle @click="cancel"><i class="fas fa-fw fa-times-circle"></i></el-button>
    <el-button type="success" size="small" round @click="save"><i class="fas fa-fw fa-check-circle"></i> Save</el-button>
  </span>
</template>

<script>
export default {
  name: 'SaveButton',
  methods: {
    save () {
      this.$message({
        message: 'Profile saved!',
        type: 'success'
      })
    },
    cancel () {
      this.$message({
        message: 'Profile reseted!',
        type: 'warning'
      })
    }
  }
}
</script>
