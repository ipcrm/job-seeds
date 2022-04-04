pipelineJob('ticketing-app') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/lacework-demo/ticketing-app.git')
          }
        }
      }
    }
  }
}

