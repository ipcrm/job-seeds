pipelineJob('k8s infastructure') {
  definition {
    cpsScm {
      scm {
        git branch: 'ipcrm/jenkins', changelog: false, poll: false, url: 'https://github.com/lacework-dev/detc-resources.git'
      }
    }
    scriptPath('jenkinsfiles/k8s/Jenkinsfile')
  }
}

