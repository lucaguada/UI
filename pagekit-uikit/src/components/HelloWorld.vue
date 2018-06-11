<template>
  <div>
    <div class="">

    </div>
    <table class="uk-table uk-table-striped uk-table-large">
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
