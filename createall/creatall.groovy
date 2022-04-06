pipelineJob('createall') {
  definition {
    cpsScm {
      scm {
        git('https://github.com/lacework-dev/detc-resources.git','ipcrm/jenkins', {node -> node / 'extensions' << '' })
      }
      scriptPath('jenkinsfiles/createall/Jenkinsfile')
    }
  }
}

