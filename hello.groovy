job('hello-world-job') {
  displayName('Hello World Job')
  description('This is a simple "Hello World" job created using Job DSL.')

  steps {
    shell('echo "Hello, World!"')
  }
}
