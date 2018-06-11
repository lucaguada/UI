<template>
  <div>
    <div class="">
      <ul class="uk-subnav uk-subnav-pill" uk-margin>
        <li class="uk-active"><a href="#">Active</a></li>
        <li><a href="#">Item</a></li>
        <li>
          <a href="#">More <span uk-icon="icon:  triangle-down"></span></a>
          <div uk-dropdown="mode: click;">
            <ul class="uk-nav uk-dropdown-nav">
              <li class="uk-active"><a href="#">Active</a></li>
              <li><a href="#">Item</a></li>
              <li class="uk-nav-header">Header</li>
              <li><a href="#">Item</a></li>
              <li><a href="#">Item</a></li>
              <li class="uk-nav-divider"></li>
              <li><a href="#">Item</a></li>
            </ul>
          </div>
        </li>
      </ul>
    </div>
    <table class="uk-table uk-table-striped uk-table-large uk-table-hover">
      <thead>
        <tr>
          <th>Table Heading</th>
          <th>Table Heading</th>
          <th>Table Heading</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>Table Data</td>
          <td>Table Data</td>
          <td>Table Data</td>
        </tr>
        <tr>
          <td>Table Data</td>
          <td>Table Data</td>
          <td>Table Data</td>
        </tr>
        <tr>
          <td>Table Data</td>
          <td>Table Data</td>
          <td>Table Data</td>
        </tr>
      </tbody>
    </table>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  data: () => ({
    msg: 'Welcome to Your Vue.js App'
  })
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1, h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
