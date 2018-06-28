<template>
  <div class="card">
    <div class="card-content">
      <nav class="level">
        <!-- Left side -->
        <div class="level-left">
          <div class="level-item">
            <figure class="image">
              <i class="fas fa-user-circle fa-3x"></i>
            </figure>
          </div>
          <div class="level-item">
            <p class="subtitle is-5">
              <strong>Walter Hartwell White</strong>
            </p>
          </div>
          <div class="level-item">
            <div class="field has-addons">
              <p class="control">
                <input class="input" type="text" placeholder="Find a post">
              </p>
              <p class="control">
                <button class="button">
                  Search
                </button>
              </p>
            </div>
          </div>
        </div>

        <!-- Right side -->
        <div class="level-right">
          <b-tabs type="is-toggle">
            <b-tab-item label="Pictures" icon="google-photos"></b-tab-item>
            <b-tab-item label="Music" icon="library-music"></b-tab-item>
            <b-tab-item label="Videos" icon="video"></b-tab-item>
          </b-tabs>
        </div>
      </nav>
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: () => ({msg: 'Welcome to Your Vue.js App'})
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style>
.b-tabs .tab-content {
  padding: 0;
}
</style>
