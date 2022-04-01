job('exampleapp') {
  definition {
    cpsScm {
        scm {
            git('https://github.com/ipcrm/example-app.git')
        }
    }
  }
}
